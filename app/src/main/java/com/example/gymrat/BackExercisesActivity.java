package com.example.gymrat;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BackExercisesActivity extends AppCompatActivity {

    CardView beginnerBackWorkout, intermediateBackWorkout, hardBackWorkout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.back_exercises);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        beginnerBackWorkout = findViewById(R.id.beginnerBackWorkout);
        intermediateBackWorkout = findViewById(R.id.intermediateBackWorkout);
        hardBackWorkout = findViewById(R.id.hardBackWorkout);

        beginnerBackWorkout.setOnClickListener(view ->{
            Intent intent = new Intent(BackExercisesActivity.this, BeginnerBackExercisesActivity.class);
            startActivity(intent);
        });

        intermediateBackWorkout.setOnClickListener(view ->{
            Intent intent = new Intent(BackExercisesActivity.this, IntermediateBackWorkoutActivity.class);
            startActivity(intent);
        });

        hardBackWorkout.setOnClickListener(view ->{
            Intent intent = new Intent(BackExercisesActivity.this, HardBackWorkoutActivity.class);
            startActivity(intent);
        });
    }
}