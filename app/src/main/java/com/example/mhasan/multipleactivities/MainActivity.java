package com.example.mhasan.multipleactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText ScndNum, firstNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    void init() {
        Button btn1 = (Button) findViewById(R.id.CoolingActivity2);
        firstNum = (EditText) findViewById(R.id.firstNum);
        ScndNum = (EditText) findViewById(R.id.ScndNum);

        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String Num1 = firstNum.getText().toString();
        String Num2 = ScndNum.getText().toString();


        Intent getSecondActivity = new Intent(this, ActivityTwo.class);
        getSecondActivity.putExtra("FirstNum",Num1);
        getSecondActivity.putExtra("ScondNum",Num2);
        startActivity(getSecondActivity);
    }
}
