package servlets;

import schema.�γ̳ɼ�����;
import services.score.IdNotFoundException;
import services.score.Score;
import services.score.ScoreControllerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by duanzhengmou on 6/27/17.
 */
@WebServlet("/score")
public class ScoreServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Score service = new ScoreControllerService().getScorePort();
        //��ʦ�Գɼ��Ĳ���
        int type = 0; //�������ͣ���request����
        switch (type){
            case 0://�ύ�ɼ�

                break;
            case 1://ɾ���ɼ�
                break;
            case 2://�޸ĳɼ�
                break;
            case 3://��ѯ�ɼ�
                String studentId = "141250019";//��request����
                List<�γ̳ɼ�����> list = new ArrayList<�γ̳ɼ�����>();
                try {
                    list = service.getScore(studentId).get�γ̳ɼ�();
                    request.setAttribute("scores",list);//��ѯ�ɹ������ؿγ̳ɼ��б�

                } catch (IdNotFoundException e) {
                    String errId = e.getFaultInfo().getNotFoundId();
                    String errRsn = e.getFaultInfo().getNotFoundReason().value();
                    request.setAttribute("errId",errId);//��ѯû�н��������ѧ��id�ʹ���ԭ��
                    request.setAttribute("errReason",errRsn);
                }
                break;
            default:
                break;

        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/jsp/score.jsp").forward(request,response);
    }
}
