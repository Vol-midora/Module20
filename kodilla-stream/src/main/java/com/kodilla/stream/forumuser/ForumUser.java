package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char gender;
    private final LocalDate birthDate;
    private final int postNumber;

    public ForumUser(int userID, String userName, char gender, LocalDate birthDate, int postNumber) {
        this.userID = userID;
        this.userName = userName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.postNumber = postNumber;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostNumber() {
        return postNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", postNumber=" + postNumber +
                '}';
    }
}
