package com.busrayasar.fragmentproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class BlankFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    //layoutu xmlle bağlarken inflater kullanılır. Bu onCreateView önemli
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment, layoutu fragmenta bağıyoruz
        val view =  inflater.inflate(R.layout.fragment_blank, container, false)
        return view
    }


}