package com.example.mindbrewers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Summary extends AppCompatActivity {
    private ImageView summary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        summary=findViewById(R.id.idSummary);

        summary.setOnClickListener(v->{
            startActivity(new Intent(getApplicationContext(),PopitLanding.class));
        });
    }
}