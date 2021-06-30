package com.harsh.playcricket.models;

import javax.persistence.*;
import java.util.Set;

@Entity
//@Table(name = "scoreboard")
public class ScoreBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "cricketmatch_id")
    private CricketMatch match;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @ManyToOne
    @JoinColumn(name = "striker")
    private Player striker;

    @ManyToOne
    @JoinColumn(name = "non_striker")
    private Player nonStriker;

    @ManyToOne
    @JoinColumn(name = "bowler")
    private Player bowler;
    private double overs;
    private int run;
    private int wicket;

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
    private Set<ScoreBoardHistory> history;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CricketMatch getMatch() {
        return match;
    }

    public void setMatch(CricketMatch match) {
        this.match = match;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Player getStriker() {
        return striker;
    }

    public void setStriker(Player striker) {
        this.striker = striker;
    }

    public Player getNonStriker() {
        return nonStriker;
    }

    public void setNonStriker(Player nonStriker) {
        this.nonStriker = nonStriker;
    }

    public Player getBowler() {
        return bowler;
    }

    public void setBowler(Player bowler) {
        this.bowler = bowler;
    }

    public double getOvers() {
        return overs;
    }

    public void setOvers(double overs) {
        this.overs = overs;
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

    public Set<ScoreBoardHistory> getHistory() {
        return history;
    }

    public void setHistory(Set<ScoreBoardHistory> history) {
        this.history = history;
    }
}
