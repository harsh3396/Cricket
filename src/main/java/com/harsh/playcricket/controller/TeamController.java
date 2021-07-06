package com.harsh.playcricket.controller;

import com.harsh.playcricket.exception.NotFoundException;
import com.harsh.playcricket.models.Team;
import com.harsh.playcricket.repositories.TeamRepository;
import com.harsh.playcricket.response_dto.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class TeamController {

    @Autowired
    TeamRepository teamRepository;

    @PostMapping("team")
    public BaseResponse createTeam(@RequestBody Team team){
        Team savedTeam = teamRepository.save(team);
        String msg = "Team created successfully";
        BaseResponse response = new BaseResponse(true, msg, savedTeam);
        return response;
    }

    @GetMapping("team/{id}")
    public BaseResponse getTeam(@PathVariable(value = "id") int id){
        Optional<Team> team = teamRepository.findById(id);
        if(!team.isPresent()){
            throw new NotFoundException("Team id " + id +" doesn't exist.");
        }
        String msg = "Team retrieved successfully";
        BaseResponse response = new BaseResponse(true, msg, team);
        return response;
    }
}
