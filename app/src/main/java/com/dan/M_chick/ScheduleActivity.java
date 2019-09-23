package com.dan.M_chick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScheduleActivity extends AppCompatActivity {
TextView txtvacc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        txtvacc=(TextView)findViewById(R.id.txtvacc);
        txtvacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ScheduleActivity.this,VaccinationGuide.class);
                startActivity(intent);
            }
        });
    }
}
