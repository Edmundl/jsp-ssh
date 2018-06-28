package com.model;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Teaevaluate implements Serializable {

    /** identifier field */
    private String teanum;

    /** nullable persistent field */
    private String grade;

    /** nullable persistent field */
    private String gradetxt;

    /** full constructor */
    public Teaevaluate(String teanum, String grade, String gradetxt) {
        this.teanum = teanum;
        this.grade = grade;
        this.gradetxt = gradetxt;
    }

    /** default constructor */
    public Teaevaluate() {
    }

    /** minimal constructor */
    public Teaevaluate(String teanum) {
        this.teanum = teanum;
    }

    public String getTeanum() {
        return this.teanum;
    }

    public void setTeanum(String teanum) {
        this.teanum = teanum;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGradetxt() {
        return this.gradetxt;
    }

    public void setGradetxt(String gradetxt) {
        this.gradetxt = gradetxt;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("teanum", getTeanum())
            .toString();
    }

}
