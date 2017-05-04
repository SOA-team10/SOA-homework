/**
 * Created by duanzhengmou on 5/2/17.
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.soap.*;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import java.io.IOException;
import java.io.PrintWriter;
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
//        PrintWriter out = response.getWriter();
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
            // envelope.setPrefix("soap");	// 默认是SOAP-ENV
            // header
            // SOAPHeader header = envelope.getHeader();
            // 写body
            SOAPBody body = envelope.getBody();
            // 3.4.向body中添加元素，即要传递的数据
            SOAPBodyElement stuElement = body.addBodyElement(envelope.createName("Student"));
            stuElement.addChildElement(envelope.createName("StudentName")).addTextNode("段正谋");
            stuElement.addChildElement(envelope.createName("StudentId")).addTextNode(id);
            SOAPBodyElement courseElement = body.addBodyElement(envelope.createName("课程"));
            courseElement.addChildElement(envelope.createName("CourseId")).addTextNode("000001");
            courseElement.addChildElement(envelope.createName("Teacher")).addTextNode("Frank");
            courseElement.addChildElement(envelope.createName("AttendanceScore")).addTextNode("90");
            courseElement.addChildElement(envelope.createName("FinalScore")).addTextNode("85");
            courseElement.addChildElement(envelope.createName("TotalScore")).addTextNode("92");
            // 4.创建SOAP消息的目标对象（服务端点endPoint），即消息发给谁
            String reqBaseUrl = getReqBaseUrl(request);
            URL endPoint = new URL(reqBaseUrl + "/msgReceiver");
            // 5.发送SOAP消息，并接收返回信息
            SOAPMessage respMsg = conn.call(reqMsg, endPoint);

//            out.print("success!");
            System.out.println("\nrequest: ");
            reqMsg.writeTo(System.out);

            System.out.println("\nresponse: ");
            respMsg.writeTo(System.out);
            response.setContentType("text/xml");
            respMsg.writeTo(response.getOutputStream());
//            Source respSource = respMsg.getSOAPPart().getContent();


        } catch (SOAPException e) {
            e.printStackTrace();
//            out.print("error!\n" + e.getMessage());
        }
//        out.flush();
//        out.close();
    }

    private String getReqBaseUrl(HttpServletRequest req) {
        StringBuffer urlSB = new StringBuffer();
        urlSB.append(req.getScheme()).append("://").append(req.getServerName()).append(":").append(req.getServerPort()).append(req.getContextPath());
        return urlSB.toString();
    }
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }
}
