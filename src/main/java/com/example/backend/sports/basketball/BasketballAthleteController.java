package com.example.backend.sports.basketball;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping(path = "api/v1/BasketballAthlete")
public class BasketballAthleteController {

    private final BasketballAthleteService basketballAthleteService;

    @Autowired
    public BasketballAthleteController(BasketballAthleteService basketballAthleteService) {
        this.basketballAthleteService = basketballAthleteService;
    }

    @GetMapping(path = "/GetAthlete/{id}")
    public Optional<BasketballAthlete> getBasketballAthlete(@PathVariable String id) {
        return basketballAthleteService.getBasketballAthlete(id);
    }

    @GetMapping(path = "/GetAllAthletes")
    public List<BasketballAthlete> getAllBasketballAthletes() {
        return basketballAthleteService.getAllBasketballAthletes();
    }

    @PostMapping(path = "/AddAthlete")
    public String storeBasketballAthlete(@RequestBody BasketballAthlete basketballAthlete) {
        return basketballAthleteService.storeBasketballAthlete(basketballAthlete);
    }

    @DeleteMapping("/Delete/{id}")
    public String deleteBasketballAthlete(@PathVariable String id) {
        return basketballAthleteService.deleteBasketballAthlete(id);
    }
}
