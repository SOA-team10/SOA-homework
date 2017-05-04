package data;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by duanzhengmou on 5/2/17.
 */
public class ScoreList {
    private List<CourseScore> scoreList = new ArrayList<CourseScore>();

    public ScoreList(){
        // generate data
        for (int i=0;i<5;i++){
            String studentId = "14125000"+i;
            CourseScore c1 = new CourseScore();
            c1.setCourseId("000000");
            c1.setScoreType("平时成绩");
            c1.setScore(new Score(studentId, (int)(Math.random()*20+50)));

            CourseScore c2 = new CourseScore();
            c2.setCourseId("000000");
            c2.setScoreType("期末成绩");
            c2.setScore(new Score(studentId, (int)(Math.random()*20+50)));

            CourseScore c3 = new CourseScore();
            c3.setCourseId("000000");
            c3.setScoreType("总评成绩");
            c3.setScore(new Score(studentId, (int)(Math.random()*20+50)));

            scoreList.add(c1);
            scoreList.add(c2);
            scoreList.add(c3);
        }
    }
    public List<CourseScore> getScoreList() {
        return scoreList;
    }

    public List<CourseScore> getScoreById(String id){
        List<CourseScore> result = new ArrayList<CourseScore>();
        for (CourseScore c : scoreList){
            if ( c.getScore().getStudentId().equals(id)){
                result.add(c);
            }
        }
        return result;
    }

    public void show() {
        for (CourseScore c : scoreList){
            System.out.println("courseId :"+c.getCourseId()+" scoreType:"+c.getScoreType());
            System.out.println("studentId: "+c.getScore().getStudentId());
            System.out.println("score    :"+c.getScore().getStudentScore());
            System.out.println("----------");
        }
    }
}
