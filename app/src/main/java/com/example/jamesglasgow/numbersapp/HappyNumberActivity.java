package com.example.jamesglasgow.numbersapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.HashSet;

public class HappyNumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy_number);

        Log.e("happy"," "+isHappy(19));
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();

        while(!set.contains(n)){
            set.add(n);

            n = getSum(n);

            if(n==1)
                return true;
        }

        return false;
    }

    public int getSum(int n){
        int sum =0;
        while(n>0){
            Log.e("test","n "+n%10+"s "+n);
            sum+=(n%10)*(n%10);
            Log.e("test"," "+sum);
            n=n/10;
        }
        return sum;
    }
}
