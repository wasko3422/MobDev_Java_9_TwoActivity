package com.example.twoactivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {


    Button btnForward;
    final String TAG = "States";
    public static String text;

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnForward = (Button) findViewById(R.id.btnActForward);
        btnForward.setOnClickListener(this);

        Log.d(TAG, "MainActivity: onCreate()");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActForward:

                text = ((EditText)findViewById(R.id.phone)).getText().toString();
                Intent intent = new Intent(this, ActivityTwo.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_1:
                AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                dlgAlert.setMessage("This is an alert with no consequence");
                dlgAlert.setTitle("App Title");
                dlgAlert.setPositiveButton("OK", null);
                dlgAlert.setCancelable(true);
                dlgAlert.create().show();
                return false;
            case R.id.menu_2:
                Intent intent = new Intent(this, ActivityTwo.class);
                startActivity(intent);
                return true;
            case R.id.menu_3:
                intent = new Intent(this, Activity3.class);
                startActivity(intent);
                return true;
            case R.id.menu_4:
                intent = new Intent(this, Activity4.class);
                startActivity(intent);
                return true;
            default:
                return true;

        }
    }

}
