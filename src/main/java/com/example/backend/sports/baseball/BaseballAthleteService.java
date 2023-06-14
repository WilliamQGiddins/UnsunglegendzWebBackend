package com.example.backend.sports.baseball;

import com.example.backend.mongoAPI.BaseballAthleteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.backend.exception.AthleteNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class BaseballAthleteService {

    private final BaseballAthleteRepository baseballAthleteRepository;

    @Autowired
    public BaseballAthleteService(BaseballAthleteRepository baseballAthleteRepository) {
        this.baseballAthleteRepository = baseballAthleteRepository;
    }

    public Optional<BaseballAthlete> getBaseballAthlete(String id) {
        return Optional.ofNullable(baseballAthleteRepository.findById(id).orElseThrow(() -> new AthleteNotFoundException(id)));

    }

    public List<BaseballAthlete> getAllBaseballAthletes() {
        return baseballAthleteRepository.findAll();
    }

    public String storeBaseballAthlete(BaseballAthlete baseballAthlete) {
        baseballAthleteRepository.save(baseballAthlete);
        return "Added Baseball Athlete with id : " + baseballAthlete.getId();
    }

    public String deleteBaseballAthlete(String id) {
        if(!baseballAthleteRepository.existsById(id)){
            throw new AthleteNotFoundException(id);
        }
        baseballAthleteRepository.deleteById(id);
        return "Deleted Baseball Athlete with id : " + id;
    }
}
