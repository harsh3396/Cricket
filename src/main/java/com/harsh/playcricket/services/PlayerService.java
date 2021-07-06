package com.harsh.playcricket.services;

import com.harsh.playcricket.models.Player;
import com.harsh.playcricket.request_dto.PlayerRequest;

public interface PlayerService {
    public Player createPlayer(PlayerRequest request);
}
