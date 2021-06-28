package com.harsh.playcricket.models;

public class Player {
    private int id;
    private String name;
    private int age;
    private String type;
    private int run;
    private int wicket;
    private double overs;
    private int played_balls;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getWicket() {
        return wicket;
    }

    public void setWicket(int wicket) {
        this.wicket = wicket;
    }

    public double getOvers() {
        return overs;
    }

    public void setOvers(double overs) {
        this.overs = overs;
    }

    public int getPlayed_balls() {
        return played_balls;
    }

    public void setPlayed_balls(int played_balls) {
        this.played_balls = played_balls;
    }

}

enum PlayerType {

    BOWLER, BATSMAN;
}