package Entities.jw;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * Created by duanzhengmou on 6/6/17.
 */
@XmlType( propOrder = { "teacher", "scoreList"})
@XmlRootElement(name = "course", namespace = "http://jw.nju.edu.cn/schema")

public class Course implements Serializable{
    String courseId;
    String courseName;
    String teacher;
    ScoreList scoreList;


    public String getCourseId() {
        return courseId;
    }

    @XmlAttribute(name = "courseId")
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    @XmlAttribute
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacher() {
        return teacher;
    }

    @XmlElement(name = "teacher", namespace = "http://jw.nju.edu.cn/schema")
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }


    public ScoreList getScoreList() {
        return scoreList;
    }

    @XmlElement(namespace = "http://jw.nju.edu.cn/schema")
    public void setScoreList(ScoreList scoreList) {
        this.scoreList = scoreList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", teacher='" + teacher + '\'' +
                ", scoreList=" + scoreList +
                '}';
    }
}
