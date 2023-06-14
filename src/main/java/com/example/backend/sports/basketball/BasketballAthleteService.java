package com.example.backend.sports.basketball;

import com.example.backend.exception.AthleteNotFoundException;
import com.example.backend.mongoAPI.BasketballAthleteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BasketballAthleteService {

    private final BasketballAthleteRepository basketballAthleteRepository;

    @Autowired
    public BasketballAthleteService(BasketballAthleteRepository basketballAthleteRepository) {
        this.basketballAthleteRepository = basketballAthleteRepository;
    }

    public Optional<BasketballAthlete> getBasketballAthlete(String id) {
        return Optional.ofNullable(basketballAthleteRepository.findById(id).orElseThrow(() -> new AthleteNotFoundException(id)));
    }

    public List<BasketballAthlete> getAllBasketballAthletes() {
        return basketballAthleteRepository.findAll();
    }

    public String storeBasketballAthlete(BasketballAthlete basketballAthlete) {
        basketballAthleteRepository.save(basketballAthlete);
        return "Added Basketball Athlete with id : " + basketballAthlete.getId();
    }

    public String deleteBasketballAthlete(String id) {
        if(!basketballAthleteRepository.existsById(id)){
            throw new AthleteNotFoundException(id);
        }
        basketballAthleteRepository.deleteById(id);
        return "Deleted Basketball Athlete with id : " + id;
    }
}
