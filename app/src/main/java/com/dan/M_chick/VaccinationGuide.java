package com.dan.M_chick;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VaccinationGuide extends AppCompatActivity {
Button btnSchedule,btnm1,btnm2,btnm3,btnm4;
TextView txtmainhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccination_guide);
        btnSchedule=(Button)findViewById(R.id.btn_schedule);
        txtmainhome=(TextView)findViewById(R.id.txtmainhome);
        btnm1=(Button) findViewById(R.id.btn_m1);
        btnm2=(Button)findViewById(R.id.btn_m2);
        btnm3=(Button)findViewById(R.id.btn_m3) ;
        btnm4=(Button)findViewById(R.id.btn_m4);
        btnm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VaccinationGuide.this,OralMethod.class);
                startActivity(intent);
            }
        });
        btnm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VaccinationGuide.this,DrinkingWater.class);
                startActivity(intent);
            }
        });
        btnm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VaccinationGuide.this,EyedropActivity.class);
                startActivity(intent);
            }
        });
        btnm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VaccinationGuide.this,InjectionActivity.class);
                startActivity(intent);
            }
        });
        txtmainhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VaccinationGuide.this,Homepage.class);
                startActivity(intent);
            }
        });
        btnSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VaccinationGuide.this,ScheduleActivity.class);
                startActivity(intent);
            }
        });
    }
}
