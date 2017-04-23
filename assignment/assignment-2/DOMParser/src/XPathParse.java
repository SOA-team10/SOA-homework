import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;

/**
 * Created by duanzhengmou on 4/20/17.
 */
public class XPathParse {
    public static void main(String args[]){
        // main
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
//        documentBuilderFactory.setNamespaceAware(true);
        Document document = null;
        try {
            DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
            document = builder.parse("./example.xml");
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(document == null) {
            System.out.println("error in parsing document");
            return ;
        }

        XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();
        XPathExpression xPathExpression = null;
        String xExprStr = "/paper/chapter/parent::node()";
        try {
            xPathExpression = xpath.compile(xExprStr);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }

        NodeList result = null;
        try {
            result = (NodeList) xPathExpression.evaluate(document, XPathConstants.NODESET);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        System.out.println("Result Num: "+result.getLength());
        for (int i = 0; i < result.getLength(); i++) {
            System.out.println("------- begin -------");
            System.out.println("nodeName: "+result.item(i).getNodeName());
            System.out.println("text    : "+result.item(i).getTextContent());
            System.out.println("nodeValue    : "+result.item(i).getNodeValue());
            System.out.println("-------  end  -------");
        }
    }
}
