package com.harsh.playcricket.repositories;

import com.harsh.playcricket.models.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Integer> {

}
