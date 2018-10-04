package com.example.manu.cine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        name_r.setText(lastname);
        String address = getIntent().getExtras().getString("address");
        TextView address_r = (TextView) findViewById(R.id.textView_r_address_2);
        name_r.setText(address);
    }
}
