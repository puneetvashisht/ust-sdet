package mavendemo.repos;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import mavendemo.entities.Workout;
// JDBC Code 
public interface WorkoutRepo {
	int create(Workout workout) throws SQLException;

	Workout find(int workoutId) throws SQLException;
	
	List<Workout> findAll() throws SQLException;

//	update cases for workout
	int startWorkout(int workoutId, Date datetime ) throws SQLException;
	int endWorkout(int workoutId, Date datetime ) throws SQLException;
	
	int delete(int workoutId) throws SQLException;
}
