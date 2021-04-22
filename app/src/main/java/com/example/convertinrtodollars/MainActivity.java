package com.example.convertinrtodollars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){

        EditText inputAmt= (EditText) findViewById(R.id.amt);
        String inrString = inputAmt.getText().toString();
        double inrDouble = Double.parseDouble(inrString);
        double dollar = inrDouble * 0.013;
        String dollarString = String.format("%.3f", dollar);
//        Log.i("Value", dollarString);
        Toast.makeText(this, "INR " + inrString + "= $ " + dollarString, Toast.LENGTH_LONG ).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}