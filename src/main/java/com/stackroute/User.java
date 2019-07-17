package com.stackroute;

public class User {
    String name;
    String password;
    User(String name,String password){
        this.name=name;
        this.password=password;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPassword(String password){
        this.password=password;
    }
    String getName(){
        return name;
    }
    String getPassword(){
        return password;
    }
}
