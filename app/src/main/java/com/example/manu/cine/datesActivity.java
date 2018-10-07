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
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class datesActivity extends AppCompatActivity {
    EditText editTextName;
    EditText editTextLastname;
    EditText editTextAddress;
    EditText editTextGenre;
    EditText editTextPhone;
    EditText editTextEmail;
    CheckBox terms;
    Activity contexto;
    String genre = "female";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dates);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        contexto = this;

        RadioGroup sexSelected = (RadioGroup) findViewById(R.id.sexSelected);
        sexSelected.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checked) {

                switch (checked){
                    case R.id.radioButton_male:
                        genre = "Male";
                        break;
                    case R.id.radioButton_female:
                        genre = "Female";
                        break;
                }
                Toast.makeText(contexto,"You pushed " + genre, Toast.LENGTH_SHORT).show();

            }
        });

        editTextName = findViewById(R.id.editText_name);
        editTextLastname = findViewById(R.id.editText_lastname);
        editTextAddress = findViewById(R.id.editText_address);
        editTextPhone = findViewById(R.id.editText_phone);
       // editTextZIP = findViewById(R.id.editText_zip);
        editTextEmail = findViewById(R.id.editText_mail);
        terms =findViewById(R.id.checkBox_terms);
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

        String phone = editTextPhone.getText().toString();

        String mail = editTextEmail.getText().toString();
        Intent intent = new Intent(contexto, MoredatesActivity.class);

        intent.putExtra("genre",genre);
        intent.putExtra("name", name);
        intent.putExtra("lastname", lastname);
        intent.putExtra("address", address);
        intent.putExtra("phone", phone);
        intent.putExtra("mail",mail);


        startActivity(intent);
    }
}
