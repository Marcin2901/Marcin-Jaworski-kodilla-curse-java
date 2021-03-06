package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int ID;
    private final String userName;
    private final  char sex;
    private final LocalDate dateOfBirth;
    private final int publicatePost;

    public ForumUser(final int ID, final String userName,final char sex,final LocalDate dateOfBirth,final int publicatePost) {
        this.ID = ID;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.publicatePost = publicatePost;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "ID=" + ID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", publicatePost=" + publicatePost +
                '}';
    }

    public int getID() {
        return ID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPublicatePost() {
        return publicatePost;
    }
}
