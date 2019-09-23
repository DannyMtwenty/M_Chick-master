package com.dan.M_chick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OralMethod extends AppCompatActivity {
Button home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_method);
        home=(Button)findViewById(R.id.btnhomu);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OralMethod.this,Homepage.class);
                startActivity(intent);
            }
        });
    }
}
