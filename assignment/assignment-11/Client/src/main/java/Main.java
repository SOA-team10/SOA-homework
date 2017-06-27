
import schema.成绩类型;
import schema.课程成绩列表类型;
import schema.课程成绩类型;
import services.score.*;


import java.util.List;

public class Main {

    public static void main(String[] args) {
//        ScoreControllerService service = new ScoreControllerServiceLocator();
//        Score port = null;
//
//        StudentControllerService service = new StudentControllerServiceLocator();
//        StudentPort port = null;
//
//
//        try {
//            port = service.getScorePort();
//            成绩类型[][] scores = port.getScore("141250019");
//            for(int i = 0; i < scores.length; i++){
//                System.out.println("i="+i);
//                for(int j = 0; j < scores[i].length; j++){
//                    System.out.println("学号:"+scores[i][j].get学号()+",得分:"+scores[i][j].get得分());
//                }
//            }
//            System.out.println("end");
//
//            port = service.getStudentPortPort();
//            GetInfoByIdType par = new GetInfoByIdType();
//            par.setSid("141250019");
//            学生类型 student = port.getInfoById(par);
//            System.out.println(student.get个人信息().get个人姓名());
//        } catch (ServiceException e) {
//            e.printStackTrace();
//        } catch (NotFoundType notFoundType) {
//            notFoundType.printStackTrace();
//        } catch (RemoteException e) {
//            e.printStackTrace();
//        }

        ScoreControllerService service = new ScoreControllerService();
        Score port = service.getScorePort();
        try {
            课程成绩列表类型 courseScores = port.getScore("141250019");
            List<课程成绩类型> list = courseScores.get课程成绩();
            for(int i = 0; i < list.size(); i++){
                课程成绩类型 cs = list.get(i);
                System.out.println("course id:"+cs.get课程编号()+"score type:"+cs.get成绩性质().value());
                List<成绩类型> scoreList = cs.get成绩();
                for(int j = 0; j < scoreList.size(); j++){
                    System.out.println("id:"+scoreList.get(j).get学号()+",value:"+scoreList.get(j).get得分());
                }
            }
        } catch (IdNotFoundException e) {
            e.printStackTrace();
        }

    }
}
