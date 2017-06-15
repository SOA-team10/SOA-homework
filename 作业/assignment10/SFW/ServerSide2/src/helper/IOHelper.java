package helper;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

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
            StreamResult result = new StreamResult(new File(filePath));
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
//        URL url = getClass().getResource("");
//        System.out.println(url);
//        String filePath = url.getPath().replace("WEB-INF","");
//        System.out.println(filePath);

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setIgnoringElementContentWhitespace(true);

        Document document = null;
        try{
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse(filePath);
        }catch (Exception e){
            e.printStackTrace();
        }

        return document;
    }
}
