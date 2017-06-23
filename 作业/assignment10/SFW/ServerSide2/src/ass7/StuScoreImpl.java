package ass7;

import helper.IOHelper;
import org.w3c.dom.*;
import schema.*;


import javax.jws.WebService;
import java.util.ArrayList;

/**
 * Created by 张文玘 on 2017/6/13.
 */
@WebService
public class StuScoreImpl implements StuScoreInterface {


    @Override
    public 单个学生成绩列表类型 searchScore(String studentId) throws SearchScoreFault {
        Document document = IOHelper.getDocument("scores.xml");
        ArrayList<单科成绩类型> list = new ArrayList<>();

        if(studentId==null){
            错误类型 faultType = new 错误类型();
            faultType.setMissingParameter("未传入学生id参数");
            SearchScoreFault fault = new SearchScoreFault("缺少参数",faultType);
            throw fault;
        }else if(studentId.length()!=9){
            错误类型 faultType = new 错误类型();
            faultType.setInvalidStudentId(studentId);
            throw new SearchScoreFault("参数格式错误",faultType);
        }
        NodeList nodes = document.getDocumentElement().getElementsByTagName("tns:courseScore");
        boolean isFount = false;
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
                    isFount = true;
                    单科成绩类型 single = new 单科成绩类型();
                    single.set分数(score);
                    single.set得分性质(成绩性质类型.fromValue(scoreType));
                    single.set课程编号(courseId);
                    list.add(single);
                }
            }
        }
        单个学生成绩列表类型 studentScores = new 单个学生成绩列表类型();
        studentScores.set学号(studentId);
        studentScores.set单项成绩(list);

        if(!isFount){
            错误类型 faultType = new 错误类型();
            faultType.setNoResult(studentId);
            throw new SearchScoreFault("未找到对应结果",faultType);

        }

        return studentScores;
    }

    @Override
    public String addScore(添加或修改成绩数据类型 student) throws AddScoreFault {

        Document document = IOHelper.getDocument("scores.xml");
//        System.out.println(student.get学号());
//        System.out.println(student.get课程编号());
//         System.out.println(student.get得分性质().value());
//        System.out.println(student.get分数());
        String id = student.get学号();
        if(id==null){
            错误类型 faultType = new 错误类型();
            faultType.setMissingParameter("未传入学生id参数");
            AddScoreFault fault = new AddScoreFault("缺少参数",faultType);
            throw fault;
        }else if(id.length()!=9){
            错误类型 faultType = new 错误类型();
            faultType.setInvalidStudentId(id);
            throw new AddScoreFault("参数格式错误",faultType);
        }


        //检验课程和成绩性质是否已经存在
        NodeList nodes = document.getDocumentElement().getElementsByTagName("tns:courseScore");
        Element courseScoreEle = null;
        //这个学生的这项成绩是不是已经存在了
        boolean existed = false;
        for(int i = 0; i < nodes.getLength(); i++){
            NamedNodeMap nodeAttr = nodes.item(i).getAttributes();
//            System.out.println("courseId:"+nodeAttr.getNamedItem("courseId").getTextContent()+",scoreType"+nodeAttr.getNamedItem("scoreType").getTextContent());
            String courseId = nodeAttr.getNamedItem("courseId").getTextContent();
            String scoreType = nodeAttr.getNamedItem("scoreType").getTextContent();
            if(courseId.equals(student.get课程编号())&&scoreType.equals(student.get得分性质().value())){
                System.out.println("课程和成绩性质已存在");
                NodeList child = nodes.item(i).getChildNodes();
                for(int j = 0; j < child.getLength(); j++){
                    Node n = child.item(j);
                    for(int k = 0; k < n.getChildNodes().getLength(); k++){
                        Node n1 = n.getChildNodes().item(k);
                        if(n1.getNodeName().equals("tns:studentId")){
                            if(n1.getTextContent().equals(student.get学号())){
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

        //如果课程和成绩性质不存在
        if(courseScoreEle==null){
            System.out.println("课程和成绩性质不存在");
            courseScoreEle = document.createElement("tns:courseScore");
            courseScoreEle.setAttribute("courseId",student.get课程编号());
            courseScoreEle.setAttribute("scoreType",student.get得分性质().value());
        }

        if(existed){
            错误类型 faultType = new 错误类型();
            String faultInfo = student.get学号()+","+student.get课程编号()+","+student.get得分性质().value();
            faultType.setInvalidStudentId(faultInfo);
            throw new AddScoreFault("已存在对应成绩",faultType);

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

        return IOHelper.writeXML(document,"scores.xml");
    }

    @Override
    public String deleteScore(删除成绩数据类型 student) throws DeleteScoreFault {
        Document document = IOHelper.getDocument("scores.xml");

        NodeList nodes = document.getElementsByTagName("tns:courseScore");

        boolean isFound = false;
        for(int i = 0; i < nodes.getLength(); i++){
            NamedNodeMap nodeAttr = nodes.item(i).getAttributes();
            String courseId = nodeAttr.getNamedItem("courseId").getTextContent();
            String scoreType = nodeAttr.getNamedItem("scoreType").getTextContent();
            if(courseId.equals(student.get课程编号())&& scoreType.equals(student.get得分性质().value())){
                NodeList childNodes = nodes.item(i).getChildNodes();
                //score层
                for(int j = 0; j < childNodes.getLength(); j++){
                    NodeList temp = childNodes.item(j).getChildNodes();
                    for(int k = 0; k < temp.getLength(); k++){
                        if(temp.item(k).getNodeType()!=Node.ELEMENT_NODE){
                            continue;
                        }else{
                            System.out.println(temp.item(k).getNodeName());
                            //比较学号
                            if(temp.item(k).getNodeName().equals("tns:studentId")){
                                System.out.println("学号："+temp.item(k).getTextContent());
                                //如果学号一样的话，删掉这个节点
                                if(temp.item(k).getTextContent().equals(student.get学号())){
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
            错误类型 faultType = new 错误类型();
            faultType.setNoResult(student.get学号()+","+student.get课程编号()+","+student.get得分性质().value());
            throw new DeleteScoreFault("没有找到对应项成绩",faultType);
        }

        return IOHelper.writeXML(document,"scores.xml");
    }

    @Override
    public String modifyScore(添加或修改成绩数据类型 student) throws ModifyScoreFault {
        删除成绩数据类型 del = new 删除成绩数据类型();
        del.set课程编号(student.get课程编号());
        del.set学号(student.get学号());
        del.set得分性质(成绩性质类型.fromValue(student.get得分性质().value()));


        String result="";
        try{
            result = deleteScore(del);
        }catch (DeleteScoreFault fault){
            throw new ModifyScoreFault(fault.getMessage(),fault.getFaultInfo());
        }
        if(result.equals("操作成功")){
            try{
                result = addScore(student);
            }catch (AddScoreFault fault){
                throw new ModifyScoreFault(fault.getMessage(),fault.getFaultInfo());
            }
        }

        return result;
    }


}
