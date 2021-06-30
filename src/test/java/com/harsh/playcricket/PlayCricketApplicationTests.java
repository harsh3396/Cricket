package com.harsh.playcricket;

import com.harsh.playcricket.models.Team;
import com.harsh.playcricket.repositories.TeamRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PlayCricketApplicationTests {

    @Autowired
    TeamRepository teamRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testCreateTeam() {
        Team team = new Team();
        team.setName("India");
        teamRepository.save(team);
    }
}
