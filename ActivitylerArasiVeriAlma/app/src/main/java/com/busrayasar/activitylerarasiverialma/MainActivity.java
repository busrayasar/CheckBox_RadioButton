package com.busrayasar.activitylerarasiverialma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText userName, userPassword;
    Button gonderButton;
    RadioGroup radioGroup;

    String kullaniciAdi, kullaniciSifre, kullaniciCinsiyet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        tiklaVeGec();
    }

    void tanimla(){
        userName=(EditText)findViewById(R.id.editTextKullaniciAdi);
        userPassword= (EditText) findViewById(R.id.editTextKullaniciSifre);
        gonderButton=(Button)findViewById(R.id.gonder_button );
        radioGroup=(RadioGroup)findViewById(R.id.cinsiyetRadioGroup);

    }
    void degerAl(){
        kullaniciAdi=userName.getText().toString();
        kullaniciSifre=userPassword.getText().toString();
        //Radio gruptan seçilenin textini alma
        kullaniciCinsiyet = ((RadioButton)findViewById(radioGroup.getCheckedRadioButtonId())).getText().toString();

    }
    void tiklaVeGec(){
        gonderButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                degerAl();
                Log.i("Degerler"," "+kullaniciAdi+" "+kullaniciCinsiyet+" "+kullaniciSifre);
                //intentle diğer activitymize değerleri göndericez
                Intent intent = new Intent(getApplicationContext(), Activity2.class);
                intent.putExtra("kullaniciAdi", kullaniciAdi);
                intent.putExtra("kullaniciSifre", kullaniciSifre);
                intent.putExtra("cinsiyet", kullaniciCinsiyet);
                startActivity(intent);
            }
        });
    }


}