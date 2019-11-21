package com.sxy.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author 孙鑫悦
 * @create 2019-11-20-10:03
 */
@Entity
public class Emp {
    private int id;
    private int gonghao;
    private String name;
    private int age;
    private int gongzi;
    private String bumen;

    @Id
    @Column(name = "id")
    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    @Basic
    @Column(name = "gonghao")
    public int getGonghao() {
        return gonghao;
    }

    public void setGonghao(int gonghao) {
        this.gonghao = gonghao;
    }

    @Basic
    @Column(name = "name")
    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Basic
    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Basic
    @Column(name = "gongzi")
    public int getGongzi() {
        return gongzi;
    }

    public void setGongzi(int gongzi) {

        this.gongzi = gongzi;
    }

    @Basic
    @Column(name = "bumen")
    public String getBumen() {

        return bumen;
    }

    public void setBumen(String bumen) {

        this.bumen = bumen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}

        Emp emp = (Emp) o;

        if (id != emp.id) {return false;}
        if (gonghao != emp.gonghao) {return false;}
        if (age != emp.age){ return false;}
        if (gongzi != emp.gongzi) {return false;}
        if (name != null ? !name.equals(emp.name) : emp.name != null) {return false;}
        if (bumen != null ? !bumen.equals(emp.bumen) : emp.bumen != null){ return false;}

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + gonghao;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + gongzi;
        result = 31 * result + (bumen != null ? bumen.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", gonghao=" + gonghao +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gongzi=" + gongzi +
                ", bumen='" + bumen + '\'' +
                '}';
    }
}
