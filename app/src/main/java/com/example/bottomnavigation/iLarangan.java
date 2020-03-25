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
        model.setTitle("memotong");
        model.setImg(R.drawable.ihram_penjelasan);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("potong kuku");
        model.setImg(R.drawable.ihram_larangan);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("minyak wangi");
        model.setImg(R.drawable.ihram_sunnah);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("nutup kpl");
        model.setImg(R.drawable.ihram_niat);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("jahit");
        model.setImg(R.drawable.ihram_kesalahan);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("berburu");
        model.setImg(R.drawable.ihram_penjelasan);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("akad");
        model.setImg(R.drawable.ihram_larangan);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("nganu");
        model.setImg(R.drawable.ihram_sunnah);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("cium");
        model.setImg(R.drawable.ihram_niat);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("peringatan");
        model.setImg(R.drawable.ihram_kesalahan);
        models.add(model);

        return models;
    }

    @Override
    public void onClick(View view) {

    }
}
