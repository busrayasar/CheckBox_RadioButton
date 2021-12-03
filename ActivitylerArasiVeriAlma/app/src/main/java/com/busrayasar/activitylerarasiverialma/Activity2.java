package com.busrayasar.activitylerarasiverialma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    String kAdi, kSifre, kCinsiyet;
    TextView adi, sifre, cinsiyet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        tanimla2();
        al();
    }

    public void al() {
        //Bundle activityler arası veri geçişi için kullanılır
        Bundle intent = getIntent().getExtras();
        kAdi = intent.getString("kullaniciAdi");
        kSifre = intent.getString("kullaniciSifre");
        kCinsiyet = intent.getString("cinsiyet");
        Log.i("Degerler_2 ", " " + kAdi + " " + kCinsiyet + " " + kSifre);

        adi.setText(adi.getText() + " " + kAdi);
        sifre.setText(sifre.getText() + " " + kSifre);
        cinsiyet.setText(cinsiyet.getText() + " " + kCinsiyet);
    }

    public void tanimla2() {
        adi = (TextView) findViewById(R.id.isim);
        sifre = (TextView) findViewById(R.id.sifre);
        cinsiyet = (TextView) findViewById(R.id.cinsiyet);
    }
}