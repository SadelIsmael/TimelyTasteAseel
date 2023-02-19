package com.example.timelytasteaseel;

public class User {
    private String fullName;
    private String username;
    private String password;
    private String bio;


    public User(){

    }


    public User(String fullName, String username, String password, String bio) {
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.bio = bio;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public String getbio() {
        return bio;
    }

    public void setbio(String bio) {
        this.bio = bio;
    }


    @Override
    public String toString() {
        return "MainPage{" +
                "fullName='" + fullName + '\'' +
                ",username='" + username+ '\'' +
                ",  password='" +  password + '\'' +
                '}';
    }
}
