package com.harsh.playcricket.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Team extends Base {

    private String name;

    @OneToMany
    @JoinTable(name = "team_player_map", joinColumns = @JoinColumn(name = "team_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "player_id", referencedColumnName = "id"))
    private Set<Player> players;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
