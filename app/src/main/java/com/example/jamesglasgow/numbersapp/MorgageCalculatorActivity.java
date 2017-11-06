package com.example.jamesglasgow.numbersapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MorgageCalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morgage_calculator);
        int loanAmount = 40000;
        int termInYears = 6;
        double interestRate = 6.5;
        double monthlyPayment =calculateMonthlyPayment(loanAmount, termInYears, interestRate);
        Log.e("monthlypayments",""+monthlyPayment);
    }
//add a condition to slect week ,month or year or daily;
    public static double calculateMonthlyPayment(
            int loanAmount, int termInYears, double interestRate) {

        // Convert interest rate into a decimal
        interestRate /= 100.0;

        // Monthly interest rate
        // is the yearly rate divided by 12
        double monthlyRate = interestRate / 12.0;

        // The length of the term in months
        int termInMonths = termInYears * 12;
        // Calculate the monthly payment

        // The Math.pow() method is used calculate values raised to a power

        double monthlyPayment =(loanAmount*monthlyRate) / (1-Math.pow(1+monthlyRate, -termInMonths));

        return monthlyPayment;
    }

}
