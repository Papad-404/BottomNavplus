package com.example.bottomnavigation;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterNahr extends RecyclerView.Adapter<HolderIhram> {

    Context context;
    ArrayList<ModelIhram> ihramModel;

    public AdapterNahr(Context context, ArrayList<ModelIhram> ihramModel){
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
                if (ihramModel.get(position).getTitle().equals("Melempar")) {
                    Intent jelas = new Intent(context, nMelempar.class);
                    context.startActivity(jelas);
                }
                if (ihramModel.get(position).getTitle().equals("Menyembelih")) {
                    Intent in = new Intent(context, nMenyembelih.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Mencukur")) {
                    Intent in = new Intent(context, nMencukur.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Thowaf")) {
                    Intent in = new Intent(context, nThawaf.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Sai")) {
                    Intent in = new Intent(context, nMainActivitySai.class);
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
