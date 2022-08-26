package com.example.mindbrewers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

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