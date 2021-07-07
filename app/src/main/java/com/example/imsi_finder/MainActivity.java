package com.example.imsi_finder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private Button button;
   TextView textView;
   TelephonyManager td;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button1);
        textView = (TextView) findViewById(R.id.text1);

        td = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
//        String myData = "Hello ";

        button.setOnClickListener(new View.OnClickListener() {
//            @Override
            public void onClick(View v) {
                textView.setText(td.getSubscriberId().toString());
            }
        });
    }
}