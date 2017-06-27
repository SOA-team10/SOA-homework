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
 * Created by ���ī^ on 2017/6/27.
 */
public class ScoreManage {

    public void testAdd(){
        ScoreControllerService service = new ScoreControllerService();

        //handler
        String username = "141250019@smail.nju.edu.cn";
        String password = "141250019";

        service.setHandlerResolver(new VeriHandlerResolver());

        Score port = service.getScorePort();
        //�Գɼ��Ĳ���
        WSBindingProvider bp = (WSBindingProvider) port;

                bp.setOutboundHeaders(
                        Headers.create(new QName("email"),username),
                        Headers.create(new QName("pwd"), password)
                );



                String addStr = "[{\"course_id\": 000000,\"score_type\": \"�����ɼ�\",\"score_detail\": " +
                        "[{\"value\": 100,\"id\": \"141250019\"}]}]";//��ȡ�ύ�ĳɼ�

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

    public List<�γ̳ɼ�����> testSearch(){
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

        String studentId = "141250019";//��request����
        List<�γ̳ɼ�����> list = new ArrayList<�γ̳ɼ�����>();
        try {
            list = port.getScore(studentId).get�γ̳ɼ�();

        } catch (IdNotFoundException e) {
            e.printStackTrace();
        }

        return list;

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
