package com.harsh.playcricket.models;

import javax.persistence.*;

@Entity
public class CricketMatch extends Base {

    public enum Inning {
        FIRST, SECOND
    }

    private String name;

    @ManyToOne
    @JoinColumn(name = "team1")
    private Team team1;

    @ManyToOne
    @JoinColumn(name = "team2")
    private Team team2;

    private String venue;

    @ManyToOne
    @JoinColumn(name = "bat_first_team")
    private Team batFirst;

    @Enumerated(value = EnumType.STRING)
    private Inning inning;

    @Column(name = "is_match_over")
    private boolean isMatchOver;

    @Column(name = "max_over")
    private int maxOver;

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

    public Team getBatFirst() {
        return batFirst;
    }

    public void setBatFirst(Team batFirst) {
        this.batFirst = batFirst;
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

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }
}
