
package wsdl;

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

    private final static QName _AddScoreResponse_QNAME = new QName("http://wsdl/", "addScoreResponse");
    private final static QName _ModifyScore_QNAME = new QName("http://wsdl/", "modifyScore");
    private final static QName _ModifyScoreResponse_QNAME = new QName("http://wsdl/", "modifyScoreResponse");
    private final static QName _SearchScoreResponse_QNAME = new QName("http://wsdl/", "searchScoreResponse");
    private final static QName _SearchScore_QNAME = new QName("http://wsdl/", "searchScore");
    private final static QName _DeleteScore_QNAME = new QName("http://wsdl/", "deleteScore");
    private final static QName _AddScore_QNAME = new QName("http://wsdl/", "addScore");
    private final static QName _DeleteScoreResponse_QNAME = new QName("http://wsdl/", "deleteScoreResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModifyScoreResponse }
     * 
     */
    public ModifyScoreResponse createModifyScoreResponse() {
        return new ModifyScoreResponse();
    }

    /**
     * Create an instance of {@link SearchScoreResponse }
     * 
     */
    public SearchScoreResponse createSearchScoreResponse() {
        return new SearchScoreResponse();
    }

    /**
     * Create an instance of {@link SearchScore }
     * 
     */
    public SearchScore createSearchScore() {
        return new SearchScore();
    }

    /**
     * Create an instance of {@link DeleteScoreResponse }
     * 
     */
    public DeleteScoreResponse createDeleteScoreResponse() {
        return new DeleteScoreResponse();
    }

    /**
     * Create an instance of {@link DeleteScore }
     * 
     */
    public DeleteScore createDeleteScore() {
        return new DeleteScore();
    }

    /**
     * Create an instance of {@link AddScore }
     * 
     */
    public AddScore createAddScore() {
        return new AddScore();
    }

    /**
     * Create an instance of {@link AddScoreResponse }
     * 
     */
    public AddScoreResponse createAddScoreResponse() {
        return new AddScoreResponse();
    }

    /**
     * Create an instance of {@link ModifyScore }
     * 
     */
    public ModifyScore createModifyScore() {
        return new ModifyScore();
    }

    /**
     * Create an instance of {@link 单项成绩类型 }
     * 
     */
    public 单项成绩类型 create单项成绩类型() {
        return new 单项成绩类型();
    }

    /**
     * Create an instance of {@link 删除成绩类型 }
     * 
     */
    public 删除成绩类型 create删除成绩类型() {
        return new 删除成绩类型();
    }

    /**
     * Create an instance of {@link 单个学生成绩列表类型 }
     * 
     */
    public 单个学生成绩列表类型 create单个学生成绩列表类型() {
        return new 单个学生成绩列表类型();
    }

    /**
     * Create an instance of {@link 添加或修改成绩类型 }
     * 
     */
    public 添加或修改成绩类型 create添加或修改成绩类型() {
        return new 添加或修改成绩类型();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddScoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl/", name = "addScoreResponse")
    public JAXBElement<AddScoreResponse> createAddScoreResponse(AddScoreResponse value) {
        return new JAXBElement<AddScoreResponse>(_AddScoreResponse_QNAME, AddScoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyScore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl/", name = "modifyScore")
    public JAXBElement<ModifyScore> createModifyScore(ModifyScore value) {
        return new JAXBElement<ModifyScore>(_ModifyScore_QNAME, ModifyScore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyScoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl/", name = "modifyScoreResponse")
    public JAXBElement<ModifyScoreResponse> createModifyScoreResponse(ModifyScoreResponse value) {
        return new JAXBElement<ModifyScoreResponse>(_ModifyScoreResponse_QNAME, ModifyScoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchScoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl/", name = "searchScoreResponse")
    public JAXBElement<SearchScoreResponse> createSearchScoreResponse(SearchScoreResponse value) {
        return new JAXBElement<SearchScoreResponse>(_SearchScoreResponse_QNAME, SearchScoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchScore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl/", name = "searchScore")
    public JAXBElement<SearchScore> createSearchScore(SearchScore value) {
        return new JAXBElement<SearchScore>(_SearchScore_QNAME, SearchScore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteScore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl/", name = "deleteScore")
    public JAXBElement<DeleteScore> createDeleteScore(DeleteScore value) {
        return new JAXBElement<DeleteScore>(_DeleteScore_QNAME, DeleteScore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddScore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl/", name = "addScore")
    public JAXBElement<AddScore> createAddScore(AddScore value) {
        return new JAXBElement<AddScore>(_AddScore_QNAME, AddScore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteScoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl/", name = "deleteScoreResponse")
    public JAXBElement<DeleteScoreResponse> createDeleteScoreResponse(DeleteScoreResponse value) {
        return new JAXBElement<DeleteScoreResponse>(_DeleteScoreResponse_QNAME, DeleteScoreResponse.class, null, value);
    }

}
