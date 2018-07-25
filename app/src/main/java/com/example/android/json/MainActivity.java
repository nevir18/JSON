package com.example.android.json;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        }
              public void profileclick(View view) {
                Intent i = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(i);
            }

    public void orgsclick(View view) {
        Intent i = new Intent(MainActivity.this, OrgsActivity.class);
        startActivity(i);
    }

    }
