

import services.info.*;
import services.score.�ɼ�����;
import services.score.�γ̳ɼ��б�����;
import services.score.�γ̳ɼ�����;
import services.score.*;
import test.ScoreManage;


import java.util.List;


public class Main {

    public static void main(String[] args) {


//        Score port = service.getScorePort();
//        try {
//            �γ̳ɼ��б����� courseScores = port.getScore("141250019");
//            List<�γ̳ɼ�����> list = courseScores.get�γ̳ɼ�();
//            if(list.size()==0){
//                System.out.println("�γ̳ɼ�Ϊ��");
//            }
//            for(int i = 0; i < list.size(); i++){
//                �γ̳ɼ����� cs = list.get(i);
//                System.out.println("course id:"+cs.get�γ̱��()+"score type:"+cs.get�ɼ�����().value());
//                List<�ɼ�����> scoreList = cs.get�ɼ�();
//                for(int j = 0; j < scoreList.size(); j++){
//                    System.out.println("id:"+scoreList.get(j).getѧ��()+",value:"+scoreList.get(j).get�÷�());
//                }
//            }
//        } catch (IdNotFoundException e) {
//            e.printStackTrace();
//        }

//        StudentPort studentPort = new StudentControllerService().getStudentPortPort();
//        GetInfoByIdType id = new GetInfoByIdType();
//        id.setSid("141250019");
//        try {
//            ѧ������ student = studentPort.getInfoById(id);
//            System.out.println(student.get������Ϣ().get��������());
//        } catch (services.info.IdNotFoundException e) {
//            e.printStackTrace();
//        }

//        StudentPort port = new StudentControllerService().getStudentPortPort();
//        port.getInfoById(new GetInfoByIdType("141250019"));


        ScoreManage scoreManage = new ScoreManage();
        scoreManage.testAdd();

//        String relativelyPath=System.getProperty("user.dir");
//        System.out.println(relativelyPath+"/src/main/resource/log.txt");



    }
}
