import javax.xml.validation.Validator;
import java.io.File;

/**
 * Created by duanzhengmou on 4/23/17.
 */
public class TestEntry {
    public static void main(String args[]){
        // main
//        MyXslTransformer.xsl("xml/test.xml", "xml/testOutput.xml", "xsl/test.xsl");
        boolean inputIsValid = MyValidator.validateXMLByXSD(new File("xml/newStudentList.xml"), new File("xsd/StudentList.xsd"));
        boolean outPutIsValid = MyValidator.validateXMLByXSD(new File("xml/output.xml"), new File("xsd/ScoreList.xsd"));
        System.out.println(inputIsValid);
        System.out.println(outPutIsValid);
    }
}
