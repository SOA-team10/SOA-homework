import java.io.File;

/**
 * Created by duanzhengmou on 4/23/17.
 */
public class Entry {
    public static void main(String args[]){
        // main
        MyXslTransformer.xsl("xml/newStudentList.xml", "xml/output.xml", "xsl/transform.xsl");
        boolean result = MyValidator.validateXMLByXSD(new File("xml/output.xml"), new File("xsd/ScoreList.xsd"));
        System.out.println("valid? "+result);
    }
}
