package main;

import wsdl.*;

/**
 * Created by ���ī^ on 2017/6/14.
 */
public class App {
    public static void main(String[] args){
        StuScoreImplService stu = new StuScoreImplService();

        StuScoreImpl soap = stu.getStuScoreImplPort();
        //����
//        String id = "141250192";
//
//        ����ѧ���ɼ��б����� list = null;
//        try {
//             list = soap.searchScore(id);
//        } catch (SearchScoreFault searchScoreFault) {
//            searchScoreFault.printStackTrace();
//        }
//
//        if(list!=null){
//            System.out.println("id:"+list.getѧ��());
//            for(int i = 0; i < list.get����ɼ�().size(); i++){
//                ����ɼ����� item = list.get����ɼ�().get(i);
//                System.out.println("�γ�id��"+ item.get�γ̱��()+",�÷����ʣ�"+item.get�÷�����()+",������"+item.get����());
//            }
//        }

        //���
        ��ӻ��޸ĳɼ����� addGrade = new ��ӻ��޸ĳɼ�����();
        addGrade.setѧ��("141250001");
        addGrade.set�γ̱��("000000");
        addGrade.set�ɼ���������(�ɼ���������.�����ɼ�);
        addGrade.set����(100);
        String result = "";
//        System.out.println(addGrade.get�ɼ���������().value());
        try{
            result = soap.addScore(addGrade);
        }catch (AddScoreFault fault){
            fault.printStackTrace();
        }
        System.out.println(result);


    }
}
