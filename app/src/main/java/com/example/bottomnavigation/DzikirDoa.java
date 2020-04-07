package com.example.bottomnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class DzikirDoa extends AppCompatActivity implements View.OnClickListener {
    CardView cd1,cd2,cd3,cd4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_dzikir_doa);

        cd1 = findViewById(R.id.btndd1);
        cd1.setOnClickListener(this);
        cd2 = findViewById(R.id.btndd2);
        cd2.setOnClickListener(this);
        cd3 = findViewById(R.id.btndd3);
        cd3.setOnClickListener(this);
        cd4 = findViewById(R.id.btndd4);
        cd4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btndd1:
                Intent ddhu = new Intent(this, MainActivityUmrah.class);
                startActivity(ddhu);
                break;
            case R.id.btndd2:
                Intent ddpp = new Intent(this, MainActivityThawaf.class);
                startActivity(ddpp);
                break;
            case R.id.btndd3:
                Intent ddkshrn = new Intent(this, MainActivityMaqom.class);
                startActivity(ddkshrn);
                break;
            case R.id.btndd4:
                Intent ddumm = new Intent(this, MainActivityZamzam.class);
                startActivity(ddumm);
                break;
        }

    }
}
