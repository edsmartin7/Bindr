package com.example.emartin.bindr;

//http://developer.android.com/training/basics/fragments/index.html
//http://developer.android.com/guide/components/activities.html
//http://www.tutorialspoint.com/android/android_acitivities.htm

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //modified:  pull random images from mysql(?) database
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //setContentView(R.layout.main_fragment);
        setContentView(R.layout.display_all);


        //ASync Task
        //Start Database

    }


}
