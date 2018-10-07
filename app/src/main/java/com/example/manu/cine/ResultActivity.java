package com.example.manu.cine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String name = getIntent().getExtras().getString("name");
        TextView name_r= (TextView) findViewById(R.id.textView_result_name);
        name_r.setText(name);

        String lastname = getIntent().getExtras().getString("lastname");
        TextView lastname_r = (TextView) findViewById(R.id.textView_result_lastname);
        lastname_r.setText(lastname);

        String address = getIntent().getExtras().getString("address");
        TextView address_r = (TextView) findViewById(R.id.textView_result_address);
        address_r.setText(address);

        String country = getIntent().getExtras().getString("country");
        TextView country_r = (TextView) findViewById(R.id.textView_result_country);
        country_r.setText(country);

        String city = getIntent().getExtras().getString("city");
        TextView city_r = (TextView) findViewById(R.id.textView_result_city);
        city_r.setText(city);

        String zip = getIntent().getExtras().getString("zip");
        TextView zip_r = (TextView) findViewById(R.id.textView_result_zip);
        zip_r.setText(zip);

        String phone = getIntent().getExtras().getString("phone");
        TextView phone_r = (TextView) findViewById(R.id.textView_result_phone);
        phone_r.setText(phone);

        String mail = getIntent().getExtras().getString("mail");
        TextView mail_r = (TextView) findViewById(R.id.textView_result_mail);
        mail_r.setText(mail);

        String genre = getIntent().getExtras().getString("genre");
        TextView genre_r = (TextView) findViewById(R.id.textView_result_genre);
        genre_r.setText(genre);
    }
}
