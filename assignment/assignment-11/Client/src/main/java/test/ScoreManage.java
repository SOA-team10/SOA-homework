package test;

import com.sun.xml.internal.ws.api.message.Headers;
import com.sun.xml.internal.ws.developer.WSBindingProvider;
import handlerResolver.DefaultHandlerResolver;
import handlerResolver.VeriHandlerResolver;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import services.score.*;

import javax.xml.namespace.QName;
import javax.xml.ws.Holder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 张文玘 on 2017/6/27.
 */
public class ScoreManage {

    public void testAdd(){
        ScoreControllerService service = new ScoreControllerService();

        //handler
        String username = "141250019@smail.nju.edu.cn";
        String password = "141250019";

        service.setHandlerResolver(new VeriHandlerResolver());

        Score port = service.getScorePort();
        //对成绩的操作
        WSBindingProvider bp = (WSBindingProvider) port;

                bp.setOutboundHeaders(
                        Headers.create(new QName("email"),username),
                        Headers.create(new QName("pwd"), password)
                );



                String addStr = "[{\"course_id\": 000000,\"score_type\": \"总评成绩\",\"score_detail\": " +
                        "[{\"value\": 100,\"id\": \"141250019\"}]}]";//获取提交的成绩

                try {
                    port.addScore(getHolder(addStr));

                } catch (AuthorityException e) {
                    e.printStackTrace();
//                    request.setAttribute("errMsg",e.getFaultInfo().getId()+";"+e.getFaultInfo().getReason());
                } catch (IdNotFoundException e) {
                    e.printStackTrace();
//                    request.setAttribute("error",true);
//                    request.setAttribute("errMsg",e.getFaultInfo().getNotFoundId()+";"+e.getFaultInfo().getNotFoundReason());

                } catch (ScoreModifyException e) {
                    e.printStackTrace();
//                    request.setAttribute("error",true);
//                    request.setAttribute("errMsg",e.getFaultInfo().getParamIndex()+";"+e.getFaultInfo().getParamName()+";"+e.getFaultInfo().getFaultInfo());

                } catch (ScoreTypeException e) {
                    e.printStackTrace();
//                    request.setAttribute("error",true);
//                    request.setAttribute("errMsg",e.getFaultInfo().getParamIndex()+";"+e.getFaultInfo().getParamName()+";"+e.getFaultInfo().getFaultInfo());
                }




    }

    public List<课程成绩类型> testSearch(){
        ScoreControllerService service = new ScoreControllerService();

//        WSBindingProvider bp = (WSBindingProvider) port;
//        String username = "141250019@smail.nju.edu.cn";
//        String password = "141250019";
//        bp.setOutboundHeaders(
//                Headers.create(new QName("email"),username),
//                Headers.create(new QName("pwd"), password)
//        );
//
        service.setHandlerResolver(new DefaultHandlerResolver());

        Score port = service.getScorePort();

        String studentId = "141250019";//从request中拿
        List<课程成绩类型> list = new ArrayList<课程成绩类型>();
        try {
            list = port.getScore(studentId).get课程成绩();

        } catch (IdNotFoundException e) {
            e.printStackTrace();
        }

        return list;

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

}
