package com.busrayasar.dialogpencereleri;

import android.app.Activity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ToastWindow {
    //bu display hangi aktivite üzerinde gösterilecekse onun referansına parametre olarak ihtiyacı var
    public static void Display(Activity activity, String title, String message){

        Toast t =  Toast.makeText(activity, "", Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER, 5, -7);

        //y - oldukça yukarı , x +5 sağa gider

        //xml den view elde edebilmek için inflater ile deserialization yapıcaz
        LayoutInflater li = activity.getLayoutInflater();
        FrameLayout fl = (FrameLayout) li.inflate(R.layout.custom_toast_design,null);

        LinearLayout tmp =  fl.findViewById(R.id.pnlToast_Text);

        TextView tv1 = tmp.findViewById(R.id.textTitle);
        TextView tv2 = tmp.findViewById(R.id.textContent);
        tv1.setText(title);
        tv2.setText(message);

        t.setView(fl);


        t.show();
    }


}
