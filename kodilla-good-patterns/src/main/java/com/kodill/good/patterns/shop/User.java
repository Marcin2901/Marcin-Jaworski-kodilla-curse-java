package com.kodill.good.patterns.shop;

public class User {
    private String name;
    private String surname;
    private String email;
    public User(String name, String surname, String email){
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' ;
    }



    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
}
