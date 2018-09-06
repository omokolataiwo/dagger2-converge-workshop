package com.hxvz.android.daggerthings;

import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Multiplication implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        ((MainActivity)view.getContext()).completed("I am done with the multiplication");
    }
}
