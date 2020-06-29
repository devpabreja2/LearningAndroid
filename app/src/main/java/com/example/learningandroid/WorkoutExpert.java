package com.example.learningandroid;

import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert {

    List<String> getWorkouts(String workouttypes) {

        List<String> workout = new ArrayList<String>();

        if(workouttypes.equals("Chest")) {
            workout.add("Bench Press");
        }

        else if(workouttypes.equals("Triceps")) {
            workout.add("Tricep PushDowns");
        }

        else if(workouttypes.equals("Shoulder")) {
            workout.add("Shoulder Press");
        }

        else if(workouttypes.equals("Biceps")) {
            workout.add("Bicep Curls");
        }

        return workout;
    }
}
