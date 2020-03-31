package com.example.bottomnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class persiapanhaji extends AppCompatActivity implements View.OnClickListener {
    CardView btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_persiapanhaji);

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
        btn7 = findViewById(R.id.btnfq7);
        btn7.setOnClickListener(this);
        btn8 = findViewById(R.id.btnfq8);
        btn8.setOnClickListener(this);
        btn9 = findViewById(R.id.btnfq9);
        btn9.setOnClickListener(this);
        btn10 = findViewById(R.id.btnfq10);
        btn10.setOnClickListener(this);
        btn11 = findViewById(R.id.btnfq11);
        btn11.setOnClickListener(this);
        btn12 = findViewById(R.id.btnfq12);
        btn12.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnfq1:
                Intent utama = new Intent(this, dKeutamaanHaji.class);
                startActivity(utama);
                break;
            case R.id.btnfq2:
                Intent jamaah = new Intent(this, dJamaahHajiTamuAllah.class);
                startActivity(jamaah);
                break;
            case R.id.btnfq3:
                Intent segera = new Intent(this, dSegeraMenjadiTamuAllah.class);
                startActivity(segera);
                break;
            case R.id.btnfq4:
                Intent sabar = new Intent(this, dBersabar.class);
                startActivity(sabar);
                break;
            case R.id.btnfq5:
                Intent ikhlas = new Intent(this, dIklasdalamhaji.class);
                startActivity(ikhlas);
                break;
            case R.id.btnfq6:
                Intent teladan = new Intent(this, dMeneladaniNabi.class);
                startActivity(teladan);
                break;
            case R.id.btnfq7:
                Intent debat = new Intent(this, dJanganBerdebat.class);
                startActivity(debat);
                break;
            case R.id.btnfq8:
                Intent maksiat = new Intent(this, dHindariMaksiat.class);
                startActivity(maksiat);
                break;
            case R.id.btnfq9:
                Intent tobat = new Intent(this, dBertaubatSebelumHaji.class);
                startActivity(tobat);
                break;
            case R.id.btnfq10:
                Intent harta = new Intent(this, dBerhajiDenganHartaYangHalal.class);
                startActivity(harta);
                break;
            case R.id.btnfq11:
                Intent teman = new Intent(this, dMencariPertemananyangBaikdalamPerjalanan.class);
                startActivity(teman);
                break;
            case R.id.btnfq12:
                Intent hakikat = new Intent(this, dHakikatTalbiyah.class);
                startActivity(hakikat);
                break;
        }
    }
}
