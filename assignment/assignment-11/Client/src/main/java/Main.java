

import services.info.*;
import services.score.成绩类型;
import services.score.课程成绩列表类型;
import services.score.课程成绩类型;
import services.score.*;
import test.ScoreManage;


import java.util.List;


public class Main {

    public static void main(String[] args) {


//        Score port = service.getScorePort();
//        try {
//            课程成绩列表类型 courseScores = port.getScore("141250019");
//            List<课程成绩类型> list = courseScores.get课程成绩();
//            if(list.size()==0){
//                System.out.println("课程成绩为空");
//            }
//            for(int i = 0; i < list.size(); i++){
//                课程成绩类型 cs = list.get(i);
//                System.out.println("course id:"+cs.get课程编号()+"score type:"+cs.get成绩性质().value());
//                List<成绩类型> scoreList = cs.get成绩();
//                for(int j = 0; j < scoreList.size(); j++){
//                    System.out.println("id:"+scoreList.get(j).get学号()+",value:"+scoreList.get(j).get得分());
//                }
//            }
//        } catch (IdNotFoundException e) {
//            e.printStackTrace();
//        }

//        StudentPort studentPort = new StudentControllerService().getStudentPortPort();
//        GetInfoByIdType id = new GetInfoByIdType();
//        id.setSid("141250019");
//        try {
//            学生类型 student = studentPort.getInfoById(id);
//            System.out.println(student.get个人信息().get个人姓名());
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
