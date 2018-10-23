package com.example.manu.cine;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class postRegister extends AppCompatActivity {

    Activity contexto;
    ImageButton end;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_register);

    contexto = this;

    end =  (ImageButton) findViewById(R.id.imageButton_finish);
    end.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(contexto, RegisteredApp.class);
            startActivity(intent);
        }
    });

    }
}
