package com.hsnlearning.learningandroidpart2.EtBoxFoldeer;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hsnlearning.learningandroidpart2.R;

import io.github.angebagui.mediumtextview.MediumTextView;

public class EtBoxActivity extends AppCompatActivity {

    private String btnContents = "<p> This is simple HTML with Image and Video /n  Medium Text View</p>"
            + "<img src=\"https://www.w3schools.com/HTML/img_girl.jpg\" alt=\"Girl in a jacket\" width=\"500\" height=\"600\"/>"
            + "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/ew5Eveyqx2U\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_et_box);

        MediumTextView mediumTextView = findViewById(R.id.medium_text_view);
        mediumTextView.setText(btnContents);

       /* //Color text view k lye library ko add krny k bad ye krna h
        ViewGroup mainLayout= findViewById(R.id.activity_et_box);
        ColorTextView colorTextView=new ColorTextView(this);
        colorTextView.addTextColor("this is first", Color.parseColor("#FFCE4D4D"));
        colorTextView.addTextColor("this is second", Color.parseColor("#FF64DB22"));
        colorTextView.setSpaces(true);
        colorTextView.apply();

        mainLayout.addView(colorTextView);*/

        //medium text view k lye

    }
}
