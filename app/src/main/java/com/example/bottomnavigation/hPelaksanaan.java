package com.example.bottomnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class hPelaksanaan extends AppCompatActivity implements View.OnClickListener {
    CardView btn1, btn2, btn3, btn4, btn5, btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.haji_pelaksanaan);

        btn1 = findViewById(R.id.btnhj1);
        btn1.setOnClickListener(this);
        btn2 = findViewById(R.id.btnhj2);
        btn2.setOnClickListener(this);
        btn3 = findViewById(R.id.btnhj3);
        btn3.setOnClickListener(this);
        btn4 = findViewById(R.id.btnhj4);
        btn4.setOnClickListener(this);
        btn5 = findViewById(R.id.btnhj5);
        btn5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnhj1:
                Intent tarwiyah = new Intent(this, hrTarwiyah.class);
                startActivity(tarwiyah);
                break;
            case R.id.btnhj2:
                Intent arafah = new Intent(this, hrArafah.class);
                startActivity(arafah);
                break;
            case R.id.btnhj3:
                Intent muzd = new Intent(this, hrMuzdalifah.class);
                startActivity(muzd);
                break;
            case R.id.btnhj4:
                Intent nahr = new Intent(this, hrNahr.class);
                startActivity(nahr);
                break;
            case R.id.btnhj5:
                Intent tasy = new Intent(this, hrTasyriq.class);
                startActivity(tasy);
                break;
        }

    }
}
