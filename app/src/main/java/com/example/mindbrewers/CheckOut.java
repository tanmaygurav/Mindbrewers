package com.example.mindbrewers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CheckOut extends AppCompatActivity {
    private TextView timer;
    private Button payNow;
    private CountDownTimer timer1;
    private ImageView payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);

        timer=findViewById(R.id.idOfferTimer);
        payment=findViewById(R.id.idPayment);

        payment.setOnClickListener(v->{
            timer1.cancel();
            startActivity(new Intent(getApplicationContext(),ManualDataEntry.class));
        });



        timer1=new CountDownTimer(1800000, 1000) {

            public void onTick(long millisUntilFinished) {
                NumberFormat f = new DecimalFormat("00");
                long hour = (millisUntilFinished / 3600000) % 24;
                long min = (millisUntilFinished / 60000) % 60;
                long sec = (millisUntilFinished / 1000) % 60;
                timer.setText("Offer will last for "+f.format(hour) + ":" + f.format(min) + ":" + f.format(sec));
            }
            public void onFinish() {
                timer.setText("00:00:00");
            }

        }.start();

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