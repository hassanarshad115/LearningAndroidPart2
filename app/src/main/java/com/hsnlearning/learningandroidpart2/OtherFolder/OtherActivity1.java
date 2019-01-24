package com.hsnlearning.learningandroidpart2.OtherFolder;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.hsnlearning.learningandroidpart2.R;

import me.grantland.widget.AutofitTextView;
import rb.popview.PopField;

public class OtherActivity1 extends Activity {
     AutofitTextView autofitTextView;
     EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other1);

        autofitTextView= this.<AutofitTextView>findViewById(R.id.TVotherLayoutFile);
        editText= this.<EditText>findViewById(R.id.ETotherLayoutFile);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                autofitTextView.setText(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        //ye alg h uper wala alg h

        final PopField popField = PopField.attach2Window(this);
        final TextView oldTv = findViewById(R.id.TVeasytextviewInAcitivity);
        oldTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                View addView = layoutInflater.inflate(R.layout.other_layoutfile, null);
                TextView rfTVNewTV = addView.findViewById(R.id.TVeasytextview);
                popField.popView(oldTv, addView, true);

            }
        });
    }
}
