package com.dan.M_chick;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityPoultry extends AppCompatActivity {
    Button SignIn, SignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_poultry);

        SignIn = (Button) findViewById(R.id.signin);
        SignUp = (Button) findViewById(R.id.signup);

        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityPoultry.this, Login.class);
                startActivity(intent);
            }
        });
    }

    public void register (View view) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}
