package com.example.app1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;

import java.util.List;

import javax.xml.xpath.XPathFunctionResolver;

public class UserListAdapter extends BaseAdapter {

    List<UserModel> list;
    Context context;
    public UserListAdapter(List<UserModel> userList, Context cont) {
        this.list = userList;
        this.context = cont;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View layout = LayoutInflater.from(context).inflate(R.layout.layout, viewGroup, false);
        TextView name = layout.findViewById(R.id.name);
        TextView surname =layout.findViewById(R.id.surname);
        TextView age = layout.findViewById(R.id.age);
        TextView team = layout.findViewById(R.id.team);

        name.setText(list.get(i).getName());
        surname.setText(list.get(i).getSurname());
        age.setText(list.get(i).getAge());
        team.setText(list.get(i).getSupportedTeam());

        return layout;
    }
}
