package com.harsh.playcricket.services;

import com.harsh.playcricket.exception.NotFoundException;
import com.harsh.playcricket.models.Player;
import com.harsh.playcricket.models.Team;
import com.harsh.playcricket.repositories.TeamRepository;
import com.harsh.playcricket.request_dto.PlayerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService{

    @Autowired
    TeamRepository teamRepository;

    @Override
    @Transactional
    public Player createPlayer(PlayerRequest request) {
        Optional<Team> team = teamRepository.findById(request.getTeam_id());
        if(!team.isPresent()){
            throw new NotFoundException("Team id " + request.getTeam_id() + " doesn't exist.");
        }

        Player player = request.getPlayer();

        Team teamObj = team.get();
        player.setTeam(teamObj);
        return player;
    }
}
