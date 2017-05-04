/**
 * Created by duanzhengmou on 5/2/17.
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.soap.*;
import java.io.IOException;
import java.net.URL;

@WebServlet("/sender")
public class MsgSender extends HttpServlet{
    private static final long serialVersionUID = 1L;
    private SOAPConnection conn;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MsgSender() {
        super();
        SOAPConnectionFactory factory = null;
        try {
            factory = SOAPConnectionFactory.newInstance();
            conn = factory.createConnection();
        } catch (SOAPException e) {
            e.printStackTrace();
        }

    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        if (id == null){
            id = "";
        }
        try {
            // message factory
            MessageFactory factory = MessageFactory.newInstance();
            // soap message instance
            SOAPMessage reqMsg = factory.createMessage();
            // soap message part
            SOAPPart part = reqMsg.getSOAPPart();
            // soap-envelope
            SOAPEnvelope envelope = part.getEnvelope();
            // may change prefix for envelope
            // header
            // SOAPHeader header = envelope.getHeader();
            // craft body
            SOAPBody body = envelope.getBody();
            SOAPBodyElement stuElement = body.addBodyElement(envelope.createName("Student"));
            stuElement.addChildElement(envelope.createName("StudentName")).addTextNode("段正谋");
            stuElement.addChildElement(envelope.createName("StudentId")).addTextNode(id);
            SOAPBodyElement courseElement = body.addBodyElement(envelope.createName("Course"));
            courseElement.addChildElement(envelope.createName("CourseId")).addTextNode("000001");
            courseElement.addChildElement(envelope.createName("Teacher")).addTextNode("Frank");
            courseElement.addChildElement(envelope.createName("AttendanceScore")).addTextNode("90");
            courseElement.addChildElement(envelope.createName("FinalScore")).addTextNode("85");
            courseElement.addChildElement(envelope.createName("TotalScore")).addTextNode("92");
            // config target
            String reqBaseUrl = extractUrl(request);
            URL endPoint = new URL(reqBaseUrl + "/msgReceiver");
            // send message
            SOAPMessage respMsg = conn.call(reqMsg, endPoint);

            System.out.println("\nrequest: ");
            reqMsg.writeTo(System.out);

            System.out.println("\nresponse: ");
            respMsg.writeTo(System.out);
            // display as xml in browser
            response.setContentType("text/xml");
            respMsg.writeTo(response.getOutputStream());


        } catch (SOAPException e) {
            e.printStackTrace();
//            out.print("error!\n" + e.getMessage());
        }
    }

    private String extractUrl(HttpServletRequest req) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(req.getScheme()).append("://").append(req.getServerName()).append(":").append(req.getServerPort()).append(req.getContextPath());
        return stringBuffer.toString();
    }
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }
}
