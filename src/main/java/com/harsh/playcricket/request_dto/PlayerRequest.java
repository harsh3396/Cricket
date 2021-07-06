package com.harsh.playcricket.request_dto;

import com.harsh.playcricket.models.Player;

public class PlayerRequest {
    private String name;
    private int age;
    private String type;
    private int team_id;
    private Player player;

    public Player getPlayer() {
        if(player == null) {
            player = new Player();
            player.setName(name);
            player.setType(Player.PlayerType.valueOf(type));
            player.setAge(age);
        }
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    @Override
    public String toString() {
        return "PlayerRequest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                ", team_id=" + team_id +
                '}';
    }
}
