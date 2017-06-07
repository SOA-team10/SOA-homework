
package Entities.jw;
import Entities.www.PersonInfo;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by duanzhengmou on 6/6/17.
 */
@XmlRootElement(name= "student")
@XmlType( propOrder = {"personInfo", "checkInYear", "courseList"})
public class Student implements Cloneable, Serializable{
    String studentId;
    PersonInfo personInfo;
    String checkInYear;
    CourseList courseList;

    @XmlAttribute(name = "studentId")
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    @XmlElement(name = "personInfo", namespace = "http://www.nju.edu.cn/schema")
    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }


    public String getCheckInYear() {
        return checkInYear;
    }

    @XmlElement(name = "checkInYear")
    public void setCheckInYear(String checkInYear) {
        this.checkInYear = checkInYear;
    }


    public CourseList getCourseList() {
        return courseList;
    }

    @XmlElement(name = "courseList")
    public void setCourseList(CourseList courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", personInfo=" + personInfo +
                ", checkInYear='" + checkInYear + '\'' +
                ", courseList=" + courseList +
                '}';
    }

    public Student clone(){
        Student student = null;
        try {
            student = (Student) super.clone();

            System.out.println("after clone: "+student.getPersonInfo().getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return student;
    }
}
