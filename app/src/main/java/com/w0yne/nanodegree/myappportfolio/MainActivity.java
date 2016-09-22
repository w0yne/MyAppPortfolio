/*
 * Created by Stev Wayne on 2016/9/22
 * Copyright (c) 2016 Stev Wayne. All rights reserved.
 */

package com.w0yne.nanodegree.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickPopularMovies(View view) {
        showToastOnClickButton(view);
    }

    public void onClickStockHawk(View view) {
        showToastOnClickButton(view);
    }

    public void onClickBuildItBigger(View view) {
        showToastOnClickButton(view);
    }

    public void onClickMakeYourAppMaterial(View view) {
        showToastOnClickButton(view);
    }

    public void onClickGoUbiquitous(View view) {
        showToastOnClickButton(view);
    }

    public void onClickCapstone(View view) {
        showToastOnClickButton(view);
    }

    private void showToastOnClickButton(View view) {
        if (view instanceof Button) {
            Toast.makeText(this, "This button will launch my " + ((Button) view).getText() + " app!", Toast.LENGTH_SHORT).show();
        }
    }
}
