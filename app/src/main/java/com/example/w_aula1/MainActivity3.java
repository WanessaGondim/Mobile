package com.example.w_aula1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);



        int imagemSelecionada = getIntent().getIntExtra( "KEY_TELA1", 0);
        TextView tvNomeDoDoce = findViewById(R.id.tvNomeDoDoce);


        String doce = "";
        if(imagemSelecionada == 1) {
            doce = "Donut";
//            imageView.set
        }else if(imagemSelecionada == 2) {
            doce = "Biscoito";
        }else if(imagemSelecionada == 3){
            doce = "Sorvete";
        }else {
            doce = "Não encontrado";
        }

        tvNomeDoDoce.setText(doce);

    }
}