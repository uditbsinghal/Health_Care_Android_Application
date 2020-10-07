package com.example.googlemaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bhala1 extends AppCompatActivity {
    public Button but1;
    public Button but2;
    public Button but3;
    public Button but4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhala1);
    but1 = (Button) findViewById(R.id.but1);
        but2 = (Button) findViewById(R.id.but2);
        but3 = (Button) findViewById(R.id.but3);
        but4 = (Button) findViewById(R.id.but4);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open3 = new Intent(bhala1.this,pune.class);
                startActivity(open3);
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open4 = new Intent(bhala1.this,mumbai.class);
                startActivity(open4);
            }

        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open5 = new Intent(bhala1.this,ratna.class);
                startActivity(open5);
            }

        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open6 = new Intent(bhala1.this,sudha.class);
                startActivity(open6);
            }

        });

    }
}
