package com.harsh.playcricket.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Inning extends Base{

    @ManyToOne
    @JoinColumn(name = "batting_team_id")
    private Team battingTeam;

    @ManyToOne
    @JoinColumn(name = "bowling_team_id")
    private Team bowlingTeam;
    private boolean isInningOver;

    @ManyToOne
    @JoinColumn(name = "striker")
    private Player striker;

    @ManyToOne
    @JoinColumn(name = "non_striker")
    private Player nonStriker;

    @Column(name = "current_over")
    private double currentOver;

    @OneToMany(mappedBy = "inning", cascade = CascadeType.ALL)
    private Set<Over> overs;

    public Team getBattingTeam() {
        return battingTeam;
    }

    public void setBattingTeam(Team battingTeam) {
        this.battingTeam = battingTeam;
    }

    public Team getBowlingTeam() {
        return bowlingTeam;
    }

    public void setBowlingTeam(Team bowlingTeam) {
        this.bowlingTeam = bowlingTeam;
    }

    public boolean isInningOver() {
        return isInningOver;
    }

    public void setInningOver(boolean inningOver) {
        isInningOver = inningOver;
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

    public double getCurrentOver() {
        return currentOver;
    }

    public void setCurrentOver(double currentOver) {
        this.currentOver = currentOver;
    }

    public Set<Over> getOvers() {
        return overs;
    }

    public void setOvers(Set<Over> overs) {
        this.overs = overs;
    }
}
