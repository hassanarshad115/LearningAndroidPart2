package com.hsnlearning.learningandroidpart2.OtherFolder;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.felipecsl.gifimageview.library.GifImageView;
import com.hsnlearning.learningandroidpart2.MainActivity;
import com.hsnlearning.learningandroidpart2.R;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class OtherThreeSplashScreenOriginalActivity extends AppCompatActivity {

    GifImageView gifImageView, gifImageView2;
    Button btnImgStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_three);

        gifImageView = findViewById(R.id.gitImageViewOtherThree);

        try {
            InputStream inputStream = getAssets().open("android.gif");
            byte[] bytes = IOUtils.toByteArray(inputStream);
            gifImageView.setBytes(bytes);
            gifImageView.startAnimation();

        } catch (IOException e) {
            e.printStackTrace();
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                    OtherThreeSplashScreenOriginalActivity.this.startActivity(new Intent(OtherThreeSplashScreenOriginalActivity.this, MainActivity.class));
                    OtherThreeSplashScreenOriginalActivity.this.finish();
            }
        }, 2000);

        /*//gifImageView2 = findViewById(R.id.gitImageViewOtherThree2);  //url sy gif image leni hoto

         *//*new RetriveByteArrayHassan().execute("https://quotespics.net/wp-content/uploads/2018/11/welcome-gif-images.gif");
        gifImageView2.startAnimation();*//*
        new RetriveByteArrayHassan().execute("https://thumbs.gfycat.com/IcySkinnyErne-small.gif");
        gifImageView.startAnimation();


   *//*     if (gifImageView.getDrawable() == null ) {
            Toast.makeText(this, "Network Problem", Toast.LENGTH_SHORT).show();
        } else {

            Toast.makeText(this, "net thq h", Toast.LENGTH_SHORT).show();
        }*//*

    }

    class RetriveByteArrayHassan extends AsyncTask<String, Void, byte[]> {

        @Override
        protected byte[] doInBackground(String... strings) {
            try {
                URL url = new URL(strings[0]);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                if (urlConnection.getResponseCode() == 200) {
                    InputStream inputStream = new BufferedInputStream(urlConnection.getInputStream());
                    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
                    int nRead;
                    byte[] data = new byte[10240];
                    while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
                        buffer.write(data, 0, nRead);
                    }
                    buffer.flush();
                    return buffer.toByteArray();
                }


            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(byte[] bytes) {
            super.onPostExecute(bytes);
            gifImageView.setBytes(bytes);
            //   gifImageView2.setBytes(bytes);

        }
   */
    }
}


