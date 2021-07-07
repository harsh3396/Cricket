package com.harsh.playcricket.controller;

import com.harsh.playcricket.exception.NotFoundException;
import com.harsh.playcricket.models.Player;
import com.harsh.playcricket.repositories.PlayerRepository;
import com.harsh.playcricket.request_dto.PlayerRequest;
import com.harsh.playcricket.response_dto.BaseResponse;
import com.harsh.playcricket.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PlayerController {

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    PlayerService playerService;

    @PostMapping("player")
    public BaseResponse createPlayer(@RequestBody PlayerRequest request){
        Player savedPlayer = playerService.createPlayer(request);
        String msg = "Player created successfully";
        BaseResponse response = new BaseResponse(true, msg, savedPlayer);
        return response;
    }

    @GetMapping("player/{id}")
    public BaseResponse getPlayer(@PathVariable(value = "id") int player_id){
        Optional<Player> player = playerRepository.findById(player_id);
        if(!player.isPresent()){
            throw new NotFoundException("Player id " + player_id +" doesn't exist.");
        }

        String msg = "Player retrieved successfully";
        BaseResponse response = new BaseResponse(true, msg, player);
        return response;
    }

}
