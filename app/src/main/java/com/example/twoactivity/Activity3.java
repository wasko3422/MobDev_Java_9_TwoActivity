package com.example.twoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity implements View.OnClickListener {

    Button btnForward;
    final String TAG = "States";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        btnForward = (Button) findViewById(R.id.btnActForward3);
        btnForward.setOnClickListener(this);
        Log.d(TAG, "Activity3: onCreate()");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActForward3:
                Intent intent = new Intent(this, Activity4.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}