package com.dan.M_chick;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        EasySplashScreen welcome = new EasySplashScreen(WelcomeActivity.this)
                .withFullScreen()
                .withTargetActivity(MainActivityPoultry.class)
                .withSplashTimeOut(5000)
                .withLogo(R.drawable.chick1)
                .withBackgroundColor(Color.parseColor("#FFFFFF"))
                .withHeaderText("Welcome to ChickMonitor!")
                .withAfterLogoText("Helping farmers Monitor their Chicks")
                .withFooterText("Copyright @ danny");

        welcome.getHeaderTextView().setTextColor(Color.BLUE);
        welcome.getHeaderTextView().setTextSize(15);
        welcome.getFooterTextView().setTextSize(15);
        welcome.getAfterLogoTextView().setTextSize(20);
        welcome.getAfterLogoTextView().setTextColor(Color.GREEN);
        welcome.getFooterTextView().setTextColor(Color.DKGRAY);

        View view = welcome.create();
        setContentView(view);
    }
}
