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
 * Created by ���ī^ on 2017/6/15.
 */
@WebService
public class InfoManageImpl implements InfoManagementInterface{
    @Override
    public ѧ����Ϣ���� getInfoById(String studentId) throws InvalidDataFault {
        InvalidDataFault fault = null;
        if(studentId==null){
            �������� faultType = new ��������();
            faultType.setMissingParameter("studentId");
            fault = new InvalidDataFault("ȱ���������",faultType);
            //throw invalidDataFault
            throw fault;
        }else if(studentId.length()!=9){
            �������� faultType = new ��������();
            faultType.setInvalidStudentId(studentId);
            fault = new InvalidDataFault("�����������",faultType);
            throw fault;
        }

        Document document = IOHelper.getDocument("student.xml");

        NodeList nodes = document.getDocumentElement().getElementsByTagName("student");
        ѧ����Ϣ���� student = null;
        //student
        for(int i = 0; i < nodes.getLength(); i++){
            Node item = nodes.item(i);
            NamedNodeMap nodeAttr = item.getAttributes();
            String id = nodeAttr.getNamedItem("studentId").getTextContent();
            if(id.equals(studentId)){
                student = new ѧ����Ϣ����();
                student.setStudentId(id);

                NodeList childs = item.getChildNodes();
                //personInfo, checkInYear, courseList
                for(int j = 0; j < childs.getLength(); j++){
                    Node temp = childs.item(j);
                    if(temp.getNodeType()!=Node.ELEMENT_NODE){
                        continue;
                    }else{
                        //������Ϣ
                        ���˻�����Ϣ���� personInfo = new ���˻�����Ϣ����();
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
                                        �Ա����� sex = �Ա�����.fromValue(n.getTextContent());
                                        personInfo.setSex(sex);
                                    }else if(n.getNodeName().equals("phone")){
                                        personInfo.setPhone(n.getTextContent());
                                    }else if(n.getNodeName().equals("department")){
                                        //������Ϣ����
                                        personInfo.setDepartment(xml2Department(n));
                                    }
                                }
                            }
                            student.setPersonInfo(personInfo);
                        }else if(temp.getNodeName().equals("checkInYear")){
                            //��ѧ���
                            XMLGregorianCalendar checkInYear = string2Date(temp.getTextContent(), new SimpleDateFormat("yyyy"));
                            student.setCheckInYear(checkInYear);
                        }else if(temp.getNodeName().equals("courseList")){
                            //�γ��б�
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
            �������� faultType = new ��������();
            faultType.setNoResult(studentId);
            fault = new InvalidDataFault("û�ж�Ӧ���",faultType);
            throw fault;
        }
    }

    @Override
    public ѧ���б����� getInfoByName(String studentName) throws InvalidDataFault {
        InvalidDataFault fault = null;
        if(studentName==null){
            �������� faultType = new ��������();
            faultType.setMissingParameter("studentName");
            fault = new InvalidDataFault("ȱ���������",faultType);
            //throw invalidDataFault
            throw fault;
        }
        ѧ���б����� studentList = new ѧ���б�����();
        Document document = IOHelper.getDocument("student.xml");

        NodeList nodes = document.getDocumentElement().getElementsByTagName("student");

        for(int i = 0; i < nodes.getLength(); i++){
            ѧ����Ϣ���� student = null;
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
            �������� faultType = new ��������();
            faultType.setNoResult(studentName);
            fault = new InvalidDataFault("û�ж�Ӧ���",faultType);
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
            �������� faultType = new ��������();
            faultType.setInvalidStudentId(studentId);
            InvalidDataFault fault = new InvalidDataFault("û�ж�ӦID���û�����",faultType);
            throw fault;
        }
        return IOHelper.writeXML(document, "student.xml");
    }

    @Override
    public String addInfo(ѧ����Ϣ���� student) throws InvalidDataFault {
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
            �������� faultType = new ��������();
            faultType.setInvalidStudentId(student.getStudentId());
            InvalidDataFault fault = new InvalidDataFault("�Ѵ��ڶ�Ӧid��ѧ��", faultType);
            throw fault;
        }
        //��id���û������ڣ��������
        Element studentEle = document.createElement("student");
        studentEle.setAttribute("studentId",student.getStudentId());
        Element personInfoEle = document.createElement("personInfo");
        Element checkInYearEle = document.createElement("checkInYear");
        Element courseListEle = document.createElement("courseList");

        ���˻�����Ϣ���� personInfo = student.getPersonInfo();
        personInfoEle.setAttribute("idCard",personInfo.getIdCard());
        Element nameEle = document.createElement("name"); nameEle.setTextContent(personInfo.getName());
        Element nativeEle = document.createElement("native"); nativeEle.setTextContent(personInfo.getNative());
        Element birthdayEle = document.createElement("birthday"); birthdayEle.setTextContent(date2String(personInfo.getBirthday(), new SimpleDateFormat("yyyy-MM-dd")));
        Element sexEle = document.createElement("sex"); sexEle.setTextContent(personInfo.getSex().value());
        Element phoneEle = document.createElement("phone"); phoneEle.setTextContent(personInfo.getPhone());

        ������Ϣ���� department = personInfo.getDepartment();
        Element departmentEle = document.createElement("department");
        departmentEle.setAttribute("depId",String.valueOf(department.getDepId()));
        Element depTypeEle = document.createElement("depType"); depTypeEle.setTextContent(department.getDepType().value());
        Element depNameEle = document.createElement("depName"); depNameEle.setTextContent(department.getDepName());

        ��ַ���� addr = department.getDepAddress();
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

        List<�γ���Ϣ����> courseList = student.getCourseList().getCourse();
        for(int i = 0; i < courseList.size(); i++){
            �γ���Ϣ���� course = courseList.get(i);
            Element courseEle = document.createElement("course");
            courseEle.setAttribute("courseId",course.getCourseId());
            courseEle.setAttribute("courseName",course.getCourseName());
            Element teacherEle = document.createElement("teacher");
            teacherEle.setTextContent(course.getTeacher());

            Element scoreListEle = document.createElement("scoreList");
            List<����ɼ�����> scoreList = course.getScoreList().getScore();
            for(int j = 0; j < scoreList.size(); j++){
                ����ɼ����� score = scoreList.get(j);
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
    public String modifyInfo(ѧ����Ϣ���� student) throws InvalidDataFault {
        //���ԸĽ�
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
        return "�����ɹ�";
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
    ת���������ͣ���Ϊ�ϸ�������Ƕ�ײ���̫���ˡ�����
     */
    private ������Ϣ���� xml2Department(Node node){
        ������Ϣ���� department = new ������Ϣ����();
        String depId = node.getAttributes().getNamedItem("depId").getTextContent();
        department.setDepId(Integer.parseInt(depId));
        NodeList nodeList = node.getChildNodes();
        for(int i = 0; i < nodeList.getLength(); i++){
            Node temp = nodeList.item(i);
            if(temp.getNodeName().equals("depType")){
                department.setDepType(��������.fromValue(temp.getTextContent()));
            }else if(temp.getNodeName().equals("depName")){
                department.setDepName(temp.getTextContent());
            }else if(temp.getNodeName().equals("depAddress")){
                ��ַ���� address = new ��ַ����();
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
    nodeת��Ϊ�γ��б�����
     */
    private �γ��б����� xml2CourseList(Node node){
        �γ��б����� coursesInfo = new �γ��б�����();

        NodeList courses = node.getChildNodes();
        for(int i = 0; i < courses.getLength(); i++){
            Node n = courses.item(i);
            �γ���Ϣ���� course = new �γ���Ϣ����();
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

    private �γ̳ɼ���Ϣ���� xml2ScoreList(Node node){
        �γ̳ɼ���Ϣ���� scoreInfo = new �γ̳ɼ���Ϣ����();
        List<����ɼ�����> scoreList = new ArrayList<>();
        NodeList scores = node.getChildNodes();
        for(int i = 0; i < scores.getLength(); i++){
            Node item = scores.item(i);
            ����ɼ����� score = new ����ɼ�����();
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
                    score.setScoreType(�÷�����.fromValue(n.getTextContent()));
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
