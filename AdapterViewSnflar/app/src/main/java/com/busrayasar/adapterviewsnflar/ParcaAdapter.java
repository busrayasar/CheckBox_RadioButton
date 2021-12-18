package com.busrayasar.adapterviewsnflar;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ParcaAdapter extends BaseAdapter {
    //activityden buraya context set edicez
    private Context m_Context;
    private ArrayList<String> m_Data;
    private  String m_Category;

    public ParcaAdapter(Context context, ArrayList<String> data, String category) {
        this.m_Context = context;
        this.m_Data = data;
        this.m_Category = category;

    }

    @Override
    public int getCount() {
        return m_Data.size();
    }

    @Override
    public Object getItem(int position) {
        return m_Data.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    //her veriyi görselleştirecek kısım burası, veriyi görsele bağlayan kısım
    @Override
    public View getView(int position, View view, ViewGroup viewGroup)
    {
        //product_item designi ayağa kaldırmamız lazım, deserialization
        LayoutInflater li =  ((Activity) m_Context).getLayoutInflater();

        LinearLayout p = (LinearLayout) li.inflate(R.layout.product_item_design, null) ;
        if(position % 2 == 0)
        {
            p.setBackgroundColor(Color.LTGRAY);
        }
        else{
            p.setBackgroundColor(Color.WHITE);
        }

        ImageView img = p.findViewById(R.id.img);

        TextView tv = p.findViewById(R.id.txtProductName);


        tv.setText(getItem(position).toString());

        //resourceları dinamik kullanacaksan böyle kullan
        Resources res = m_Context.getResources();

        Drawable drw = null;

        switch (m_Category){
            case "motor":
                drw = res.getDrawable(R.drawable.motor);
                break;
            case "mekanik":
                drw = res.getDrawable(R.drawable.mekanik);
                break;
            case "kaporta":
                drw = res.getDrawable(R.drawable.kaporta);
                break;
            case "elektrik":
                drw = res.getDrawable(R.drawable.elektrik);
                break;
        }
       img.setImageDrawable(drw);
        
        return p;
    }












}
