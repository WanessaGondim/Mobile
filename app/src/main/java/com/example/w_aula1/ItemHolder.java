package com.example.w_aula1;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemHolder extends RecyclerView.ViewHolder {

//    ItemHolder holder = new ItemHolder(/*construir a referência da view*/)


    private TextView tvVersionName;
    private ConstraintLayout clContainer;

    public ItemHolder(@NonNull View itemView) {
        super(itemView);

       tvVersionName =  itemView.findViewById(R.id.tvVersionName);
        clContainer = itemView.findViewById(R.id.clContainerParent);
    }

    public void changeText(String value){
        tvVersionName.setText(value);
    }

    public void changeBackgroundColor(String color){
        clContainer.setBackgroundColor(Color.parseColor(color));
    }
}
