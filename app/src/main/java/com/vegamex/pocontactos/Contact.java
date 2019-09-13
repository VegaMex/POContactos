package com.vegamex.pocontactos;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;

public class Contact implements Parcelable {

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

    protected Contact(Parcel in) {
        user = in.readString();
        email = in.readString();
        twitter = in.readString();
        cellphone = in.readString();
        long tmpBirthdate = in.readLong();
        birthdate = tmpBirthdate != -1 ? new Date(tmpBirthdate) : null;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(user);
        dest.writeString(email);
        dest.writeString(twitter);
        dest.writeString(cellphone);
        dest.writeLong(birthdate != null ? birthdate.getTime() : -1L);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Contact> CREATOR = new Parcelable.Creator<Contact>() {
        @Override
        public Contact createFromParcel(Parcel in) {
            return new Contact(in);
        }

        @Override
        public Contact[] newArray(int size) {
            return new Contact[size];
        }
    };
}
