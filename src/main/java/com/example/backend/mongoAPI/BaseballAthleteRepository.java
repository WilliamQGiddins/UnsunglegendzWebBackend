package com.example.backend.mongoAPI;

import com.example.backend.sports.baseball.BaseballAthlete;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BaseballAthleteRepository extends MongoRepository<BaseballAthlete, String> {
}
