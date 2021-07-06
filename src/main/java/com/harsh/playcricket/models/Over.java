package com.harsh.playcricket.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "match_over")
public class Over extends Base{

    @ManyToOne
    @JoinColumn(name = "bowler_id")
    private Player bowler;

    @Column(name = "over_no")
    private int overNo;

    @ManyToOne
    @JoinColumn(name = "inning_id")
    private Inning inning;

    @OneToMany(mappedBy = "over", cascade = CascadeType.ALL)
    private Set<Ball> balls;

    public Player getBowler() {
        return bowler;
    }

    public void setBowler(Player bowler) {
        this.bowler = bowler;
    }

    public int getOverNo() {
        return overNo;
    }

    public void setOverNo(int overNo) {
        this.overNo = overNo;
    }

    public Inning getInning() {
        return inning;
    }

    public void setInning(Inning inning) {
        this.inning = inning;
    }

    public Set<Ball> getBalls() {
        return balls;
    }

    public void setBalls(Set<Ball> balls) {
        this.balls = balls;
    }
}
