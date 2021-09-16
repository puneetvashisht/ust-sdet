package mavendemo.services;

import java.util.Date;

import mavendemo.entities.Workout;
import mavendemo.exception.ServiceException;

public interface WorkoutService{
	
	boolean createWorkout(Workout workout) throws ServiceException;
//	if the workout already present, return false
//	return true, if workout is successfully created

	boolean deleteWorkout(int workoutId) throws ServiceException;

	boolean findAllWorkouts();
	
	boolean findAWorkout( int workoutId) throws ServiceException;
	
	boolean startWorkout(int workoutId , Date datetime )throws ServiceException;
	boolean endWorkout(int workoutId , Date datetime )throws ServiceException;

}
