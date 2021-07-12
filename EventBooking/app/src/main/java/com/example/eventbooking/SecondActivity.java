package com.example.eventbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView mrecfirstname;
    private TextView mreclastname;
    private TextView mrecemail;
    private TextView mrecPhnNo;
    private EditText mNoOfSeats;
    private EditText mDateOfShow;
    private Button mbtnPreview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initViews();
        String username = getIntent().getStringExtra("keyname");
        String userlastname = getIntent().getStringExtra("keylastname");
        String useremail = getIntent().getStringExtra("keyuseremail");
        String usernumber = getIntent().getStringExtra("keynumber");
        mrecfirstname.setText(username);
        mreclastname.setText(userlastname);
        mrecemail.setText(useremail);
        mrecPhnNo.setText(usernumber);
        mbtnPreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = mrecfirstname.getText().toString();
                String userlastnmae = mreclastname.getText().toString();
                String useremail = mrecemail.getText().toString();
                String usernumber = mrecPhnNo.getText().toString();
                String userNoofseats = mNoOfSeats.getText().toString();
                String userdateofshow = mDateOfShow.getText().toString();
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                intent.putExtra("keyname",username);
                intent.putExtra("keylastname",userlastnmae);
                intent.putExtra("keyuseremail",useremail);
                intent.putExtra("keynumber",usernumber);
                intent.putExtra("keynoofseat",userNoofseats);
                intent.putExtra("keydateofshow",userdateofshow);
                startActivity(intent);
            }
        });

    }
    private void initViews() {
        mrecfirstname =findViewById(R.id.recfirstname);
        mreclastname = findViewById(R.id.reclastname);
        mrecemail = findViewById(R.id.recemail);
        mrecPhnNo =findViewById(R.id.recPhnNo);
        mNoOfSeats = findViewById(R.id.NoOfSeats);
        mDateOfShow = findViewById(R.id.DateOfShow);
        mbtnPreview = findViewById(R.id.btnPreview);

    }

}


