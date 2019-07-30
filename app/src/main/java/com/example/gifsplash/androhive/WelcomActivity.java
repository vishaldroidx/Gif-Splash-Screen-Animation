/*
 * Copyright (c) 2019.
 * Created By Vishal Swami(vishaldroidx)
 * vishalswamiv@gmail.com
 * www.androhive.tech
 */

package com.example.gifsplash.androhive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class WelcomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);


        TextView mLink = (TextView) findViewById(R.id.infoTxtCredits);
        if (mLink != null) {
            mLink.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
