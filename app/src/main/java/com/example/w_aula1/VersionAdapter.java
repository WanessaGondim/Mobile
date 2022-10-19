package com.example.w_aula1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VersionAdapter extends RecyclerView.Adapter<ItemHolder> {

    private ArrayList<String> versionNameList = new ArrayList<>();
    private ArrayList<String> color = new ArrayList();

    public void setVersionNameList(ArrayList<String> list){
        color.add("#f44336");
        color.add("#e91e63");
        color.add("#e91e63");
        color.add("#9c27b0");
        color.add("#2196f3");
        color.add("#009688");
        color.add("#4caf50");
        color.add("#cddc39");
        color.add("#ffeb3b");


        this.versionNameList.addAll(list);
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

      ItemHolder holder = new ItemHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {

       String versionName = this.versionNameList.get(position);
        holder.changeText(versionName);
        String color = this.color.get(position);
        holder.changeBackgroundColor(color);
    }

    @Override
    public int getItemCount() {
        return versionNameList.size();
    }
}
