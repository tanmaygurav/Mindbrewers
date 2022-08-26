package com.example.mindbrewers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PopIt extends AppCompatActivity {
    private ImageView pop1,pop2,pop3,pop4;
    private TextView oneLine,description,next,play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_it);

        pop1=findViewById(R.id.idPop1);
        pop2=findViewById(R.id.idPop2);
        pop3=findViewById(R.id.idPop3);
        pop4=findViewById(R.id.idPop4);

        oneLine=findViewById(R.id.idOneLine);
        description=findViewById(R.id.idDescription);

        play=findViewById(R.id.idPlayAgain);
        next=findViewById(R.id.idNext);

        play.setOnClickListener(v->{
            pop1.setVisibility(View.VISIBLE);
            pop2.setVisibility(View.VISIBLE);
            pop3.setVisibility(View.VISIBLE);
            pop4.setVisibility(View.VISIBLE);
        });

        next.setOnClickListener(v->{
            startActivity(new Intent(getApplicationContext(),CheckOut.class));
        });

        pop1.setOnClickListener(v->{
            popAndmsg1();
        });

        pop2.setOnClickListener(v->{
            popAndmsg2();
        });

        pop3.setOnClickListener(v->{
            popAndmsg3();
        });

        pop4.setOnClickListener(v->{
            popAndmsg4();
        });
    }

    private void popAndmsg4() {
        pop4.setVisibility(View.INVISIBLE);
        oneLine.setText("Existing Illness Benefit");
        description.setText("Treatment expense for pre-existing");
    }

    private void popAndmsg3() {
        pop3.setVisibility(View.INVISIBLE);
        oneLine.setText("AYUSH or Alternate Medicine Treatment");
        description.setText("All Homeopathy, Unani & Ayurvedic expenses covered.");
    }

    private void popAndmsg2() {
        pop2.setVisibility(View.INVISIBLE);
        oneLine.setText("Network Discounts");
        description.setText("Save on healthcare expenses, hospital room rent & more.");
    }

    private void popAndmsg1() {
        pop1.setVisibility(View.INVISIBLE);
        oneLine.setText("Preventive Health Check-up");
        description.setText("FREE health package with 61+ tests for 2 adults.");
    }
}