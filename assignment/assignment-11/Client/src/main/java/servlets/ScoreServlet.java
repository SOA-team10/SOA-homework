package servlets;

import schema.课程成绩类型;
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
        //老师对成绩的操作
        int type = 0; //操作类型，从request中拿
        switch (type){
            case 0://提交成绩

                break;
            case 1://删除成绩
                break;
            case 2://修改成绩
                break;
            case 3://查询成绩
                String studentId = "141250019";//从request中拿
                List<课程成绩类型> list = new ArrayList<课程成绩类型>();
                try {
                    list = service.getScore(studentId).get课程成绩();
                    request.setAttribute("scores",list);//查询成功，返回课程成绩列表

                } catch (IdNotFoundException e) {
                    String errId = e.getFaultInfo().getNotFoundId();
                    String errRsn = e.getFaultInfo().getNotFoundReason().value();
                    request.setAttribute("errId",errId);//查询没有结果，返回学生id和错误原因
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
