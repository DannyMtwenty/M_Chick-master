package com.dan.M_chick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.dan.M_chick.activities.AboutActivity;
import com.dan.M_chick.activities.MainActivity;
import com.dan.M_chick.activities.PreferenceActivity;

import butterknife.BindView;

public class Homepage extends AppCompatActivity {
    private CardView diseaseCard,vaccinationCard,brooderCard,reminderCard,mapCard;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        diseaseCard = (CardView) findViewById(R.id.diseasecard);
        vaccinationCard = (CardView) findViewById(R.id.vaccinationcard);
        brooderCard = (CardView) findViewById(R.id.broodercard);
        reminderCard = (CardView) findViewById(R.id.remindercard);
        mapCard = (CardView) findViewById(R.id.mapcard);
        vaccinationCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Homepage.this,VaccinationGuide.class);
                startActivity(intent);
            }
        });
        diseaseCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this, Symptoms.class);
                startActivity(intent);
            }
        });
        reminderCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu_home, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.action_settings:
                    Intent preferenceIntent = new Intent(this, PreferenceActivity.class);
                    startActivity(preferenceIntent);
                    return true;
                case R.id.action_about:
                    Intent aboutIntent = new Intent(this, AboutActivity.class);
                    startActivity(aboutIntent);
                    return true;
            }
            return super.onOptionsItemSelected(item);
        }
}
