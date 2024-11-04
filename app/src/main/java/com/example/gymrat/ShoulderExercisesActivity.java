package com.example.gymrat;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ShoulderExercisesActivity extends AppCompatActivity {

    CardView beginnerShoulderWorkoutCardview, intermediateShoulderWorkoutCardView,
            hardShoulderWorkoutCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.shoulder_exercises);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        beginnerShoulderWorkoutCardview = findViewById(R.id.beginnerShoulderWorkoutCardview);
        intermediateShoulderWorkoutCardView = findViewById(R.id.intermediateShoulderWorkoutCardView);
        hardShoulderWorkoutCardView = findViewById(R.id.hardShoulderWorkoutCardView);

        beginnerShoulderWorkoutCardview.setOnClickListener(view ->{
            Intent intent = new Intent(ShoulderExercisesActivity.this, BeginnerShoulderWorkoutActivity.class);
            startActivity(intent);
        });

        intermediateShoulderWorkoutCardView.setOnClickListener(view ->{
            Intent intent = new Intent(ShoulderExercisesActivity.this, IntermediateShoulderWorkoutActivity.class);
            startActivity(intent);
        });

        hardShoulderWorkoutCardView.setOnClickListener(view ->{
            Intent intent = new Intent(ShoulderExercisesActivity.this, HardShoulderWorkoutActivity.class);
            startActivity(intent);
        });
    }
}