package com.harsh.playcricket.models;

import javax.persistence.*;

@Entity
public class Player extends Base {

    public enum PlayerType {
        BOWLER, BATSMAN;
    }

    private String name;
    private int age;

    @Enumerated(value = EnumType.STRING)
    private PlayerType type;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
    private int run;
    private int wicket;
    private double overs;
    private int playedballs;

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

    public PlayerType getType() {
        return type;
    }

    public void setType(PlayerType type) {
        this.type = type;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
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

    public int getPlayedballs() {
        return playedballs;
    }

    public void setPlayedballs(int playedballs) {
        this.playedballs = playedballs;
    }

    public double getOvers() {
        return overs;
    }

    public void setOvers(double overs) {
        this.overs = overs;
    }


}