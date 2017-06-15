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
 * Created by ���ī^ on 2017/6/15.
 */
public class IOHelper {
    /*
    дscores.xml�ļ�
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
            return "�����ɹ�";
        } catch (Exception e) {
            e.printStackTrace();
            return "����ʧ�ܣ� " + e.getMessage();
        }
    }

    /*
    ��ȡscores.xml�ļ�
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
