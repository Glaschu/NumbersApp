package com.example.jamesglasgow.numbersapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ChangeReturnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_return);
        double pricePaid=15.00,itemcost=8.41;
        String change =calculateChange(pricePaid,itemcost);
        Log.e("change",change);

    }
    public String calculateChange(
            double pricePaid, double itemCost) {
            double moneyAfterTransaction=pricePaid-itemCost;
            double tmp = moneyAfterTransaction/1;
            String ChangeCal="Pounds:"+tmp;
            moneyAfterTransaction-=tmp;
            tmp = moneyAfterTransaction/0.5;
            ChangeCal+="fiftu cents:"+tmp;
            moneyAfterTransaction-=(0.5*tmp);
            tmp = moneyAfterTransaction/0.2;
            ChangeCal+="twenty cents:"+tmp;
            moneyAfterTransaction-=(0.2*tmp);
            tmp = moneyAfterTransaction/0.02;
            ChangeCal+="two cents:"+tmp;
            moneyAfterTransaction-=(0.2*tmp);
            tmp = moneyAfterTransaction/0.01;
            ChangeCal+="one cents:"+tmp;
            moneyAfterTransaction-=(0.1*tmp);

        return ChangeCal;
    }
}
