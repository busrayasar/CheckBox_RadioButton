package com.example.listview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listV;
    List<MessageModel> listmsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        define();
        fillList();

    }

    public void define(){
        listV = findViewById(R.id.listview);
    }

public void fillList(){
    listmsg = new ArrayList<>();
    MessageModel m1 = new MessageModel("Hello I am Jane", "Jane", R.drawable.ic_launcher_background);
    MessageModel m2 = new MessageModel("Hello I am Bear", "Bear", R.drawable.ic_launcher_foreground);
    listmsg.add(m1); listmsg.add(m2);



}
}