package JAXB;

import Entities.jw.*;
import Entities.www.DepAddress;
import Entities.www.Department;
import Entities.www.PersonInfo;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.util.JAXBSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.*;
import java.util.*;

/**
 * Created by duanzhengmou on 6/6/17.
 */
public class Main {
    public static void main(String args[]){
        // main
        try {
            assignment3();
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            assignment4();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    static void assignment3() throws JAXBException, SAXException, IOException {
        // read and un-marshal doc1
        JAXBContext readContext = JAXBContext.newInstance(Student.class);
        Unmarshaller doc1Unmarshaller = readContext.createUnmarshaller();
        Student doc1Student = (Student) doc1Unmarshaller.unmarshal(new File("jaxb4/src/main/xml/document1.xml"));
        System.out.println(doc1Student.getCourseList().getCourseList());
        JAXBSource doc1StudentSource = new JAXBSource(readContext, doc1Student);
        // validate doc1
        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = sf.newSchema(new File("jaxb4/src/main/xsd/Student.xsd"));
            // init validator
        Validator validator = schema.newValidator();
        validator.validate(doc1StudentSource);
        // generate more student info
        List<Student> newStudents = generateStudent();

//        Marshaller m = readContext.createMarshaller();
//        m.marshal(doc1Student, new File("test.xml"));

        // merge doc1 and new student info
        newStudents.add(doc1Student);
        StudentList studentList = new StudentList();
        studentList.setStudentList(newStudents);
        // write into file
        JAXBContext doc2Context = JAXBContext.newInstance(StudentList.class);
        Marshaller marshaller = doc2Context.createMarshaller();
        marshaller.marshal(studentList, new File("jaxb4/src/main/xml/document2.xml"));
    }


    static private List<Student> generateStudent(){
        String studentId[] = {"141250192", "121250216", "141250142", "141250004", "141250056", "141250205", "141250109", "141250160", "141250206", "141250050"};
        String name[] = {"张文玘", "张宇逸", "王亚杰", "曹江湖", "姜新炀", "周梦佳", "石婉蓉", "徐江成", "周锐", "花蕾"};
        String province[] = {"山西", "江苏", "河南", "湖北", "江苏", "江苏", "山西", "江苏", "江苏", "江苏"};
        String gender[] = {"女", "男", "男", "男", "男", "女", "女", "男", "男", "女"};

        List<Student> students = new ArrayList<Student>();
        Student studentTemplate = new Student();
        DepAddress dpAddr = new DepAddress();
        dpAddr.setProvince("江苏省");
        dpAddr.setCity("南京市");
        dpAddr.setDistrict("鼓楼区");
        dpAddr.setStreet("汉口路");
        dpAddr.setNumber("22号");
        Department dptm = new Department();
        dptm.setDepId("1");
        dptm.setDepName("软件学院");
        dptm.setDepType("院系单位");
        dptm.setDepAddress(dpAddr);
        PersonInfo pi = new PersonInfo();
        pi.setBirthDay("1996-01-01");
        pi.setIdCard("111123737384842222");
        pi.setPhone("18358376836");
        pi.setDepartment(dptm);

        studentTemplate.setPersonInfo(pi);
        studentTemplate.setCheckInYear("2014");

        for (int i=0;i<name.length;i++){
//            Student cur = studentTemplate.clone();
            Student cur = null;
            try {
                cur = copyStudent(studentTemplate);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            cur.setStudentId(studentId[i]);
            cur.getPersonInfo().setName(name[i]);
            System.out.println(cur.getPersonInfo().getName());
            cur.getPersonInfo().setNative_(province[i]);
            cur.getPersonInfo().setSex(gender[i]);
            cur.setCourseList(generateCourseList());
            students.add(cur);
        }

        return students;
    }

    static private CourseList generateCourseList(){
        CourseList courseList = new CourseList();
        List<Course> data = new ArrayList<Course>();
        Course discreteMathematics = new Course();
        discreteMathematics.setScoreList(generateScoreList());
        discreteMathematics.setCourseId("000000");
        discreteMathematics.setCourseName("离散数学");
        discreteMathematics.setTeacher("Jeff");
        data.add(discreteMathematics);

        Course calculus = new Course();
        calculus.setScoreList(generateScoreList());
        calculus.setCourseId("000001");
        calculus.setCourseName("线性代数");
        calculus.setTeacher("Tony");
        data.add(calculus);

        Course algebra = new Course();
        algebra.setScoreList(generateScoreList());
        algebra.setCourseId("000002");
        algebra.setCourseName("微积分");
        algebra.setTeacher("Adam");
        data.add(algebra);

        courseList.setCourseList(data);
        return courseList;
    }

    static private ScoreList generateScoreList(){
        ScoreList scoreList = new ScoreList();
        List<Score> scores = new ArrayList<Score>();

        Score score1 = new Score();
        score1.setScoreType("平时成绩");
        score1.setScoreValue(getRandomScore());

        Score score2 = new Score();
        score2.setScoreType("期末成绩");
        score2.setScoreValue(getRandomScore());

        Score score3 = new Score();
        score3.setScoreType("总评成绩");
        score3.setScoreValue(getRandomScore());
        scores.add(score1);
        scores.add(score2);
        scores.add(score3);
        scoreList.setScoreList(scores);
        return scoreList;
    }

    static private int getRandomScore(){
        return (int)Math.round(Math.random()*40)+40;
    }

    static private Student copyStudent(Student student) throws IOException, ClassNotFoundException {
        Student result;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeObject(student);

        ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(in);

        result = (Student) ois.readObject();
        ois.close();
        return result;
    }
    static void assignment4() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(StudentList.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Marshaller marshaller = context.createMarshaller();
        StudentList studentList = (StudentList) unmarshaller.unmarshal(new File("jaxb4/src/main/xml/document2.xml"));
        List<Student> students = studentList.getStudentList();


        // sort student's course
        // this is for document-3
        List<Student> sortedStudents = new ArrayList<>();
        for (int j=0;j<students.size();j++){
            Student curStudent = students.get(j);
            List<Course> courses = curStudent.getCourseList().getCourseList();
            for (int k=0;k<courses.size();k++){
                ScoreList sortedIndividualScores = sortScores(courses.get(k).getScoreList());
                courses.get(k).setScoreList(sortedIndividualScores);
            }
        }
        StudentList sortedStudentList = new StudentList();
        sortedStudentList.setStudentList(students);
        marshaller.marshal(sortedStudentList, new File("jaxb4/src/main/xml/document3.xml"));

        //  ======

        Unmarshaller fUnmarshaller = context.createUnmarshaller();
        Marshaller fMarshaller = context.createMarshaller();
        StudentList doc3List = (StudentList) fUnmarshaller.unmarshal(new File("jaxb4/src/main/xml/document3.xml"));
        List<Student> doc3students = doc3List.getStudentList();
        List<Student> filtered = new ArrayList<>();
        Map<String, Student> filterCheck = new HashMap<>();
        // filter student which has failed course
        // this is for document-4
        for (int i=0;i<doc3students.size();i++){
            Student cur = doc3students.get(i);
            if (hasFailed(cur) && !filterCheck.containsKey(cur.getStudentId())){
                filtered.add(cur);
                filterCheck.put(cur.getStudentId(), cur);
            }
        }
        StudentList filteredList = new StudentList();
        filteredList.setStudentList(filtered);
        fMarshaller.marshal(filteredList, new File("jaxb4/src/main/xml/document4.xml"));


    }

    static private ScoreList sortScores(ScoreList scoreList){
        List<Score> data = scoreList.getScoreList();
        Collections.sort(data);
        return scoreList;
    }

    static private boolean hasFailed(Student student){
        List<Course> courses = student.getCourseList().getCourseList();
        for (int i=0;i<courses.size();i++){
            List<Score> scores = courses.get(i).getScoreList().getScoreList();
            for (int j=0;j<scores.size();j++){
                if (scores.get(j).getScoreValue()<60){
                    return true;
                }
            }
        }

        return false;
    }
}
