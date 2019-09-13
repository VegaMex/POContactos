package com.vegamex.pocontactos;

import java.io.Serializable;
import java.util.Date;

public class Contact implements Serializable {

    private String user;
    private String email;
    private String twitter;
    private String cellphone;
    private String birthdate;

    public Contact(String user, String email, String twitter, String cellphone, String birthdate) {
        this.user = user;
        this.email = email;
        this.twitter = twitter;
        this.cellphone = cellphone;
        this.birthdate = birthdate;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
