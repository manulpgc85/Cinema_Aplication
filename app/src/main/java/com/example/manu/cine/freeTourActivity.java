package com.example.manu.cine;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class freeTourActivity extends AppCompatActivity {
ImageButton register;
Activity contexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_tour);

        contexto = this;

        register = (ImageButton) findViewById(R.id.ImageButtonRegister);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(contexto,"Going to register page", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(contexto, datesActivity.class);
                startActivity(intent);
            }
        });
    }
}
