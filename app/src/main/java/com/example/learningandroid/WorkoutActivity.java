package com.example.learningandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class WorkoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
    }

    public void onClickFindWorkout(View view) {
        Spinner workouttype = (Spinner) findViewById(R.id.workouttype);

        String workout = String.valueOf(workouttype.getSelectedItem());

        Intent intent = new Intent(this, ExerciseActivity.class);

        intent.putExtra("message", workout);

        startActivity(intent);
    }
}