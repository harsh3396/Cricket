package com.harsh.playcricket.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ScoreBoard extends Base {

    @ManyToOne
    @JoinColumn(name = "cricketmatch_id")
    private CricketMatch match;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
    private Set<ScoreBoardHistory> history;

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

    public Set<ScoreBoardHistory> getHistory() {
        return history;
    }

    public void setHistory(Set<ScoreBoardHistory> history) {
        this.history = history;
    }
}
