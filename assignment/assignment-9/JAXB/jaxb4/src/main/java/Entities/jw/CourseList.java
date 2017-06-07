package Entities.jw;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by duanzhengmou on 6/6/17.
 */
@XmlRootElement(name = "courseList", namespace = "http://jw.nju.edu.cn/schema")
public class CourseList implements Serializable {
    List<Course> courseList;

    public List<Course> getCourseList() {
        return courseList;
    }

    @XmlElement(name = "course", namespace = "http://jw.nju.edu.cn/schema")
    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void show(){
        for (int i=0;i<courseList.size();i++){
            Course c= courseList.get(i);
            System.out.println(c.toString());
        }
    }
}
