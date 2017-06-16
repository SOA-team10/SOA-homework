package ass7;

import helper.IOHelper;
import org.w3c.dom.*;
import schema.*;


import javax.jws.WebService;
import java.util.ArrayList;

/**
 * Created by ���ī^ on 2017/6/13.
 */
@WebService
public class StuScoreImpl implements StuScoreInterface {


    @Override
    public ����ѧ���ɼ��б����� searchScore(String studentId) throws SearchScoreFault {
        Document document = IOHelper.getDocument("scores.xml");
        ArrayList<���Ƴɼ�����> list = new ArrayList<>();

        if(studentId==null){
            �������� faultType = new ��������();
            faultType.setMissingParameter("δ����ѧ��id����");
            SearchScoreFault fault = new SearchScoreFault("ȱ�ٲ���",faultType);
            throw fault;
        }else if(studentId.length()!=9){
            �������� faultType = new ��������();
            faultType.setInvalidStudentId(studentId);
            throw new SearchScoreFault("������ʽ����",faultType);
        }
        NodeList nodes = document.getDocumentElement().getElementsByTagName("tns:courseScore");
        boolean isFount = false;
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
                    isFount = true;
                    ���Ƴɼ����� single = new ���Ƴɼ�����();
                    single.set����(score);
                    single.set�÷�����(�ɼ���������.fromValue(scoreType));
                    single.set�γ̱��(courseId);
                    list.add(single);
                }
            }
        }
        ����ѧ���ɼ��б����� studentScores = new ����ѧ���ɼ��б�����();
        studentScores.setѧ��(studentId);
        studentScores.set����ɼ�(list);

        if(!isFount){
            �������� faultType = new ��������();
            faultType.setNoResult(studentId);
            throw new SearchScoreFault("δ�ҵ���Ӧ���",faultType);

        }

        return studentScores;
    }

    @Override
    public String addScore(��ӻ��޸ĳɼ��������� student) throws AddScoreFault {

        Document document = IOHelper.getDocument("scores.xml");
//        System.out.println(student.getѧ��());
//        System.out.println(student.get�γ̱��());
//         System.out.println(student.get�÷�����().value());
//        System.out.println(student.get����());
        String id = student.getѧ��();
        if(id==null){
            �������� faultType = new ��������();
            faultType.setMissingParameter("δ����ѧ��id����");
            AddScoreFault fault = new AddScoreFault("ȱ�ٲ���",faultType);
            throw fault;
        }else if(id.length()!=9){
            �������� faultType = new ��������();
            faultType.setInvalidStudentId(id);
            throw new AddScoreFault("������ʽ����",faultType);
        }


        //����γ̺ͳɼ������Ƿ��Ѿ�����
        NodeList nodes = document.getDocumentElement().getElementsByTagName("tns:courseScore");
        Element courseScoreEle = null;
        //���ѧ��������ɼ��ǲ����Ѿ�������
        boolean existed = false;
        for(int i = 0; i < nodes.getLength(); i++){
            NamedNodeMap nodeAttr = nodes.item(i).getAttributes();
//            System.out.println("courseId:"+nodeAttr.getNamedItem("courseId").getTextContent()+",scoreType"+nodeAttr.getNamedItem("scoreType").getTextContent());
            String courseId = nodeAttr.getNamedItem("courseId").getTextContent();
            String scoreType = nodeAttr.getNamedItem("scoreType").getTextContent();
            if(courseId.equals(student.get�γ̱��())&&scoreType.equals(student.get�÷�����().value())){
                System.out.println("�γ̺ͳɼ������Ѵ���");
                NodeList child = nodes.item(i).getChildNodes();
                for(int j = 0; j < child.getLength(); j++){
                    Node n = child.item(j);
                    for(int k = 0; k < n.getChildNodes().getLength(); k++){
                        Node n1 = n.getChildNodes().item(k);
                        if(n1.getNodeName().equals("tns:studentId")){
                            if(n1.getTextContent().equals(student.getѧ��())){
                                existed = true;
                                break;
                            }
                        }
                    }
                    if(existed){
                        break;
                    }
                }
                courseScoreEle = (Element) nodes.item(i);
                break;
            }
        }

        //����γ̺ͳɼ����ʲ�����
        if(courseScoreEle==null){
            System.out.println("�γ̺ͳɼ����ʲ�����");
            courseScoreEle = document.createElement("tns:courseScore");
            courseScoreEle.setAttribute("courseId",student.get�γ̱��());
            courseScoreEle.setAttribute("scoreType",student.get�÷�����().value());
        }

        if(existed){
            �������� faultType = new ��������();
            String faultInfo = student.getѧ��()+","+student.get�γ̱��()+","+student.get�÷�����().value();
            faultType.setInvalidStudentId(faultInfo);
            throw new AddScoreFault("�Ѵ��ڶ�Ӧ�ɼ�",faultType);

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

        return IOHelper.writeXML(document,"scores.xml");
    }

    @Override
    public String deleteScore(ɾ���ɼ��������� student) throws DeleteScoreFault {
        Document document = IOHelper.getDocument("scores.xml");

        NodeList nodes = document.getElementsByTagName("tns:courseScore");

        boolean isFound = false;
        for(int i = 0; i < nodes.getLength(); i++){
            NamedNodeMap nodeAttr = nodes.item(i).getAttributes();
            String courseId = nodeAttr.getNamedItem("courseId").getTextContent();
            String scoreType = nodeAttr.getNamedItem("scoreType").getTextContent();
            if(courseId.equals(student.get�γ̱��())&& scoreType.equals(student.get�÷�����().value())){
                NodeList childNodes = nodes.item(i).getChildNodes();
                //score��
                for(int j = 0; j < childNodes.getLength(); j++){
                    NodeList temp = childNodes.item(j).getChildNodes();
                    for(int k = 0; k < temp.getLength(); k++){
                        if(temp.item(k).getNodeType()!=Node.ELEMENT_NODE){
                            continue;
                        }else{
                            System.out.println(temp.item(k).getNodeName());
                            //�Ƚ�ѧ��
                            if(temp.item(k).getNodeName().equals("tns:studentId")){
                                System.out.println("ѧ�ţ�"+temp.item(k).getTextContent());
                                //���ѧ��һ���Ļ���ɾ������ڵ�
                                if(temp.item(k).getTextContent().equals(student.getѧ��())){
                                    nodes.item(i).removeChild(childNodes.item(j));
                                    isFound = true;
                                    break;
                                }
                            }
                        }
                    }
                    if(isFound){
                        break;
                    }
                }
            }
            if(isFound){
                break;
            }
        }
        if(!isFound){
            �������� faultType = new ��������();
            faultType.setNoResult(student.getѧ��()+","+student.get�γ̱��()+","+student.get�÷�����().value());
            throw new DeleteScoreFault("û���ҵ���Ӧ��ɼ�",faultType);
        }

        return IOHelper.writeXML(document,"scores.xml");
    }

    @Override
    public String modifyScore(��ӻ��޸ĳɼ��������� student) throws ModifyScoreFault {
        ɾ���ɼ��������� del = new ɾ���ɼ���������();
        del.set�γ̱��(student.get�γ̱��());
        del.setѧ��(student.getѧ��());
        del.set�÷�����(�ɼ���������.fromValue(student.get�÷�����().value()));


        String result="";
        try{
            result = deleteScore(del);
        }catch (DeleteScoreFault fault){
            throw new ModifyScoreFault(fault.getMessage(),fault.getFaultInfo());
        }
        if(result.equals("�����ɹ�")){
            try{
                result = addScore(student);
            }catch (AddScoreFault fault){
                throw new ModifyScoreFault(fault.getMessage(),fault.getFaultInfo());
            }
        }

        return result;
    }


}
