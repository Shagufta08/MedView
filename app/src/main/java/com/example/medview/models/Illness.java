package com.example.medview.models;

public class Illness {
    String name , illness , type ;
    Long userId;
public  Illness(String name , String illness , Long userId , String type) {
    this.name=name;
    this.illness=illness;
    this.userId=userId;
    this.type=type;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
