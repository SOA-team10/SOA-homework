
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
     * Create an instance of {@link DeleteScoreType }
     * 
     */
    public DeleteScoreType createDeleteScoreType() {
        return new DeleteScoreType();
    }

    /**
     * Create an instance of {@link IndividualStudentScoreListType }
     * 
     */
    public IndividualStudentScoreListType createIndividualStudentScoreListType() {
        return new IndividualStudentScoreListType();
    }

    /**
     * Create an instance of {@link AddOrModifyScoreType }
     * 
     */
    public AddOrModifyScoreType create添加或修改成绩数据类型() {
        return new AddOrModifyScoreType();
    }

    /**
     * Create an instance of {@link CourseScoreListType }
     * 
     */
    public CourseScoreListType create课程成绩列表类型() {
        return new CourseScoreListType();
    }

    /**
     * Create an instance of {@link StudentInfoType }
     * 
     */
    public StudentInfoType createStudentInfoType() {
        return new StudentInfoType();
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

    /**
     * Create an instance of {@link IndividualCourseScoreType }
     * 
     */
    public IndividualCourseScoreType createIndividualCourseScoreType() {
        return new IndividualCourseScoreType();
    }

    /**
     * Create an instance of {@link CourseScoreType }
     * 
     */
    public CourseScoreType create课程成绩类型() {
        return new CourseScoreType();
    }

    /**
     * Create an instance of {@link CourseScoreInfoType }
     * 
     */
    public CourseScoreInfoType create课程成绩信息类型() {
        return new CourseScoreInfoType();
    }

    /**
     * Create an instance of {@link IndividualScoreItemType }
     * 
     */
    public IndividualScoreItemType createIndividualScoreItemType() {
        return new IndividualScoreItemType();
    }

    /**
     * Create an instance of {@link BJScoreType }
     * 
     */
    public BJScoreType create成绩类型() {
        return new BJScoreType();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CourseInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "course")
    public JAXBElement<CourseInfoType> createCourse(CourseInfoType value) {
        return new JAXBElement<CourseInfoType>(_Course_QNAME, CourseInfoType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link IndividualStudentScoreListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/test1", name = "studentScore")
    public JAXBElement<IndividualStudentScoreListType> createStudentScore(IndividualStudentScoreListType value) {
        return new JAXBElement<IndividualStudentScoreListType>(_StudentScore_QNAME, IndividualStudentScoreListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CourseScoreListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "scoreList")
    public JAXBElement<CourseScoreListType> createScoreList(CourseScoreListType value) {
        return new JAXBElement<CourseScoreListType>(_ScoreList_QNAME, CourseScoreListType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/test1", name = "isSuccess")
    public JAXBElement<String> createIsSuccess(String value) {
        return new JAXBElement<String>(_IsSuccess_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrModifyScoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/test1", name = "modifyScore")
    public JAXBElement<AddOrModifyScoreType> createModifyScore(AddOrModifyScoreType value) {
        return new JAXBElement<AddOrModifyScoreType>(_ModifyScore_QNAME, AddOrModifyScoreType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "student")
    public JAXBElement<StudentInfoType> createStudent(StudentInfoType value) {
        return new JAXBElement<StudentInfoType>(_Student_QNAME, StudentInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrModifyScoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/test1", name = "addScore")
    public JAXBElement<AddOrModifyScoreType> createAddScore(AddOrModifyScoreType value) {
        return new JAXBElement<AddOrModifyScoreType>(_AddScore_QNAME, AddOrModifyScoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteScoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/test1", name = "deleteScore")
    public JAXBElement<DeleteScoreType> createDeleteScore(DeleteScoreType value) {
        return new JAXBElement<DeleteScoreType>(_DeleteScore_QNAME, DeleteScoreType.class, null, value);
    }

}
