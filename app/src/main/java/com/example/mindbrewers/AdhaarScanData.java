package com.example.mindbrewers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class AdhaarScanData extends AppCompatActivity {
    private ImageView adhaarScan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhaar_scan_data);

        adhaarScan=findViewById(R.id.idAdhaarScan);

        adhaarScan.setOnClickListener(v->{
            startActivity(new Intent(getApplicationContext(),Summary.class));
        });
    }
}