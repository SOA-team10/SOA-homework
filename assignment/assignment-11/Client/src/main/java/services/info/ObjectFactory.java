
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
    private final static QName _部门_QNAME = new QName("http://www.nju.edu.cn/schema", "\u90e8\u95e8");
    private final static QName _学生_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5b66\u751f");
    private final static QName _InvalidParamFault_QNAME = new QName("http://jw.nju.edu.cn/schema", "InvalidParamFault");
    private final static QName _个人信息_QNAME = new QName("http://www.nju.edu.cn/schema", "\u4e2a\u4eba\u4fe1\u606f");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services.info
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link 学生类型 }
     * 
     */
    public 学生类型 create学生类型() {
        return new 学生类型();
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
     * Create an instance of {@link 成绩类型 }
     * 
     */
    public 成绩类型 create成绩类型() {
        return new 成绩类型();
    }

    /**
     * Create an instance of {@link 课程成绩类型 }
     * 
     */
    public 课程成绩类型 create课程成绩类型() {
        return new 课程成绩类型();
    }

    /**
     * Create an instance of {@link 课程成绩列表类型 }
     * 
     */
    public 课程成绩列表类型 create课程成绩列表类型() {
        return new 课程成绩列表类型();
    }

    /**
     * Create an instance of {@link 部门类型 }
     * 
     */
    public 部门类型 create部门类型() {
        return new 部门类型();
    }

    /**
     * Create an instance of {@link 个人信息类型 }
     * 
     */
    public 个人信息类型 create个人信息类型() {
        return new 个人信息类型();
    }

    /**
     * Create an instance of {@link 地址类型 }
     * 
     */
    public 地址类型 create地址类型() {
        return new 地址类型();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link 学生类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "updateInfoElement")
    public JAXBElement<学生类型> createUpdateInfoElement(学生类型 value) {
        return new JAXBElement<学生类型>(_UpdateInfoElement_QNAME, 学生类型.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link 部门类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/schema", name = "\u90e8\u95e8")
    public JAXBElement<部门类型> create部门(部门类型 value) {
        return new JAXBElement<部门类型>(_部门_QNAME, 部门类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 学生类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u5b66\u751f")
    public JAXBElement<学生类型> create学生(学生类型 value) {
        return new JAXBElement<学生类型>(_学生_QNAME, 学生类型.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link 个人信息类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/schema", name = "\u4e2a\u4eba\u4fe1\u606f")
    public JAXBElement<个人信息类型> create个人信息(个人信息类型 value) {
        return new JAXBElement<个人信息类型>(_个人信息_QNAME, 个人信息类型.class, null, value);
    }

}
