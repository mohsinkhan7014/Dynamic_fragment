package com.mohsin.dynamic_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        WindowManager windowManager=getWindowManager();
        Display display=windowManager.getDefaultDisplay();
        if (display.getHeight()>display.getWidth())
        {
            BlankFragment blankFragment=new BlankFragment();
            fragmentTransaction.replace(android.R.id.content, blankFragment);
        }
        else
        {
            BlankFragment2 blankFragment2=new BlankFragment2();
            fragmentTransaction.replace(android.R.id.content,blankFragment2);
        }
        fragmentTransaction.commit();
    }
}
