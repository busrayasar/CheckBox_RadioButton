package com.busrayasar.adapterviewsnflar;

import java.util.ArrayList;
import java.util.HashMap;

public class Model {

    private String elektrik[]={"Alternatör", "Meksefe", "Distribitör", "Ateşleme", "Buji"};
    private String mekanik[]={"Z rot", "Rotil", "Rotbaşı", "Aks Bilyası", "Gergi Rulmanı"};
    private String kaporta[]={"Kapı sacı", "Kaput sacı", "Travers ", "Braket", "Tampon Demiri"};
    private String motor[]={"Kol yatağı", "Piston kolu", "Subap itici", "Gasket", "Krank Keçesi"};

    private HashMap<String, String[]> urunler;

    public Model(){
        urunler=new HashMap<>();

        urunler.put("motor", motor);
        urunler.put("kaporta", kaporta);
        urunler.put("mekanik", mekanik);
        urunler.put("elektrik", elektrik);
    }

    public ArrayList<String> getKategoriUrunler(String kategori){

        ArrayList<String> ret = new ArrayList<>();

        if(urunler.containsKey(kategori)){

            String[] arr = urunler.get(kategori);

            for(int i=0; i<=arr.length -1; ++i){
                ret.add(arr[i]);
            }
        }
        return ret;
    }

}
