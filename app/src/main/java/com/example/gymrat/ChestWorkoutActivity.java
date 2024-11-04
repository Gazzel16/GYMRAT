package com.example.gymrat;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChestWorkoutActivity extends AppCompatActivity {

    CardView beginnerChestWorkoutCardView,
            intermediateChestWorkoutCardView,hardcoreChestWorkoutCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.chest_workout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        beginnerChestWorkoutCardView = findViewById(R.id.beginnerChestWorkoutCardView);
        intermediateChestWorkoutCardView = findViewById(R.id.intermediateChestWorkoutCardView);
        hardcoreChestWorkoutCardView = findViewById(R.id.hardcoreChestWorkoutCardView);

        beginnerChestWorkoutCardView.setOnClickListener(view ->{
            Intent intent = new Intent(ChestWorkoutActivity.this, BeginnerChestWorkoutActivity.class);
            startActivity(intent);
        });

        intermediateChestWorkoutCardView.setOnClickListener(view ->{
            Intent intent = new Intent(ChestWorkoutActivity.this, IntermediateChestWorkoutActivity.class);
            startActivity(intent);
        });

        hardcoreChestWorkoutCardView.setOnClickListener(view ->{
            Intent intent = new Intent(ChestWorkoutActivity.this, HardcoreChestWorkoutActivity.class);
            startActivity(intent);
        });
    }
}