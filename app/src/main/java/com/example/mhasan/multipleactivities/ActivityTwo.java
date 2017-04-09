package com.example.mhasan.multipleactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        init();
    }

    void init() {
        Button btn2 = (Button) findViewById(R.id.CoolingActivity1);
        btn2.setOnClickListener(this);

        String  FirstNum= getIntent().getExtras().getString("FirstNum");
        String  ScondNum=getIntent().getExtras().getString("ScondNum");
        Log.d("We got the first Number",FirstNum);
        Log.d("We got the scond Number",ScondNum);
    }

    @Override
    public void onClick(View v) {
        Intent getFirstActivity = new Intent(this, MainActivity.class);
        startActivity(getFirstActivity);

    }
}
