package com.example.gymrat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GymLocationActivity extends AppCompatActivity {

    ImageView home, gymLocationImageView;
    TextView gymLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.gym_location);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        home = findViewById(R.id.home);
        gymLocation = findViewById(R.id.gymLocation);
        gymLocationImageView = findViewById(R.id.gymLocationImageView);

        home.setOnClickListener(view ->{
            Intent intent = new Intent(GymLocationActivity.this, NavigationActivity.class);
            startActivity(intent);
        });

        gymLocation.setOnClickListener(view ->{
            Intent intent = new Intent(GymLocationActivity.this, NavigationActivity.class);
            startActivity(intent);
        });

        gymLocationImageView.setOnClickListener(view ->{
            Intent intent = new Intent(GymLocationActivity.this, GymLocationActivity.class);
            startActivity(intent);
        });
    }
}