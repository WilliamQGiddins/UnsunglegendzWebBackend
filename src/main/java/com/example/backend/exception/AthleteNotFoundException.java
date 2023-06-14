package com.example.backend.exception;

public class AthleteNotFoundException extends RuntimeException{

    public AthleteNotFoundException(String id){
        super("Could not find the athlete with given id " + id);
    }
}
