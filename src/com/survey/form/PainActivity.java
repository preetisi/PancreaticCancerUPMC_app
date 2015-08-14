package com.survey.form;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class PainActivity extends Activity {

	SeekBar seekbar,seekbar1;
	TextView value,value1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pain);
		
		Button   contButton    = (Button)findViewById(R.id.submit);
        
        // Listening to register new account link
        contButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// Switching to Register screen
				
				Intent i = new Intent(getApplicationContext(), ResultActivity.class);
				startActivity(i);
			}
		});		
		value = (TextView) findViewById(R.id.textview);
		seekbar = (SeekBar) findViewById(R.id.seekBar1);

		seekbar.setOnSeekBarChangeListener( new OnSeekBarChangeListener()
		{
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser)
			{
				// TODO Auto-generated method stub
				if(progress == 0)
				{
					value.setText("Less Pain");
				}
				else if(progress >= 10 && progress < 20)
				{
					value.setText("Hurts Little Bit");
				}	
				else if(progress >= 20 && progress < 40)
				{
					value.setText("Hurts Little More");
				}
				else if(progress >= 40 && progress < 60)
				{
					value.setText("Hurts Even More");
				}
				else if(progress >= 60 && progress < 80)
				{
					value.setText("Hurts Whole Lot");
				}
				else if(progress >= 80 && progress <=100)
				{
					value.setText("Hurts Worst");
				}
					
			}

			public void onStartTrackingTouch(SeekBar seekBar)
			{
				// TODO Auto-generated method stub
			}

			public void onStopTrackingTouch(SeekBar seekBar)
			{
				// TODO Auto-generated method stub
			}
		});
		
		value1 = (TextView) findViewById(R.id.textview1);
		seekbar1 = (SeekBar) findViewById(R.id.seekBar2);

		seekbar1.setOnSeekBarChangeListener( new OnSeekBarChangeListener()
		{
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser)
			{
				// TODO Auto-generated method stub
				if(progress == 0)
				{
					value1.setText("Less Pain");
				}
				else if(progress >= 10 && progress < 20)
				{
					value1.setText("Hurts Little Bit");
				}	
				else if(progress >= 20 && progress < 40)
				{
					value1.setText("Hurts Little More");
				}
				else if(progress >= 40 && progress < 60)
				{
					value1.setText("Hurts Even More");
				}
				else if(progress >= 60 && progress < 80)
				{
					value1.setText("Hurts Whole Lot");
				}
				else if(progress >= 80 && progress <=100)
				{
					value1.setText("Hurts Worst");
				}
							
			}

			public void onStartTrackingTouch(SeekBar seekBar)
			{
				// TODO Auto-generated method stub
			}

			public void onStopTrackingTouch(SeekBar seekBar)
			{
				// TODO Auto-generated method stub
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pain, menu);
		return true;
	}

}
