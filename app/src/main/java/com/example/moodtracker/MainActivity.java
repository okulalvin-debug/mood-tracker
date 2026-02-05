package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declare UI components
    private EditText moodInput;
    private Button submitButton;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        moodInput = findViewById(R.id.moodInput);
        submitButton = findViewById(R.id.submitButton);
        resultText = findViewById(R.id.resultText);

        // Button click logic
        submitButton.setOnClickListener(v -> {
            String mood = moodInput.getText().toString().trim();

            if (mood.isEmpty()) {
                resultText.setText(R.string.please_enter_a_mood);
            } else {
                resultText.setText(getString(R.string.today_is_a_day, mood));
            }
        });
    }
}
