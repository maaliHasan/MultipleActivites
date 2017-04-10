package com.example.mhasan.multipleactivities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);// retrieve a reference to actionbar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_two);

    }

    @Override
    public boolean onSupportNavigateUp() {
        setData();
        finish();
        return true;
    }

    public void setData() {
        String FirstNum = getIntent().getExtras().getString("FirstNum");
        String ScondNum = getIntent().getExtras().getString("ScondNum");

        int result = Integer.parseInt(FirstNum) + Integer.parseInt(ScondNum);
        Intent getFirstActivity = new Intent();
        getFirstActivity.putExtra("result", String.valueOf(result));
        setResult(Activity.RESULT_OK, getFirstActivity);
        finish();
        Log.d("The result", String.valueOf(result));
    }


}
