package wsdl;

import org.w3c.dom.*;
import schema.*;
import schema.����ѧ���ɼ��б�����;
import schema.����ɼ�����;


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
 * Created by ���ī^ on 2017/6/13.
 */
@WebService
public class StuScoreImpl implements StuScoreInterface{


    @Override
    public ����ѧ���ɼ��б����� searchScore(String studentId) throws SearchScoreFault {
        Document document = getDocument();
        ArrayList<����ɼ�����> list = new ArrayList<>();

        NodeList nodes = document.getDocumentElement().getElementsByTagName("tns:courseScore");

        //courseScore��
        for(int i = 0; i < nodes.getLength(); i++){
            NodeList childNodes = nodes.item(i).getChildNodes();

            NamedNodeMap nodeAttr = nodes.item(i).getAttributes();

            String courseId = nodeAttr.getNamedItem("courseId").getTextContent();
            String scoreType = nodeAttr.getNamedItem("scoreType").getTextContent();
            System.out.println("�γ̱����ɼ����ͣ�"+courseId+" "+scoreType);
            //score��
            for(int j = 0; j < childNodes.getLength(); j++){
                Node temp = childNodes.item(j);
                if(temp.getNodeType() != Node.ELEMENT_NODE){
                    continue;
                }
                //�Ƚ�ѧ��
                String stuId = "";
                int score = 0;
                //score�ڲ���studentId��studentScore����
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

                //������ڵ��ѧ���Ƿ�Ϊ���ҵ�ѧ��
                if(stuId.equals(studentId)){
                    ����ɼ����� single = new ����ɼ�����();
                    single.set����(score);
                    single.set�÷�����(�÷�����.fromValue(scoreType));
                    single.set�γ̱��(courseId);
                    list.add(single);
                }
            }
        }
        ����ѧ���ɼ��б����� studentScores = new ����ѧ���ɼ��б�����();
        studentScores.setѧ��(studentId);
        studentScores.set����ɼ�(list);

        return studentScores;
    }

    @Override
    public String addScore(��ӻ��޸ĳɼ��������� student) throws AddScoreFault {

        Document document = getDocument();
        System.out.println(student.getѧ��());
        System.out.println(student.get�γ̱��());
        System.out.println(student.get�ɼ���������().value());
        System.out.println(student.get����());

        //����γ̺ͳɼ������Ƿ��Ѿ�����
        NodeList nodes = document.getDocumentElement().getElementsByTagName("tns:courseScore");
        Element courseScoreEle = null;
        for(int i = 0; i < nodes.getLength(); i++){
            NamedNodeMap nodeAttr = nodes.item(i).getAttributes();
            System.out.println("courseId:"+nodeAttr.getNamedItem("courseId").getTextContent()+",scoreType"+nodeAttr.getNamedItem("scoreType").getTextContent());
            String courseId = nodeAttr.getNamedItem("courseId").getTextContent();
            String scoreType = nodeAttr.getNamedItem("scoreType").getTextContent();
            if(courseId.equals(student.get�γ̱��())&&scoreType.equals(student.get�ɼ���������().value())){
                System.out.println("�γ̺ͳɼ������Ѵ���");
                courseScoreEle = (Element) nodes.item(i);
                break;
            }
        }

        //����γ̺ͳɼ����ʲ�����
        if(courseScoreEle==null){
            System.out.println("�γ̺ͳɼ����ʲ�����");
            courseScoreEle = document.createElement("tns:courseScore");
            courseScoreEle.setAttribute("courseId",student.get�γ̱��());
            courseScoreEle.setAttribute("scoreType",student.get�ɼ���������().value());
        }

        //����ӵ�����д��document��
        Element score = document.createElement("tns:score");
        Element studentId = document.createElement("tns:studentId");
        Element studentScore = document.createElement("tns:studentScore");
        studentId.setTextContent(student.getѧ��());
        studentScore.setTextContent(String.valueOf(student.get����()));
        score.appendChild(studentId);
        score.appendChild(studentScore);
        courseScoreEle.appendChild(score);

        return writeXML(document);
    }

    @Override
    public String deleteScore(ɾ���ɼ��������� student) throws DeleteScoreFault {
        Document document = getDocument();

        NodeList nodes = document.getElementsByTagName("tns:courseScore");
        Element delEle = null;

        for(int i = 0; i < nodes.getLength(); i++){
            NamedNodeMap nodeAttr = nodes.item(i).getAttributes();
            String courseId = nodeAttr.getNamedItem("courseId").getTextContent();
            String scoreType = nodeAttr.getNamedItem("scoreType").getTextContent();
            if(courseId.equals(student.get�γ̱��())&& scoreType.equals(student.get�ɼ���������().value())){
                NodeList childNodes = nodes.item(i).getChildNodes();
                //score��
                for(int j = 0; j < childNodes.getLength(); j++){
                    NodeList temp = childNodes.item(i).getChildNodes();
                    for(int k = 0; k < temp.getLength(); k++){
                        if(temp.item(k).getNodeType()!=Node.ELEMENT_NODE){
                            continue;
                        }else{
                            //�Ƚ�ѧ��
                            if(temp.item(k).getNodeName().equals("tns:studentId")){
                                //���ѧ��һ���Ļ���ɾ������ڵ�
                                if(temp.item(k).getTextContent().equals(student.getѧ��())){
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
    public String modifyScore(��ӻ��޸ĳɼ��������� student) throws ModifyScoreFault {
        ɾ���ɼ��������� del = new ɾ���ɼ���������();
        del.set�γ̱��(student.get�γ̱��());
        del.setѧ��(student.getѧ��());
        del.set�ɼ���������(student.get�ɼ���������());


        String result="";
        try{
            result = deleteScore(del);
        }catch (DeleteScoreFault fault){
            System.out.println(fault.getFaultInfo());
        }
        if(result.equals("�����ɹ�")){
            try{
                result = addScore(student);
            }catch (AddScoreFault fault){
                System.out.println(fault.getFaultInfo());
            }
        }

        return result;
    }
    /*
    дscores.xml�ļ�
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
            return "�����ɹ�";
        } catch (Exception e) {
            e.printStackTrace();
            return "����ʧ�ܣ� " + e.getMessage();
        }
    }

    /*
    ��ȡscores.xml�ļ�
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
