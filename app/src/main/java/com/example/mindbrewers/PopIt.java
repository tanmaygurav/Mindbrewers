package com.example.mindbrewers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PopIt extends AppCompatActivity {
    private ImageView pop1,pop2,pop3,pop4,pop5,pop6,pop7,pop8,pop9,pop10,pop11,pop12,pop13,pop14,pop15,pop16,pop17,pop18;
    private TextView oneLine,description,next,play;
    private List<String> benefitsHeader,benefitsDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_it);

        pop1=findViewById(R.id.idPop1);
        pop2=findViewById(R.id.idPop2);
        pop3=findViewById(R.id.idPop3);
        pop4=findViewById(R.id.idPop4);
//        TODO:Create and find pop till 18 in xml file

        oneLine=findViewById(R.id.idOneLine);
        description=findViewById(R.id.idDescription);

        play=findViewById(R.id.idPlayAgain);
        next=findViewById(R.id.idNext);

//      18 benefits
        getData();


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

        pop5.setOnClickListener(v->{
            popAndmsg5();
        });
        pop6.setOnClickListener(v->{
            popAndmsg6();
        });
        pop7.setOnClickListener(v->{
            popAndmsg7();
        });
        pop8.setOnClickListener(v->{
            popAndmsg8();
        });
        pop9.setOnClickListener(v->{
            popAndmsg9();
        });
        pop10.setOnClickListener(v->{
            popAndmsg10();
        });
        pop11.setOnClickListener(v->{
            popAndmsg11();
        });
        pop12.setOnClickListener(v->{
            popAndmsg12();
        });
        pop13.setOnClickListener(v->{
            popAndmsg13();
        });
        pop14.setOnClickListener(v->{
            popAndmsg14();
        });
        pop15.setOnClickListener(v->{
            popAndmsg15();
        });
        pop16.setOnClickListener(v->{
            popAndmsg16();
        });
        pop17.setOnClickListener(v->{
            popAndmsg17();
        });
        pop18.setOnClickListener(v->{
            popAndmsg18();
        });
    }
    private void popAndmsg18() {
        pop18.setVisibility(View.INVISIBLE);
        oneLine.setText(benefitsHeader.get(18));
        description.setText(benefitsHeader.get(18));
    }
    private void popAndmsg17() {
        pop17.setVisibility(View.INVISIBLE);
        oneLine.setText(benefitsHeader.get(17));
        description.setText(benefitsHeader.get(17));
    }
    private void popAndmsg16() {
        pop16.setVisibility(View.INVISIBLE);
        oneLine.setText(benefitsHeader.get(16));
        description.setText(benefitsHeader.get(16));
    }
    private void popAndmsg15() {
        pop15.setVisibility(View.INVISIBLE);
        oneLine.setText(benefitsHeader.get(15));
        description.setText(benefitsHeader.get(15));
    }
    private void popAndmsg14() {
        pop14.setVisibility(View.INVISIBLE);
        oneLine.setText(benefitsHeader.get(14));
        description.setText(benefitsHeader.get(14));
    }
    private void popAndmsg13() {
        pop13.setVisibility(View.INVISIBLE);
        oneLine.setText(benefitsHeader.get(13));
        description.setText(benefitsHeader.get(13));
    }
    private void popAndmsg12() {
        pop12.setVisibility(View.INVISIBLE);
        oneLine.setText(benefitsHeader.get(12));
        description.setText(benefitsHeader.get(12));
    }
    private void popAndmsg11() {
        pop11.setVisibility(View.INVISIBLE);
        oneLine.setText(benefitsHeader.get(11));
        description.setText(benefitsHeader.get(11));
    }
    private void popAndmsg10() {
        pop10.setVisibility(View.INVISIBLE);
        oneLine.setText(benefitsHeader.get(10));
        description.setText(benefitsHeader.get(10));
    }
    private void popAndmsg9() {
        pop9.setVisibility(View.INVISIBLE);
        oneLine.setText(benefitsHeader.get(9));
        description.setText(benefitsHeader.get(9));
    }
    private void popAndmsg8() {
        pop8.setVisibility(View.INVISIBLE);
        oneLine.setText(benefitsHeader.get(8));
        description.setText(benefitsHeader.get(8));
    }
    private void popAndmsg7() {
        pop7.setVisibility(View.INVISIBLE);
        oneLine.setText(benefitsHeader.get(7));
        description.setText(benefitsHeader.get(7));
    }
    private void popAndmsg6() {
        pop6.setVisibility(View.INVISIBLE);
        oneLine.setText(benefitsHeader.get(6));
        description.setText(benefitsHeader.get(6));
    }
    private void popAndmsg5() {
        pop5.setVisibility(View.INVISIBLE);
        oneLine.setText(benefitsHeader.get(5));
        description.setText(benefitsHeader.get(5));
    }
    private void popAndmsg4() {
        pop4.setVisibility(View.INVISIBLE);
        oneLine.setText(benefitsHeader.get(4));
        description.setText(benefitsHeader.get(4));
    }

    private void popAndmsg3() {
        pop3.setVisibility(View.INVISIBLE);
        oneLine.setText(benefitsHeader.get(3));
        description.setText(benefitsHeader.get(3));
    }

    private void popAndmsg2() {
        pop2.setVisibility(View.INVISIBLE);
        oneLine.setText(benefitsHeader.get(2));
        description.setText(benefitsHeader.get(2));
    }

    private void popAndmsg1() {
        pop1.setVisibility(View.INVISIBLE);
        oneLine.setText(benefitsHeader.get(1));
        description.setText(benefitsHeader.get(1));
    }
    private void getData() {
//        one liners
        benefitsHeader=new ArrayList<String>();
        benefitsHeader.add("Insta Consult");
        benefitsHeader.add("Wellness Benefits");
        benefitsHeader.add("Preventive Health Check-up");
        benefitsHeader.add("Health Insurance Cover");
        benefitsHeader.add("Network Discounts");
        benefitsHeader.add("Room Rent Cover");
        benefitsHeader.add("COVID-19 Treatment");
        benefitsHeader.add("Pre-hospitalization Benefit");
        benefitsHeader.add("Post-hospitalization Benefit");
        benefitsHeader.add("Day-care Procedures");
        benefitsHeader.add("Hospital Care & Tests Cover");
        benefitsHeader.add("Surgery Requirements Cover");
        benefitsHeader.add("Life Support Treatment Benefit");
        benefitsHeader.add("Organ Donor Cover");
        benefitsHeader.add("Implants Cover");
        benefitsHeader.add("AYUSH or Alternate Medicine Treatment");
        benefitsHeader.add("Ambulance Charges");
        benefitsHeader.add("Existing Illness Benefit");
//        description

        benefitsDescription=new ArrayList<String>();
        benefitsDescription.add("Upto 180 FREE online doctor consultations on Bajaj Finserv Health platform \n You can consult 8400+ doctors online 24/7 with multiple follow-ups via audio, video or chat");
        benefitsDescription.add("Get wallet balance upto ₹34,300 for doctor consultations & lab tests or radiology tests\n" +
                "Avail any test or consult any doctor from 96,000+ doctors across 35+ specialties in 17+ languages or consult your family doctor, and get fees reimbursed.");
        benefitsDescription.add("FREE health package with 61+ tests for 2 adults.\n" +
                "Your annual health test package with home sample collection is included.");
        benefitsDescription.add("Cover of upto 10 lacs for your family.\n" +
                "You, your spouse & 4 children under 21 years of age are covered for pre-and post-hospitalization expenses.");
        benefitsDescription.add("Save on healthcare expenses, hospital room rent & more.\n" +
                "Get 10% OFF on doctor consultation fees, medicines & lab tests across 700+ partner hospitals and 3400+ labs PAN India.");
        benefitsDescription.add("1 private, a/c room allotted during hospitalization.\n" +
                "Expenses incurred for one private room during your treatment period is covered. If you need ICU stay, expenses for an ICU bed is included.");
        benefitsDescription.add("Cover for hospitalization for all COVID-19 variants.\n" +
                "When hospitalized due to COVID-19, all your treatment expenses are covered. Tests like RT-PCR, COVID antibodies, etc. during hospitalization are covered.");
        benefitsDescription.add("Expenses incurred 60 day prior to hospitalization.\n" +
                "Go cashless for doctor visit and lab tests expenses within network before hospitalization. Claim reimbursement for non-network labs and doctors.");
        benefitsDescription.add("Expenses incurred 90 days post-hospitalization.\n" +
                "Your post-hospitalization care expenses of medicines and follow-up treatments are covered for the next 90 days.");
        benefitsDescription.add("Medical procedures with less than 24 hrs. of hospitalization are covered.\n" +
                "Small procedures that require you to go under anesthesia and need less than 24 hrs. of hospital stay are covered.");
        benefitsDescription.add("Expenses incurred for all\n" +
                "Complete requisite care during hospitalization covered. All expenses related to doctors, tests, anesthetists, surgeons, etc. during your hospital stay for treatment are covered");
        benefitsDescription.add("Expenses incurred for all surgical needs during hospitalization.\n" +
                "Cost of unit of blood, anesthesia, oxygen cylinder, OT charges, medicines & other surgical appliances needed for surgery are covered.");
        benefitsDescription.add("Expenses incurred for life support & life-saving procedures during treatment.\n" +
                "Your chemotherapy sessions, dialysis, prosthetic and cost of ventilator, etc. are included in the plan to use as and when required.");
        benefitsDescription.add("Expenses incurred for obtaining organ & donor healthcare.\n" +
                "If and when you need an organ transplant, cost of obtaining an organ, transplant procedure and donor’s healthcare are all taken care of.");
        benefitsDescription.add("Expenses incurred for all health improvement surgical implants\n" +
                "To improve your health and increase life longevity, expense of infra-cardiac valve replacements, vascular stents, pacemaker, orthopedic implants, etc. are included.");
        benefitsDescription.add("All Homeopathy, Unani & Ayurvedic expenses covered.\n" +
                "If you want to opt for alternate medicine like homeopathy, Ayurvedic or Unani treatment instead of allopathy, expenses are covered.");
        benefitsDescription.add("Ambulance assistance expenses for hospitalization covered.\n" +
                "As and when you need an ambulance for hospital admission, you get upto ₹3000 per year (on renewal) as a part of your plan.");
        benefitsDescription.add("Treatment expense for pre-existing illnesses.\n" +
                "All expenses incurred for medicines and treatment for your pre-existing illness declared at policy purchase after a waiting period are included in the plan.");
    }
}