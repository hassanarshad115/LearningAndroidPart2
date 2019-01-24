package com.hsnlearning.learningandroidpart2.SplashScreenFolder;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

import com.felipecsl.gifimageview.library.GifImageView;
import com.hsnlearning.learningandroidpart2.MainActivity;
import com.hsnlearning.learningandroidpart2.R;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class SplashScreenActivity extends AppCompatActivity {

    ProgressBar progressBar;
    GifImageView gifImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        gifImageView = findViewById(R.id.gifImageInSplashScreen);
        progressBar = findViewById(R.id.progressbarInSplashScreen);

        progressBar.setVisibility(ProgressBar.VISIBLE);

        try {
            InputStream inputStream = getAssets().open("nno.gif");
            byte[] bytes = IOUtils.toByteArray(inputStream);
            gifImageView.setBytes(bytes);
            gifImageView.startAnimation();

        } catch (IOException e) {
            e.printStackTrace();
        }

/*
        //code for splash screen with Thread

            Thread thread = new Thread() {
                @Override
                public void run() {
                    try {

                        sleep(3500);
                        finish();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        Intent cv = new Intent(MainActivity.this, EtBoxActivity.class);
        startActivity(cv);
    }
}
            };
                    thread.start();
*/


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SplashScreenActivity.this.startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
                SplashScreenActivity.this.finish();
            }
        }, 5000);
    }
}
