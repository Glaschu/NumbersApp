package com.example.jamesglasgow.numbersapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NextPrimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_prime);
        int number =33;
        while(!isPrime(number)){
            number++;
        }
            Log.e("prime num ",""+number);
        

    }
    public static boolean isPrime(int number) {
        for (int div = 2; div <= Math.sqrt(number); div++) {
            if (number % div == 0) {
                return false;
            }
        }
        return true;
    }
}
