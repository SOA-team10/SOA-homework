package data;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import java.sql.Array;
import java.util.ArrayList;

public class Course {

	private String courseName;
	private String course;
	private ArrayList<Score> scoreList;
	
	public Course() {
		super();
	}
	
	public Course(String courseName,String course, ArrayList<Score> scoreList) {
		super();
		this.courseName = courseName;
		this.course = course;
		this.scoreList = scoreList;
	}

	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public ArrayList<Score> getScore() {
		return scoreList;
	}
	public void setScore(ArrayList<Score> score) {
		this.scoreList = score;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void addToSOAP(SOAPElement soapElement) {
		try {
			QName rootQName = soapElement.createQName("course", "tns");
			SOAPElement root = soapElement.addChildElement(rootQName);

			root.addAttribute(new QName("courseName"), courseName);
			root.addAttribute(new QName("courseId"), course);

			QName scoreListQName = soapElement.createQName("scoreList", "tns");
			SOAPElement scoreListDom = root.addChildElement(scoreListQName);

			for(Score score: scoreList){
				score.addToSoap(scoreListDom);
			}

		} catch (SOAPException e) {
			e.printStackTrace();
		}
	}
}
