package com.example.gymrat;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NavigationActivity extends AppCompatActivity {

    CardView descriptionCardView, gymDetailsCardView, profileDetailsCardView, trainingProgramCardView,
            membershipTermsAndConditionCardView, membershipSessionCardView, paymentCardView, gymLocationCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.navigation);
        // Apply insets to the main view
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Initialize CardView elements
        descriptionCardView = findViewById(R.id.descriptionCardView);
        profileDetailsCardView = findViewById(R.id.profileDetailsCardView);
        gymDetailsCardView = findViewById(R.id.gymDetailsCardView);
        trainingProgramCardView = findViewById(R.id.trainingProgramCardView);
        membershipTermsAndConditionCardView = findViewById(R.id.membershipTermsAndConditionCardView);
        membershipSessionCardView = findViewById(R.id.membershipSessionCardView);
        paymentCardView = findViewById(R.id.paymentCardView);
        gymLocationCardView = findViewById(R.id.gymLocationCardView);


        descriptionCardView.setOnClickListener(view ->{
            Intent intent = new Intent(NavigationActivity.this, DescriptionActivity.class);
            startActivity(intent);
        });

        profileDetailsCardView.setOnClickListener(view ->{
            Intent intent = new Intent(NavigationActivity.this, ProfileDetailsActivity.class);
            startActivity(intent);
        });

        gymDetailsCardView.setOnClickListener(view ->{
            Intent intent = new Intent(NavigationActivity.this, GymDetailsActivity.class);
            startActivity(intent);
        });

        trainingProgramCardView.setOnClickListener(view ->{
            Intent intent = new Intent(NavigationActivity.this, TrainingProgramActivity.class);
            startActivity(intent);
        });

        membershipTermsAndConditionCardView.setOnClickListener(view ->{
            Intent intent = new Intent(NavigationActivity.this, MembershipTermsAndConditionActivity.class);
            startActivity(intent);
        });

        membershipSessionCardView.setOnClickListener(view ->{
            Intent intent = new Intent(NavigationActivity.this, MembershipSessionsActivity.class);
            startActivity(intent);
        });

        paymentCardView.setOnClickListener(view ->{
            Intent intent = new Intent(NavigationActivity.this, PaymentActivity.class);
            startActivity(intent);
        });

        gymLocationCardView.setOnClickListener(view ->{
            Intent intent = new Intent(NavigationActivity.this, GymLocationActivity.class);
            startActivity(intent);
        });
    }
}
