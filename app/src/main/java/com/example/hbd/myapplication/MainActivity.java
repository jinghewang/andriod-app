package com.example.hbd.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button btn;
    private  TextView textView;
    private int count =0;
    Toast toast= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)this.findViewById(R.id.button1);
    }


    public void BtnLogin_Click(View view)
    {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,LoginActivity.class);
        intent.putExtra("name","wjh");
        intent.putExtra("age",18);
        this.startActivity(intent);
    }

    public void Btn1_Click(View view)
    {
        String str = "count:" + count;
        toast=Toast.makeText(this.getApplicationContext(), str, Toast.LENGTH_SHORT);
        toast.show();
        count++;
    }

    public void Btn2_Click(View view)
    {
        String str = "count2:" + count;
        //textView.setText(str);
        toast=Toast.makeText(this.getApplicationContext(), str, Toast.LENGTH_SHORT);
        toast.show();
        count++;
    }

    public void BtnTest1_Click(View view)
    {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,TestActivity.class);
        intent.putExtra("name","wjh");
        intent.putExtra("age",18);
        this.startActivity(intent);
    }


    public void BtnTest2_Click(View view)
    {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,Test2Activity.class);
        intent.putExtra("name","wjh2");
        intent.putExtra("age",20);
        this.startActivity(intent);
    }


    public void BtnLayout_Click(View view)
    {

        Button btn = (Button) view;
        Intent intent = new Intent();
        intent.putExtra("name",btn.getText());
        switch (btn.getText().toString().toLowerCase()){
            case "linear":
                intent.setClass(MainActivity.this,LinearActivity.class);
                break;

            case "frame":
                intent.setClass(MainActivity.this,FrameActivity.class);
                break;

            case "table":
                intent.setClass(MainActivity.this,TableActivity.class);
                break;

            case "relative":
                intent.setClass(MainActivity.this,RelativeActivity.class);
                break;

            case "absolute":
                intent.setClass(MainActivity.this,AbsoluteActivity.class);
                break;

            default:
                intent.setClass(MainActivity.this,Test2Activity.class);
                break;
        }

        this.startActivity(intent);
    }
}
