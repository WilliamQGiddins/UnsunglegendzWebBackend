package com.example.backend.sports.baseball;

import com.example.backend.athlete.Athlete;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "Baseball")
public class BaseballAthlete extends Athlete {

    private Integer runs;
    private Integer hits;
    private String battingAvg;
    private Integer RBI;

    public BaseballAthlete(Integer runs,
                           Integer hits,
                           String battingAvg,
                           Integer RBI,
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
        this.runs = runs;
        this.hits = hits;
        this.battingAvg = battingAvg;
        this.RBI = RBI;
    }

    public Integer getRuns() {
        return runs;
    }

    public void setRuns(Integer runs) {
        this.runs = runs;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public String getBattingAvg() {
        return battingAvg;
    }

    public void setBattingAvg(String battingAvg) {
        this.battingAvg = battingAvg;
    }

    public Integer getRBI() {
        return RBI;
    }

    public void setRBI(Integer RBI) {
        this.RBI = RBI;
    }

    @Override
    public String toString() {
        return "BaseballAthlete{" +
                "runs=" + runs +
                ", hits=" + hits +
                ", battingAvg=" + battingAvg +
                ", RBI=" + RBI +
                '}';
    }
}
