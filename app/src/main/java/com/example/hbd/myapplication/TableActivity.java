package com.example.hbd.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        //new
        Intent i = getIntent();
        String uName = i.getStringExtra("name");
        String str = "count:" + uName;
        Toast toast= Toast.makeText(this.getApplicationContext(), str, Toast.LENGTH_SHORT);
        toast.show();
    }
}
