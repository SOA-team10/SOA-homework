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
import java.io.PrintWriter;
import java.net.URL;

@WebServlet("/sender")
public class Sender extends HttpServlet{
    private static final long serialVersionUID = 1L;
    private SOAPConnection conn;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sender() {
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
        PrintWriter out = response.getWriter();
        response.setContentType("text/html; charset=UTF-8");
        try {
            // 1.创建消息工厂
            MessageFactory factory = MessageFactory.newInstance();
            // 2.创建soap消息reqMsg
            SOAPMessage reqMsg = factory.createMessage();
            // 3.创建soap消息的部分reqMsgpart
            SOAPPart part = reqMsg.getSOAPPart();
            // 3.1.创建sope信封envelope，开始写信
            SOAPEnvelope envelope = part.getEnvelope();
            // envelope.setPrefix("soap");	// 默认是SOAP-ENV
            // 3.2.写header
            // SOAPHeader header = envelope.getHeader();
            // 3.3.写body
            SOAPBody body = envelope.getBody();
            // 3.4.向body中添加元素，即要传递的数据
            SOAPBodyElement stuElement = body.addBodyElement(envelope.createName("学生"));
            stuElement.addChildElement(envelope.createName("姓名")).addTextNode("陈云龙");
            stuElement.addChildElement(envelope.createName("学号")).addTextNode("131250181");
            SOAPBodyElement courseElement = body.addBodyElement(envelope.createName("课程"));
            courseElement.addChildElement(envelope.createName("课程编号")).addTextNode("000001");
            courseElement.addChildElement(envelope.createName("课程讲师")).addTextNode("xxx");
            courseElement.addChildElement(envelope.createName("平时成绩")).addTextNode("77");
            courseElement.addChildElement(envelope.createName("期末成绩")).addTextNode("58");
            courseElement.addChildElement(envelope.createName("总评成绩")).addTextNode("92");
            // 4.创建SOAP消息的目标对象（服务端点endPoint），即消息发给谁
            String reqBaseUrl = getReqBaseUrl(request);
            URL endPoint = new URL(reqBaseUrl + "/msgReceiver");
            // 5.发送SOAP消息，并接收返回信息
            SOAPMessage respMsg = conn.call(reqMsg, endPoint);

            out.print("success!");
            System.out.println("\n=====================请求的消息 : ");
            reqMsg.writeTo(System.out);

            System.out.println("\n=====================接收的消息 : ");
            respMsg.writeTo(System.out);

        } catch (SOAPException e) {
            e.printStackTrace();
            out.print("error!\n" + e.getMessage());
        }
        out.flush();
        out.close();
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
