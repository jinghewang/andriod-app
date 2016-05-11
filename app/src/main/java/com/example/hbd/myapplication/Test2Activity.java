package com.example.hbd.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Test2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        //new
        Intent i = getIntent();
        String uName = i.getStringExtra("name");
        int uAge = i.getIntExtra("age",0);

        String str = "count:" + uName + " age:" + uAge;
        //textView.setText(str);
        Toast toast= Toast.makeText(this.getApplicationContext(), str, Toast.LENGTH_SHORT);
        toast.show();
    }
}
