package com.hsnlearning.learningandroidpart2.ButtonsFolder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;
import com.hsnlearning.learningandroidpart2.R;

import co.ceryle.segmentedbutton.SegmentedButtonGroup;

public class CircleButtonActivity extends AppCompatActivity {

    ElegantNumberButton elegantNumberButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_button);

        elegantNumberButton = findViewById(R.id.elegentBtnS);
        elegantNumberButton.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                //
            }
        });

        //segment button k lye
        SegmentedButtonGroup segmentedButtonGroup = (SegmentedButtonGroup) findViewById(R.id.segmentedButtonGroup);
        segmentedButtonGroup.setOnClickedButtonPosition(new SegmentedButtonGroup.OnClickedButtonPosition() {
            @Override
            public void onClickedButtonPosition(int position) {
                if (position == 0)
                    Toast.makeText(CircleButtonActivity.this, "Login: " + position, Toast.LENGTH_SHORT).show();
                else if (position == 1)
                    Toast.makeText(CircleButtonActivity.this, "Register: " + position, Toast.LENGTH_SHORT).show();
                else if (position == 2)
                    Toast.makeText(CircleButtonActivity.this, "Share: " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
