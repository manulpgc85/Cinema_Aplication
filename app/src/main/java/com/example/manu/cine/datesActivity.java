package com.example.manu.cine;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class datesActivity extends AppCompatActivity {
    EditText editTextName;
    EditText editTextLastname;
    EditText editTextAddress;
    EditText editTextCountry;
    EditText editTextCity;
    EditText editTextGenre;
    EditText editTextPhone;
    EditText editTextZIP;
    EditText editTextEmail;
    Activity contexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dates);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        contexto = this;

        editTextName = findViewById(R.id.editText_name);
        editTextLastname = findViewById(R.id.editText_lastname);
        editTextAddress = findViewById(R.id.editText_address);
        editTextCountry = findViewById(R.id.editText_country);
        editTextCity = findViewById(R.id.editText_city);
        editTextPhone = findViewById(R.id.editText_phone);
        editTextZIP = findViewById(R.id.editText_zip);
        editTextEmail = findViewById(R.id.editText_mail);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void validate() {
        irAResultado();
    }

    private void irAResultado(){
        String name = editTextName.getText().toString();
        String lastname = editTextLastname.getText().toString();
        String address = editTextAddress.getText().toString();
        String country = editTextCountry.getText().toString();
        String city = editTextCity.getText().toString();
        String phone = editTextPhone.getText().toString();
        String zip = editTextZIP.getText().toString();
        String mail = editTextEmail.getText().toString();
        Intent intent = new Intent(contexto, ResultActivity.class);

        intent.putExtra("name", name);
        intent.putExtra("lastname", lastname);
        intent.putExtra("address", address);
        intent.putExtra("country",country);
        intent.putExtra("city", city);
        intent.putExtra("phone", phone);
        intent.putExtra("zip", zip) ;
        intent.putExtra("mail",mail);
        startActivity(intent);
    }
}
