package com.example.app1;

public class UserModel {
    String name, surname;
    String age;
    String supportedTeam;

    public String getName() {
        return name;
    }

    public UserModel(String name, String surname, String age, String supportedTeam) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.supportedTeam = supportedTeam;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSupportedTeam() {
        return supportedTeam;
    }

    public void setSupportedTeam(String supportedTeam) {
        this.supportedTeam = supportedTeam;
    }
}
