package sax;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by duanzhengmou on 4/24/17.
 */
public class SaxEntry {
    public static void main(String args[]) {
        // main
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = null;
        try {
            saxParser = saxParserFactory.newSAXParser();
        } catch (ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }

        ScoreHandler scoreHandler = new ScoreHandler();

        try {
            assert saxParser != null;
            saxParser.parse(new File("xml/output.xml"), scoreHandler);
        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }

        List<Score> scores = scoreHandler.getScoreList();
        System.out.println("Parse finished");
        XmlBuilder.build("filteredOutput.xml", scores);



    }
}
