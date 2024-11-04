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

public class MembershipTermsAndConditionActivity extends AppCompatActivity {

    TextView home;
    ImageView home1, profileDetailsImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.membership_terms_and_condition);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        home = findViewById(R.id.home);
        home1 = findViewById(R.id.home1);
        profileDetailsImageView = findViewById(R.id.profileDetailsImageView);

        home.setOnClickListener(view ->{
            Intent intent = new Intent(MembershipTermsAndConditionActivity.this, NavigationActivity.class);
            startActivity(intent);
        });

        home1.setOnClickListener(view ->{
            Intent intent = new Intent(MembershipTermsAndConditionActivity.this, NavigationActivity.class);
            startActivity(intent);
        });

        profileDetailsImageView.setOnClickListener(view ->{
            Intent intent = new Intent(MembershipTermsAndConditionActivity.this, ProfileDetailsActivity.class);
            startActivity(intent);
        });
    }
}