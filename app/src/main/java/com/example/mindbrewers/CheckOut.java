package com.example.mindbrewers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CheckOut extends AppCompatActivity {
    private TextView timer;
    private Button payNow;
    private CountDownTimer timer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);

        timer=findViewById(R.id.idOfferTimer);
        payNow=findViewById(R.id.idPayNow);

        payNow.setOnClickListener(v->{
            timer1.cancel();
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

    }
}