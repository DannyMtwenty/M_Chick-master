package com.dan.M_chick;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OralMethod extends AppCompatActivity {
Button home;
Button vid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_method);
        home=(Button)findViewById(R.id.btnhomu);
        vid=(Button)findViewById(R.id.btnvideo);
        vid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OralMethod.this,VideoOral.class);
                startActivity(intent);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OralMethod.this,Homepage.class);
                startActivity(intent);
            }
        });
    }
}
