package com.example.bottomnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class FiqihUmrah extends AppCompatActivity implements View.OnClickListener {
    CardView btn1, btn2, btn3, btn4, btn5, btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_fiqih_umrah);

        btn1 = findViewById(R.id.btnfq1);
        btn1.setOnClickListener(this);
        btn2 = findViewById(R.id.btnfq2);
        btn2.setOnClickListener(this);
        btn3 = findViewById(R.id.btnfq3);
        btn3.setOnClickListener(this);
        btn4 = findViewById(R.id.btnfq4);
        btn4.setOnClickListener(this);
        btn5 = findViewById(R.id.btnfq5);
        btn5.setOnClickListener(this);
        btn6 = findViewById(R.id.btnfq6);
        btn6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnfq1:
                Intent ihram = new Intent(this, MainActivityIhram.class);
                startActivity(ihram);
                break;
            case R.id.btnfq2:
                Intent thawaf = new Intent(this, FiqihHaji.class);
                startActivity(thawaf);
                break;
            case R.id.btnfq3:
                Intent maqom = new Intent(this, FiqihUmrah.class);
                startActivity(maqom);
                break;
            case R.id.btnfq4:
                Intent zamzam = new Intent(this, DzikirDoa.class);
                startActivity(zamzam);
                break;
            case R.id.btnfq5:
                Intent sai = new Intent(this, DaftarIsi.class);
                startActivity(sai);
                break;
            case R.id.btnfq6:
                Intent gundul = new Intent(this, MainActivityGundul.class);
                startActivity(gundul);
                break;
        }

    }
}
