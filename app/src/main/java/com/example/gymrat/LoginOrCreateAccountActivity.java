package com.example.gymrat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginOrCreateAccountActivity extends AppCompatActivity {

    TextView create,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login_or_create_account);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        create = findViewById(R.id.create);
        login = findViewById(R.id.login);

        login.setOnClickListener(view ->{
            Intent intent = new Intent(LoginOrCreateAccountActivity.this, LoginActivity.class);
            startActivity(intent);
        });

        create.setOnClickListener(view ->{
            Intent intent = new Intent(LoginOrCreateAccountActivity.this, SignupActivity.class);
            startActivity(intent);
        });
    }
}