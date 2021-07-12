package com.example.eventbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    private TextView mfristname;
    private TextView mlastname;
    private TextView memail;
    private TextView mphnnumber;
    private TextView mnoofseats;
    private TextView mdateofshows;
    private Button mbtnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        initView();
        String username = getIntent().getStringExtra("keyname");
        String userlastname = getIntent().getStringExtra("keylastname");
        String useremail = getIntent().getStringExtra("keyuseremail");
        String usernumber = getIntent().getStringExtra("keynumber");
        String usernoofseats = getIntent().getStringExtra("keynoofseat");
        String userdateofshoe = getIntent().getStringExtra("keydateofshow");
        mfristname.setText(username);
        mlastname.setText(userlastname);
        memail.setText(useremail);
        mphnnumber.setText(usernumber);
        mnoofseats.setText(usernoofseats);
        mdateofshows.setText(userdateofshoe);
        mbtnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this,"Event is booked Number of seats are "+usernoofseats+" and Date of the show "+userdateofshoe,Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void initView() {
        mfristname = findViewById(R.id.recfirstname);
        mlastname =  findViewById(R.id.reclastname);
        memail = findViewById(R.id.recemail);
        mphnnumber = findViewById(R.id.recPhnNo);
        mnoofseats = findViewById(R.id.recnoofseats);
        mdateofshows = findViewById(R.id.recdateofshow);
        mbtnConfirm = findViewById(R.id.btnconfirm);

    }
}