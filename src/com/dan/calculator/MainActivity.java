package com.dan.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	
	TextView textResult;
	
	Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine,
	btnAdd, btnSubtract, btnMultiply, btnEqual, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Find the text view that displays entered numbers / result
        textResult = (TextView) findViewById(R.id.numberDisplay);
        textResult.setText("");
        
        //Find the buttons
        btnZero = (Button) findViewById(R.id.zero);
        btnOne = (Button) findViewById(R.id.one);
        btnTwo = (Button) findViewById(R.id.two);
        btnThree = (Button) findViewById(R.id.three);
        btnFour = (Button) findViewById(R.id.four);
        btnFive = (Button) findViewById(R.id.five);
        btnSix = (Button) findViewById(R.id.six);
        btnSeven = (Button) findViewById(R.id.seven);
        btnEight = (Button) findViewById(R.id.eight);
        btnNine = (Button) findViewById(R.id.nine);
        
        btnAdd = (Button) findViewById(R.id.add);
        btnSubtract = (Button) findViewById(R.id.subtract);
        btnMultiply = (Button) findViewById(R.id.multiply);
        btnEqual = (Button) findViewById(R.id.equal);
        btnClear = (Button) findViewById(R.id.clear);
        
        //Set click listeners to the buttons
        btnZero.setOnClickListener(this);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        
        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.zero:
			String leadingZeroCheck = textResult.getText().toString();
			if(leadingZeroCheck != null && !leadingZeroCheck.isEmpty()) {
				textResult.append("0");
				break;
			}
			else {
				break;
			}
		case R.id.one:
			textResult.append("1");
			break;
		case R.id.two:
			textResult.append("2");
			break;
		case R.id.three:
			textResult.append("3");
			break;
		case R.id.four:
			textResult.append("4");
			break;
		case R.id.five:
			textResult.append("5");
			break;
		case R.id.six:
			textResult.append("6");
			break;
		case R.id.seven:
			textResult.append("7");
			break;
		case R.id.eight:
			textResult.append("8");
			break;
		case R.id.nine:
			textResult.append("9");
			break;
		case R.id.add:
			break;
		case R.id.subtract:
			break;
		case R.id.multiply:
			break;
		case R.id.divide:
			break;
		case R.id.clear:
			textResult.setText("");
			break;
		}
	}
}
