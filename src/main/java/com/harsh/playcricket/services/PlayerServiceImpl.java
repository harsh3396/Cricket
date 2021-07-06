package com.harsh.playcricket.services;

import com.harsh.playcricket.exception.NotFoundException;
import com.harsh.playcricket.models.Player;
import com.harsh.playcricket.models.Team;
import com.harsh.playcricket.repositories.PlayerRepository;
import com.harsh.playcricket.repositories.TeamRepository;
import com.harsh.playcricket.request_dto.PlayerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService{

    @Autowired
    TeamRepository teamRepository;

    @Autowired
    PlayerRepository playerRepository;

    @Override
    @Transactional
    public Player createPlayer(PlayerRequest request) {
        Optional<Team> team = teamRepository.findById(request.getTeam_id());
        if(!team.isPresent()){
            throw new NotFoundException("Team id " + request.getTeam_id() + " doesn't exist.");
        }

        Player player = playerRepository.save(request.getPlayer());

        Team teamObj = team.get();
        if(teamObj.getPlayers() == null){
            HashSet<Player> players = new HashSet<Player>();
            players.add(player);
            teamObj.setPlayers(players);
        }else{
            teamObj.getPlayers().add(player);
        }
        return player;
    }
}
