package com.hsnlearning.learningandroidpart2.OtherFolder;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hsnlearning.learningandroidpart2.R;

public class ImageFragmentOtherThreeRf extends Fragment {
    public ImageFragmentOtherThreeRf() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_image_otherthree_rf, container, false);

    }
}
