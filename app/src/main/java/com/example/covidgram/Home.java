package com.example.covidgram;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {

    public ImageButton ehome;
    public ImageButton eupload;
    public ImageButton eprofile;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ehome = (ImageButton)findViewById(R.id.ethome);
        ehome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Covid.class);
                startActivity(i);
            }
        });

        eupload = (ImageButton)findViewById(R.id.etupload);
        eupload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Covid.class);
                startActivity(i);
            }
        });

        ehome = (ImageButton)findViewById(R.id.ethome);
        ehome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Covid.class);
                startActivity(i);
            }
        });

    }
}