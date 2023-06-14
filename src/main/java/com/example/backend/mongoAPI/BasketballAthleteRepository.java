package com.example.backend.mongoAPI;

import com.example.backend.sports.basketball.BasketballAthlete;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BasketballAthleteRepository extends MongoRepository<BasketballAthlete, String> {
}
