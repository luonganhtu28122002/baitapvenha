package baitap;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Student {
    public int id;
    public String name;
    public String address;
    public String mobile;

    public Student(int id, String name, String address, String mobile) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }
@XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
@XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
@XmlElement
    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }
@XmlElement
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
