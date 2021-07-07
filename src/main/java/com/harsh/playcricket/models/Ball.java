package com.harsh.playcricket.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ball extends Base{
    @ManyToOne
    @JoinColumn(name = "striker")
    private Player striker;

    @ManyToOne
    @JoinColumn(name = "non_striker")
    private Player nonStriker;

    @Column(name = "ball_no")
    private int ballNo;

    @Column(name = "ball_output")
    private String ballOutput;

    @ManyToOne
    @JoinColumn(name = "over_id")
    private Over over;

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

    public int getBallNo() {
        return ballNo;
    }

    public void setBallNo(int ballNo) {
        this.ballNo = ballNo;
    }

    public String getBallOutput() {
        return ballOutput;
    }

    public void setBallOutput(String ballOutput) {
        this.ballOutput = ballOutput;
    }

    public Over getOver() {
        return over;
    }

    public void setOver(Over over) {
        this.over = over;
    }
}
