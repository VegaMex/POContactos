package com.vegamex.pocontactos;

import java.util.Date;

public class Contact {

    private String user;
    private String email;
    private String twitter;
    private String cellphone;
    private Date birthdate;

    public Contact(String user, String email, String twitter, String cellphone, Date birthdate) {
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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
