
package ass7;

import schema.*;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ass7 package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Department_QNAME = new QName("http://jw.nju.edu.cn/schema", "department");
    private final static QName _Course_QNAME = new QName("http://jw.nju.edu.cn/schema", "course");
    private final static QName _InvalidDataError_QNAME = new QName("http://jw.nju.edu.cn/test1", "invalidDataError");
    private final static QName _StudentScore_QNAME = new QName("http://jw.nju.edu.cn/test1", "studentScore");
    private final static QName _ScoreList_QNAME = new QName("http://jw.nju.edu.cn/schema", "scoreList");
    private final static QName _PersonInfo_QNAME = new QName("http://jw.nju.edu.cn/schema", "personInfo");
    private final static QName _IsSuccess_QNAME = new QName("http://jw.nju.edu.cn/test1", "isSuccess");
    private final static QName _CourseList_QNAME = new QName("http://jw.nju.edu.cn/schema", "courseList");
    private final static QName _ModifyScore_QNAME = new QName("http://jw.nju.edu.cn/test1", "modifyScore");
    private final static QName _StudentId_QNAME = new QName("http://jw.nju.edu.cn/test1", "studentId");
    private final static QName _Student_QNAME = new QName("http://jw.nju.edu.cn/schema", "student");
    private final static QName _AddScore_QNAME = new QName("http://jw.nju.edu.cn/test1", "addScore");
    private final static QName _DeleteScore_QNAME = new QName("http://jw.nju.edu.cn/test1", "deleteScore");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ass7
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link 删除成绩数据类型 }
     * 
     */
    public 删除成绩数据类型 create删除成绩数据类型() {
        return new 删除成绩数据类型();
    }

    /**
     * Create an instance of {@link 单个学生成绩列表类型 }
     * 
     */
    public 单个学生成绩列表类型 create单个学生成绩列表类型() {
        return new 单个学生成绩列表类型();
    }

    /**
     * Create an instance of {@link 添加或修改成绩数据类型 }
     * 
     */
    public 添加或修改成绩数据类型 create添加或修改成绩数据类型() {
        return new 添加或修改成绩数据类型();
    }

    /**
     * Create an instance of {@link 课程成绩列表类型 }
     * 
     */
    public 课程成绩列表类型 create课程成绩列表类型() {
        return new 课程成绩列表类型();
    }

    /**
     * Create an instance of {@link 学生信息类型 }
     * 
     */
    public 学生信息类型 create学生信息类型() {
        return new 学生信息类型();
    }

    /**
     * Create an instance of {@link 课程信息类型 }
     * 
     */
    public 课程信息类型 create课程信息类型() {
        return new 课程信息类型();
    }

    /**
     * Create an instance of {@link 课程列表类型 }
     * 
     */
    public 课程列表类型 create课程列表类型() {
        return new 课程列表类型();
    }

    /**
     * Create an instance of {@link 部门信息类型 }
     * 
     */
    public 部门信息类型 create部门信息类型() {
        return new 部门信息类型();
    }

    /**
     * Create an instance of {@link 个人基本信息类型 }
     * 
     */
    public 个人基本信息类型 create个人基本信息类型() {
        return new 个人基本信息类型();
    }

    /**
     * Create an instance of {@link 单科成绩类型 }
     * 
     */
    public 单科成绩类型 create单科成绩类型() {
        return new 单科成绩类型();
    }

    /**
     * Create an instance of {@link 课程成绩类型 }
     * 
     */
    public 课程成绩类型 create课程成绩类型() {
        return new 课程成绩类型();
    }

    /**
     * Create an instance of {@link 课程成绩信息类型 }
     * 
     */
    public 课程成绩信息类型 create课程成绩信息类型() {
        return new 课程成绩信息类型();
    }

    /**
     * Create an instance of {@link 单项成绩类型 }
     * 
     */
    public 单项成绩类型 create单项成绩类型() {
        return new 单项成绩类型();
    }

    /**
     * Create an instance of {@link 成绩类型 }
     * 
     */
    public 成绩类型 create成绩类型() {
        return new 成绩类型();
    }

    /**
     * Create an instance of {@link 地址类型 }
     * 
     */
    public 地址类型 create地址类型() {
        return new 地址类型();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 部门信息类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "department")
    public JAXBElement<部门信息类型> createDepartment(部门信息类型 value) {
        return new JAXBElement<部门信息类型>(_Department_QNAME, 部门信息类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 课程信息类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "course")
    public JAXBElement<课程信息类型> createCourse(课程信息类型 value) {
        return new JAXBElement<课程信息类型>(_Course_QNAME, 课程信息类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/test1", name = "invalidDataError")
    public JAXBElement<String> createInvalidDataError(String value) {
        return new JAXBElement<String>(_InvalidDataError_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 单个学生成绩列表类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/test1", name = "studentScore")
    public JAXBElement<单个学生成绩列表类型> createStudentScore(单个学生成绩列表类型 value) {
        return new JAXBElement<单个学生成绩列表类型>(_StudentScore_QNAME, 单个学生成绩列表类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 课程成绩列表类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "scoreList")
    public JAXBElement<课程成绩列表类型> createScoreList(课程成绩列表类型 value) {
        return new JAXBElement<课程成绩列表类型>(_ScoreList_QNAME, 课程成绩列表类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 个人基本信息类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "personInfo")
    public JAXBElement<个人基本信息类型> createPersonInfo(个人基本信息类型 value) {
        return new JAXBElement<个人基本信息类型>(_PersonInfo_QNAME, 个人基本信息类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/test1", name = "isSuccess")
    public JAXBElement<String> createIsSuccess(String value) {
        return new JAXBElement<String>(_IsSuccess_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 课程列表类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "courseList")
    public JAXBElement<课程列表类型> createCourseList(课程列表类型 value) {
        return new JAXBElement<课程列表类型>(_CourseList_QNAME, 课程列表类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 添加或修改成绩数据类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/test1", name = "modifyScore")
    public JAXBElement<添加或修改成绩数据类型> createModifyScore(添加或修改成绩数据类型 value) {
        return new JAXBElement<添加或修改成绩数据类型>(_ModifyScore_QNAME, 添加或修改成绩数据类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/test1", name = "studentId")
    public JAXBElement<String> createStudentId(String value) {
        return new JAXBElement<String>(_StudentId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 学生信息类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "student")
    public JAXBElement<学生信息类型> createStudent(学生信息类型 value) {
        return new JAXBElement<学生信息类型>(_Student_QNAME, 学生信息类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 添加或修改成绩数据类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/test1", name = "addScore")
    public JAXBElement<添加或修改成绩数据类型> createAddScore(添加或修改成绩数据类型 value) {
        return new JAXBElement<添加或修改成绩数据类型>(_AddScore_QNAME, 添加或修改成绩数据类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 删除成绩数据类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/test1", name = "deleteScore")
    public JAXBElement<删除成绩数据类型> createDeleteScore(删除成绩数据类型 value) {
        return new JAXBElement<删除成绩数据类型>(_DeleteScore_QNAME, 删除成绩数据类型.class, null, value);
    }

}
