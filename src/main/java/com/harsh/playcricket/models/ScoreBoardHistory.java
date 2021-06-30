package com.harsh.playcricket.models;

import javax.persistence.*;

@Entity
public class ScoreBoardHistory extends Base {

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

    private String output;

    @ManyToOne
    @JoinColumn(name = "scoreboard_id")
    private ScoreBoard board;

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

    public ScoreBoard getBoard() {
        return board;
    }

    public void setBoard(ScoreBoard board) {
        this.board = board;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
