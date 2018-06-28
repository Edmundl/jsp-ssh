package com.model;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Lesson implements Serializable {

    /** identifier field */
    private Integer id;

    /** nullable persistent field */
    private String dept;

    /** nullable persistent field */
    private String classes;

    /** persistent field */
    private String subject;

    /** persistent field */
    private String time;

    /** nullable persistent field */
    private String place;

    /** persistent field */
    private String teanum;

    /** persistent field */
    private String status;

    /** full constructor */
    public Lesson(Integer id, String dept, String classes, String subject, String time, String place, String teanum, String status) {
        this.id = id;
        this.dept = dept;
        this.classes = classes;
        this.subject = subject;
        this.time = time;
        this.place = place;
        this.teanum = teanum;
        this.status = status;
    }

    /** default constructor */
    public Lesson() {
    }

    /** minimal constructor */
    public Lesson(Integer id, String subject, String time, String teanum, String status) {
        this.id = id;
        this.subject = subject;
        this.time = time;
        this.teanum = teanum;
        this.status = status;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDept() {
        return this.dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getClasses() {
        return this.classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlace() {
        return this.place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTeanum() {
        return this.teanum;
    }

    public void setTeanum(String teanum) {
        this.teanum = teanum;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .toString();
    }

}
