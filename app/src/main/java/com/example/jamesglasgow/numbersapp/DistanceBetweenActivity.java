package com.example.jamesglasgow.numbersapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DistanceBetweenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance_between);
    }


    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        EditText Lat1Text = (EditText) findViewById(R.id.editText2);
        EditText Long1Text = (EditText) findViewById(R.id.editText1);
        EditText Lat2Text = (EditText) findViewById(R.id.editText1);
        EditText Long2Text = (EditText) findViewById(R.id.editText4);

        double Lat1,Long1,Lat2,Long2,dist;
        try{
            Lat1 = Double.parseDouble(Lat1Text.getText().toString());
        } catch (final NumberFormatException e) {
            Lat1 = 0.0;
        }
        try{
            Long1 = Double.parseDouble(Long1Text.getText().toString());
        } catch (final NumberFormatException e) {
            Long1 = 0.0;
        }
        try{
            Lat2 = Double.parseDouble(Lat2Text.getText().toString());
        } catch (final NumberFormatException e) {
            Lat2 = 0.0;
        }
        try{
            Long2 = Double.parseDouble(Long2Text.getText().toString());
        } catch (final NumberFormatException e) {
            Long2 = 0.0;
        }

        dist=distance( Lat1,  Lat2,  Long1,Long2,  0.0,  0.0);
        TextView textView = (TextView) findViewById(R.id.AnsText);
        textView.setText(Double.toString(dist));
    }
    /**
     * Calculate distance between two points in latitude and longitude taking
     * into account height difference. If you are not interested in height
     * difference pass 0.0. Uses Haversine method as its base.
     *
     * lat1, lon1 Start point lat2, lon2 End point el1 Start altitude in meters
     * el2 End altitude in meters
     * @returns Distance in Meters
     */
    public static double distance(double lat1, double lat2, double lon1,
                                  double lon2, double el1, double el2) {

        final int R = 6371; // Radius of the earth

        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; // convert to meters

        double height = el1 - el2;

        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);
    }
}
