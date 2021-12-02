package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<UserModel> userList ;
    UserListAdapter adapter;
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        define();
        fillList();

    }

    public void fillList(){
        userList =  new ArrayList<>();
        UserModel user1 = new UserModel("Busra", "Yasar", "24", "X");
        UserModel user2 = new UserModel("Ayşe", "Yılmaz","23", "Y");
        UserModel user3 = new UserModel("Fatma", "Kaya","27", "Y");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        adapter = new UserListAdapter(userList, this);
        listview.setAdapter(adapter);

    }

    void define(){
        listview = findViewById(R.id.listview);
    }
}