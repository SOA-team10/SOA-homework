package sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by duanzhengmou on 4/24/17.
 */
public class ScoreHandler extends DefaultHandler {
    private List<Score> scoreList;
    private Score carrier;
    private String currentTag="";
    private String currentCourseId;
    private String currentScoreType;


    @Override
    public void startDocument() throws SAXException {
        scoreList = new LinkedList<>();
        carrier = new Score();
        super.startDocument();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("encounter an element: " + qName);


        switch (qName) {
            case "tns:courseScore":
                currentCourseId = attributes.getValue("courseId");
                currentScoreType = attributes.getValue("scoreType");
                currentTag = qName;
                break;
            case "tns:studentId":
                currentTag = qName;
                break;
            case "tns:studentScore":
                currentTag = qName;
                break;

        }
        super.startElement(uri, localName, qName, attributes);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String charVal = new String(ch, start, length);

        // todo alternative
        if(charVal.contains("\n")||charVal.contains("\n\t")) return ;

        switch (currentTag){
            case "tns:studentId":
                carrier.setStudentId(charVal);
                break;
            case "tns:studentScore":
                handleScore(charVal, currentScoreType);
                System.out.println("score:["+charVal+"]");
                break;
        }
        super.characters(ch, start, length);
    }

    private void handleScore(String value, String type) {
        int scoreVal = Integer.valueOf(value);
        if (scoreVal < 60) {
            Score savedRecord = new Score(
                    carrier.getStudentId(),
                    scoreVal,
                    currentCourseId,
                    type);
            scoreList.add(savedRecord);
        }
    }

    public List<Score> getScoreList() {
        return this.scoreList;
    }
}


