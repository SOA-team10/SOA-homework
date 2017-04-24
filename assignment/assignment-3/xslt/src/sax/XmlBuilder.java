package sax;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by duanzhengmou on 4/25/17.
 */
public class XmlBuilder {
    public static void build(String path, List<Score> scoreList){
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        Document document = null;
        try {
            builder = documentBuilderFactory.newDocumentBuilder();

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        document = builder.newDocument();



        Element root = document.createElement("tns:scoreList");

        root.setAttribute("xmlns:tns", "http://jw.nju.edu.cn/schema");

        for (int i=0;i<scoreList.size();i++){
            Element courseScore = document.createElement("tns:courseScore");
            courseScore.setAttribute("courseId", scoreList.get(i).getCourseId());
            courseScore.setAttribute("scoreType", scoreList.get(i).getScoreType());

            Element score = document.createElement("tns:score");

            Element studentId = document.createElement("tns:studentId");
            studentId.setTextContent(scoreList.get(i).getStudentId());

            Element studentScore = document.createElement("tns:studentScore");
            studentScore.setTextContent(String.valueOf(scoreList.get(i).getStudentScore()));

            score.appendChild(studentId);
            score.appendChild(studentScore);
            courseScore.appendChild(score);
            root.appendChild(courseScore);
        }
        document.appendChild(root);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = null;
        try {
             transformer = transformerFactory.newTransformer();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        }
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty(OutputKeys.ENCODING, "utf-8");

        DOMSource source = new DOMSource(document);
        PrintWriter pw = null;

        try {
            pw = new PrintWriter(new FileOutputStream(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StreamResult result = new StreamResult(pw);

        try {
            transformer.transform(source, result);
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        System.out.println("xml generated");
    }
}
