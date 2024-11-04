package com.example.gymrat;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LegsExercisesActivity extends AppCompatActivity {

    CardView beginnerLegsWorkoutCardView, IntermediateLegsWorkoutCardView,
            hardLegsWorkoutCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.legs_exercises);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        beginnerLegsWorkoutCardView = findViewById(R.id.beginnerLegsWorkoutCardView);
        IntermediateLegsWorkoutCardView = findViewById(R.id.IntermediateLegsWorkoutCardView);
        hardLegsWorkoutCardView = findViewById(R.id.hardLegsWorkoutCardView);

        beginnerLegsWorkoutCardView.setOnClickListener(view ->{
            Intent intent = new Intent(LegsExercisesActivity.this, BeginnerLegsWorkoutActivity.class);
            startActivity(intent);
        });

        IntermediateLegsWorkoutCardView.setOnClickListener(view ->{
            Intent intent = new Intent(LegsExercisesActivity.this, IntermediateLegsWorkoutActivity.class);
            startActivity(intent);
        });

        hardLegsWorkoutCardView.setOnClickListener(view ->{
            Intent intent = new Intent(LegsExercisesActivity.this, HardLegsWorkoutActivity.class);
            startActivity(intent);
        });
    }
}