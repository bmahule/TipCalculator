package com.example.tipcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TipCalculator extends Activity {
	private EditText billAmount;
	private EditText tipPercentage;
	private EditText numOfPeople;
	private EditText totalTip;
	private TextView lblTip;
	private TextView lblTipPerPerson;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tip_calculator);
		billAmount = (EditText) findViewById(R.id.etBill);
		tipPercentage = (EditText) findViewById(R.id.etTipPrctg);
		numOfPeople = (EditText) findViewById(R.id.etNoPeople);
		lblTip = (TextView) findViewById(R.id.etTotalTip);
		lblTipPerPerson = (TextView) findViewById(R.id.etTipPerHead);
	}
	
	public void onCalculate(View v) {
		Double billAmt = Double.parseDouble(billAmount.getText().toString());
		Double tipPrctg = Double.parseDouble(tipPercentage.getText().toString());
		Double numPeople = Double.parseDouble(numOfPeople.getText().toString());
		
		Double totalTip = ((billAmt * tipPrctg) / 100);
		Double tipPerPerson = (totalTip / numPeople);
		
		//Toast.makeText(this, billAmount1.toString(), Toast.LENGTH_LONG).show();
		lblTip.setText(totalTip.toString());
		lblTipPerPerson.setText(tipPerPerson.toString());
		
	}

}
