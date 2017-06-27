package servlets;

import handlerResolver.DefaultHandlerResolver;
import services.info.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by duanzhengmou on 6/27/17.
 */
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentControllerService service = new StudentControllerService();
        service.setHandlerResolver(new DefaultHandlerResolver());

        StudentPort studentPort = service.getStudentPortPort();

        String studentId = "141250019";
        String des = request.getParameter("���˼��");//��ȡ�޸ĺ�ĸ��˼��
        //�޸�ѧ����Ϣ
        GetInfoByIdType getInfoByIdType = new GetInfoByIdType();
        getInfoByIdType.setSid(studentId);
        try {
            ѧ������ student = studentPort.getInfoById(getInfoByIdType);
            student.get������Ϣ().set���˼��(des);
            ѧ������ updateStu = studentPort.updateInfo(student);
            request.setAttribute("error",false);
            request.setAttribute("student",updateStu);

        } catch (IdNotFoundException e) {
            request.setAttribute("error",true);
            request.setAttribute("errMsg",e.getFaultInfo().getNotFoundId()+";"+e.getFaultInfo().getNotFoundReason());
        } catch (AuthorityException e) {
            request.setAttribute("error",true);
            request.setAttribute("errMsg",e.getFaultInfo().getId()+";"+e.getFaultInfo().getReason());
        } catch (ScoreTypeException e) {
            request.setAttribute("error",true);
            request.setAttribute("errMsg",e.getFaultInfo().getParamIndex()+";"+e.getFaultInfo().getParamName()+";"+e.getFaultInfo().getFaultInfo());
        } catch (ScoreModifyException e) {
            request.setAttribute("error",true);
            request.setAttribute("errMsg",e.getFaultInfo().getParamIndex()+";"+e.getFaultInfo().getParamName()+";"+e.getFaultInfo().getFaultInfo());
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
