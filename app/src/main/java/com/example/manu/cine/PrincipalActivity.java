package com.example.manu.cine;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PrincipalActivity extends AppCompatActivity {
    Activity contexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        contexto=this;

    Button welcome = (Button) findViewById(R.id.button_welcome);
    welcome.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(contexto, datesActivity.class);
        startActivity(intent);
        }
    });
    Button invite = (Button) findViewById(R.id.button_invite);
    invite.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent tour = new Intent (contexto, freeTourActivity.class);
            startActivity(tour);
        }
    });
    }
}
