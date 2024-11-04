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

public class ProfileDetailsActivity extends AppCompatActivity {

    ImageView home;
    TextView home1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.profile_details);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        home = findViewById(R.id.home);
        home1 = findViewById(R.id.home1);

        home.setOnClickListener(view ->{
            Intent intent = new Intent(ProfileDetailsActivity.this, NavigationActivity.class);
            startActivity(intent);
        });

        home1.setOnClickListener(view ->{
            Intent intent = new Intent(ProfileDetailsActivity.this, NavigationActivity.class);
            startActivity(intent);
        });
    }
}