
package services.score;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services.score package. 
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

    private final static QName _ModifyScore_QNAME = new QName("http://jw.nju.edu.cn/schema", "modifyScore");
    private final static QName _学号_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5b66\u53f7");
    private final static QName _NotFoundFault_QNAME = new QName("http://jw.nju.edu.cn/schema", "NotFoundFault");
    private final static QName _AuthFault_QNAME = new QName("http://jw.nju.edu.cn/schema", "AuthFault");
    private final static QName _AddScore_QNAME = new QName("http://jw.nju.edu.cn/schema", "addScore");
    private final static QName _InvalidParamFault_QNAME = new QName("http://jw.nju.edu.cn/schema", "InvalidParamFault");
    private final static QName _课程成绩列表_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u6210\u7ee9\u5217\u8868");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services.score
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link 课程成绩列表类型 }
     * 
     */
    public 课程成绩列表类型 create课程成绩列表类型() {
        return new 课程成绩列表类型();
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
     * Create an instance of {@link AddScore }
     * 
     */
    public AddScore createAddScore() {
        return new AddScore();
    }

    /**
     * Create an instance of {@link NotFoundType }
     * 
     */
    public NotFoundType createNotFoundType() {
        return new NotFoundType();
    }

    /**
     * Create an instance of {@link ModifyScore }
     * 
     */
    public ModifyScore createModifyScore() {
        return new ModifyScore();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyScore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "modifyScore")
    public JAXBElement<ModifyScore> createModifyScore(ModifyScore value) {
        return new JAXBElement<ModifyScore>(_ModifyScore_QNAME, ModifyScore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u5b66\u53f7")
    public JAXBElement<String> create学号(String value) {
        return new JAXBElement<String>(_学号_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "AuthFault")
    public JAXBElement<AuthFaultType> createAuthFault(AuthFaultType value) {
        return new JAXBElement<AuthFaultType>(_AuthFault_QNAME, AuthFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddScore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "addScore")
    public JAXBElement<AddScore> createAddScore(AddScore value) {
        return new JAXBElement<AddScore>(_AddScore_QNAME, AddScore.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link 课程成绩列表类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8bfe\u7a0b\u6210\u7ee9\u5217\u8868")
    public JAXBElement<课程成绩列表类型> create课程成绩列表(课程成绩列表类型 value) {
        return new JAXBElement<课程成绩列表类型>(_课程成绩列表_QNAME, 课程成绩列表类型.class, null, value);
    }

}
