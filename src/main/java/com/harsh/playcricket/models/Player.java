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
    private int run;
    private int wicket;
    private double overs;
    private int playedballs;
    private double average;

    @Column(name = "strike_rate")
    private int strikeRate;

    @Column(name = "total_match")
    private int totalMatch;

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

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getStrikeRate() {
        return strikeRate;
    }

    public void setStrikeRate(int strikeRate) {
        this.strikeRate = strikeRate;
    }

    public int getTotalMatch() {
        return totalMatch;
    }

    public void setTotalMatch(int totalMatch) {
        this.totalMatch = totalMatch;
    }
}