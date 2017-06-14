
package wsdl;

import schema.*;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsdl package. 
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

    private final static QName _InvalidDataError_QNAME = new QName("http://jw.nju.edu.cn/wsdl", "invalidDataError");
    private final static QName _StudentScore_QNAME = new QName("http://jw.nju.edu.cn/wsdl", "studentScore");
    private final static QName _IsSuccess_QNAME = new QName("http://jw.nju.edu.cn/wsdl", "isSuccess");
    private final static QName _ModifyScore_QNAME = new QName("http://jw.nju.edu.cn/wsdl", "modifyScore");
    private final static QName _StudentId_QNAME = new QName("http://jw.nju.edu.cn/wsdl", "studentId");
    private final static QName _AddScore_QNAME = new QName("http://jw.nju.edu.cn/wsdl", "addScore");
    private final static QName _DeleteScore_QNAME = new QName("http://jw.nju.edu.cn/wsdl", "deleteScore");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ɾ���ɼ��������� }
     * 
     */
    public ɾ���ɼ��������� createɾ���ɼ�����() {
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
    public ��ӻ��޸ĳɼ��������� create��ӻ��޸ĳɼ�����() {
        return new ��ӻ��޸ĳɼ���������();
    }



    /**
     * Create an instance of {@link ����ɼ����� }
     * 
     */
    public ����ɼ����� create���Ƴɼ�����() {
        return new ����ɼ�����();
    }


    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/wsdl", name = "invalidDataError")
    public JAXBElement<String> createInvalidDataError(String value) {
        return new JAXBElement<String>(_InvalidDataError_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ����ѧ���ɼ��б����� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/wsdl", name = "studentScore")
    public JAXBElement<����ѧ���ɼ��б�����> createStudentScore(����ѧ���ɼ��б����� value) {
        return new JAXBElement<����ѧ���ɼ��б�����>(_StudentScore_QNAME, ����ѧ���ɼ��б�����.class, null, value);
    }


    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/wsdl", name = "isSuccess")
    public JAXBElement<String> createIsSuccess(String value) {
        return new JAXBElement<String>(_IsSuccess_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ��ӻ��޸ĳɼ��������� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/wsdl", name = "modifyScore")
    public JAXBElement<��ӻ��޸ĳɼ���������> createModifyScore(��ӻ��޸ĳɼ��������� value) {
        return new JAXBElement<��ӻ��޸ĳɼ���������>(_ModifyScore_QNAME, ��ӻ��޸ĳɼ���������.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/wsdl", name = "studentId")
    public JAXBElement<String> createStudentId(String value) {
        return new JAXBElement<String>(_StudentId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ��ӻ��޸ĳɼ��������� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/wsdl", name = "addScore")
    public JAXBElement<��ӻ��޸ĳɼ���������> createAddScore(��ӻ��޸ĳɼ��������� value) {
        return new JAXBElement<��ӻ��޸ĳɼ���������>(_AddScore_QNAME, ��ӻ��޸ĳɼ���������.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ɾ���ɼ��������� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/wsdl", name = "deleteScore")
    public JAXBElement<ɾ���ɼ���������> createDeleteScore(ɾ���ɼ��������� value) {
        return new JAXBElement<ɾ���ɼ���������>(_DeleteScore_QNAME, ɾ���ɼ���������.class, null, value);
    }

}
