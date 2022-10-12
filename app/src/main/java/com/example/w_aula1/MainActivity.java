package com.example.w_aula1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    int contadorDeClicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvNumber = findViewById(R.id.tvNumber);
        tvNumber.setText("0");

      Button btToast = findViewById(R.id.btToast);
        btToast.setOnClickListener(view -> {
            Toast.makeText(this, "Hello Toast " + contadorDeClicks, Toast.LENGTH_LONG).show();
        });

        Button btCount = findViewById(R.id.btCount);
        btCount.setOnClickListener(view -> {

            contadorDeClicks += 1;
            tvNumber.setText(String.valueOf(contadorDeClicks));
        });




    }
}