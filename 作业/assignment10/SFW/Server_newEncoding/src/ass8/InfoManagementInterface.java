
package ass8;

import schema.ModifyStudentInfoType;
import schema.StudentInfoType;
import schema.StudentListType;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "InfoManagementInterface", targetNamespace = "http://jw.nju.edu.cn/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface InfoManagementInterface {


    /**
     *
     * @param studentId
     * @return
     *     returns test.StudentInfoType
     * @throws InvalidDataFault
     */
    @WebMethod(action = "http://jw.nju.edu.cn/wsdl/getInfoById")
    @WebResult(name = "student", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "student")
    public StudentInfoType getInfoById(
            @WebParam(name = "studentId", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "studentId")
                    String studentId)
        throws InvalidDataFault
    ;

    /**
     *
     * @param studentName
     * @return
     *     returns test.StudentListType
     * @throws InvalidDataFault
     */
    @WebMethod(action = "http://jw.nju.edu.cn/wsdl/getInfoByName")
    @WebResult(name = "studentList", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "students")
    public StudentListType getInfoByName(
            @WebParam(name = "studentName", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "studentName")
                    String studentName)
        throws InvalidDataFault
    ;

    /**
     *
     * @param student
     * @return
     *     returns java.lang.String
     * @throws InvalidDataFault
     */
    @WebMethod(action = "http://jw.nju.edu.cn/wsdl/modifyInfo")
    @WebResult(name = "isSuccess", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "isSuccess")
    public String modifyInfo(
            @WebParam(name = "modifyInfo", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "student")
                    ModifyStudentInfoType student)
        throws InvalidDataFault
    ;

    /**
     *
     * @param student
     * @return
     *     returns java.lang.String
     * @throws InvalidDataFault
     */
    @WebMethod(action = "http://jw.nju.edu.cn/wsdl/addInfo")
    @WebResult(name = "isSuccess", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "isSuccess")
    public String addInfo(
            @WebParam(name = "student", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "student")
                    StudentInfoType student)
        throws InvalidDataFault
    ;

    /**
     *
     * @param studentId
     * @return
     *     returns java.lang.String
     * @throws InvalidDataFault
     */
    @WebMethod(action = "http://jw.nju.edu.cn/wsdl/deleteInfo")
    @WebResult(name = "isSuccess", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "isSuccess")
    public String deleteInfo(
            @WebParam(name = "studentId", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "studentId")
                    String studentId)
        throws InvalidDataFault
    ;

}
