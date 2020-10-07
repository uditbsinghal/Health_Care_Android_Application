package com.example.googlemaps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class main extends AppCompatActivity {
    Button emr;
    Button loc;
    Button about;
    Button pharmacy;
    Button ambulance;
    Button blood;
    Button organ;
    Button Disease;
    Button Help;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emr = (Button) findViewById(R.id.emergency);
        loc = (Button) findViewById(R.id.loc);
        about = (Button) findViewById(R.id.about);
        pharmacy = (Button) findViewById(R.id.pharmacy);
        ambulance =(Button)findViewById(R.id.ambulance);
        blood = (Button) findViewById(R.id.Blood);
        organ =(Button)findViewById(R.id.organ);
        Disease=(Button)findViewById(R.id.Disease);
        Help=(Button)findViewById(R.id.about);

        emr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open = new Intent(main.this,MapsActivity.class);
                startActivity(open);
            }
        });
        loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open2 = new Intent(main.this,bhala1.class);
                startActivity(open2);
            }
        });
        pharmacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open3 = new Intent(main.this,pharmacy.class);
                startActivity(open3);
            }
        });
        ambulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open4 = new Intent(main.this,ambulance.class);
                startActivity(open4);
            }
        });
        blood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open5 = new Intent(main.this,blood.class);
                startActivity(open5);
            }
        });
        organ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open6 = new Intent(main.this,organ.class);
                startActivity(open6);
            }
        });
        Disease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open7 = new Intent(main.this,dpage.class);
                startActivity(open7);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open8 = new Intent(main.this,help.class);
                startActivity(open8);
            }
        });
    }
}
