package com.example.bottomnavigation;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class hrNahr extends AppCompatActivity implements View.OnClickListener {
    RecyclerView mrecyclerView;
    AdapterNahr adapterNahr;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hari_nahr);

        mrecyclerView = findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = (new LinearLayoutManager(this));
        mrecyclerView.setLayoutManager(layoutManager);

        adapterNahr = new AdapterNahr(this, getMyList());
        mrecyclerView.setAdapter(adapterNahr);
        // Inflate the layout for this fragment

        mrecyclerView.setOnClickListener(this);

    }

    private ArrayList<ModelIhram> getMyList() {
        ArrayList<ModelIhram> models = new ArrayList<>();

        ModelIhram model = new ModelIhram();
        model.setTitle("Melempar");
        model.setImg(R.mipmap.hrts_jamarot);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Menyembelih");
        model.setImg(R.mipmap.hran_dam);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Mencukur");
        model.setImg(R.mipmap.i_laranganbulu);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Thowaf");
        model.setImg(R.mipmap.hran_thawaf);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Sai");
        model.setImg(R.mipmap.sai);
        models.add(model);

        return models;
    }

    @Override
    public void onClick(View view) {

    }
}
