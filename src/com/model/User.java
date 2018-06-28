package com.model;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class User implements Serializable {

    /** identifier field */
    private String username;

    /** persistent field */
    private String password;

    /** persistent field */
    private String identity;

    /** nullable persistent field */
    private String teanum;

    /** full constructor */
    public User(String username, String password, String identity, String teanum) {
        this.username = username;
        this.password = password;
        this.identity = identity;
        this.teanum = teanum;
    }

    /** default constructor */
    public User() {
    }

    /** minimal constructor */
    public User(String username, String password, String identity) {
        this.username = username;
        this.password = password;
        this.identity = identity;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdentity() {
        return this.identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getTeanum() {
        return this.teanum;
    }

    public void setTeanum(String teanum) {
        this.teanum = teanum;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("username", getUsername())
            .toString();
    }

}
