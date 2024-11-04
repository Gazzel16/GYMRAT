package com.example.gymrat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    ImageView back;
    TextView signup;
    EditText email, password;
    Button loginbtn;

    // Temporary login credentials
    private final String TEMP_EMAIL = "admin@gmail.com";
    private final String TEMP_PASSWORD = "admin123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        back = findViewById(R.id.back);
        signup = findViewById(R.id.signup);
        email = findViewById(R.id.email); // EditText for email
        password = findViewById(R.id.password); // EditText for password
        loginbtn = findViewById(R.id.loginbtn);

        back.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
            startActivity(intent);
        });

        signup.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
            startActivity(intent);
        });

        // Login button click listener
        loginbtn.setOnClickListener(view -> {
            String emailInput = email.getText().toString();
            String passwordInput = password.getText().toString();

            if (emailInput.equals(TEMP_EMAIL) && passwordInput.equals(TEMP_PASSWORD)) {
                // Login success - Navigate to next activity
                Intent intent = new Intent(LoginActivity.this, NavigationActivity.class); // Replace with your target activity
                startActivity(intent);
                finish();
            } else {
                // Login failed - show error message
                Toast.makeText(LoginActivity.this, "Invalid email or password", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
