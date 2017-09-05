package com.example.jamesglasgow.numbersapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class FindPiAndEActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_pi_and_e);




    }

    public static BigDecimal FindPi(int Length) {
        //set the starting value to 1
        BigDecimal Pi = new BigDecimal(Math.PI).setScale(Length, RoundingMode.DOWN);
        //return end result

        return Pi;
    }
    public static BigDecimal FindE(int Length) {
        //set the starting value to 1
        BigDecimal Pi = new BigDecimal(Math.E).setScale(Length, RoundingMode.DOWN);
        //return end result

        return Pi;
    }
}
