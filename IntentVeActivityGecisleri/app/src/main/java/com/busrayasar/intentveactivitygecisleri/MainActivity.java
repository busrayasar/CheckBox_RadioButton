package com.busrayasar.intentveactivitygecisleri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        tiklama();

    }

    public void tanimla() {
        btn = findViewById(R.id.button);
    }

    public void gecisYap() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void tiklama() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gecisYap();
            }
        });
    }
}