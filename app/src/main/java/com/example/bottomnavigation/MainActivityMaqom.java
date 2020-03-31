package com.example.bottomnavigation;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivityMaqom extends AppCompatActivity implements View.OnClickListener {

    RecyclerView mrecyclerView;
    AdapterMaqom adapterMaqom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maqom_main);

        mrecyclerView = findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = (new LinearLayoutManager(this));
        mrecyclerView.setLayoutManager(layoutManager);

        adapterMaqom = new AdapterMaqom(this, getMyList());
        mrecyclerView.setAdapter(adapterMaqom);
        // Inflate the layout for this fragment

        mrecyclerView.setOnClickListener(this);
    }

    private ArrayList<ModelIhram> getMyList() {
        ArrayList<ModelIhram> models = new ArrayList<>();

        ModelIhram model = new ModelIhram();
        model.setTitle("Apa itu?");
        model.setImg(R.mipmap.maqam_apa);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Kesalahan");
        model.setImg(R.mipmap.ihram_larangan);
        models.add(model);

        return models;
    }

    @Override
    public void onClick(View view) {

    }
}
