package com.example.w_aula1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        TextView textView = findViewById(R.id.tvText);

        Button btBackground = findViewById(R.id.btBackgorund);
        btBackground.setOnClickListener(view -> {
            textView.setBackgroundColor(Color.parseColor("#c9c9c9"));
        });

        Button btNext = findViewById(R.id.btNext);
        btNext.setOnClickListener(view -> {
            textView.setText("Novo Texto");
        });

        Button btEstado = findViewById(R.id.btEstado);
        btEstado.setOnClickListener(view -> {
            textView.setText("TextView");
            textView.setBackgroundColor(Color.TRANSPARENT);
        });
    }
}