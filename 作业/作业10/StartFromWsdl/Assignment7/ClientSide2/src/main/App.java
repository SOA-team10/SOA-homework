package main;

import wsdl.*;

/**
 * Created by 张文玘 on 2017/6/14.
 */
public class App {
    public static void main(String[] args){
        StuScoreImplService stu = new StuScoreImplService();

        StuScoreImpl soap = stu.getStuScoreImplPort();
        //查找
//        String id = "141250192";
//
//        单个学生成绩列表类型 list = null;
//        try {
//             list = soap.searchScore(id);
//        } catch (SearchScoreFault searchScoreFault) {
//            searchScoreFault.printStackTrace();
//        }
//
//        if(list!=null){
//            System.out.println("id:"+list.get学号());
//            for(int i = 0; i < list.get单项成绩().size(); i++){
//                单项成绩类型 item = list.get单项成绩().get(i);
//                System.out.println("课程id："+ item.get课程编号()+",得分性质："+item.get得分性质()+",分数："+item.get分数());
//            }
//        }

        //添加
        添加或修改成绩类型 addGrade = new 添加或修改成绩类型();
        addGrade.set学号("141250001");
        addGrade.set课程编号("000000");
        addGrade.set成绩性质类型(成绩性质类型.总评成绩);
        addGrade.set分数(100);
        String result = "";
//        System.out.println(addGrade.get成绩性质类型().value());
        try{
            result = soap.addScore(addGrade);
        }catch (AddScoreFault fault){
            fault.printStackTrace();
        }
        System.out.println(result);


    }
}
