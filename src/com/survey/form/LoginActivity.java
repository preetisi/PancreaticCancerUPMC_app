package com.survey.form;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity {
	String username,password;
	TextView user;
	TextView pass;
	private static String TAG= "Activity";
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);

		//TextView registerScreen = (TextView) findViewById(R.id.link_to_register);
		Button   LoginButton    = (Button)findViewById(R.id.btnLogin);
		user = (TextView) findViewById(R.id.Username);
		pass = (TextView) findViewById(R.id.password);



		/* Listening to register new account link
        registerScreen.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// Switching to Register screen
				Intent i = new Intent(getApplicationContext(), RegisterActivity.class);
				startActivity(i);
			}
		});*/

		// Listening to register new account link
		LoginButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				if(user == null && pass==null)
					Log.i(TAG,"Invalid user");
				
				if(user!=null && pass!=null)
				{	
					username = user.getText().toString();
					password = pass.getText().toString();

					Log.i(TAG, "username"+username);
					Log.i(TAG, "password"+password);
					
					if(username.equals("pt1") && password.equals("pt1"))
					{	
						// Switching to Register screen
						Intent i = new Intent(getApplicationContext(), MainActivity.class);
						startActivity(i);
					}
					else
					{
						//Invalid userId and password
						//Toast.makeText(context, text, duration);
					}
				}
			}
		});
	}
}