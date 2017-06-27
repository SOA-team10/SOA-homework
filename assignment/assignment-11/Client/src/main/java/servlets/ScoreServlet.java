package servlets;


import com.sun.xml.internal.ws.api.message.Headers;
import com.sun.xml.internal.ws.developer.WSBindingProvider;
import com.sun.xml.internal.ws.streaming.XMLStreamReaderException;
import handlerResolver.DefaultHandlerResolver;
import handlerResolver.VeriHandlerResolver;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import services.score.成绩性质类型;
import services.score.成绩类型;
import services.score.课程成绩列表类型;
import services.score.课程成绩类型;
import services.score.*;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
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
        ScoreControllerService service = new ScoreControllerService();

        //handler
        String username = "141250019@smail.nju.edu.cn";
        String password = "141250019";

        //对成绩的操作
        int type = 0; //操作类型，从request中拿
        switch (type){
            case 0://提交成绩
                service.setHandlerResolver(new VeriHandlerResolver());
                Score port = service.getScorePort();

                WSBindingProvider bp = (WSBindingProvider) port;

                bp.setOutboundHeaders(
                        Headers.create(new QName("email"),username),
                        Headers.create(new QName("pwd"), password)
                );

                String addStr = request.getParameter("scores");//获取提交的成绩

                try {
                    port.addScore(getHolder(addStr));
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
            case 1://删除成绩

                service.setHandlerResolver(new VeriHandlerResolver());

                Score delPort = service.getScorePort();

                WSBindingProvider delbp = (WSBindingProvider) delPort;

                delbp.setOutboundHeaders(
                        Headers.create(new QName("email"),username),
                        Headers.create(new QName("pwd"), password)
                );

                String delStr = request.getParameter("scores");//获取提交的成绩

                try {
                    delPort.deleteScore(getHolder(delStr));
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
            case 2://修改成绩

                service.setHandlerResolver(new VeriHandlerResolver());

                Score modPort = service.getScorePort();

                WSBindingProvider modbp = (WSBindingProvider) modPort;

                modbp.setOutboundHeaders(
                        Headers.create(new QName("email"),username),
                        Headers.create(new QName("pwd"), password)
                );
                String modStr = request.getParameter("scores");//获取提交的成绩

                try {
                    modPort.modifyScore(getHolder(modStr));
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
            case 3://查询成绩

                service.setHandlerResolver(new DefaultHandlerResolver());

                Score searchPort = service.getScorePort();

                String studentId = "141250019";//从request中拿
                List<课程成绩类型> list = new ArrayList<课程成绩类型>();
                try {
                    list = searchPort.getScore(studentId).get课程成绩();
                    request.setAttribute("error",false);
                    request.setAttribute("scores",list);//查询成功，返回课程成绩列表

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

    private Holder<课程成绩列表类型> getHolder(String jsonStr){

        课程成绩列表类型 result = new 课程成绩列表类型();
        List<课程成绩类型> csList = result.get课程成绩();

        JSONArray array = JSONArray.fromObject(jsonStr);//获取课程成绩列表
        for(int i = 0; i < array.size(); i++){
            JSONObject object = array.getJSONObject(i);

            课程成绩类型 course = new 课程成绩类型();
            course.set成绩性质(成绩性质类型.fromValue(object.getString("score_type")));
            course.set课程编号(object.getString("course_id"));
            List<成绩类型> scoreList = course.get成绩();

            JSONArray jsonScore = object.getJSONArray("score_detail");
            for(int j = 0; j < jsonScore.size(); j++){
                JSONObject scoreObject = jsonScore.getJSONObject(i);

                成绩类型 score = new 成绩类型();
                score.set学号(scoreObject.getString("id"));
                score.set得分(scoreObject.getInt("value"));



                scoreList.add(score);
            }

            csList.add(course);
        }
        Holder<课程成绩列表类型> holder = new Holder<课程成绩列表类型>(result);
        return holder;
    }

    private void addVeriHandler(){

    }

}
