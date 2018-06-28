package com.model;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Teame implements Serializable {

    /** identifier field */
    private Integer id;

    /** persistent field */
    private String name;

    /** persistent field */
    private String sex;

    /** persistent field */
    private int age;

    /** persistent field */
    private String tel;

    /** persistent field */
    private String email;

    /** persistent field */
    private String position;

    /** persistent field */
    private String company;

    /** persistent field */
    private int year;

    /** persistent field */
    private String time;

    /** persistent field */
    private String teanum;

    /** full constructor */
    public Teame(Integer id, String name, String sex, int age, String tel, String email, String position, String company, int year, String time, String teanum) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.tel = tel;
        this.email = email;
        this.position = position;
        this.company = company;
        this.year = year;
        this.time = time;
        this.teanum = teanum;
    }

    /** default constructor */
    public Teame() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTeanum() {
        return this.teanum;
    }

    public void setTeanum(String teanum) {
        this.teanum = teanum;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .toString();
    }

}
