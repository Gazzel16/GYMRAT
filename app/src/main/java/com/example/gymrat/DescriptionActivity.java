package com.example.gymrat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DescriptionActivity extends AppCompatActivity {

    ImageView home, gymLocation, trainingProgram, account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.description);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        home = findViewById(R.id.home);
        gymLocation = findViewById(R.id.gymLocation);
        trainingProgram = findViewById(R.id.trainingProgram);
        account = findViewById(R.id.account);

        home.setOnClickListener(view ->{
            Intent intent = new Intent(DescriptionActivity.this, NavigationActivity.class);
            startActivity(intent);
        });

        gymLocation.setOnClickListener(view ->{
            Intent intent = new Intent(DescriptionActivity.this, GymLocationActivity.class);
            startActivity(intent);
        });

        trainingProgram.setOnClickListener(view ->{
            Intent intent = new Intent(DescriptionActivity.this, TrainingProgramActivity.class);
            startActivity(intent);
        });

        account.setOnClickListener(view ->{
            Intent intent = new Intent(DescriptionActivity.this, ProfileDetailsActivity.class);
            startActivity(intent);
        });
    }
}