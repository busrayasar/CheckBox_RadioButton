package com.busrayasar.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Spinner spinner;
    String [] istanbulIlceleri = {"Çekmeköy","Ümraniye","Üsküdar","Kadıköy","Fatih","Başakşehir","Beşiktaş", "Şişli" };
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerTanimla();
        adapterOlustur();
        spinneraAdapterEkle();
        bilgiVer();
    }
    public void spinnerTanimla(){
        spinner = findViewById(R.id.spinner);
    }
    public void adapterOlustur(){
        arrayAdapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item, istanbulIlceleri);
    }
    public void spinneraAdapterEkle(){
        spinner.setAdapter(arrayAdapter);
    }
    //tıklanan itema göre işlem yapma
    public void bilgiVer()
    {
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext() , "" + spinner.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}