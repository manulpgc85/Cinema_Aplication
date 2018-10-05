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
        TextView name_r = (TextView) findViewById(R.id.textView_r_name_2);
        name_r.setText(name);

        String lastname = getIntent().getExtras().getString("lastname");
        TextView lastname_r = (TextView) findViewById(R.id.textView_r_lastname_2);
        lastname_r.setText(lastname);

        String address = getIntent().getExtras().getString("address");
        TextView address_r = (TextView) findViewById(R.id.textView_r_address_2);
        address_r.setText(address);

        String country = getIntent().getExtras().getString("country");
        TextView country_r = (TextView) findViewById(R.id.textView_r_country_2);
        country_r.setText(country);

        String city = getIntent().getExtras().getString("city");
        TextView city_r = (TextView) findViewById(R.id.textView_r_city_2);
        city_r.setText(city);

        String zip = getIntent().getExtras().getString("zip");
        TextView zip_r = (TextView) findViewById(R.id.textView_r_zip_2);
        zip_r.setText(zip);

        String phone = getIntent().getExtras().getString("phone");
        TextView phone_r = (TextView) findViewById(R.id.textView_r_phone_2);
        phone_r.setText(phone);

        String mail = getIntent().getExtras().getString("mail");
        TextView mail_r = (TextView) findViewById(R.id.textView_r_mail_2);
        mail_r.setText(mail);
    }
}
