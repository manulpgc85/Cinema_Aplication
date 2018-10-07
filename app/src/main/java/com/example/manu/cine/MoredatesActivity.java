package com.example.manu.cine;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MoredatesActivity extends AppCompatActivity {
    String name ="";
    String lastname = "";
    String address = "";
    String phone = "";
    String mail = "";
    String genre = "";
    Activity contexto;
    EditText editTextCountry;
    EditText editTextCity;
    EditText editTextZIP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moredates);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        contexto = this;

        editTextCountry = findViewById(R.id.editText_country);
        editTextCity = findViewById(R.id.editText_city);
        editTextZIP = findViewById(R.id.editText_zip);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        name =getIntent().getExtras().getString("name");
        lastname = getIntent().getExtras().getString("lastname");
        address = getIntent().getExtras().getString("address");
        phone = getIntent().getExtras().getString("phone");
        mail = getIntent().getExtras().getString("mail");
        genre = getIntent().getExtras().getString("genre");
        String country = editTextCountry.getText().toString();
        String city = editTextCity.getText().toString();
        String zip = editTextZIP.getText().toString();
    }

    private void validate() {
        goTomore();
    }

    private void goTomore() {

        String country = editTextCountry.getText().toString();
        String city = editTextCity.getText().toString();
        String zip = editTextZIP.getText().toString();

        Intent intent = new Intent(contexto, ResultActivity.class);

        intent.putExtra("genre",genre);
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
