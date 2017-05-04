import com.sun.xml.messaging.soap.server.SAAJServlet;

import javax.servlet.annotation.WebServlet;
import javax.xml.soap.*;

/**
 * Created by duanzhengmou on 5/2/17.
 */
@WebServlet("/msgReceiver")
public class MsgReceiver extends SAAJServlet {

    public SOAPMessage onMessage(SOAPMessage soapMessage) {
        SOAPMessage respMsg = null;
        try {
            respMsg = this.msgFactory.createMessage();
            SOAPEnvelope envelope = respMsg.getSOAPPart().getEnvelope();
            SOAPBody body = envelope.getBody();
            String userID = "141250001";
            if(userID.equals("141250001")) {
                body.addChildElement(envelope.createName("ResponseMsg")).addTextNode("修改 " + userID + " 的成绩成功!");
                SOAPBodyElement stuElement = body.addBodyElement(envelope.createName("学生"));
                stuElement.addChildElement(envelope.createName("姓名")).addTextNode("Someone");
                stuElement.addChildElement(envelope.createName("学号")).addTextNode("141250001");
                SOAPBodyElement courseElement = body.addBodyElement(envelope.createName("课程"));
                courseElement.addChildElement(envelope.createName("课程编号")).addTextNode("000001");
                courseElement.addChildElement(envelope.createName("课程讲师")).addTextNode("xxx");
                courseElement.addChildElement(envelope.createName("平时成绩")).addTextNode("77");
                courseElement.addChildElement(envelope.createName("期末成绩")).addTextNode("58");
                courseElement.addChildElement(envelope.createName("总评成绩")).addTextNode("92");
            } else {
                SOAPElement faultElement = body.addChildElement(envelope.createName("Fault", "env", "http://www.w3.org/2003/05/soap-envelope"));
                SOAPElement soapCode = faultElement.addChildElement(envelope.createName("Code", "env", "http://www.w3.org/2003/05/soap-envelope"));
                SOAPElement soapCodeValue=soapCode.addChildElement(envelope.createName("Value", "env", "http://www.w3.org/2003/05/soap-envelope"));
                soapCodeValue.addTextNode("学号");
                SOAPElement soapReason=faultElement.addChildElement(envelope.createName("Reason", "env", "http://www.w3.org/2003/05/soap-envelope"));
                SOAPElement soapText=soapReason.addChildElement(envelope.createName("Text", "env", "http://www.w3.org/2003/05/soap-envelope"));
                soapText.addTextNode("学号不存在");
            }
            return respMsg;
        } catch (SOAPException e) {
            e.printStackTrace();
        }

        return null;
    }
}
