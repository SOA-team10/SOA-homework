package Entities.jw;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by duanzhengmou on 6/6/17.
 */
@XmlRootElement
public class StudentList {
    List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    @XmlElement(name = "student")
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
