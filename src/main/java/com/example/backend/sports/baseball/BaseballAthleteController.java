package com.example.backend.sports.baseball;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping(path = "api/v1/BaseballAthlete")
public class BaseballAthleteController {

    private final BaseballAthleteService baseballAthleteService;

    @Autowired
    public BaseballAthleteController(BaseballAthleteService baseballAthleteService) {
        this.baseballAthleteService = baseballAthleteService;
    }

    @GetMapping(path = "/GetAthlete/{id}")
    public Optional<BaseballAthlete> getBaseballAthlete(@PathVariable String id) {
        return baseballAthleteService.getBaseballAthlete(id);
    }

    @GetMapping(path = "/GetAllAthletes")
    public List<BaseballAthlete> getAllBaseballAthletes() {
        return baseballAthleteService.getAllBaseballAthletes();
    }

    @PostMapping(path = "/AddAthlete")
    public String storeBaseballAthlete(@RequestBody BaseballAthlete baseballAthlete) {
        return baseballAthleteService.storeBaseballAthlete(baseballAthlete);
    }

    @DeleteMapping("/Delete/{id}")
    public String deleteBaseballAthlete(@PathVariable String id) {
        return baseballAthleteService.deleteBaseballAthlete(id);
    }
}
