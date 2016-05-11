package com.example.hbd.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button btn;
    private  TextView textView;
    private int count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView2);
        btn = (Button)this.findViewById(R.id.button1);
    }


    public void Btn1_Click(View view)
    {
        String str = "---->" + count;
        textView.setText(str);
        count++;
    }
}
