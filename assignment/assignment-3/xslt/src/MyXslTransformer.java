import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by duanzhengmou on 4/23/17.
 */
public class MyXslTransformer {

    public static void xsl(
            String inFilename,
            String inXsdname,
            String outFilename,
            String xslFilename) {
        // validate the input xml
        File inputXsd = new File(inXsdname);
        File inputXml = new File(inFilename);
        boolean isValid = MyValidator.validateXMLByXSD(inputXml, inputXsd);
//        if (! isValid ){
//            System.err.println("not a valid xml input");
//            return ;
//        }
        try {
            // Create transformer factory
            TransformerFactory factory = TransformerFactory.newInstance();

            // Use the factory to create a template containing the xsl file
            Templates template = factory.newTemplates(new StreamSource(
                    new FileInputStream(xslFilename)));

            // Use the template to create a transformer
            Transformer xformer = template.newTransformer();

            // Prepare the input and output files
            Source source = new StreamSource(new FileInputStream(inFilename));
            Result result = new StreamResult(new FileOutputStream(outFilename));

            // Apply the xsl file to the source file and write the result to the
            // output file

            xformer.transform(source, result);
            System.out.println("transform finish");
        } catch (FileNotFoundException e) {
            // File not found
        } catch (TransformerConfigurationException e) {
            // An error occurred in the XSL file
        } catch (TransformerException e) {
            // An error occurred while applying the XSL file
            // Get location of error in input file
        }
    }
}
