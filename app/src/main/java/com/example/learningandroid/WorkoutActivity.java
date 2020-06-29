package com.example.learningandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

//Workout activity Class which help us select the body part for the exercise
public class WorkoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
    }

    //Function invoked on the onclick of button
    public void onClickFindWorkout(View view) {

        //Get the value of the spinner
        Spinner workouttype = (Spinner) findViewById(R.id.workouttype);

        String workout = String.valueOf(workouttype.getSelectedItem());

        //Create Intent and send the selected item of spinner to new activity
        Intent intent = new Intent(this, ExerciseActivity.class);

        intent.putExtra("message", workout);

        startActivity(intent);
    }
}