package com.durgesh.inspireme_workshopapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    TextView quoteText;

    Button btnNewQuote, btnShare;

    String[] quotes = {

            "Believe in yourself.",
            "Small progress is still progress.",
            "Dream big. Start small. Act now.",
            "Your future is created by what you do today.",
            "Success begins with the decision to try."

    };


    Random random = new Random();

    String quotenow = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        quoteText = findViewById(R.id.quoteText);
        btnNewQuote = findViewById(R.id.btnNewQuote);

        btnShare = findViewById(R.id.btnShare);


        btnNewQuote.setOnClickListener(v -> {

            Toast.makeText(this, "Quote is created", Toast.LENGTH_SHORT).show();

            int index = random.nextInt(quotes.length);

            quotenow = quotes[index];

            quoteText.setText(quotenow);

        });

        btnShare.setOnClickListener(v -> {

            Intent intent = new Intent(Intent.ACTION_SEND);

            intent.setType("text/plain");

            intent.putExtra(Intent.EXTRA_TEXT, quotenow);

            startActivity(Intent.createChooser(intent, "Share Quote"));

        });


    }
}