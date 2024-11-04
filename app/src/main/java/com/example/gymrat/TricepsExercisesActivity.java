package com.example.gymrat;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TricepsExercisesActivity extends AppCompatActivity {

    CardView beginnerTricepsWorkoutCardView, intermedeiateTricepsWorkoutCardView,
            hardTricepsWorkoutCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.triceps_exercises);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        beginnerTricepsWorkoutCardView = findViewById(R.id.beginnerTricepsWorkoutCardView);
        intermedeiateTricepsWorkoutCardView = findViewById(R.id.intermedeiateTricepsWorkoutCardView);
        hardTricepsWorkoutCardView = findViewById(R.id.hardTricepsWorkoutCardView);

        beginnerTricepsWorkoutCardView.setOnClickListener(view ->{
            Intent intent = new Intent(TricepsExercisesActivity.this, BeginnerTricepsWorkoutActivity.class);
            startActivity(intent);
        });

        intermedeiateTricepsWorkoutCardView.setOnClickListener(view ->{
            Intent intent = new Intent(TricepsExercisesActivity.this, IntermediateTricepsWorkoutActivity.class);
            startActivity(intent);
        });

        hardTricepsWorkoutCardView.setOnClickListener(view ->{
            Intent intent = new Intent(TricepsExercisesActivity.this, HardTricepsWorkoutActivity.class);
            startActivity(intent);
        });
    }
}