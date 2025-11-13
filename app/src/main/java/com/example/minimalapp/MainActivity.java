package com.example.minimalapp;

import android.app.Activity;
import android.os.Bundle;

// Import R karena kita merujuk ke file layout
import com.example.minimalapp.R;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Memuat layout dari res/layout/activity_main.xml
        setContentView(R.layout.activity_main);
    }
}

