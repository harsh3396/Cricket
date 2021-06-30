CREATE DATABASE cricket;

use cricket;

create table team(
id int PRIMARY KEY AUTO_INCREMENT,
name varchar(30)
);

create table player(
id int PRIMARY KEY AUTO_INCREMENT,
team_id int,
name varchar(30),
age int,
type varchar(20),
run int,
wicket int,
overs decimal(2,1),
playedballs int,
FOREIGN KEY (team_id)
REFERENCES team(id)
);

create table cricketmatch(
id int PRIMARY KEY AUTO_INCREMENT,
name varchar(30),
team1 int,
team2 int,
battingteam int,
inning varchar(20),
max_over int,
isMatchOver boolean,
FOREIGN KEY (team1)
REFERENCES team(id),
FOREIGN KEY (team2)
REFERENCES team(id),
FOREIGN KEY (battingteam)
REFERENCES team(id)
);

create table scoreboard(
id int PRIMARY KEY AUTO_INCREMENT,
cricketmatch_id int,
team_id int,
striker int,
non_striker int,
bowler int,
run int,
wicket int,
overs decimal(2,1),
FOREIGN KEY (cricketmatch_id)
REFERENCES cricketmatch(id),
FOREIGN KEY (team_id)
REFERENCES team(id),
FOREIGN KEY (striker)
REFERENCES player(id),
FOREIGN KEY (non_striker)
REFERENCES player(id),
FOREIGN KEY (bowler)
REFERENCES player(id)
);

create table scoreboardhistory(
id int PRIMARY KEY AUTO_INCREMENT,
scoreboard_id int,
striker int,
non_striker int,
bowler int,
run int,
wicket int,
overs decimal(2,1),
output varchar(10),
FOREIGN KEY (scoreboard_id)
REFERENCES scoreboard(id),
FOREIGN KEY (striker)
REFERENCES player(id),
FOREIGN KEY (non_striker)
REFERENCES player(id),
FOREIGN KEY (bowler)
REFERENCES player(id)
);
