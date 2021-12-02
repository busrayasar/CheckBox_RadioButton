package com.busrayasar.intentveactivitygecisleri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        tanimla();
    }
    public void gec(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void tanimla(){
        textView = findViewById(R.id.text);
        textView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                gec();;
            }
        });
    }
}