import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

/**
 * Created by duanzhengmou on 4/17/17.
 */
public class Validation {
    public static void main(String args[]){
        // main
        validateXMLByXSD();
    }
    public static void validateXMLByXSD() {
        String xmlFileName = "xsd/newProfile.xml";
        String xsdFileName = "xsd/Student.xsd";


        Source xmlFile = new StreamSource(new File(xmlFileName));
        SchemaFactory schemaFactory = SchemaFactory
                .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = null;
        try {
            schema = schemaFactory.newSchema(new File(xsdFileName));
        } catch (SAXException e) {
            System.out.println(xmlFile.getSystemId() + " is NOT valid reason:" + e);
            e.printStackTrace();
        }
        Validator validator = schema.newValidator();
        try {
            validator.validate(xmlFile);
            System.out.println(xmlFile.getSystemId() + " is valid");
        } catch (SAXException e) {
            System.out.println(xmlFile.getSystemId() + " is NOT valid reason:" + e);
        } catch (IOException e) {
            System.out.println(xmlFile.getSystemId() + " is NOT valid reason:" + e);
            e.printStackTrace();
        }
    }

}
