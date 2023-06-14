package com.example.backend.athlete;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public abstract class Athlete {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private Integer age;
    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    private LocalDate dob;
    private String email;
    private String school;
    private String gpa;
    private String city;
    private String state;

    public Athlete(String id, String firstName, String lastName, Integer age, LocalDate dob, String email, String school, String gpa, String city, String state) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dob = dob;
        this.email = email;
        this.school = school;
        this.gpa = gpa;
        this.city = city;
        this.state = state;
    }

    public Athlete(String firstName, String lastName, Integer age, LocalDate dob, String email, String school, String gpa, String city, String state) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dob = dob;
        this.email = email;
        this.school = school;
        this.gpa = gpa;
        this.city = city;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }


    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", school='" + school + '\'' +
                ", gpa=" + gpa +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
