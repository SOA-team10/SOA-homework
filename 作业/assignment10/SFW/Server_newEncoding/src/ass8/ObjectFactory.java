
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
     * Create an instance of {@link VerifyInfoType }
     * 
     */
    public VerifyInfoType create验证信息类型() {
        return new VerifyInfoType();
    }

    /**
     * Create an instance of {@link VerifyResultType }
     * 
     */
    public VerifyResultType create验证结果类型() {
        return new VerifyResultType();
    }

    /**
     * Create an instance of {@link StudentInfoType }
     * 
     */
    public StudentInfoType createStudentInfoType() {
        return new StudentInfoType();
    }

    /**
     * Create an instance of {@link FaultType }
     * 
     */
    public FaultType create错误类型() {
        return new FaultType();
    }

    /**
     * Create an instance of {@link CourseInfoType }
     * 
     */
    public CourseInfoType create课程信息类型() {
        return new CourseInfoType();
    }

    /**
     * Create an instance of {@link CourseListType }
     * 
     */
    public CourseListType create课程列表类型() {
        return new CourseListType();
    }

    /**
     * Create an instance of {@link DepartmentInfoType }
     * 
     */
    public DepartmentInfoType create部门信息类型() {
        return new DepartmentInfoType();
    }

    /**
     * Create an instance of {@link PersonalBasicInfoType }
     * 
     */
    public PersonalBasicInfoType createPersonalBasicInfoType() {
        return new PersonalBasicInfoType();
    }

//    /**
//     * Create an instance of {@link 返回信息类型 }
//     *
//     */
//    public 返回信息类型 create返回信息类型() {
//        return new 返回信息类型();
//    }

    /**
     * Create an instance of {@link IndividualScoreItemType }
     * 
     */
    public IndividualScoreItemType createIndividualScoreItemType() {
        return new IndividualScoreItemType();
    }

    /**
     * Create an instance of {@link CourseScoreInfoType }
     * 
     */
    public CourseScoreInfoType create课程成绩信息类型() {
        return new CourseScoreInfoType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepartmentInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "department")
    public JAXBElement<DepartmentInfoType> createDepartment(DepartmentInfoType value) {
        return new JAXBElement<DepartmentInfoType>(_Department_QNAME, DepartmentInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalBasicInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "personInfo")
    public JAXBElement<PersonalBasicInfoType> createPersonInfo(PersonalBasicInfoType value) {
        return new JAXBElement<PersonalBasicInfoType>(_PersonInfo_QNAME, PersonalBasicInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/ass7", name = "verifyInfo")
    public JAXBElement<VerifyInfoType> createVerifyInfo(VerifyInfoType value) {
        return new JAXBElement<VerifyInfoType>(_VerifyInfo_QNAME, VerifyInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CourseListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "courseList")
    public JAXBElement<CourseListType> createCourseList(CourseListType value) {
        return new JAXBElement<CourseListType>(_CourseList_QNAME, CourseListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "ErrorMsg")
    public JAXBElement<FaultType> createErrorMsg(FaultType value) {
        return new JAXBElement<FaultType>(_ErrorMsg_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CourseInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "course")
    public JAXBElement<CourseInfoType> createCourse(CourseInfoType value) {
        return new JAXBElement<CourseInfoType>(_Course_QNAME, CourseInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "VerifyMsg")
    public JAXBElement<VerifyResultType> createVerifyMsg(VerifyResultType value) {
        return new JAXBElement<VerifyResultType>(_VerifyMsg_QNAME, VerifyResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "student")
    public JAXBElement<StudentInfoType> createStudent(StudentInfoType value) {
        return new JAXBElement<StudentInfoType>(_Student_QNAME, StudentInfoType.class, null, value);
    }

}
