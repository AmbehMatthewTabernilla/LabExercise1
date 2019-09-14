package com.tabernilla.labexercise1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

public class Service extends IntentService{

    public Service()
    {
        super("Service");
    }
    @Override
    protected void onHandleIntent(@Nullable Intent intent)
    {
        Log.d("places" , "UST Library");
        Log.d("places" , "Quadricentennial Pavilion");
        Log.d("places" , "UST Botanical Garden");
        Log.d("places" , "Santisimo Rosario Parish");
    }
}
