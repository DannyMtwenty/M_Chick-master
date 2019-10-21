package com.dan.M_chick;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EyedropActivity extends AppCompatActivity {
Button home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eyedrop);
        home=(Button)findViewById(R.id.btnhomu);
        Button vid=(Button)findViewById(R.id.btnvideoeye);
        vid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EyedropActivity.this,VideoEye.class);
                startActivity(intent);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EyedropActivity.this,Homepage.class);
                startActivity(intent);
            }
        });
    }
}
