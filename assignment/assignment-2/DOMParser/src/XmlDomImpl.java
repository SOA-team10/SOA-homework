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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 * Created by 张文玘 on 2017/4/16.
 */
public class XmlDomImpl implements XmlInterface{
    private Document document;
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public void init(){
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            docFactory.setValidating(true);
            DocumentBuilder builder = docFactory.newDocumentBuilder();
            document = builder.newDocument();
        }catch (ParserConfigurationException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void createXml(String fileName) throws ParseException {
        Element root = document.createElement("studentList");

        root.setAttribute("xmlns","http://jw.nju.edu.cn/schema");
        document.appendChild(root);
        //办公地址
        Address address = new Address();
        address.setProvince("江苏省");
        address.setCity("南京市");
        address.setDistrict("鼓楼区");
        address.setStreet("汉口路");
        address.setNumber("22号");
        //部门信息
        Department department = new Department();
        department.setDepId(1);
        department.setDepName("软件学院");
        department.setDepType("院系单位");
        department.setDepAddress(address);
        //学生1
        Student student1 = new Student();
        student1.setId("141250033");
        student1.setIdCard("530000199602191533");
        student1.setName("段正谋");
        student1.setSex("男");
        student1.setPhone("18260068888");
        student1.setBirthday(sdf.parse("1996-02-19"));
        student1.setDepartment(department);
        student1.setProvince("云南");
        student1.setCheckInYear("2014");
        ArrayList<Score> scores = getScoreByStudent(student1.getId());
        student1.setScores(scores);
        root.appendChild(appendStudent(student1));

        //学生2
        Student student2 = new Student();
        student2.setId("141250192");
        student2.setIdCard("140311199512251522");
        student2.setName("张文玘");
        student2.setSex("女");
        student2.setPhone("18260068636");
        student2.setBirthday(sdf.parse("1995-12-25"));
        student2.setDepartment(department);
        student2.setProvince("山西");
        student2.setCheckInYear("2014");
        student2.setScores(getScoreByStudent(student2.getId()));
        root.appendChild(appendStudent(student2));

        //学生3
        Student student3 = new Student();
        student3.setId("141220142");
        student3.setIdCard("410000199509131432");
        student3.setName("王亚杰");
        student3.setSex("男");
        student3.setPhone("18260068888");
        student3.setBirthday(sdf.parse("1995-09-13"));
        student3.setDepartment(department);
        student3.setProvince("河南");
        student3.setCheckInYear("2014");
        student3.setScores(getScoreByStudent(student3.getId()));
        root.appendChild(appendStudent(student3));

        //学生4
        Student student4 = new Student();
        student4.setId("121250216");
        student4.setIdCard("111111111111223323");
        student4.setName("张宇逸");
        student4.setSex("男");
        student4.setPhone("18260068888");
        student4.setBirthday(sdf.parse("1992-09-09"));
        student4.setDepartment(department);
        student4.setProvince("江苏省");
        student4.setCheckInYear("2012");
        student4.setScores(getScoreByStudent(student4.getId()));
        root.appendChild(appendStudent(student4));

        //学生5
        Student student5 = new Student();
        student5.setId("141250004");
        student5.setIdCard("111123737384842222");
        student5.setName("曹江湖");
        student5.setSex("男");
        student5.setPhone("18260068888");
        student5.setBirthday(sdf.parse("1996-02-24"));
        student5.setDepartment(department);
        student5.setProvince("湖北");
        student5.setCheckInYear("2014");
        student5.setScores(getScoreByStudent(student5.getId()));
        root.appendChild(appendStudent(student5));

        //学生6
        Student student6 = new Student();
        student6.setId("141250205");
        student6.setIdCard("123333223323231233");
        student6.setName("周梦佳");
        student6.setSex("女");
        student6.setPhone("18260068888");
        student6.setBirthday(sdf.parse("1996-03-11"));
        student6.setDepartment(department);
        student6.setProvince("江苏");
        student6.setCheckInYear("2014");
        student6.setScores(getScoreByStudent(student6.getId()));
        root.appendChild(appendStudent(student6));

        //学生7
        Student student7 = new Student();
        student7.setId("141250056");
        student7.setIdCard("123333232333232322");
        student7.setName("姜新炀");
        student7.setSex("男");
        student7.setPhone("18260068888");
        student7.setBirthday(sdf.parse("1996-08-10"));
        student7.setDepartment(department);
        student7.setProvince("江苏");
        student7.setCheckInYear("2014");
        student7.setScores(getScoreByStudent(student7.getId()));
        root.appendChild(appendStudent(student7));

        //学生8
        Student student8 = new Student();
        student8.setId("141250109");
        student8.setIdCard("140311202929484712");
        student8.setName("石婉容");
        student8.setSex("女");
        student8.setPhone("18260068888");
        student8.setBirthday(sdf.parse("1997-02-08"));
        student8.setDepartment(department);
        student8.setProvince("山西");
        student8.setCheckInYear("2014");
        student8.setScores(getScoreByStudent(student8.getId()));
        root.appendChild(appendStudent(student8));

        //学生9
        Student student9 = new Student();
        student9.setId("141250160");
        student9.setIdCard("10292332324583939");
        student9.setName("徐江成");
        student9.setSex("男");
        student9.setPhone("18260068888");
        student9.setBirthday(sdf.parse("1996-05-21"));
        student9.setDepartment(department);
        student9.setProvince("江苏");
        student9.setCheckInYear("2014");
        student9.setScores(getScoreByStudent(student9.getId()));
        root.appendChild(appendStudent(student9));

        //学生10
        Student student10 = new Student();
        student10.setId("141250206");
        student10.setIdCard("122333234555433323");
        student10.setName("周锐");
        student10.setSex("男");
        student10.setPhone("18260068888");
        student10.setBirthday(sdf.parse("1995-10-23"));
        student10.setDepartment(department);
        student10.setProvince("江苏");
        student10.setCheckInYear("2014");
        student10.setScores(getScoreByStudent(student10.getId()));
        root.appendChild(appendStudent(student10));

        //学生11
        Student student11 = new Student();
        student11.setId("141250050");
        student11.setIdCard("122333234555433320");
        student11.setName("花蕾");
        student11.setSex("女");
        student11.setPhone("18260068888");
        student11.setBirthday(sdf.parse("1996-10-06"));
        student11.setDepartment(department);
        student11.setProvince("江苏");
        student11.setCheckInYear("2014");
        student11.setScores(getScoreByStudent(student11.getId()));
        root.appendChild(appendStudent(student11));






        TransformerFactory tf = TransformerFactory.newInstance();
        try {
            Transformer transformer = tf.newTransformer();
            DOMSource source = new DOMSource(document);
            transformer.setOutputProperty(OutputKeys.ENCODING, "gb2312");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
            StreamResult result = new StreamResult(pw);

            //设置换行和缩进
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");

            transformer.transform(source, result);
            System.out.println("生成XML文件成功!");
        } catch (TransformerConfigurationException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (TransformerException e) {
            System.out.println(e.getMessage());
        }


    }

    private ArrayList<Score> getScoresByCourse(String studentId, String courseId){
        ArrayList<Score> scores = new ArrayList<>();

        Score usual = new Score();
        usual.setCourseId(courseId);
        usual.setStudentId(studentId);
        usual.setScoreType("平时成绩");
        usual.setScore(getRandom(0,100));
        scores.add(usual);

        Score exam = new Score();
        exam.setCourseId(courseId);
        exam.setStudentId(studentId);
        exam.setScoreType("期末成绩");
        exam.setScore(getRandom(0,100));
        scores.add(exam);

        Score total = new Score();
        total.setCourseId(courseId);
        total.setStudentId(studentId);
        total.setScoreType("总评成绩");
        total.setScore(getRandom(0,100));
        scores.add(total);

        return scores;

    }

    private int getRandom(int min, int max){
        Random random = new Random();
        int s = random.nextInt(max)%(max-min) + min;
        return s;
    }

    private ArrayList<Score> getScoreByStudent(String studentId){
        ArrayList<Score> scores = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            String courseId = "00000"+i;
            scores.addAll(getScoresByCourse(studentId, courseId));
        }

        return scores;
    }

    //添加学生节点
    private Element appendStudent(Student student){
        Element studentElement = document.createElement("student");

        studentElement.setAttribute("studentId", student.getId());

        Element personInfo = document.createElement("personInfo");
        personInfo.setAttribute("idCard",student.getIdCard());
        personInfo.setAttribute("xmlns","http://www.nju.edu.cn/schema");
        studentElement.appendChild(personInfo);

        Element name = document.createElement("name");
        name.setTextContent(student.getName());
        personInfo.appendChild(name);

        Element province = document.createElement("native");
        province.setTextContent(student.getProvince());
        personInfo.appendChild(province);

        Element phone = document.createElement("phone");
        phone.setTextContent(student.getPhone());
        personInfo.appendChild(phone);

        Element birthday = document.createElement("birthday");
        birthday.setTextContent(sdf.format(student.getBirthday()));
        personInfo.appendChild(birthday);

        Element sex = document.createElement("sex");
        sex.setTextContent(student.getSex());
        personInfo.appendChild(sex);

        Element checkInYear = document.createElement("checkInYear");
        checkInYear.setTextContent(student.getCheckInYear());
        studentElement.appendChild(checkInYear);

        Element department = appendDepartment(student.getDepartment());
        studentElement.appendChild(department);


        Element scoreList = appendScore(student.getScores());
        studentElement.appendChild(scoreList);

        return studentElement;
    }

    //添加部门节点
    private Element appendDepartment(Department department){
        Element departmentNode = document.createElement("department");

        departmentNode.setAttribute("depId", String.valueOf(department.getDepId()));

        Element depType = document.createElement("depType");
        depType.setTextContent(department.getDepType());
        departmentNode.appendChild(depType);

        Element depName = document.createElement("depName");
        depName.setTextContent(department.getDepName());
        departmentNode.appendChild(depName);

        Element depAddress = document.createElement("depAddress");
        departmentNode.appendChild(depAddress);

        Address address = department.getDepAddress();

        Element province = document.createElement("province");
        province.setTextContent(address.getProvince());
        depAddress.appendChild(province);

        Element city = document.createElement("city");
        city.setTextContent(address.getCity());
        depAddress.appendChild(city);

        Element district = document.createElement("district");
        district.setTextContent(address.getDistrict());
        depAddress.appendChild(district);

        Element street = document.createElement("street");
        street.setTextContent(address.getStreet());
        depAddress.appendChild(street);

        Element number = document.createElement("number");
        number.setTextContent(address.getNumber());
        depAddress.appendChild(number);


        return departmentNode;
    }
    //添加成绩节点
    private Element appendScore(ArrayList<Score> scoreList){
        Element scoresNode = document.createElement("scoreList");

        for(int i = 0; i < scoreList.size(); i++){
            Score score = scoreList.get(i);
            Element courseScore = document.createElement("courseScore");
            Element scoreNode = document.createElement("score");
            courseScore.appendChild(scoreNode);
            courseScore.setAttribute("courseId", score.getCourseId());
            courseScore.setAttribute("scoreType", score.getScoreType());

            Element studentId = document.createElement("studentId");
            studentId.setTextContent(score.getStudentId());
            scoreNode.appendChild(studentId);

            Element studentScore = document.createElement("studentScore");
            studentScore.setTextContent(String.valueOf(score.getScore()));
            scoreNode.appendChild(studentScore);

            scoresNode.appendChild(courseScore);
        }

        return scoresNode;

    }

    @Override
    public void parseXml(String fileName) {

    }
}
