package com.hsnlearning.learningandroidpart2.Label;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.easyandroidanimations.library.FlipHorizontalAnimation;
import com.hsnlearning.learningandroidpart2.R;

public class StylishLabelActivity extends AppCompatActivity {

    Button btneasyanimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stylish_label);

        //sirf ispy btn animation ka kam  hoa h
        //isky lye manifest ma application m tool rreplace ko add krna h
        btneasyanimation = findViewById(R.id.btneasyandroidanimatoin);
        btneasyanimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               /*  //btn pr click kr k btn gaeeb hojayga
               new BlindAnimation(btneasyanimation).setListener(new AnimationListener() {
                    @Override
                    public void onAnimationEnd(Animation animation) {
                        btneasyanimation.setVisibility(View.GONE);
                    }
                }).animate();*/

              /* //btn explode k lye
                new ExplodeAnimation(btneasyanimation).animate();*/

             /*   //fade out animation btn
                new FadeOutAnimation(btneasyanimation).animate();*/

           /*  //flip vertical animatioon k lye
                new FlipVerticalAnimation(btneasyanimation).animate();
*/
                //flip horizontol animation
                new FlipHorizontalAnimation(btneasyanimation).animate();

           /* //unfeld animation mtlb ander sy bhr niklna
                new UnfoldAnimation(btneasyanimation).animate();*/

           /*//puff in or puff out animation
                new PuffInAnimation(btneasyanimation).animate();*/

      /*     //shake animation mtlb ider oder hilna
                new ShakeAnimation(btneasyanimation).animate();*/
      /*          //slide out or in animation
                new SlideInAnimation(btneasyanimation).animate();*/
            }
        });
    }
}
