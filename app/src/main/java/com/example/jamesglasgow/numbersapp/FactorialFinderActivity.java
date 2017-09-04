package com.example.jamesglasgow.numbersapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.math.BigInteger;

public class FactorialFinderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial_finder);
    }


    public static BigInteger factorial(BigInteger n) {
        //set the starting value to 1
        BigInteger factorial = BigInteger.valueOf(1);
        //if n = 0 return 1;
        if (n.equals(BigInteger.valueOf(0))) {
            return factorial;
        }
        //for every number multiply by last calculated
        for (int i = 1; i <= n.intValue(); i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        //return end result
        return factorial;
    }
}
