package Entities.www;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by duanzhengmou on 6/6/17.
 */
@XmlRootElement(name = "department")
public class Department implements Serializable{
    String depId;
    String depType;
    String depName;
    DepAddress depAddress;

    public String getDepId() {
        return depId;
    }

    @XmlAttribute
    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepType() {
        return depType;
    }

    @XmlElement(namespace = "http://www.nju.edu.cn/schema")
    public void setDepType(String depType) {
        this.depType = depType;
    }

    public String getDepName() {
        return depName;
    }

    @XmlElement(namespace = "http://www.nju.edu.cn/schema")
    public void setDepName(String depName) {
        this.depName = depName;
    }


    public DepAddress getDepAddress() {
        return depAddress;
    }

    @XmlElement(namespace = "http://www.nju.edu.cn/schema")
    public void setDepAddress(DepAddress depAddress) {
        this.depAddress = depAddress;
    }
}
