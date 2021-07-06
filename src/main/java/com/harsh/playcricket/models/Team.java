package com.harsh.playcricket.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Team extends Base {

    private String name;

//    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
//    private Set<Player> players;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Set<Player> getPlayers() {
//        return players;
//    }
//
//    public void setPlayers(Set<Player> players) {
//        this.players = players;
//    }
//
//    public void addPlayer(Player player) {
//        if (player != null) {
//            if (players == null) {
//                players = new HashSet<>();
//            }
////            player.setTeam(this);
//            players.add(player);
//        }
//    }
}
