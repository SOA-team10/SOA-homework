
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
     * Create an instance of {@link 删除成绩数据类型 }
     * 
     */
    public 删除成绩数据类型 create删除成绩类型() {
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
    public 添加或修改成绩数据类型 create添加或修改成绩类型() {
        return new 添加或修改成绩数据类型();
    }



    /**
     * Create an instance of {@link 单项成绩类型 }
     * 
     */
    public 单项成绩类型 create单科成绩类型() {
        return new 单项成绩类型();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link 单个学生成绩列表类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/wsdl", name = "studentScore")
    public JAXBElement<单个学生成绩列表类型> createStudentScore(单个学生成绩列表类型 value) {
        return new JAXBElement<单个学生成绩列表类型>(_StudentScore_QNAME, 单个学生成绩列表类型.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link 添加或修改成绩数据类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/wsdl", name = "modifyScore")
    public JAXBElement<添加或修改成绩数据类型> createModifyScore(添加或修改成绩数据类型 value) {
        return new JAXBElement<添加或修改成绩数据类型>(_ModifyScore_QNAME, 添加或修改成绩数据类型.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link 添加或修改成绩数据类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/wsdl", name = "addScore")
    public JAXBElement<添加或修改成绩数据类型> createAddScore(添加或修改成绩数据类型 value) {
        return new JAXBElement<添加或修改成绩数据类型>(_AddScore_QNAME, 添加或修改成绩数据类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 删除成绩数据类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/wsdl", name = "deleteScore")
    public JAXBElement<删除成绩数据类型> createDeleteScore(删除成绩数据类型 value) {
        return new JAXBElement<删除成绩数据类型>(_DeleteScore_QNAME, 删除成绩数据类型.class, null, value);
    }

}
