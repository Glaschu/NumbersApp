package com.example.jamesglasgow.numbersapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Random;

public class CoinFlipActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin_flip);

        int head =flip(10);
        Log.d("flip","head : "+head+"Tails : "+(10-head));
    }

    public int flip(int flips){
        Random randomNum = new Random();

        int head=0;
        for (int i = 0; i < flips; i++) {
            int result = randomNum.nextInt(2);
            if(result == 0){

                head++;
            }
            }
            return head;

    }
}
