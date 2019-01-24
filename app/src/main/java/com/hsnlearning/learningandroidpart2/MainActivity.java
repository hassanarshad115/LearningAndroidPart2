package com.hsnlearning.learningandroidpart2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.hsnlearning.learningandroidpart2.ButtonsFolder.CircleButtonActivity;
import com.hsnlearning.learningandroidpart2.DifferntMapStylesFolder.DifferentMapStyleActivity;
import com.hsnlearning.learningandroidpart2.EtBoxFoldeer.EtBoxActivity;
import com.hsnlearning.learningandroidpart2.Label.StylishLabelActivity;
import com.hsnlearning.learningandroidpart2.MapFolder.MapsActivity;
import com.hsnlearning.learningandroidpart2.MapFolder.MapsActivity2;
import com.hsnlearning.learningandroidpart2.OtherFolder.LicensesKLyeActivity;
import com.hsnlearning.learningandroidpart2.OtherFolder.OtherActivity1;
import com.hsnlearning.learningandroidpart2.OtherFolder.OtherTwo;
import com.hsnlearning.learningandroidpart2.SplashScreenFolder.SplashScreenActivity;
import com.spark.submitbutton.SubmitButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mapbtn, mapbtn2, dfrntMapStyle, circlebtn, stylishLabelBtn,otherbtn,licencebtn,btnothertwo,btnotherthree;
    SubmitButton submitbtn;  //https://stackoverflow.com/questions/38964764/google-button-cannot-be-cast-to-android-widget-button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapbtn = this.<Button>findViewById(R.id.btnMap);
        mapbtn.setOnClickListener(this);

        mapbtn2 = findViewById(R.id.btnMap2);
        mapbtn2.setOnClickListener(this);
        //different map styles
        dfrntMapStyle = findViewById(R.id.btnDifferntMapStyle);
        dfrntMapStyle.setOnClickListener(this);
        //circle button k lye
        circlebtn = findViewById(R.id.btnCircle);
        circlebtn.setOnClickListener(this);
        //submit button
        submitbtn = findViewById(R.id.sbmitBtn);
        submitbtn.setOnClickListener(this);
        //emphasize button
        stylishLabelBtn = findViewById(R.id.btnStylishLabel);
        stylishLabelBtn.setOnClickListener(this);
        //goto other 1
        otherbtn=findViewById(R.id.btnOthers);
        otherbtn.setOnClickListener(this);
        //btn licence
        licencebtn=findViewById(R.id.btnLicencM);
        licencebtn.setOnClickListener(this);
        //other two
        btnothertwo=findViewById(R.id.btnOtherTwoM);
        btnothertwo.setOnClickListener(this);
        //other three
        btnotherthree=findViewById(R.id.btnOtherThreeM);
        btnotherthree.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.btnMap) {
            startActivity(new Intent(MainActivity.this, MapsActivity.class));
        }
        if (id == R.id.btnMap2) {
            startActivity(new Intent(MainActivity.this, MapsActivity2.class));
        }
        if (id == R.id.btnDifferntMapStyle) {
            startActivity(new Intent(MainActivity.this, DifferentMapStyleActivity.class));
        }
        if (id == R.id.btnCircle) {
            startActivity(new Intent(MainActivity.this, CircleButtonActivity.class));
        }
        if (id == R.id.sbmitBtn) {

            //Code for Splash Screen
            Thread thread = new Thread() {
                @Override
                public void run() {
                    try {

                        sleep(3500);
                        finish();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        Intent cv = new Intent(MainActivity.this, EtBoxActivity.class/*otherclass*/);
                        startActivity(cv);
                    }
                }
            };
            thread.start();
        }

        //
        if (id==R.id.btnStylishLabel){
        startActivity(new Intent(MainActivity.this, StylishLabelActivity.class));
        }
        //for other
        if (id==R.id.btnOthers){
            startActivity(new Intent(MainActivity.this, OtherActivity1.class));
        }
        //btn licences
        if (id==R.id.btnLicencM){
            startActivity(new Intent(MainActivity.this, LicensesKLyeActivity.class));
        }
        if (id==R.id.btnOtherTwoM){
            startActivity(new Intent(MainActivity.this, OtherTwo.class));
        }
        if (id==R.id.btnOtherThreeM){
            startActivity(new Intent(MainActivity.this, SplashScreenActivity.class));
        }
    }
}
