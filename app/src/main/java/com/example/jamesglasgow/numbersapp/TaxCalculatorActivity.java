package com.example.jamesglasgow.numbersapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TaxCalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax_calculator);
    }

    public void sendMessage(View view) {
        // Do something in response to button
        EditText PriceText = (EditText) findViewById(R.id.editText1);
        EditText TaxText = (EditText) findViewById(R.id.editText2);

        double Price,Tax,Final;
        try{
            Price = Double.parseDouble(PriceText.getText().toString());
        } catch (final NumberFormatException e) {
            Price = 0.0;
        }
        try{
            Tax = Double.parseDouble(TaxText.getText().toString());
        } catch (final NumberFormatException e) {
            Tax = 0.0;
        }

        Final=PriceWithTax(Price,Tax);

        TextView textView = (TextView) findViewById(R.id.PriceAns);
        textView.setText(Double.toString(Final));
    }

    public static double PriceWithTax(double price, double tax) {

     double FinalTax=(tax/100)+1;
        
        double FinalPrice = price*FinalTax;
        return FinalPrice;
    }
}
