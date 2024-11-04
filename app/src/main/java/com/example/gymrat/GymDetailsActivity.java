package com.example.gymrat;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GymDetailsActivity extends AppCompatActivity {

    CardView gymLocationCardView, gymHoursCardView, purchaseCardView, equipmentListCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.gym_details);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        gymLocationCardView = findViewById(R.id.gymLocationCardView);
        gymHoursCardView = findViewById(R.id.gymHoursCardView);
        purchaseCardView = findViewById(R.id.purchaseCardView);
        equipmentListCardView = findViewById(R.id.equipmentListCardView);

        gymLocationCardView.setOnClickListener(view ->{
            Intent intent = new Intent(GymDetailsActivity.this, GymLocationActivity.class);
            startActivity(intent);
        });

        gymHoursCardView.setOnClickListener(view ->{
            Intent intent = new Intent(GymDetailsActivity.this, MembershipSessionsActivity.class);
            startActivity(intent);
        });

        purchaseCardView.setOnClickListener(view ->{
            Intent intent = new Intent(GymDetailsActivity.this, PaymentActivity.class);
            startActivity(intent);
        });

    }
}