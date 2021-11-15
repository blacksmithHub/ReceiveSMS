package com.example.chanel.receivesms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtmessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtmessage=(TextView)findViewById(R.id.textViewMessage);

        // Get intent object sent from the SMSBroadcastReceiver
        Intent sms_intent = getIntent();
        Bundle b = sms_intent.getExtras();

        if (b!=null){


            SMSClass smsObj = (SMSClass) b.getSerializable("sms_obj");
            txtmessage.setText(smsObj.getMessage().toString());

        }




    }
}
