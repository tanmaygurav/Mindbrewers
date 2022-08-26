package com.example.mindbrewers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ManualDataEntry extends AppCompatActivity {
    private ImageView manual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_data_entry);

        manual=findViewById(R.id.idManualData);

        manual.setOnClickListener(v->{
            startActivity(new Intent(getApplicationContext(),AdhaarScanData.class));
        });
    }
}