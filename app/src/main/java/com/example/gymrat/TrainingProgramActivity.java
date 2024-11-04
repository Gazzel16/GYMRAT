package com.example.gymrat;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TrainingProgramActivity extends AppCompatActivity {

    CardView chestWorkoutCardView, backWorkoutCardView, shoulderWorkoutCardView,
            legsWorkoutCardView, tricepsWorkoutCardView, bicepsWorkoutCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.training_program);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        chestWorkoutCardView = findViewById(R.id.chestWorkoutCardView);
        backWorkoutCardView = findViewById(R.id.backWorkoutCardView);
        shoulderWorkoutCardView = findViewById(R.id.shoulderWorkoutCardView);
        legsWorkoutCardView = findViewById(R.id.legsWorkoutCardView);
        tricepsWorkoutCardView = findViewById(R.id.tricepsWorkoutCardView);
        bicepsWorkoutCardView = findViewById(R.id.bicepsWorkoutCardView);

        chestWorkoutCardView.setOnClickListener(view ->{
            Intent intent = new Intent(TrainingProgramActivity.this, ChestWorkoutActivity.class);
            startActivity(intent);
        });
        backWorkoutCardView.setOnClickListener(view ->{
            Intent intent = new Intent(TrainingProgramActivity.this, BackExercisesActivity.class);
            startActivity(intent);
        });
        shoulderWorkoutCardView.setOnClickListener(view ->{
            Intent intent = new Intent(TrainingProgramActivity.this, ShoulderExercisesActivity.class);
            startActivity(intent);
        });
        legsWorkoutCardView.setOnClickListener(view ->{
            Intent intent = new Intent(TrainingProgramActivity.this, LegsExercisesActivity.class);
            startActivity(intent);
        });
        tricepsWorkoutCardView.setOnClickListener(view ->{
            Intent intent = new Intent(TrainingProgramActivity.this, TricepsExercisesActivity.class);
            startActivity(intent);
        });
        bicepsWorkoutCardView.setOnClickListener(view ->{
            Intent intent = new Intent(TrainingProgramActivity.this, BicepExercisesActivity.class);
            startActivity(intent);
        });

    }
}