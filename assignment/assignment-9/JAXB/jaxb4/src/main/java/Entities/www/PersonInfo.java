package Entities.www;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * Created by duanzhengmou on 6/6/17.
 */
@XmlRootElement(name = "personInfo", namespace = "http://www.nju.edu.cn/schema")
@XmlType( propOrder = {"name", "native_", "birthDay", "sex", "phone", "department"})
public class PersonInfo implements Serializable{
    String name;
    String native_;
    String idCard;
    String birthDay;
    String sex;
    String phone;
    Department department;


    public String getIdCard() {
        return idCard;
    }
    @XmlAttribute
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getName() {
//        System.out.println("my name is:"+this.name);
        return name;
    }

    @XmlElement(name = "name", namespace = "http://www.nju.edu.cn/schema")
    public void setName(String name) {
        this.name = name;
//        System.out.println("set name for :"+name);
    }

    public String getNative_() {
        return native_;
    }

    @XmlElement(name = "native", namespace = "http://www.nju.edu.cn/schema")
    public void setNative_(String native_) {
        this.native_ = native_;
    }

    public String getBirthDay() {
        return birthDay;
    }

    @XmlElement(name = "birthday", namespace = "http://www.nju.edu.cn/schema")
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getSex() {
        return sex;
    }

    @XmlElement(namespace = "http://www.nju.edu.cn/schema")
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    @XmlElement(namespace = "http://www.nju.edu.cn/schema")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Department getDepartment() {
        return department;
    }

    @XmlElement(namespace = "http://www.nju.edu.cn/schema")
    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "PersonInfo{" +
                "name='" + name + '\'' +
                ", native_='" + native_ + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", department=" + department +
                '}';
    }
}
