package com.example.mhasan.multipleactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    void init() {
        Button btn1 = (Button) findViewById(R.id.CoolingActivity2);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent getSecondActivity = new Intent(this, ActivityTwo.class);
        startActivity(getSecondActivity);
    }
}
