package com.busrayasar.adapterviewsnflar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner spnCategory;
    private Model model;
    private ListView listProducts;
    private void init()
    {
        spnCategory = findViewById(R.id.spnCategory);
        listProducts = findViewById(R.id.listProducts);
        model = new Model();

    }
    private void spnCategory_Selection(){
        spnCategory.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View child, int i, long l) {

                        //Log.e("x",child.getClass().getName());
                        MaterialTextView mtv = (MaterialTextView) child;
                       // Toast.makeText(MainActivity.this, "Seçilen: "+mtv.getText(), Toast.LENGTH_LONG).show();

                       ArrayList<String> veri = model.getKategoriUrunler(mtv.getText().toString());

listProducts.setAdapter(new ParcaAdapter(MainActivity.this, veri,mtv.getText().toString()));

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                }
        );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        spnCategory_Selection();
    }
}