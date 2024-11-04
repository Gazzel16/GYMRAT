package com.example.gymrat;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MembershipSessionsActivity extends AppCompatActivity {

    CardView sessionCardView, threeMonthsCardView,
            sixMonthsCardView, oneYearCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.membership_sessions);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        sessionCardView = findViewById(R.id.sessionCardView);
        threeMonthsCardView = findViewById(R.id.threeMonthsCardView);
        sixMonthsCardView = findViewById(R.id.sixMonthsCardView);
        oneYearCardView = findViewById(R.id.oneYearCardView);

        sessionCardView.setOnClickListener(view ->{
            Intent intent = new Intent(MembershipSessionsActivity.this, PaymentActivity.class);
            startActivity(intent);
        });

        threeMonthsCardView.setOnClickListener(view ->{
            Intent intent = new Intent(MembershipSessionsActivity.this, PaymentActivity.class);
            startActivity(intent);
        });

        sixMonthsCardView.setOnClickListener(view ->{
            Intent intent = new Intent(MembershipSessionsActivity.this, PaymentActivity.class);
            startActivity(intent);
        });

        oneYearCardView.setOnClickListener(view ->{
            Intent intent = new Intent(MembershipSessionsActivity.this, PaymentActivity.class);
            startActivity(intent);
        });
    }
}