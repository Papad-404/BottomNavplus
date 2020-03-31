package com.example.bottomnavigation;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class iLarangan extends AppCompatActivity implements View.OnClickListener {

    RecyclerView mrecyclerView;
    AdapterLarangan adapterLarangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.ihram_larangan);

        mrecyclerView = findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = (new LinearLayoutManager(this));
        mrecyclerView.setLayoutManager(layoutManager);

        adapterLarangan = new AdapterLarangan(this, getMyList());
        mrecyclerView.setAdapter(adapterLarangan);
        // Inflate the layout for this fragment

        mrecyclerView.setOnClickListener(this);
    }

    private ArrayList<ModelIhram> getMyList() {
        ArrayList<ModelIhram> models = new ArrayList<>();

        ModelIhram model = new ModelIhram();
        model.setTitle("Memotong rambut/bulu");
        model.setImg(R.mipmap.i_laranganbulu);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Memotong kuku");
        model.setImg(R.mipmap.i_larangankuku);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Memakai minyak wangi");
        model.setImg(R.mipmap.i_laranganmw);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Menutup kepala");
        model.setImg(R.mipmap.i_larangankpl);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Pakaian jahit");
        model.setImg(R.mipmap.i_laranganjahit);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Berburu hewan darat");
        model.setImg(R.mipmap.i_laranganberburu);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Melakukan akad");
        model.setImg(R.mipmap.i_larangannganu);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("nganu");
        model.setImg(R.mipmap.i_larangannganu);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Bercumbu");
        model.setImg(R.mipmap.i_laranganbercumbu);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Peringatan");
        model.setImg(R.mipmap.i_peringatan);
        models.add(model);

        return models;
    }

    @Override
    public void onClick(View view) {

    }
}
