package com.workout.workoutapp.controller;

import com.workout.workoutapp.WorkoutsRepository;
import com.workout.workoutapp.model.Workout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://35.174.171.29")
public class WorkoutsController {

    @Autowired
    private WorkoutsRepository workoutsRepository;

    @PostMapping("/workouts")
    public ResponseEntity addWorkout(@RequestBody Workout workout){
        Workout newWorkout = workoutsRepository.save(workout);
        return ResponseEntity.created(URI.create("/" + newWorkout.getId())).build();
    }

    @GetMapping("/workouts")
    public List<Workout> getAllWorkouts() {
        return (List<Workout>) workoutsRepository.findAll();
    }

    @DeleteMapping("/workouts/{id}")
    public ResponseEntity deleteOneWorkout(@PathVariable("id") String id) {
        workoutsRepository.deleteById(id);
        return ResponseEntity.accepted().build();
    }
}
