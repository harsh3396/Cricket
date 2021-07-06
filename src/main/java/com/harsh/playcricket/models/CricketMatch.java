package com.harsh.playcricket.models;

import javax.persistence.*;

@Entity
public class CricketMatch extends Base {

    private String name;

    @ManyToOne
    @JoinColumn(name = "team1")
    private Team team1;

    @ManyToOne
    @JoinColumn(name = "team2")
    private Team team2;
    private String venue;

    @Column(name = "is_match_over")
    private boolean isMatchOver;

    @Column(name = "max_over")
    private int maxOver;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="inning1_id")
    private Inning inning1;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="inning2_id")
    private Inning inning2;

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

    public Inning getInning1() {
        return inning1;
    }

    public void setInning1(Inning inning1) {
        this.inning1 = inning1;
    }

    public Inning getInning2() {
        return inning2;
    }

    public void setInning2(Inning inning2) {
        this.inning2 = inning2;
    }
}
