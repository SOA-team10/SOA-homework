package Entities.www;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * Created by duanzhengmou on 6/6/17.
 */
// important ...!
@XmlType( propOrder = { "province", "city", "district", "street" , "number"} )
@XmlRootElement(name = "depAddress", namespace = "http://www.nju.edu.cn/schema")
public class DepAddress implements Serializable{
    String province;
    String city;
    String district;
    String street;
    String number;


    public String getProvince() {
        return province;
    }

    @XmlElement(namespace = "http://www.nju.edu.cn/schema")
    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    @XmlElement(namespace = "http://www.nju.edu.cn/schema")
    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    @XmlElement(namespace = "http://www.nju.edu.cn/schema")
    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    @XmlElement(namespace = "http://www.nju.edu.cn/schema")
    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    @XmlElement(namespace = "http://www.nju.edu.cn/schema")
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "DepAddress{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
