package com.example.mindbrewers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class PopitLanding extends AppCompatActivity {
    private ImageView popItLanding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popit_landing);

        popItLanding=findViewById(R.id.idPopitLanding);

        popItLanding.setOnClickListener(v->{
            startActivity(new Intent(getApplicationContext(),PopIt.class));
        });
    }
}