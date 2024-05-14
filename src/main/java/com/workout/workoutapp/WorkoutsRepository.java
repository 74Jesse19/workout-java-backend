package com.workout.workoutapp;

import com.workout.workoutapp.model.Workout;
import org.springframework.data.repository.CrudRepository;
@org.socialsignin.spring.data.dynamodb.repository.EnableScan
public interface WorkoutsRepository extends CrudRepository<Workout, String> {
}
