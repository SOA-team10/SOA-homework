import java.io.File;

/**
 * Created by duanzhengmou on 4/23/17.
 */
public class Entry {
    public static void main(String args[]){
        // main
        MyXslTransformer.xsl("xml/cdcatalog.xml",
                             "xsd/StudentList.xsd",
                             "xml/output22.xml",
                             "xsl/cdcatalog.xsl");
        boolean result = MyValidator.validateXMLByXSD(new File("xml/output.xml"), new File("xsd/ScoreList.xsd"));
        System.out.println("output valid? "+result);
    }
}
