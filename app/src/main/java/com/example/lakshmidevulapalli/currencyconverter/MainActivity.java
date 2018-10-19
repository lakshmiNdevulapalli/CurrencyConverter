package com.example.lakshmidevulapalli.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.nio.DoubleBuffer;

public class MainActivity extends AppCompatActivity {

    public void currencyConvert(View view){
        //Log.i("Curreny","Entered");
        double conversionAmount = 68.55;
        EditText convertToAmount = (EditText) findViewById(R.id.amountConvert);

        Double amount = Double.parseDouble(convertToAmount.getText().toString());
        Double amountAfterConversion = amount * conversionAmount;
        Log.i("Curreny","Entered");
        Toast.makeText(MainActivity.this,convertToAmount.getText().toString()+" USD in INR is "+String.format("%.2f", amountAfterConversion),Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
