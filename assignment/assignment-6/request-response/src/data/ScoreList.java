package data;

import java.util.ArrayList;
import java.util.HashMap;

public class ScoreList {

	private HashMap<String, CourseStudent> scoreMap;
	
	public ScoreList(){
		
		scoreMap = new HashMap<String, CourseStudent>();
		initData();
	}
	
	private void initData(){
		ArrayList<Course> courses = new ArrayList<Course>();
		ArrayList<Score> scores = new ArrayList<>();
		CourseStudent student1 = new CourseStudent();
		CourseStudent student2 = new CourseStudent();
		CourseStudent student3 = new CourseStudent();

		scores.add(new Score("平时成绩",90));
		scores.add(new Score("期末成绩",80));
		scores.add(new Score("总评成绩",87));

		
		courses.add(new Course("离散数学","000000",scores));
		courses.add(new Course("线性代数","000001",scores));
		courses.add(new Course("微积分","000002",scores));
		
		student1.setCourses(courses);
		student1.setId("141250133");
		student1.setName("段正谋");
		scoreMap.put("141250133", student1);
		student2.setId("141250192");
		student2.setName("张文玘");
		student2.setCourses(courses);
		scoreMap.put("141250192", student2);
		student3.setId("141250142");
		student3.setName("王亚杰");
		student3.setCourses(courses);
		scoreMap.put("141250142", student3);
	}
	
	public CourseStudent getScoreById(String id){
		CourseStudent student = scoreMap.get(id);
		return student;
	}
}
