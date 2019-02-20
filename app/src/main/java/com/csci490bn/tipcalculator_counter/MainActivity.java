package com.csci490bn.tipcalculator_counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double tipPercent;
    int numOfPeople;
    double amountNoTip;
    double total;
    double totalTip;
    double totalPerPerson;
 //   RadioButton customTip;
    TextView tipTotalTxt;
    TextView totalTxt;
    TextView perPersonTxt;
    EditText cost;
    EditText tipAmount;
    EditText numPeople;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tipAmount = (EditText) findViewById(R.id.tipAmnt);
        cost = (EditText) findViewById(R.id.amount);
        numPeople = (EditText) findViewById(R.id.numPpl);
        tipTotalTxt = (TextView) findViewById(R.id.tip);
        totalTxt = (TextView) findViewById(R.id.total);
        perPersonTxt = (TextView) findViewById(R.id.perPerson);

        tipAmount.setOnKeyListener(mKeyListener);
        cost.setOnKeyListener(mKeyListener);
        numPeople.setOnKeyListener(mKeyListener);
    }

    public void customTip(View v) {
        String tip = tipAmount.getText().toString();
        tipPercent = Double.parseDouble(tip);
    }

    public void tenPercentTip(View v) {
        tipPercent = 10.00;
    }

    public void fifteenPercentTip(View v) {
        tipPercent = 15.00;
    }


    public void calculate (View v){

        String people = numPeople.getText().toString();
        numOfPeople = Integer.parseInt(people);

        String preTipAmount = cost.getText().toString();
        amountNoTip = Integer.parseInt(preTipAmount);

        totalTip = amountNoTip * (tipPercent *.01);
        total = amountNoTip + totalTip;
        totalPerPerson = total / numOfPeople;

        tipTotalTxt.setText(String.valueOf(totalTip));
        totalTxt.setText(String.valueOf(total));
        perPersonTxt.setText(String.valueOf(totalPerPerson));
    }

 //   public void inputAmount(View v) {
  //      String preTipAmount = amount.getText().toString();
 //       amountNoTip = Integer.parseInt(preTipAmount);
 //   }

    public void resetTips(View v)
    {
        tipPercent = 0;
    }

    private View.OnKeyListener mKeyListener = new View.OnKeyListener() {
        @Override
        public boolean onKey(View v, int keyCode, KeyEvent event) {

            switch (v.getId()) {
                case R.id.amount:

                case R.id.tipAmnt:

                case R.id.numPpl:

            }
            return false;
        }


    };
}
