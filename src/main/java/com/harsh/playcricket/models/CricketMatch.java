package com.harsh.playcricket.models;

import javax.persistence.*;

@Entity
public class CricketMatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "team1")
    private Team team1;

    @ManyToOne
    @JoinColumn(name = "team2")
    private Team team2;

    @ManyToOne
    @JoinColumn(name = "battingteam")
    private Team battingteam;

    @Enumerated(value= EnumType.STRING)
    private Inning inning;

    @Column(name = "is_match_over")
    private boolean isMatchOver;

    @Column(name = "max_over")
    private int maxOver;

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

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public Team getBattingteam() {
        return battingteam;
    }

    public void setBattingteam(Team battingteam) {
        this.battingteam = battingteam;
    }

    public Inning getInning() {
        return inning;
    }

    public void setInning(Inning inning) {
        this.inning = inning;
    }

    public boolean isMatchOver() {
        return isMatchOver;
    }

    public void setMatchOver(boolean matchOver) {
        isMatchOver = matchOver;
    }

    public int getMaxOver() {
        return maxOver;
    }

    public void setMaxOver(int maxOver) {
        this.maxOver = maxOver;
    }
}

enum Inning{
    FIRST, SECOND
}