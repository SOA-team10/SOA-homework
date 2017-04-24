/**
 * Created by duanzhengmou on 4/23/17.
 */
public class TestEntry {
    public static void main(String args[]){
        // main
        MyXslTransformer.xsl("xml/test.xml", "xml/testOutput.xml", "xsl/test.xsl");
    }
}
