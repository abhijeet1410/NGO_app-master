package com.abhijeet14.ngo_app;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.abhijeet14.ngo_app.fragments.FirstFragment;

public class SplashActivity extends AppCompatActivity {
    private Fragment f = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        f = new FirstFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_container,f);
        ft.commit();
    }
}
