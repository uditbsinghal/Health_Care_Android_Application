package com.example.googlemaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dpage extends AppCompatActivity {

        public Button but1;
        public Button but2;
        public Button but3;
        public Button but4;
        public Button but5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dpage);
        but1 = (Button) findViewById(R.id.but1);
        but2 = (Button) findViewById(R.id.but2);
        but3 = (Button) findViewById(R.id.but3);
        but4 = (Button) findViewById(R.id.but4);
        but5 = (Button)findViewById(R.id.but5);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open3 = new Intent(dpage.this,cas.class);
                startActivity(open3);
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open4 = new Intent(dpage.this,ortho.class);
                startActivity(open4);
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open5 = new Intent(dpage.this,child.class);
                startActivity(open5);
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open6 = new Intent(dpage.this,disease.class);
                startActivity(open6);
            }
        });

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open7 = new Intent(dpage.this,para.class);
                startActivity(open7);
            }
        });


    }

}
