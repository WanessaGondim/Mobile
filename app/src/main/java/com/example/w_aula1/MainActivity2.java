package com.example.w_aula1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity2 extends AppCompatActivity {

    private int imagemClicada = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView img1 = findViewById(R.id.ivDonut);
        TextView txtView = findViewById(R.id.textView);
        ImageView img2 = findViewById(R.id.ivBiscoito);
        ImageView img3 = findViewById(R.id.ivSorvete);

        img1.setOnClickListener(view -> {
            imagemClicada = 1;
           });

        img2.setOnClickListener(view -> {
            imagemClicada = 2;
         });

        img3.setOnClickListener(view -> {
            imagemClicada = 3;
           });

        FloatingActionButton button = findViewById(R.id.floatingActionButton);

        button.setOnClickListener(view -> {

            Intent intent = new Intent(this, MainActivity3.class);

            intent.putExtra("KEY_TELA1", imagemClicada);

            startActivity(intent);
                } );
    }
}