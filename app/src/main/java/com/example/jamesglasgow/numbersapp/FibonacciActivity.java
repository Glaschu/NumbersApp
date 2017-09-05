package com.example.jamesglasgow.numbersapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class FibonacciActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);
        String Fib=printFibonacci(10);
        Log.e("string ",Fib);
    }

    static String printFibonacci(int count){
        int n1=0,n2=1,n3=0;
        String fib =""+n1+", "+n2;
        for(int i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            fib+=", "+n3;
            if(n3==count){
                break;
            }
            n1=n2;
            n2=n3;
        }
        return fib;
    }
}
