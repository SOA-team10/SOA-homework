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
            String userID = extractStudentId(soapMessage);
            if(userID.equals("141250033")) {
                body.addChildElement(envelope.createName("ResponseMsg")).addTextNode("Successfully modified score of " + userID);
                SOAPBodyElement stuElement = body.addBodyElement(envelope.createName("Student"));
                stuElement.addChildElement(envelope.createName("StudentName")).addTextNode("段正谋");
                stuElement.addChildElement(envelope.createName("StudentId")).addTextNode("141250001");
                SOAPBodyElement courseElement = body.addBodyElement(envelope.createName("Course"));
                courseElement.addChildElement(envelope.createName("CourseId")).addTextNode("000001");
                courseElement.addChildElement(envelope.createName("Teacher")).addTextNode("xxx");
                courseElement.addChildElement(envelope.createName("AttendanceScore")).addTextNode("77");
                courseElement.addChildElement(envelope.createName("FinalScore")).addTextNode("58");
                courseElement.addChildElement(envelope.createName("TotalScore")).addTextNode("92");
            } else {
                SOAPElement faultElement = body.addChildElement(envelope.createName("Fault", "env", "http://www.w3.org/2003/05/soap-envelope"));
                SOAPElement soapCode = faultElement.addChildElement(envelope.createName("Code", "env", "http://www.w3.org/2003/05/soap-envelope"));
                SOAPElement soapCodeValue=soapCode.addChildElement(envelope.createName("Value", "env", "http://www.w3.org/2003/05/soap-envelope"));
                soapCodeValue.addTextNode("StudentId");
                SOAPElement soapReason=faultElement.addChildElement(envelope.createName("Reason", "env", "http://www.w3.org/2003/05/soap-envelope"));
                SOAPElement soapText=soapReason.addChildElement(envelope.createName("Text", "env", "http://www.w3.org/2003/05/soap-envelope"));
                soapText.addTextNode("StudentId:"+userID+" doesn't exist");
            }
            return respMsg;
        } catch (SOAPException e) {
            e.printStackTrace();
        }

        return null;
    }
    private String extractStudentId(SOAPMessage reqMsg) throws SOAPException {
        // soap信封
        SOAPEnvelope env = reqMsg.getSOAPPart().getEnvelope();
        // soap消息体
        SOAPBody body = reqMsg.getSOAPBody();
        SOAPElement stuElem = (SOAPElement)body.getChildElements(env.createName("Student")).next();
        SOAPElement paramElem = (SOAPElement)stuElem.getChildElements(env.createName("StudentId")).next();
        return paramElem.getTextContent();
    }
}
