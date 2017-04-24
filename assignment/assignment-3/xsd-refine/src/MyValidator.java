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
public class MyValidator {

    public static boolean validateXMLByXSD(File xmlFile, File xsdFile) {
        boolean isValid = false;
        Source xmlSource = new StreamSource(xmlFile);
        SchemaFactory schemaFactory = SchemaFactory
                .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = null;
        try {
            schema = schemaFactory.newSchema(xsdFile);
        } catch (SAXException e) {
            System.out.println(xmlSource.getSystemId() + " is NOT valid");
            System.out.println(" reason:" + e);
            e.printStackTrace();
        }
        javax.xml.validation.Validator validator = schema.newValidator();
        try {
            validator.validate(xmlSource);
            isValid = true;
            System.out.println(xmlSource.getSystemId() + " is valid");
        } catch (SAXException e) {
            System.out.println(xmlSource.getSystemId() + " is NOT valid");
            System.out.println(" reason:" + e);
        } catch (IOException e) {
            System.out.println(xmlSource.getSystemId() + " is NOT valid");
            System.out.println(" reason:" + e);
        }

        return isValid;
    }

}
