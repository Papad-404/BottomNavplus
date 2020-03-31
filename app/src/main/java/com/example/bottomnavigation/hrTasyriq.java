package com.example.bottomnavigation;

import android.os.Bundle;
import android.view.View;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class hrTasyriq extends AppCompatActivity implements View.OnClickListener {

    RecyclerView mrecyclerView;
    AdapterTasyriq adapterTasyriq;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView (R.layout.hari_tasyriq);

        mrecyclerView = findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = (new LinearLayoutManager(this));
        mrecyclerView.setLayoutManager(layoutManager);

        adapterTasyriq = new AdapterTasyriq(this, getMyList());
        mrecyclerView.setAdapter(adapterTasyriq);
        // Inflate the layout for this fragment

        mrecyclerView.setOnClickListener(this);
    }

    private ArrayList<ModelIhram> getMyList() {
        ArrayList<ModelIhram> models = new ArrayList<>();

        ModelIhram model = new ModelIhram();
        model.setTitle("Mabit");
        model.setImg(R.mipmap.hrts_mabit);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Melempar");
        model.setImg(R.mipmap.hrts_jamarot);
        models.add(model);

        return models;
    }

    @Override
    public void onClick(View view) {

    }
}
