package com.example.twoactivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity implements View.OnClickListener {

    Button btnForward;
    TextView textView;
    final String TAG = "States";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        textView = (TextView)findViewById(R.id.moved);
        textView.setText(MainActivity.text);

        btnForward = (Button) findViewById(R.id.btnActForward1);
        btnForward.setOnClickListener(this);

        Log.d(TAG, "ActivityTwo: onCreate()");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            // Лучше бы для каждой кнопки свой метод привязать а не свитч делать
            case R.id.btnActForward1:
                Intent intent = new Intent(this, Activity3.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_2:
                AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                dlgAlert.setMessage("This is an alert with no consequence");
                dlgAlert.setTitle("App Title");
                dlgAlert.setPositiveButton("OK", null);
                dlgAlert.setCancelable(true);
                dlgAlert.create().show();
                return false;
            case R.id.menu_1:
                Intent intent = new Intent(this, MainActivity.class);
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
