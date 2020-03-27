package com.example.bottomnavigation;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterThawaf extends RecyclerView.Adapter<HolderIhram> {

    Context context;
    ArrayList<ModelIhram> ihramModel;

    public AdapterThawaf(Context context, ArrayList<ModelIhram> ihramModel){
        this.context = context;
        this.ihramModel = ihramModel;
    }

    @NonNull
    @Override
    public HolderIhram onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, null);
        return new HolderIhram(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final HolderIhram holder, final int i) {
        holder.mtitle.setText(ihramModel.get(i).getTitle());
        holder.imageView.setImageResource(ihramModel.get(i).getImg());

        holder.setClickListenerIhram(new ItemClickListenerIhram() {
            @Override
            public void onItemClickListenerIhram(View v, int position) {
                if (ihramModel.get(position).getTitle().equals("Keutamaan")) {
                    Intent jelas = new Intent(context, tKeutamaan.class);
                    context.startActivity(jelas);
                }
                if (ihramModel.get(position).getTitle().equals("Macam-macam")) {
                    Intent in = new Intent(context, tMacam.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Syarat-syarat")) {
                    Intent in = new Intent(context, tSyarat.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Sunnah-sunnah")) {
                    Intent in = new Intent(context, tSunnah.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Peringatan-peringatan")) {
                    Intent in = new Intent(context, tPeringatan.class);
                    context.startActivity(in);
                }

            }
        });

    }

    @Override
    public int getItemCount() {
        return ihramModel.size();
    }
}
