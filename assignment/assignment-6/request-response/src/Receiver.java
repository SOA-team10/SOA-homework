/**
 * Created by duanzhengmou on 5/2/17.
 */

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.soap.*;

@WebServlet("/receiver")
public class Receiver extends HttpServlet{
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Receiver() {
        super();
        // TODO Auto-generated constructor stub

    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        MessageFactory messageFactory = null;
        try {
            messageFactory = MessageFactory.newInstance();
            SOAPMessage message = messageFactory.createMessage();
            SOAPPart part = message.getSOAPPart();
            SOAPEnvelope envelope = part.getEnvelope();
            SOAPBody body = envelope.getBody();

            // handle error
//            if (id == null){
//                addFault(body, "Absent of parameter: id");
//            }else{
//                List<CourseScore> scores = scoreList.getScoreById(id);
//                if (scores.size() == 0){
//                    addFault(body, "Can not find such a record with id: "+id);
//                }else {
//                    SOAPBodyElement bodyElement = body.addBodyElement(new QName("http://www.nju.edu.cn", "getStudent", "m"));
//                    QName rootQName = bodyElement.createQName("CourseScore", "tns");
//                }
//            }
        } catch (SOAPException e) {
            e.printStackTrace();
        }


    }

    private void addFault(SOAPBody body, String msg) throws SOAPException {
        SOAPFault fault = body.addFault();
        fault.setFaultCode(new QName("env", "client"));
        fault.setFaultString(msg, Locale.CHINESE);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }
}
