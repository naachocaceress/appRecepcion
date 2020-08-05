package com.example.vidon1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Contador extends Activity {

	TextView tv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contador);
		tv=(TextView)findViewById(R.id.textView1);
	}
	
	public void salir(View v){
		finish();
	}
	
	public void mas (View v){
		
	}
	
	public void menos (View v){
		
	}

}
