package com.example.mhasan.multipleactivities;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText ScndNum, firstNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
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
        final int code = 1;
        String Num1 = firstNum.getText().toString();
        String Num2 = ScndNum.getText().toString();

        Intent getSecondActivity = new Intent(this, ActivityTwo.class);
        getSecondActivity.putExtra("FirstNum", Num1);
        getSecondActivity.putExtra("ScondNum", Num2);
        startActivityForResult(getSecondActivity, code);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                String dataResult=data.getStringExtra("result");
                TextView result = (TextView) findViewById(R.id.result);
                result.setText( dataResult);
            }
            if (resultCode == Activity.RESULT_CANCELED) {

            }
        }

    }


}
