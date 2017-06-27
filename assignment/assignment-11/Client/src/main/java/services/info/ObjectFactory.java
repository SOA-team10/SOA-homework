
package services.info;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services.info package. 
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

    private final static QName _GetInfoByIdElement_QNAME = new QName("http://jw.nju.edu.cn/schema", "getInfoByIdElement");
    private final static QName _UpdateInfoElement_QNAME = new QName("http://jw.nju.edu.cn/schema", "updateInfoElement");
    private final static QName _NotFoundFault_QNAME = new QName("http://jw.nju.edu.cn/schema", "NotFoundFault");
    private final static QName _DeleteInfoByIdElement_QNAME = new QName("http://jw.nju.edu.cn/schema", "deleteInfoByIdElement");
    private final static QName _AddInfoElement_QNAME = new QName("http://jw.nju.edu.cn/schema", "addInfoElement");
    private final static QName _AuthFault_QNAME = new QName("http://jw.nju.edu.cn/schema", "AuthFault");
    private final static QName _����_QNAME = new QName("http://www.nju.edu.cn/schema", "\u90e8\u95e8");
    private final static QName _ѧ��_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5b66\u751f");
    private final static QName _InvalidParamFault_QNAME = new QName("http://jw.nju.edu.cn/schema", "InvalidParamFault");
    private final static QName _������Ϣ_QNAME = new QName("http://www.nju.edu.cn/schema", "\u4e2a\u4eba\u4fe1\u606f");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services.info
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ѧ������ }
     * 
     */
    public ѧ������ createѧ������() {
        return new ѧ������();
    }

    /**
     * Create an instance of {@link ParamFaultType }
     * 
     */
    public ParamFaultType createParamFaultType() {
        return new ParamFaultType();
    }

    /**
     * Create an instance of {@link AuthFaultType }
     * 
     */
    public AuthFaultType createAuthFaultType() {
        return new AuthFaultType();
    }

    /**
     * Create an instance of {@link DeleteInfoByIdType }
     * 
     */
    public DeleteInfoByIdType createDeleteInfoByIdType() {
        return new DeleteInfoByIdType();
    }

    /**
     * Create an instance of {@link AddInfoType }
     * 
     */
    public AddInfoType createAddInfoType() {
        return new AddInfoType();
    }

    /**
     * Create an instance of {@link NotFoundType }
     * 
     */
    public NotFoundType createNotFoundType() {
        return new NotFoundType();
    }

    /**
     * Create an instance of {@link GetInfoByIdType }
     * 
     */
    public GetInfoByIdType createGetInfoByIdType() {
        return new GetInfoByIdType();
    }

    /**
     * Create an instance of {@link �ɼ����� }
     * 
     */
    public �ɼ����� create�ɼ�����() {
        return new �ɼ�����();
    }

    /**
     * Create an instance of {@link �γ̳ɼ����� }
     * 
     */
    public �γ̳ɼ����� create�γ̳ɼ�����() {
        return new �γ̳ɼ�����();
    }

    /**
     * Create an instance of {@link �γ̳ɼ��б����� }
     * 
     */
    public �γ̳ɼ��б����� create�γ̳ɼ��б�����() {
        return new �γ̳ɼ��б�����();
    }

    /**
     * Create an instance of {@link �������� }
     * 
     */
    public �������� create��������() {
        return new ��������();
    }

    /**
     * Create an instance of {@link ������Ϣ���� }
     * 
     */
    public ������Ϣ���� create������Ϣ����() {
        return new ������Ϣ����();
    }

    /**
     * Create an instance of {@link ��ַ���� }
     * 
     */
    public ��ַ���� create��ַ����() {
        return new ��ַ����();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoByIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "getInfoByIdElement")
    public JAXBElement<GetInfoByIdType> createGetInfoByIdElement(GetInfoByIdType value) {
        return new JAXBElement<GetInfoByIdType>(_GetInfoByIdElement_QNAME, GetInfoByIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ѧ������ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "updateInfoElement")
    public JAXBElement<ѧ������> createUpdateInfoElement(ѧ������ value) {
        return new JAXBElement<ѧ������>(_UpdateInfoElement_QNAME, ѧ������.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotFoundType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "NotFoundFault")
    public JAXBElement<NotFoundType> createNotFoundFault(NotFoundType value) {
        return new JAXBElement<NotFoundType>(_NotFoundFault_QNAME, NotFoundType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteInfoByIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "deleteInfoByIdElement")
    public JAXBElement<DeleteInfoByIdType> createDeleteInfoByIdElement(DeleteInfoByIdType value) {
        return new JAXBElement<DeleteInfoByIdType>(_DeleteInfoByIdElement_QNAME, DeleteInfoByIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "addInfoElement")
    public JAXBElement<AddInfoType> createAddInfoElement(AddInfoType value) {
        return new JAXBElement<AddInfoType>(_AddInfoElement_QNAME, AddInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "AuthFault")
    public JAXBElement<AuthFaultType> createAuthFault(AuthFaultType value) {
        return new JAXBElement<AuthFaultType>(_AuthFault_QNAME, AuthFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link �������� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/schema", name = "\u90e8\u95e8")
    public JAXBElement<��������> create����(�������� value) {
        return new JAXBElement<��������>(_����_QNAME, ��������.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ѧ������ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u5b66\u751f")
    public JAXBElement<ѧ������> createѧ��(ѧ������ value) {
        return new JAXBElement<ѧ������>(_ѧ��_QNAME, ѧ������.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "InvalidParamFault")
    public JAXBElement<ParamFaultType> createInvalidParamFault(ParamFaultType value) {
        return new JAXBElement<ParamFaultType>(_InvalidParamFault_QNAME, ParamFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ������Ϣ���� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/schema", name = "\u4e2a\u4eba\u4fe1\u606f")
    public JAXBElement<������Ϣ����> create������Ϣ(������Ϣ���� value) {
        return new JAXBElement<������Ϣ����>(_������Ϣ_QNAME, ������Ϣ����.class, null, value);
    }

}
