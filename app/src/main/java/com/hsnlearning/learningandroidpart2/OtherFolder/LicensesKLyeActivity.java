
package com.hsnlearning.learningandroidpart2.OtherFolder;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hsnlearning.learningandroidpart2.R;
import com.marcoscg.licenser.Library;
import com.marcoscg.licenser.License;
import com.marcoscg.licenser.LicenserDialog;

public class LicensesKLyeActivity extends AppCompatActivity {
    Button btnlcences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_licenses_klye);
        btnlcences=findViewById(R.id.btnLicences);
        btnlcences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new LicenserDialog(LicensesKLyeActivity.this)
                        .setTitle("License")
                        .setCustomNoticeTitle("Notices for files:")
                        .setBackgroundColor(Color.RED) // Optional
                        .setLibrary(new Library("Android Support Libraries",
                                "https://github.com/hassanarshad115",
                                License.APACHE))
                        .setLibrary(new Library("Example Library",
                                "https://github.com/marcoscgdev",
                                License.APACHE))
                        .setLibrary(new Library("Licenser",
                                "https://github.com/marcoscgdev/Licenser",
                                License.MIT))
                        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // TODO: 11/02/2018
                            }
                        })
                        .show();
            }
        });
    }
}
