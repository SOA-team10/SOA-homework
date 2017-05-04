package data;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import java.util.ArrayList;


public class CourseStudent {

	private String id;
	private String name;
	private ArrayList<Course> courses;
	
	public CourseStudent() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Course> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	public void addToSOAP(SOAPElement soapElement) {
		try {
			QName rootQName = soapElement.createQName("student", "tns");
			SOAPElement root = soapElement.addChildElement(rootQName);

			QName studentQName = soapElement.createQName("studentId", "tns");
			SOAPElement studentIdDOM = root.addChildElement(studentQName);
			studentIdDOM.addTextNode(id + "");
			
			QName studentNQName = soapElement.createQName("name", "tns");
			SOAPElement studentNameDOM = root.addChildElement(studentNQName);
			studentNameDOM.addTextNode(name);

			QName courselistQName = soapElement.createQName("courseList", "tns");
			SOAPElement courselistDOM = root.addChildElement(courselistQName);

			for (Course course : courses) {
				course.addToSOAP(courselistDOM);
			}

		} catch (SOAPException e) {
			e.printStackTrace();
		}
	}
}
