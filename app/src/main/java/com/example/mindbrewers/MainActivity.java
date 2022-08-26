package com.example.mindbrewers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView popit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        popit=findViewById(R.id.idPop);

        popit.setOnClickListener(v->{
            startActivity(new Intent(getApplicationContext(),PopIt.class));
        });

        //        Buzzer code
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