package com.example.bottomnavigation;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterMaqom extends RecyclerView.Adapter<HolderIhram> {

    Context context;
    ArrayList<ModelIhram> ihramModel;

    public AdapterMaqom(Context context, ArrayList<ModelIhram> ihramModel){
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
                if (ihramModel.get(position).getTitle().equals("Apa itu?")) {
                    Intent jelas = new Intent(context, Maqom1.class);
                    context.startActivity(jelas);
                }
                if (ihramModel.get(position).getTitle().equals("Kesalahan")) {
                    Intent in = new Intent(context, Maqom2.class);
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
