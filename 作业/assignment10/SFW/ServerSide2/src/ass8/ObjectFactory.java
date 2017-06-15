
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
     * Create an instance of {@link ��֤��Ϣ���� }
     * 
     */
    public ��֤��Ϣ���� create��֤��Ϣ����() {
        return new ��֤��Ϣ����();
    }

    /**
     * Create an instance of {@link ��֤������� }
     * 
     */
    public ��֤������� create��֤�������() {
        return new ��֤�������();
    }

    /**
     * Create an instance of {@link ѧ����Ϣ���� }
     * 
     */
    public ѧ����Ϣ���� createѧ����Ϣ����() {
        return new ѧ����Ϣ����();
    }

    /**
     * Create an instance of {@link �������� }
     * 
     */
    public �������� create��������() {
        return new ��������();
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

//    /**
//     * Create an instance of {@link ������Ϣ���� }
//     *
//     */
//    public ������Ϣ���� create������Ϣ����() {
//        return new ������Ϣ����();
//    }

    /**
     * Create an instance of {@link ����ɼ����� }
     * 
     */
    public ����ɼ����� create����ɼ�����() {
        return new ����ɼ�����();
    }

    /**
     * Create an instance of {@link �γ̳ɼ���Ϣ���� }
     * 
     */
    public �γ̳ɼ���Ϣ���� create�γ̳ɼ���Ϣ����() {
        return new �γ̳ɼ���Ϣ����();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ���˻�����Ϣ���� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "personInfo")
    public JAXBElement<���˻�����Ϣ����> createPersonInfo(���˻�����Ϣ���� value) {
        return new JAXBElement<���˻�����Ϣ����>(_PersonInfo_QNAME, ���˻�����Ϣ����.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ��֤��Ϣ���� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/ass7", name = "verifyInfo")
    public JAXBElement<��֤��Ϣ����> createVerifyInfo(��֤��Ϣ���� value) {
        return new JAXBElement<��֤��Ϣ����>(_VerifyInfo_QNAME, ��֤��Ϣ����.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link �������� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "ErrorMsg")
    public JAXBElement<��������> createErrorMsg(�������� value) {
        return new JAXBElement<��������>(_ErrorMsg_QNAME, ��������.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ��֤������� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "VerifyMsg")
    public JAXBElement<��֤�������> createVerifyMsg(��֤������� value) {
        return new JAXBElement<��֤�������>(_VerifyMsg_QNAME, ��֤�������.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ѧ����Ϣ���� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "student")
    public JAXBElement<ѧ����Ϣ����> createStudent(ѧ����Ϣ���� value) {
        return new JAXBElement<ѧ����Ϣ����>(_Student_QNAME, ѧ����Ϣ����.class, null, value);
    }

}
