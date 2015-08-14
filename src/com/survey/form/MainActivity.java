package com.survey.form;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.Layout;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Spinner spinner2;
	private LinearLayout empStatus;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/*EditText   text1=(EditText)findViewById(R.id.editText1);
		
				if(text1.toString().equals("abc"))
				{
					LinearLayout one = (LinearLayout) findViewById(R.id.linearLayout2);
					one.setVisibility(View.GONE);
								
				}	
		LinearLayout one = (LinearLayout) findViewById(R.id.linearLayout1);
		one.setVisibility(View.GONE);*/

		empStatus = (LinearLayout)findViewById(R.id.linearLayout9);
		empStatus.setVisibility(View.GONE);
		
		addListenerOnSpinnerItemSelection();
		
        Button   contButton    = (Button)findViewById(R.id.btnContinue);
        
        // Listening to register new account link
        contButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// Switching to Register screen
				Intent i = new Intent(getApplicationContext(), AlcoholActivity.class);
				startActivity(i);
			}
		});
		
	}
	
    public void addListenerOnSpinnerItemSelection(){
		
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		//spinner2.setOnItemSelectedListener(new CustomOnItemSelectedListener());
		
		spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

		  public void onItemSelected(AdapterView<?> parent, View selectedItemView, int pos, long id) 
		  {
		    	
		    	Toast.makeText(parent.getContext(), 
						"OnItemSelectedListener : " + parent.getItemAtPosition(pos).toString(),
						Toast.LENGTH_SHORT).show();
		    	
		    	if(parent.getItemAtPosition(pos).equals("Other"))
		    	{
		    		empStatus.setVisibility(View.VISIBLE);
		    	}
		    	else
		    	{
		    		empStatus.setVisibility(View.GONE);
		    	}
		    }

		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
			
		}

		    

		});
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
