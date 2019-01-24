package com.hsnlearning.learningandroidpart2.OtherFolder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hsnlearning.learningandroidpart2.R;

import pl.bclogic.pulsator4droid.library.PulsatorLayout;

public class OtherTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_two);

        PulsatorLayout pulsator = (PulsatorLayout) findViewById(R.id.pulsator);
        pulsator.start();


    }

}
