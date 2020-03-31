package com.example.bottomnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class persiapanhaji extends AppCompatActivity implements View.OnClickListener {
    ImageView im1, im2, im3, im4, im5, im6;
    Button im7, im8, im9, im10, im11, im12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.persiapanhaji2);

        im1 = findViewById(R.id.persiapan);
        im1.setOnClickListener(this);
        im2 = findViewById(R.id.jamaah);
        im2.setOnClickListener(this);
        im3 = findViewById(R.id.segera);
        im3.setOnClickListener(this);
        im4 = findViewById(R.id.btnTahfiz);
        im4.setOnClickListener(this);
        im5 = findViewById(R.id.btnAlbum);
        im5.setOnClickListener(this);
        im6 = findViewById(R.id.nabi);
        im6.setOnClickListener(this);


        im7 = findViewById(R.id.berdebat);
        im7.setOnClickListener(this);
        im8 = findViewById(R.id.jgnmaksiat);
        im8.setOnClickListener(this);
        im9 = findViewById(R.id.btnParentBook);
        im9.setOnClickListener(this);
        im10 = findViewById(R.id.harta);
        im10.setOnClickListener(this);
        im11 = findViewById(R.id.teman);
        im11.setOnClickListener(this);
        im12 = findViewById(R.id.talbiyah);
        im12.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.persiapan:
                Intent utama = new Intent(this, dKeutamaanHaji.class);
                startActivity(utama);
                break;
            case R.id.jamaah:
                Intent jamaah = new Intent(this, dJamaahHajiTamuAllah.class);
                startActivity(jamaah);
                break;
            case R.id.segera:
                Intent segera = new Intent(this, dSegeraMenjadiTamuAllah.class);
                startActivity(segera);
                break;
            case R.id.btnTahfiz:
                Intent sabar = new Intent(this, dBersabar.class);
                startActivity(sabar);
                break;
            case R.id.btnAlbum:
                Intent ikhlas = new Intent(this, dIklasdalamhaji.class);
                startActivity(ikhlas);
                break;
            case R.id.nabi:
                Intent teladan = new Intent(this, dMeneladaniNabi.class);
                startActivity(teladan);
                break;
            case R.id.berdebat:
                Intent debat = new Intent(this, dJanganBerdebat.class);
                startActivity(debat);
                break;
            case R.id.jgnmaksiat:
                Intent maksiat = new Intent(this, dHindariMaksiat.class);
                startActivity(maksiat);
                break;
            case R.id.btnParentBook:
                Intent tobat = new Intent(this, dBertaubatSebelumHaji.class);
                startActivity(tobat);
                break;
            case R.id.harta:
                Intent harta = new Intent(this, dBerhajiDenganHartaYangHalal.class);
                startActivity(harta);
                break;
            case R.id.teman:
                Intent teman = new Intent(this, dMencariPertemananyangBaikdalamPerjalanan.class);
                startActivity(teman);
                break;
            case R.id.talbiyah:
                Intent hakikat = new Intent(this, dHakikatTalbiyah.class);
                startActivity(hakikat);
                break;
        }
    }
}
