package com.example.mindbrewers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

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

        //                Buzzer code
        MediaPlayer mp= MediaPlayer.create(this,R.raw.page);
        try {
//            mp.prepare();
            mp.start();
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(),"error in audio : "+e,Toast.LENGTH_SHORT).show();
        }
//        End Buzzer code


    }
}