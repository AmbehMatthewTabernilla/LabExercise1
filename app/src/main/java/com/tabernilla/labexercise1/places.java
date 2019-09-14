package com.tabernilla.labexercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class places extends AppCompatActivity {
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places);
        view=this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.yellow);
    }

    public void displayWeb1(View v)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://library.ust.edu.ph/"));
        startActivity(i);
    }

    public void displayWeb2(View v)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://en.wikipedia.org/wiki/Quadricentennial_Pavilion"));
        startActivity(i);
    }

    public void displayWeb3(View v)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://cityseeker.com/manila/310456-ust-botanical-gardens"));
        startActivity(i);
    }

    public void displayWeb4(View v)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://www.ust.edu.ph/faith/santissimo-rosario-parish/"));
        startActivity(i);
    }

    public void backBtn(View v){
        Intent i = new Intent(this , MainActivity.class);
        startActivity(i);
    }
    
}

