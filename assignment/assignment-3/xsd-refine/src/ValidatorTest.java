import java.io.File;

/**
 * Created by duanzhengmou on 4/23/17.
 */
public class ValidatorTest {
    public static void main(String args[]){
        // main
        File xmlFile = new File("xml/newProfile.xml");
        File xsdFile = new File("xsd/Student.xsd");
        Boolean result = MyValidator.validateXMLByXSD(xmlFile, xsdFile);
        System.out.println(result);
    }
}
