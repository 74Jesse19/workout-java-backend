package com.workout.workoutapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.workout.workoutapp"})
public class WorkoutAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkoutAppApplication.class, args);
	}

}
