package com.harsh.playcricket.repositories;

import com.harsh.playcricket.models.ScoreBoard;
import org.springframework.data.repository.CrudRepository;

public interface ScoreBoardRepository extends CrudRepository<ScoreBoard, Integer> {
}
