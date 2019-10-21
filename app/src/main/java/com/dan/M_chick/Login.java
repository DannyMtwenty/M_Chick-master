package com.dan.M_chick;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.dan.M_chick.activities.AboutActivity;

public class Login extends AppCompatActivity {
    SQLiteDatabase db;
    SQLiteOpenHelper openHelper;
    Button login;
    TextView reg;
    TextView aboutus;
    Cursor cursor;
    EditText usrname, passcode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        openHelper = new DatabaseHelper2(this);
        db = openHelper.getReadableDatabase();
        reg=(TextView) findViewById(R.id.txtreg);
        usrname = (EditText) findViewById(R.id.username);
        passcode = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.signin);
        aboutus=(TextView)findViewById(R.id.txtaboutus);
        aboutus.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
              Intent intent=new Intent(Login.this, AboutActivity.class);
             startActivity(intent);
            }
       });
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Login.this,Register.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usrname.getText().toString();
                String password = passcode.getText().toString();

                cursor = db.rawQuery("SELECT * FROM " + DatabaseHelper2.TABLE_NAME + " WHERE " + DatabaseHelper2.COL_7 + "=?  AND " + DatabaseHelper2.COL_8 + "=?", new String[]{username,password});
                if (cursor!=null)
                {
                    if (cursor.getCount()>0) {
                        cursor.moveToNext();
                        Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Login.this,Homepage.class);
                        startActivity(intent);

                    } else {
                        Toast.makeText(getApplicationContext(), "Login Error! Please verify username or password", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
