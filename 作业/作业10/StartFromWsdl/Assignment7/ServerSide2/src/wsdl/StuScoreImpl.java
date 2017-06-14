package wsdl;

import org.w3c.dom.*;
import schema.*;
import schema.单个学生成绩列表类型;
import schema.单项成绩类型;


import javax.jws.WebService;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 张文玘 on 2017/6/13.
 */
@WebService
public class StuScoreImpl implements StuScoreInterface{


    @Override
    public 单个学生成绩列表类型 searchScore(String studentId) throws SearchScoreFault {
        Document document = getDocument();
        ArrayList<单项成绩类型> list = new ArrayList<>();

        NodeList nodes = document.getDocumentElement().getElementsByTagName("tns:courseScore");

        //courseScore层
        for(int i = 0; i < nodes.getLength(); i++){
            NodeList childNodes = nodes.item(i).getChildNodes();

            NamedNodeMap nodeAttr = nodes.item(i).getAttributes();

            String courseId = nodeAttr.getNamedItem("courseId").getTextContent();
            String scoreType = nodeAttr.getNamedItem("scoreType").getTextContent();
            System.out.println("课程编号与成绩类型："+courseId+" "+scoreType);
            //score层
            for(int j = 0; j < childNodes.getLength(); j++){
                Node temp = childNodes.item(j);
                if(temp.getNodeType() != Node.ELEMENT_NODE){
                    continue;
                }
                //比较学号
                String stuId = "";
                int score = 0;
                //score内部的studentId和studentScore两个
                for(int k = 0; k < temp.getChildNodes().getLength();k++){
                    Node t1 = temp.getChildNodes().item(k);
                    if(t1.getNodeType() != Node.ELEMENT_NODE){
                        continue;
                    }else{
                        if(t1.getNodeName().equals("tns:studentId")){
                            stuId = t1.getTextContent();
                        }else if(t1.getNodeName().equals("tns:studentScore")){
                            score = Integer.parseInt(t1.getTextContent());
                        }
                    }
                }

                //看这个节点的学号是否为查找的学号
                if(stuId.equals(studentId)){
                    单项成绩类型 single = new 单项成绩类型();
                    single.set分数(score);
                    single.set得分性质(得分性质.fromValue(scoreType));
                    single.set课程编号(courseId);
                    list.add(single);
                }
            }
        }
        单个学生成绩列表类型 studentScores = new 单个学生成绩列表类型();
        studentScores.set学号(studentId);
        studentScores.set单项成绩(list);

        return studentScores;
    }

    @Override
    public String addScore(添加或修改成绩数据类型 student) throws AddScoreFault {

        Document document = getDocument();
        System.out.println(student.get学号());
        System.out.println(student.get课程编号());
        System.out.println(student.get成绩性质类型().value());
        System.out.println(student.get分数());

        //检验课程和成绩性质是否已经存在
        NodeList nodes = document.getDocumentElement().getElementsByTagName("tns:courseScore");
        Element courseScoreEle = null;
        for(int i = 0; i < nodes.getLength(); i++){
            NamedNodeMap nodeAttr = nodes.item(i).getAttributes();
            System.out.println("courseId:"+nodeAttr.getNamedItem("courseId").getTextContent()+",scoreType"+nodeAttr.getNamedItem("scoreType").getTextContent());
            String courseId = nodeAttr.getNamedItem("courseId").getTextContent();
            String scoreType = nodeAttr.getNamedItem("scoreType").getTextContent();
            if(courseId.equals(student.get课程编号())&&scoreType.equals(student.get成绩性质类型().value())){
                System.out.println("课程和成绩性质已存在");
                courseScoreEle = (Element) nodes.item(i);
                break;
            }
        }

        //如果课程和成绩性质不存在
        if(courseScoreEle==null){
            System.out.println("课程和成绩性质不存在");
            courseScoreEle = document.createElement("tns:courseScore");
            courseScoreEle.setAttribute("courseId",student.get课程编号());
            courseScoreEle.setAttribute("scoreType",student.get成绩性质类型().value());
        }

        //将添加的数据写入document中
        Element score = document.createElement("tns:score");
        Element studentId = document.createElement("tns:studentId");
        Element studentScore = document.createElement("tns:studentScore");
        studentId.setTextContent(student.get学号());
        studentScore.setTextContent(String.valueOf(student.get分数()));
        score.appendChild(studentId);
        score.appendChild(studentScore);
        courseScoreEle.appendChild(score);

        return writeXML(document);
    }

    @Override
    public String deleteScore(删除成绩数据类型 student) throws DeleteScoreFault {
        Document document = getDocument();

        NodeList nodes = document.getElementsByTagName("tns:courseScore");
        Element delEle = null;

        for(int i = 0; i < nodes.getLength(); i++){
            NamedNodeMap nodeAttr = nodes.item(i).getAttributes();
            String courseId = nodeAttr.getNamedItem("courseId").getTextContent();
            String scoreType = nodeAttr.getNamedItem("scoreType").getTextContent();
            if(courseId.equals(student.get课程编号())&& scoreType.equals(student.get成绩性质类型().value())){
                NodeList childNodes = nodes.item(i).getChildNodes();
                //score层
                for(int j = 0; j < childNodes.getLength(); j++){
                    NodeList temp = childNodes.item(i).getChildNodes();
                    for(int k = 0; k < temp.getLength(); k++){
                        if(temp.item(k).getNodeType()!=Node.ELEMENT_NODE){
                            continue;
                        }else{
                            //比较学号
                            if(temp.item(k).getNodeName().equals("tns:studentId")){
                                //如果学号一样的话，删掉这个节点
                                if(temp.item(k).getTextContent().equals(student.get学号())){
                                    delEle = (Element) childNodes.item(i);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if(delEle!=null){
            document.removeChild(delEle);
        }

        return writeXML(document);
    }

    @Override
    public String modifyScore(添加或修改成绩数据类型 student) throws ModifyScoreFault {
        删除成绩数据类型 del = new 删除成绩数据类型();
        del.set课程编号(student.get课程编号());
        del.set学号(student.get学号());
        del.set成绩性质类型(student.get成绩性质类型());


        String result="";
        try{
            result = deleteScore(del);
        }catch (DeleteScoreFault fault){
            System.out.println(fault.getFaultInfo());
        }
        if(result.equals("操作成功")){
            try{
                result = addScore(student);
            }catch (AddScoreFault fault){
                System.out.println(fault.getFaultInfo());
            }
        }

        return result;
    }
    /*
    写scores.xml文件
     */
    private String writeXML(Document document){
        URL url = getClass().getResource("");
        String filePath = url.getPath().replace("WEB-INF", "");

        try{
            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File(filePath + "scores.xml"));
            transformer.transform(source, result);
            return "操作成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "操作失败： " + e.getMessage();
        }
    }

    /*
    读取scores.xml文件
     */
    private Document getDocument(){
//        URL url = getClass().getResource("");
//        System.out.println(url);
//        String filePath = url.getPath().replace("WEB-INF","");
//        System.out.println(filePath);

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setIgnoringElementContentWhitespace(true);

        Document document = null;
        try{
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse("src/scores.xml");
        }catch (Exception e){
            e.printStackTrace();
        }

        return document;
    }
}
