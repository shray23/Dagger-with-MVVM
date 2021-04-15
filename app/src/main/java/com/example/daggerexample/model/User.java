package com.example.daggerexample.model;

public class User {

    String firstName;
    String lastname;

    public User(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString(){
        return "User [first name =" + firstName + "Last Name = "+ lastname + "]" ;
    }
}
