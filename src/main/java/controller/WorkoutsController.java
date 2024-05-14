package controller;

import com.workout.workoutapp.WorkoutsRepository;
import model.Workout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
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
