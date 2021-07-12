package com.example.eventbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText mfirstName;
    private EditText mlastName;
    private EditText memailAddress;
    private EditText mphnNumber;
    private Button mbtnProceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        mbtnProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = mfirstName.getText().toString();
                String userlastname = mlastName.getText().toString();
                String useremail = memailAddress.getText().toString();
                String usernumber = mphnNumber.getText().toString();
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("keyname",username);
                intent.putExtra("keylastname",userlastname);
                intent.putExtra("keyuseremail",useremail);
                intent.putExtra("keynumber",usernumber);
                startActivity(intent);
            }
        });



    }
    private void initViews() {
        mfirstName =findViewById(R.id.firstName);
        mlastName = findViewById(R.id.lastName);
        memailAddress =findViewById(R.id.emailAddress);
        mphnNumber =findViewById(R.id.phnNumber);
        mbtnProceed =findViewById(R.id.btnProceed);

    }

}