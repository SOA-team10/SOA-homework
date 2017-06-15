
package ass8;

import schema.*;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ass8 package.
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
    private final static QName _PersonInfo_QNAME = new QName("http://jw.nju.edu.cn/schema", "personInfo");
    private final static QName _VerifyInfo_QNAME = new QName("http://jw.nju.edu.cn/ass7", "verifyInfo");
    private final static QName _CourseList_QNAME = new QName("http://jw.nju.edu.cn/schema", "courseList");
    private final static QName _ErrorMsg_QNAME = new QName("http://jw.nju.edu.cn/schema", "ErrorMsg");
    private final static QName _Course_QNAME = new QName("http://jw.nju.edu.cn/schema", "course");
    private final static QName _VerifyMsg_QNAME = new QName("http://jw.nju.edu.cn/schema", "VerifyMsg");
    private final static QName _Student_QNAME = new QName("http://jw.nju.edu.cn/schema", "student");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ass8
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link 验证信息类型 }
     * 
     */
    public 验证信息类型 create验证信息类型() {
        return new 验证信息类型();
    }

    /**
     * Create an instance of {@link 验证结果类型 }
     * 
     */
    public 验证结果类型 create验证结果类型() {
        return new 验证结果类型();
    }

    /**
     * Create an instance of {@link 学生信息类型 }
     * 
     */
    public 学生信息类型 create学生信息类型() {
        return new 学生信息类型();
    }

    /**
     * Create an instance of {@link 错误类型 }
     * 
     */
    public 错误类型 create错误类型() {
        return new 错误类型();
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

//    /**
//     * Create an instance of {@link 返回信息类型 }
//     *
//     */
//    public 返回信息类型 create返回信息类型() {
//        return new 返回信息类型();
//    }

    /**
     * Create an instance of {@link 单项成绩类型 }
     * 
     */
    public 单项成绩类型 create单项成绩类型() {
        return new 单项成绩类型();
    }

    /**
     * Create an instance of {@link 课程成绩信息类型 }
     * 
     */
    public 课程成绩信息类型 create课程成绩信息类型() {
        return new 课程成绩信息类型();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link 个人基本信息类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "personInfo")
    public JAXBElement<个人基本信息类型> createPersonInfo(个人基本信息类型 value) {
        return new JAXBElement<个人基本信息类型>(_PersonInfo_QNAME, 个人基本信息类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 验证信息类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/ass7", name = "verifyInfo")
    public JAXBElement<验证信息类型> createVerifyInfo(验证信息类型 value) {
        return new JAXBElement<验证信息类型>(_VerifyInfo_QNAME, 验证信息类型.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link 错误类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "ErrorMsg")
    public JAXBElement<错误类型> createErrorMsg(错误类型 value) {
        return new JAXBElement<错误类型>(_ErrorMsg_QNAME, 错误类型.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link 验证结果类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "VerifyMsg")
    public JAXBElement<验证结果类型> createVerifyMsg(验证结果类型 value) {
        return new JAXBElement<验证结果类型>(_VerifyMsg_QNAME, 验证结果类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 学生信息类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "student")
    public JAXBElement<学生信息类型> createStudent(学生信息类型 value) {
        return new JAXBElement<学生信息类型>(_Student_QNAME, 学生信息类型.class, null, value);
    }

}
