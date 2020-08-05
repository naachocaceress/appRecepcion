package com.example.vidon1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends Activity {
	ViewPager viewpager1;
	RelativeLayout activity_mesas_patio;
	RelativeLayout activity_mesas_cuadros;
	RelativeLayout activity_mesas_juegos;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		viewpager1 = (ViewPager) findViewById(R.id.view);
        viewpager1.setAdapter(new MainPageAdapter()); 
		
	}
	
	/*public void ingresar (View v){
		EditText et1 = (EditText) pagina3.findViewById(R.id.editText1); //INDICAR EN QUE PAGINA ESTA
        Toast.makeText(this, et1.getText().toString(), Toast.LENGTH_LONG).show(); 
        viewpager1.setCurrentItem(0);	
	}*/
	
	public void contador (View v){
		Intent intento= new Intent(this, Contador.class);
		startActivity(intento);
	}
	
	//ESTO VA SIEMPRE ASI
	 class MainPageAdapter extends PagerAdapter {

         @Override
         public int getCount() {
                 return 3; //LA CANTIDAD DE PAGINA QUE HAY
         }

         @Override
         public Object instantiateItem(ViewGroup collection, int position) { //ANALISA LA POSICION EN QUE ESTAN LAS PAGINAS
                 View page = null;
                 switch (position) {
                 case 0:
                         if (activity_mesas_patio == null) {
                        	 activity_mesas_patio = (RelativeLayout) LayoutInflater.from(
                                                 MainActivity.this).inflate(R.layout.activity_mesas_patio, null);

                         }
                         page = activity_mesas_patio;
                         break;
                 case 1:
                         if (activity_mesas_cuadros == null) {
                        	 activity_mesas_cuadros = (RelativeLayout) LayoutInflater.from(
                                                 MainActivity.this).inflate(R.layout.activity_mesas_cuadros, null);

                         }
                         page = activity_mesas_cuadros;
                         break;
                 case 2:
                         if (activity_mesas_juegos == null) {
                        	 activity_mesas_juegos = (RelativeLayout) LayoutInflater.from(
                                                 MainActivity.this).inflate(R.layout.activity_mesas_juegos, null);

                         }
                         page = activity_mesas_juegos;
                         break;
                 }
                 ((ViewPager) collection).addView(page, 0);
                 return page;
         }

         @Override
         public boolean isViewFromObject(View view, Object object) {
                 return view == object;
         }

         @Override
         public void destroyItem(View collection, int position, Object view) {
                 ((ViewPager) collection).removeView((View) view);
         }
  }
 //-----------------
}