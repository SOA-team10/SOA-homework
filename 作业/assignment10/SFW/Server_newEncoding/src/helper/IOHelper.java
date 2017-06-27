package helper;

import ass8.InfoManageImpl;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.InputStream;

/**
 * Created by 张文玘 on 2017/6/15.
 */
public class IOHelper {
    /*
    写scores.xml文件
     */
    public static String writeXML(Document document, String filePath){

        try{
            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT,"yes");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            DOMSource source = new DOMSource(document);
            String classDirPath = IOHelper.class.getClassLoader().getResource("").getPath();
            String realPath = classDirPath + filePath;
            StreamResult result = new StreamResult(new File(realPath));
            transformer.transform(source, result);
            return "操作成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "操作失败： " + e.getMessage();
        }
    }

    /*
    读取scores.xml文件
     */
    public static Document getDocument(String filePath){

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setIgnoringElementContentWhitespace(true);
        String classDirPath = IOHelper.class.getClassLoader().getResource("").getPath();
        String realPath = classDirPath + filePath;
        Document document = null;
        try{
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse(realPath);
        }catch (Exception e){
            e.printStackTrace();
        }

        return document;
    }
}
