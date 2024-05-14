package com.workout.workoutapp;

import model.Workout;
import org.springframework.data.repository.CrudRepository;

public interface WorkoutsRepository extends CrudRepository<Workout, String> {
}
