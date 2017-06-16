package ass8;

import helper.IOHelper;
import org.w3c.dom.*;
import schema.*;

import javax.jws.WebService;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by 张文玘 on 2017/6/15.
 */
@WebService
public class InfoManageImpl implements InfoManagementInterface{
    @Override
    public 学生信息类型 getInfoById(String studentId) throws InvalidDataFault {
        InvalidDataFault fault = null;
        if(studentId==null){
            错误类型 faultType = new 错误类型();
            faultType.setMissingParameter("studentId");
            fault = new InvalidDataFault("缺少请求参数",faultType);
            //throw invalidDataFault
            throw fault;
        }else if(studentId.length()!=9){
            错误类型 faultType = new 错误类型();
            faultType.setInvalidStudentId(studentId);
            fault = new InvalidDataFault("请求参数错误",faultType);
            throw fault;
        }

        Document document = IOHelper.getDocument("student.xml");

        NodeList nodes = document.getDocumentElement().getElementsByTagName("student");
        学生信息类型 student = null;
        //student
        for(int i = 0; i < nodes.getLength(); i++){
            Node item = nodes.item(i);
            NamedNodeMap nodeAttr = item.getAttributes();
            String id = nodeAttr.getNamedItem("studentId").getTextContent();
            if(id.equals(studentId)){
                student = new 学生信息类型();
                student.setStudentId(id);

                NodeList childs = item.getChildNodes();
                //personInfo, checkInYear, courseList
                for(int j = 0; j < childs.getLength(); j++){
                    Node temp = childs.item(j);
                    if(temp.getNodeType()!=Node.ELEMENT_NODE){
                        continue;
                    }else{
                        //基本信息
                        个人基本信息类型 personInfo = new 个人基本信息类型();
                        if(temp.getNodeName().equals("personInfo")){
                            String idCard = temp.getAttributes().getNamedItem("idCard").getTextContent();
                            personInfo.setIdCard(idCard);
                            NodeList infoList = temp.getChildNodes();
                            for(int k = 0; k < infoList.getLength(); k++){
                                Node n = infoList.item(k);
                                if(n.getNodeType()!=Node.ELEMENT_NODE){
                                    continue;
                                }else{
                                    if(n.getNodeName().equals("name")){
                                        personInfo.setName(n.getTextContent());
                                    }else if(n.getNodeName().equals("native")){
                                        personInfo.setNative(n.getTextContent());
                                    }else if(n.getNodeName().equals("birthday")){
                                        personInfo.setBirthday(string2Date(n.getTextContent(),new SimpleDateFormat("yyyy-MM-dd")));
                                    }else if(n.getNodeName().equals("sex")){
                                        性别类型 sex = 性别类型.fromValue(n.getTextContent());
                                        personInfo.setSex(sex);
                                    }else if(n.getNodeName().equals("phone")){
                                        personInfo.setPhone(n.getTextContent());
                                    }else if(n.getNodeName().equals("department")){
                                        //部门信息类型
                                        personInfo.setDepartment(xml2Department(n));
                                    }
                                }
                            }
                            student.setPersonInfo(personInfo);
                        }else if(temp.getNodeName().equals("checkInYear")){
                            //入学年份
                            XMLGregorianCalendar checkInYear = string2Date(temp.getTextContent(), new SimpleDateFormat("yyyy"));
                            student.setCheckInYear(checkInYear);
                        }else if(temp.getNodeName().equals("courseList")){
                            //课程列表
                            student.setCourseList(xml2CourseList(temp));
                        }
                    }
                }
                break;
            }

        }

        if(student!=null){
            return student;
        }else{
            错误类型 faultType = new 错误类型();
            faultType.setNoResult(studentId);
            fault = new InvalidDataFault("没有对应结果",faultType);
            throw fault;
        }
    }

    @Override
    public 学生列表类型 getInfoByName(String studentName) throws InvalidDataFault {
        InvalidDataFault fault = null;
        if(studentName==null){
            错误类型 faultType = new 错误类型();
            faultType.setMissingParameter("studentName");
            fault = new InvalidDataFault("缺少请求参数",faultType);
            //throw invalidDataFault
            throw fault;
        }
        学生列表类型 studentList = new 学生列表类型();
        Document document = IOHelper.getDocument("student.xml");

        NodeList nodes = document.getDocumentElement().getElementsByTagName("student");

        for(int i = 0; i < nodes.getLength(); i++){
            学生信息类型 student = null;
            boolean isFound = false;
            Node s = nodes.item(i);
            String studentId = s.getAttributes().getNamedItem("studentId").getTextContent();

            NodeList child = s.getChildNodes();
            for(int j = 0; j < child.getLength(); j++){
                Node n = child.item(j);
                if(n.getNodeType()!=Node.ELEMENT_NODE){
                    continue;
                }
                if(n.getNodeName().equals("personInfo")){
                    NodeList infoList = n.getChildNodes();
                    for(int k = 0; k < infoList.getLength(); k++){
                        Node info = infoList.item(k);
                        if (info.getNodeName().equals("name")) {
                            if (info.getTextContent().equals(studentName)) {
                                isFound = true;
                                student = getInfoById(studentId);
                                studentList.getStudent().add(student);
                            } else {
                                break;
                            }
                        }
                    }
                    if(!isFound) break;
                }
            }
        }

        if(studentList.getStudent().size()!=0) {
            return studentList;
        }else{
            错误类型 faultType = new 错误类型();
            faultType.setNoResult(studentName);
            fault = new InvalidDataFault("没有对应结果",faultType);
            throw fault;
        }
    }

    @Override
    public String deleteInfo(String studentId) throws InvalidDataFault {
        Document document = IOHelper.getDocument("student.xml");

        NodeList nodes = document.getDocumentElement().getElementsByTagName("student");
        boolean isFound = false;
        for(int i = 0; i < nodes.getLength(); i++){
            String id = nodes.item(i).getAttributes().getNamedItem("studentId").getTextContent();
            if(id.equals(studentId)){
                System.out.println(nodes.item(i).getNodeName());
                System.out.println(document.getDocumentElement().getNodeName());
                document.getDocumentElement().removeChild(nodes.item(i));
                isFound = true;
                break;
            }
        }

        if(!isFound){
            错误类型 faultType = new 错误类型();
            faultType.setInvalidStudentId(studentId);
            InvalidDataFault fault = new InvalidDataFault("没有对应ID的用户存在",faultType);
            throw fault;
        }
        return IOHelper.writeXML(document, "student.xml");
    }

    @Override
    public String addInfo(学生信息类型 student) throws InvalidDataFault {
        Document document = IOHelper.getDocument("student.xml");

        boolean existed = false;
        NodeList nodes = document.getElementsByTagName("student");
        for(int i = 0; i < nodes.getLength(); i++){
            String studentId = nodes.item(i).getAttributes().getNamedItem("studentId").getTextContent();
            if(studentId.equals(student.getStudentId())){
                existed = true;
                break;
            }
        }

        if(existed) {
            错误类型 faultType = new 错误类型();
            faultType.setInvalidStudentId(student.getStudentId());
            InvalidDataFault fault = new InvalidDataFault("已存在对应id的学生", faultType);
            throw fault;
        }
        //该id的用户不存在，可以添加
        Element studentEle = document.createElement("student");
        studentEle.setAttribute("studentId",student.getStudentId());
        Element personInfoEle = document.createElement("personInfo");
        Element checkInYearEle = document.createElement("checkInYear");
        Element courseListEle = document.createElement("courseList");

        个人基本信息类型 personInfo = student.getPersonInfo();
        personInfoEle.setAttribute("idCard",personInfo.getIdCard());
        Element nameEle = document.createElement("name"); nameEle.setTextContent(personInfo.getName());
        Element nativeEle = document.createElement("native"); nativeEle.setTextContent(personInfo.getNative());
        Element birthdayEle = document.createElement("birthday"); birthdayEle.setTextContent(date2String(personInfo.getBirthday(), new SimpleDateFormat("yyyy-MM-dd")));
        Element sexEle = document.createElement("sex"); sexEle.setTextContent(personInfo.getSex().value());
        Element phoneEle = document.createElement("phone"); phoneEle.setTextContent(personInfo.getPhone());

        部门信息类型 department = personInfo.getDepartment();
        Element departmentEle = document.createElement("department");
        departmentEle.setAttribute("depId",String.valueOf(department.getDepId()));
        Element depTypeEle = document.createElement("depType"); depTypeEle.setTextContent(department.getDepType().value());
        Element depNameEle = document.createElement("depName"); depNameEle.setTextContent(department.getDepName());

        地址类型 addr = department.getDepAddress();
        Element depAddressEle = document.createElement("depAddress");
        Element provinceEle = document.createElement("province"); provinceEle.setTextContent(addr.getProvince());
        Element cityEle = document.createElement("city"); cityEle.setTextContent(addr.getCity());
        Element districtEle = document.createElement("district"); districtEle.setTextContent(addr.getDistrict());
        Element streetEle = document.createElement("street"); streetEle.setTextContent(addr.getStreet());
        Element numberEle = document.createElement("number"); numberEle.setTextContent(addr.getNumber());

        depAddressEle.appendChild(provinceEle);
        depAddressEle.appendChild(cityEle);
        depAddressEle.appendChild(districtEle);
        depAddressEle.appendChild(streetEle);
        depAddressEle.appendChild(numberEle);

        departmentEle.appendChild(depTypeEle);
        departmentEle.appendChild(depNameEle);
        departmentEle.appendChild(depAddressEle);

        personInfoEle.appendChild(nameEle);
        personInfoEle.appendChild(nativeEle);
        personInfoEle.appendChild(birthdayEle);
        personInfoEle.appendChild(sexEle);
        personInfoEle.appendChild(phoneEle);
        personInfoEle.appendChild(departmentEle);

        checkInYearEle.setTextContent(date2String(student.getCheckInYear(),new SimpleDateFormat("yyyy")));

        List<课程信息类型> courseList = student.getCourseList().getCourse();
        for(int i = 0; i < courseList.size(); i++){
            课程信息类型 course = courseList.get(i);
            Element courseEle = document.createElement("course");
            courseEle.setAttribute("courseId",course.getCourseId());
            courseEle.setAttribute("courseName",course.getCourseName());
            Element teacherEle = document.createElement("teacher");
            teacherEle.setTextContent(course.getTeacher());

            Element scoreListEle = document.createElement("scoreList");
            List<单项成绩类型> scoreList = course.getScoreList().getScore();
            for(int j = 0; j < scoreList.size(); j++){
                单项成绩类型 score = scoreList.get(j);
                Element scoreEle = document.createElement("score");
                Element scoreTypeEle = document.createElement("scoreType"); scoreTypeEle.setTextContent(score.getScoreType().value());
                Element scoreValueEle = document.createElement("scoreValue"); scoreValueEle.setTextContent(String.valueOf(score.getScoreValue()));

                scoreEle.appendChild(scoreTypeEle);
                scoreEle.appendChild(scoreValueEle);

                scoreListEle.appendChild(scoreEle);
            }
            courseEle.appendChild(scoreListEle);
            courseListEle.appendChild(courseEle);

        }

        studentEle.appendChild(personInfoEle);
        studentEle.appendChild(checkInYearEle);
        studentEle.appendChild(courseListEle);

        document.getDocumentElement().appendChild(studentEle);


        return IOHelper.writeXML(document,"student.xml");
    }


    @Override
    public String modifyInfo(学生信息类型 student) throws InvalidDataFault {
        //可以改进
        try {
            deleteInfo(student.getStudentId());
        }catch (InvalidDataFault e){
            throw e;
        }
        try {
            addInfo(student);
        }catch (InvalidDataFault e){
            throw e;
        }
        return "操作成功";
    }

    private String date2String(XMLGregorianCalendar date, DateFormat format){
        Date d = date.toGregorianCalendar().getTime();
        String dateTimeString = format.format(d);
        return dateTimeString;
    }

    private XMLGregorianCalendar string2Date(String string, DateFormat format){
        Date date = null;
        try {
            date = format.parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }

            DatatypeFactory factory = null;
            try {
                factory = DatatypeFactory.newInstance();
            } catch (DatatypeConfigurationException e) {
                e.printStackTrace();
            }

            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(date);
            return factory.newXMLGregorianCalendar(gc);


    }

    /*
    转换部门类型（因为上个方法的嵌套层数太多了。。。
     */
    private 部门信息类型 xml2Department(Node node){
        部门信息类型 department = new 部门信息类型();
        String depId = node.getAttributes().getNamedItem("depId").getTextContent();
        department.setDepId(Integer.parseInt(depId));
        NodeList nodeList = node.getChildNodes();
        for(int i = 0; i < nodeList.getLength(); i++){
            Node temp = nodeList.item(i);
            if(temp.getNodeName().equals("depType")){
                department.setDepType(部门类型.fromValue(temp.getTextContent()));
            }else if(temp.getNodeName().equals("depName")){
                department.setDepName(temp.getTextContent());
            }else if(temp.getNodeName().equals("depAddress")){
                地址类型 address = new 地址类型();
                NodeList childs = temp.getChildNodes();
                for(int j = 0; j < childs.getLength(); j++){
                    Node n = childs.item(j);
                    if(n.getNodeName().equals("province")){
                        address.setProvince(n.getTextContent());
                    }else if(n.getNodeName().equals("city")){
                        address.setCity(n.getTextContent());
                    }else if(n.getNodeName().equals("district")){
                        address.setDistrict(n.getTextContent());
                    }else if(n.getNodeName().equals("street")){
                        address.setStreet(n.getTextContent());
                    }else if(n.getNodeName().equals("number")){
                        address.setNumber(n.getTextContent());
                    }
                }
                department.setDepAddress(address);
            }
        }
        return department;
    }

    /*
    node转换为课程列表类型
     */
    private 课程列表类型 xml2CourseList(Node node){
        课程列表类型 coursesInfo = new 课程列表类型();

        NodeList courses = node.getChildNodes();
        for(int i = 0; i < courses.getLength(); i++){
            Node n = courses.item(i);
            课程信息类型 course = new 课程信息类型();
            if(n.getNodeType()!=Node.ELEMENT_NODE){
                continue;
            }

            NamedNodeMap nodeAttr = n.getAttributes();
            course.setCourseId(nodeAttr.getNamedItem("courseId").getTextContent());
            course.setCourseName(nodeAttr.getNamedItem("courseName").getTextContent());

            NodeList childs = n.getChildNodes();

            for(int j = 0; j < childs.getLength(); j++){
                if(childs.item(j).getNodeName().equals("teacher")){
                    course.setTeacher(childs.item(j).getTextContent());
                }else if(childs.item(j).getNodeName().equals("scoreList")){
                    course.setScoreList(xml2ScoreList(childs.item(j)));
                }
            }
            coursesInfo.getCourse().add(course);
        }
        return coursesInfo;

    }

    private 课程成绩信息类型 xml2ScoreList(Node node){
        课程成绩信息类型 scoreInfo = new 课程成绩信息类型();
        List<单项成绩类型> scoreList = new ArrayList<>();
        NodeList scores = node.getChildNodes();
        for(int i = 0; i < scores.getLength(); i++){
            Node item = scores.item(i);
            单项成绩类型 score = new 单项成绩类型();
            if(item.getNodeType()!=Node.ELEMENT_NODE){
                continue;
            }
            NodeList child = item.getChildNodes();
            for(int j = 0; j < child.getLength(); j++){
                Node n = child.item(j);
                if(n.getNodeType()!=Node.ELEMENT_NODE){
                    continue;
                }

                if(n.getNodeName().equals("scoreType")){
                    score.setScoreType(得分性质.fromValue(n.getTextContent()));
                }else if(n.getNodeName().equals("scoreValue")){
                    score.setScoreValue(Integer.parseInt(n.getTextContent()));
                }
            }
            scoreList.add(score);

        }
        scoreInfo.setScore(scoreList);
        return scoreInfo;
    }


}
