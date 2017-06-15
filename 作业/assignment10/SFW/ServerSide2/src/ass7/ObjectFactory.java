
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
     * Create an instance of {@link ɾ���ɼ��������� }
     * 
     */
    public ɾ���ɼ��������� createɾ���ɼ���������() {
        return new ɾ���ɼ���������();
    }

    /**
     * Create an instance of {@link ����ѧ���ɼ��б����� }
     * 
     */
    public ����ѧ���ɼ��б����� create����ѧ���ɼ��б�����() {
        return new ����ѧ���ɼ��б�����();
    }

    /**
     * Create an instance of {@link ��ӻ��޸ĳɼ��������� }
     * 
     */
    public ��ӻ��޸ĳɼ��������� create��ӻ��޸ĳɼ���������() {
        return new ��ӻ��޸ĳɼ���������();
    }

    /**
     * Create an instance of {@link �γ̳ɼ��б����� }
     * 
     */
    public �γ̳ɼ��б����� create�γ̳ɼ��б�����() {
        return new �γ̳ɼ��б�����();
    }

    /**
     * Create an instance of {@link ѧ����Ϣ���� }
     * 
     */
    public ѧ����Ϣ���� createѧ����Ϣ����() {
        return new ѧ����Ϣ����();
    }

    /**
     * Create an instance of {@link �γ���Ϣ���� }
     * 
     */
    public �γ���Ϣ���� create�γ���Ϣ����() {
        return new �γ���Ϣ����();
    }

    /**
     * Create an instance of {@link �γ��б����� }
     * 
     */
    public �γ��б����� create�γ��б�����() {
        return new �γ��б�����();
    }

    /**
     * Create an instance of {@link ������Ϣ���� }
     * 
     */
    public ������Ϣ���� create������Ϣ����() {
        return new ������Ϣ����();
    }

    /**
     * Create an instance of {@link ���˻�����Ϣ���� }
     * 
     */
    public ���˻�����Ϣ���� create���˻�����Ϣ����() {
        return new ���˻�����Ϣ����();
    }

    /**
     * Create an instance of {@link ���Ƴɼ����� }
     * 
     */
    public ���Ƴɼ����� create���Ƴɼ�����() {
        return new ���Ƴɼ�����();
    }

    /**
     * Create an instance of {@link �γ̳ɼ����� }
     * 
     */
    public �γ̳ɼ����� create�γ̳ɼ�����() {
        return new �γ̳ɼ�����();
    }

    /**
     * Create an instance of {@link �γ̳ɼ���Ϣ���� }
     * 
     */
    public �γ̳ɼ���Ϣ���� create�γ̳ɼ���Ϣ����() {
        return new �γ̳ɼ���Ϣ����();
    }

    /**
     * Create an instance of {@link ����ɼ����� }
     * 
     */
    public ����ɼ����� create����ɼ�����() {
        return new ����ɼ�����();
    }

    /**
     * Create an instance of {@link �ɼ����� }
     * 
     */
    public �ɼ����� create�ɼ�����() {
        return new �ɼ�����();
    }

    /**
     * Create an instance of {@link ��ַ���� }
     * 
     */
    public ��ַ���� create��ַ����() {
        return new ��ַ����();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ������Ϣ���� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "department")
    public JAXBElement<������Ϣ����> createDepartment(������Ϣ���� value) {
        return new JAXBElement<������Ϣ����>(_Department_QNAME, ������Ϣ����.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link �γ���Ϣ���� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "course")
    public JAXBElement<�γ���Ϣ����> createCourse(�γ���Ϣ���� value) {
        return new JAXBElement<�γ���Ϣ����>(_Course_QNAME, �γ���Ϣ����.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ����ѧ���ɼ��б����� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/test1", name = "studentScore")
    public JAXBElement<����ѧ���ɼ��б�����> createStudentScore(����ѧ���ɼ��б����� value) {
        return new JAXBElement<����ѧ���ɼ��б�����>(_StudentScore_QNAME, ����ѧ���ɼ��б�����.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link �γ̳ɼ��б����� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "scoreList")
    public JAXBElement<�γ̳ɼ��б�����> createScoreList(�γ̳ɼ��б����� value) {
        return new JAXBElement<�γ̳ɼ��б�����>(_ScoreList_QNAME, �γ̳ɼ��б�����.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ���˻�����Ϣ���� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "personInfo")
    public JAXBElement<���˻�����Ϣ����> createPersonInfo(���˻�����Ϣ���� value) {
        return new JAXBElement<���˻�����Ϣ����>(_PersonInfo_QNAME, ���˻�����Ϣ����.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link �γ��б����� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "courseList")
    public JAXBElement<�γ��б�����> createCourseList(�γ��б����� value) {
        return new JAXBElement<�γ��б�����>(_CourseList_QNAME, �γ��б�����.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ��ӻ��޸ĳɼ��������� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/test1", name = "modifyScore")
    public JAXBElement<��ӻ��޸ĳɼ���������> createModifyScore(��ӻ��޸ĳɼ��������� value) {
        return new JAXBElement<��ӻ��޸ĳɼ���������>(_ModifyScore_QNAME, ��ӻ��޸ĳɼ���������.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ѧ����Ϣ���� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "student")
    public JAXBElement<ѧ����Ϣ����> createStudent(ѧ����Ϣ���� value) {
        return new JAXBElement<ѧ����Ϣ����>(_Student_QNAME, ѧ����Ϣ����.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ��ӻ��޸ĳɼ��������� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/test1", name = "addScore")
    public JAXBElement<��ӻ��޸ĳɼ���������> createAddScore(��ӻ��޸ĳɼ��������� value) {
        return new JAXBElement<��ӻ��޸ĳɼ���������>(_AddScore_QNAME, ��ӻ��޸ĳɼ���������.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ɾ���ɼ��������� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/test1", name = "deleteScore")
    public JAXBElement<ɾ���ɼ���������> createDeleteScore(ɾ���ɼ��������� value) {
        return new JAXBElement<ɾ���ɼ���������>(_DeleteScore_QNAME, ɾ���ɼ���������.class, null, value);
    }

}
