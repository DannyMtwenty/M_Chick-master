package com.dan.M_chick;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    Button reg;
    TextView login;
    EditText fname, lname, years, gender, contact, postaladdr, usrname, passcode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
              setContentView(R.layout.activity_register);
        openHelper = new DatabaseHelper2(Register.this);
        reg = (Button) findViewById(R.id.signup);
        fname = (EditText) findViewById(R.id.fname);
        lname = (EditText) findViewById(R.id.lname);
        years = (EditText) findViewById(R.id.age);
        gender = (EditText) findViewById(R.id.sex);
        contact = (EditText) findViewById(R.id.phone);
        postaladdr = (EditText) findViewById(R.id.address);
        usrname = (EditText) findViewById(R.id.username1);
        passcode = (EditText) findViewById(R.id.password);
        login = (TextView) findViewById(R.id.txtlogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this, Login.class);
                startActivity(intent);
            }
        });
        if (fname.length()==0)
        {
            fname.setError("enter firstname");
        }
        if (lname.length()==0)
        {
            lname.setError("enter lastname");
        }
        if (years.length()==0)
        {
            years.setError("enter age");
        }
        if (gender.length()==0)
        {
            gender.setError("enter gender");
        }
        if (usrname.length()==0)
        {
            usrname.setError("enter username");
        }
        if (passcode.length()==0)
        {
            passcode.setError("enter password");
        }
        if (postaladdr.length()==0)
        {
            postaladdr.setError("enter postal address");
        }
        if (contact.length()==0)
        {
            contact.setError("enter contacts");
        }

            reg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    db = openHelper.getWritableDatabase();

                    String First_Name = fname.getText().toString();
                    String Last_Name = lname.getText().toString();
                    Integer Age = Integer.parseInt(years.getText().toString());
                    Integer Phone = Integer.parseInt(contact.getText().toString());
                    String Address = postaladdr.getText().toString();
                    String Sex = gender.getText().toString();
                    String username = usrname.getText().toString();
                    String password = passcode.getText().toString();
                        insertdata(First_Name, Last_Name, Age, Phone, Address, Sex, username, password);
                        Toast.makeText(getApplicationContext(), "Registration Successful", Toast.LENGTH_LONG).show();
                        finish();
                }
            });
        }

    public void insertdata (String First_Name, String Last_Name, Integer Age, Integer Phone, String Address, String Sex, String username, String password)
    {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseHelper2.COL_1,First_Name);
        contentValues.put(DatabaseHelper2.COL_2,Last_Name);
        contentValues.put(DatabaseHelper2.COL_3,Age);
        contentValues.put(DatabaseHelper2.COL_4,Sex);
        contentValues.put(DatabaseHelper2.COL_5,Address);
        contentValues.put(DatabaseHelper2.COL_6,Phone);
        contentValues.put(DatabaseHelper2.COL_7,username);
        contentValues.put(DatabaseHelper2.COL_8,password);

        long id = db.insert(DatabaseHelper2.TABLE_NAME, null, contentValues);
    }
}
