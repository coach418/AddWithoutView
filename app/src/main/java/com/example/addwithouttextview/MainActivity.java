package com.example.addwithouttextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        int num1  = 90;
        int num2 = 9;
        int num3 = 4;
        int sum = num1 + num2 +num3;
        System.out.println("sum" + sum);
        Log.d("sum" , String.valueOf( sum ) );
    }
}