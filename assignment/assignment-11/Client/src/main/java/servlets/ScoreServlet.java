package servlets;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import services.score.�ɼ���������;
import services.score.�ɼ�����;
import services.score.�γ̳ɼ��б�����;
import services.score.�γ̳ɼ�����;
import services.score.*;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Holder;
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

                String addStr = request.getParameter("scores");//��ȡ�ύ�ĳɼ�

                try {
                    service.addScore(getHolder(addStr));
                    request.setAttribute("error",false);
                } catch (AuthorityException e) {
                    request.setAttribute("error",true);
                    request.setAttribute("errMsg",e.getFaultInfo().getId()+";"+e.getFaultInfo().getReason());
                } catch (IdNotFoundException e) {
                    request.setAttribute("error",true);
                    request.setAttribute("errMsg",e.getFaultInfo().getNotFoundId()+";"+e.getFaultInfo().getNotFoundReason());

                } catch (ScoreModifyException e) {
                    request.setAttribute("error",true);
                    request.setAttribute("errMsg",e.getFaultInfo().getParamIndex()+";"+e.getFaultInfo().getParamName()+";"+e.getFaultInfo().getFaultInfo());

                } catch (ScoreTypeException e) {
                    request.setAttribute("error",true);
                    request.setAttribute("errMsg",e.getFaultInfo().getParamIndex()+";"+e.getFaultInfo().getParamName()+";"+e.getFaultInfo().getFaultInfo());
                }


                break;
            case 1://ɾ���ɼ�
                String delStr = request.getParameter("scores");//��ȡ�ύ�ĳɼ�

                try {
                    service.deleteScore(getHolder(delStr));
                    request.setAttribute("error",false);
                } catch (AuthorityException e) {
                    request.setAttribute("error",true);
                    request.setAttribute("errMsg",e.getFaultInfo().getId()+";"+e.getFaultInfo().getReason());
                } catch (IdNotFoundException e) {
                    request.setAttribute("error",true);
                    request.setAttribute("errMsg",e.getFaultInfo().getNotFoundId()+";"+e.getFaultInfo().getNotFoundReason());

                } catch (ScoreModifyException e) {
                    request.setAttribute("error",true);
                    request.setAttribute("errMsg",e.getFaultInfo().getParamIndex()+";"+e.getFaultInfo().getParamName()+";"+e.getFaultInfo().getFaultInfo());

                } catch (ScoreTypeException e) {
                    request.setAttribute("error",true);
                    request.setAttribute("errMsg",e.getFaultInfo().getParamIndex()+";"+e.getFaultInfo().getParamName()+";"+e.getFaultInfo().getFaultInfo());
                }
                break;
            case 2://�޸ĳɼ�

                String modStr = request.getParameter("scores");//��ȡ�ύ�ĳɼ�

                try {
                    service.modifyScore(getHolder(modStr));
                    request.setAttribute("error",false);
                } catch (AuthorityException e) {
                    request.setAttribute("error",true);
                    request.setAttribute("errMsg",e.getFaultInfo().getId()+";"+e.getFaultInfo().getReason());
                } catch (IdNotFoundException e) {
                    request.setAttribute("error",true);
                    request.setAttribute("errMsg",e.getFaultInfo().getNotFoundId()+";"+e.getFaultInfo().getNotFoundReason());

                } catch (ScoreModifyException e) {
                    request.setAttribute("error",true);
                    request.setAttribute("errMsg",e.getFaultInfo().getParamIndex()+";"+e.getFaultInfo().getParamName()+";"+e.getFaultInfo().getFaultInfo());

                } catch (ScoreTypeException e) {
                    request.setAttribute("error",true);
                    request.setAttribute("errMsg",e.getFaultInfo().getParamIndex()+";"+e.getFaultInfo().getParamName()+";"+e.getFaultInfo().getFaultInfo());
                }
                break;
            case 3://��ѯ�ɼ�
                String studentId = "141250019";//��request����
                List<�γ̳ɼ�����> list = new ArrayList<�γ̳ɼ�����>();
                try {
                    list = service.getScore(studentId).get�γ̳ɼ�();
                    request.setAttribute("error",false);
                    request.setAttribute("scores",list);//��ѯ�ɹ������ؿγ̳ɼ��б�

                } catch (IdNotFoundException e) {
                    request.setAttribute("error",true);
                    request.setAttribute("errorMsg",e.getFaultInfo().getNotFoundId()+";"+e.getFaultInfo().getNotFoundReason());
                }
                break;
            default:
                break;

        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/jsp/score.jsp").forward(request,response);
    }

    private Holder<�γ̳ɼ��б�����> getHolder(String jsonStr){

        �γ̳ɼ��б����� result = new �γ̳ɼ��б�����();
        List<�γ̳ɼ�����> csList = result.get�γ̳ɼ�();

        JSONArray array = JSONArray.fromObject(jsonStr);//��ȡ�γ̳ɼ��б�
        for(int i = 0; i < array.size(); i++){
            JSONObject object = array.getJSONObject(i);

            �γ̳ɼ����� course = new �γ̳ɼ�����();
            course.set�ɼ�����(�ɼ���������.fromValue(object.getString("score_type")));
            course.set�γ̱��(object.getString("course_id"));
            List<�ɼ�����> scoreList = course.get�ɼ�();

            JSONArray jsonScore = object.getJSONArray("score_detail");
            for(int j = 0; j < jsonScore.size(); j++){
                JSONObject scoreObject = jsonScore.getJSONObject(i);

                �ɼ����� score = new �ɼ�����();
                score.setѧ��(scoreObject.getString("id"));
                score.set�÷�(scoreObject.getInt("value"));



                scoreList.add(score);
            }

            csList.add(course);
        }
        Holder<�γ̳ɼ��б�����> holder = new Holder<�γ̳ɼ��б�����>(result);
        return holder;
    }
}