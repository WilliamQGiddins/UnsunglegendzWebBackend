package com.example.backend.sports.basketball;

import com.example.backend.athlete.Athlete;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "Basketball")
public class BasketballAthlete extends Athlete {
    private String points;
    private String rebounds;
    private String assists;
    private String steals;
    private String blocks;

    public BasketballAthlete(String points,
                             String rebounds,
                             String assists,
                             String steals,
                             String blocks,
                             String id,
                             String firstName,
                             String lastName,
                             Integer age,
                             LocalDate dob,
                             String email,
                             String school,
                             String gpa,
                             String city,
                             String state) {
        super(id, firstName, lastName, age, dob, email, school, gpa, city, state);
        this.points = points;
        this.rebounds = rebounds;
        this.assists = assists;
        this.steals = steals;
        this.blocks = blocks;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getRebounds() {
        return rebounds;
    }

    public void setRebounds(String rebounds) {
        this.rebounds = rebounds;
    }

    public String getAssists() {
        return assists;
    }

    public void setAssists(String assists) {
        this.assists = assists;
    }

    public String getSteals() {
        return steals;
    }

    public void setSteals(String steals) {
        this.steals = steals;
    }

    public String getBlocks() {
        return blocks;
    }

    public void setBlocks(String blocks) {
        this.blocks = blocks;
    }

    @Override
    public String toString() {
        return "Basketball{" +
                "points=" + points +
                ", rebounds=" + rebounds +
                ", assists=" + assists +
                ", steals=" + steals +
                ", blocks=" + blocks +
                '}';
    }
}
