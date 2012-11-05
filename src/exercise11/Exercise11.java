package exercise11;

import common.BadInput;
import common.Exercise;
import common.ExerciseChooser;
import phone.PhoneLauncherExercise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 05/11/2012
 * Time: 14:15
 */
public class Exercise11 {
    public static void main(String[] args) throws BadInput {
        List<Exercise> exercises = new ArrayList<Exercise>();

        exercises.add(new PhoneLauncherExercise());

        ExerciseChooser ech = new ExerciseChooser(exercises);
        ech.run();
    }
}
