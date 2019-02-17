package com.csci490bn.tipcalculator_counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    double tipPercent;
    int numOfPeople;
    double amountNoTip;
    double total;
    double totalTip;
    double totalPerPerson;
    Button customTip;
    Button amount;
    Button numPeople;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalTip = amountNoTip * tipPercent;
        total = amountNoTip + totalTip;
        totalPerPerson = total / numOfPeople;
    }

    public void customTip(View v) {
        String tip = customTip.toString();
        tipPercent = Double.parseDouble(tip);
    }

    public void tenPercentTip(View v) {
        tipPercent = 10.00;
    }

    public void fifteenPercentTip(View v) {
        tipPercent = 15.00;
    }

    public void inputNumPeople(View v) {
        String people = numPeople.toString();
        numOfPeople = Integer.parseInt(people);
    }

    public void inputAmount(View v) {
        String preTipAmount = amount.toString();
        amountNoTip = Integer.parseInt(preTipAmount);
    }

    public void resetTips(View v)
    {
        tipPercent = 0;
    }

    private View.OnKeyListener mKeyListener = new View.OnKeyListener() {
        @Override
        public boolean onKey(View v, int keyCode, KeyEvent event) {

            switch (v.getId()) {
                case R.id.customTip:
                    customTip.setText(keyCode);
                case R.id.numPeople:
                    numPeople.setText(keyCode);
                case R.id.amount:
                    amount.setText(keyCode);
            }
            return false;
        }


    };
}
