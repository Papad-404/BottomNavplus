package com.example.bottomnavigation;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterLarangan extends RecyclerView.Adapter<HolderIhram> {

    Context context;
    ArrayList<ModelIhram> ihramModel;

    public AdapterLarangan(Context context, ArrayList<ModelIhram> ihramModel){
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
                if (ihramModel.get(position).getTitle().equals("Memotong rambut/bulu")) {
                    Intent jelas = new Intent(context, iLaranganPotong.class);
                    context.startActivity(jelas);
                }
                if (ihramModel.get(position).getTitle().equals("Memotong kuku")) {
                    Intent in = new Intent(context, iLaranganKuku.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Memakai minyak wangi")) {
                    Intent in = new Intent(context, iLaranganMW.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Menutup kepala")) {
                    Intent in = new Intent(context, iLaranganKpl.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Pakaian jahit")) {
                    Intent in = new Intent(context, iLaranganJahit.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Berburu hewan darat")) {
                    Intent jelas = new Intent(context, iLaranganBerburu.class);
                    context.startActivity(jelas);
                }
                if (ihramModel.get(position).getTitle().equals("Melakukan akad")) {
                    Intent in = new Intent(context, iLaranganAkad.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("nganu")) {
                    Intent in = new Intent(context, iLaranganNganu.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Bercumbu")) {
                    Intent in = new Intent(context, iLaranganBercumbu.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Peringatan")) {
                    Intent in = new Intent(context, iPeringatan.class);
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
