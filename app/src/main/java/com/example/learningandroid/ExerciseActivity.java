package com.example.learningandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


//Exercise Activity Class to provide information about the exercise
public class ExerciseActivity extends AppCompatActivity {

    // Instance of Workout Expert Class
    private WorkoutExpert expert = new WorkoutExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        //To get selected item from the spinner
        Bundle data = getIntent().getExtras();

        if(data == null) {
            return;
        }

        String workout = data.getString("message");

        //Change the value of textview with the exercise
        final TextView text = (TextView) findViewById(R.id.textView3);

        List<String> workoutList = expert.getWorkouts(workout);

        StringBuilder workoutsFormatted = new StringBuilder();

        for(String work : workoutList) {
            workoutsFormatted.append(work).append('\n');
        }
        text.setText(workoutsFormatted);


        //Find the name of the image file
        String workoutName = workoutList.get(0).replaceAll("\\s","").toLowerCase();


        //To show the image for each of the exercise
        final ImageView image = (ImageView) findViewById(R.id.imageView);

        String uri = "@drawable/" + workoutName;

        int imageResource = getResources().getIdentifier(uri, null, getPackageName());

        Drawable res = getResources().getDrawable(imageResource);

        image.setImageDrawable(res);
    }

    //function invoked onclick of the camera button
    public void onClickCamera(View view) {

        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);
    }
}