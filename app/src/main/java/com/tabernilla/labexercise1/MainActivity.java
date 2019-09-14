package com.tabernilla.labexercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.yellow);
    }

    public void displayAct(View v) {
        Intent i = new Intent(this, places.class);
        startActivity(i);
    }

    public void displayLog(View v) {
        Intent i = new Intent(this, Service.class);

            startActivity(i);

        }
}

