
import schema.�ɼ�����;
import schema.�γ̳ɼ��б�����;
import schema.�γ̳ɼ�����;
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
//            �ɼ�����[][] scores = port.getScore("141250019");
//            for(int i = 0; i < scores.length; i++){
//                System.out.println("i="+i);
//                for(int j = 0; j < scores[i].length; j++){
//                    System.out.println("ѧ��:"+scores[i][j].getѧ��()+",�÷�:"+scores[i][j].get�÷�());
//                }
//            }
//            System.out.println("end");
//
//            port = service.getStudentPortPort();
//            GetInfoByIdType par = new GetInfoByIdType();
//            par.setSid("141250019");
//            ѧ������ student = port.getInfoById(par);
//            System.out.println(student.get������Ϣ().get��������());
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
            �γ̳ɼ��б����� courseScores = port.getScore("141250019");
            List<�γ̳ɼ�����> list = courseScores.get�γ̳ɼ�();
            for(int i = 0; i < list.size(); i++){
                �γ̳ɼ����� cs = list.get(i);
                System.out.println("course id:"+cs.get�γ̱��()+"score type:"+cs.get�ɼ�����().value());
                List<�ɼ�����> scoreList = cs.get�ɼ�();
                for(int j = 0; j < scoreList.size(); j++){
                    System.out.println("id:"+scoreList.get(j).getѧ��()+",value:"+scoreList.get(j).get�÷�());
                }
            }
        } catch (IdNotFoundException e) {
            e.printStackTrace();
        }

    }
}
