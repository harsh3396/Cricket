CREATE DATABASE cricket;

use cricket;

create table team
(
    id   int PRIMARY KEY AUTO_INCREMENT,
    name varchar(30) NOT NULL UNIQUE
);

create table player
(
    id          int PRIMARY KEY AUTO_INCREMENT,
    name        varchar(30),
    age         int,
    type        varchar(20),
    run         int,
    wicket      int,
    overs       decimal(2, 1),
    playedballs int,
    total_match int,
    strike_rate int,
    average     decimal(3, 2)
);

create table team_player_map
(
    team_id   int,
    player_id int,
    FOREIGN KEY (team_id)
        REFERENCES team (id),
    FOREIGN KEY (player_id)
        REFERENCES player (id),
    PRIMARY KEY (team_id, player_id)
);

create table inning
(
    id              int PRIMARY KEY AUTO_INCREMENT,
    batting_team_id int,
    bowling_team_id int,
    striker         int,
    non_striker     int,
    current_over    decimal(2, 1),
    FOREIGN KEY (batting_team_id)
        REFERENCES team (id),
    FOREIGN KEY (bowling_team_id)
        REFERENCES team (id),
    FOREIGN KEY (striker)
        REFERENCES player (id),
    FOREIGN KEY (non_striker)
        REFERENCES player (id)
);

create table match_over
(
    id        int PRIMARY KEY AUTO_INCREMENT,
    inning_id int,
    bowler_id int,
    over_no   int,
    FOREIGN KEY (inning_id)
        REFERENCES inning (id),
    FOREIGN KEY (bowler_id)
        REFERENCES player (id)
);

create table ball
(
    id          int PRIMARY KEY AUTO_INCREMENT,
    over_id     int,
    striker     int,
    non_striker int,
    ball_no     int,
    ball_output varchar(5),
    FOREIGN KEY (over_id)
        REFERENCES match_over (id),
    FOREIGN KEY (striker)
        REFERENCES player (id),
    FOREIGN KEY (non_striker)
        REFERENCES player (id)
);

create table cricketmatch
(
    id            int PRIMARY KEY AUTO_INCREMENT,
    name          varchar(30),
    team1         int,
    team2         int,
    max_over      int,
    venue         varchar(30),
    is_match_over boolean,
    inning1       int,
    inning2       int,
    FOREIGN KEY (team1)
        REFERENCES team (id),
    FOREIGN KEY (team2)
        REFERENCES team (id),
    FOREIGN KEY (Inning1)
        REFERENCES inning (id),
    FOREIGN KEY (Inning2)
        REFERENCES inning (id)
);
