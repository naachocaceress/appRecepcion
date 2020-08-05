package com.example.vidon1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class Mesas extends View implements OnTouchListener {
private String letra = "G1";
private String luz="verde";

public Mesas(Context context, AttributeSet attrs) {
super(context, attrs);
this.setOnTouchListener(this);
}

@Override
protected void onDraw(Canvas canvas) {
// TODO Auto-generated method stub
super.onDraw(canvas);
int ancho = getWidth();
int alto = getHeight();

Paint pincel2=new Paint();

Paint pincel1=new Paint();
pincel1.setARGB(255, 0, 0, 0);

Paint p = new Paint();
canvas.drawRGB(0, 190, 0); //COLOR VERDE DE FONDO
//canvas.drawCircle(ancho * 0.50f, alto * 0.50f, ancho * 0.50f, p);


Paint p2 = new Paint();
p2.setARGB(255, 0, 0, 0); //COLOR DE LETRAS
p2.setTextSize(ancho*0.50f);
canvas.drawText(letra, ancho * 0.4f, alto * 0.60f, p2);



if (luz.equals("rojo"))
	canvas.drawRGB(250, 0, 0);

if (luz.equals("verde"))
	canvas.drawRGB(0, 190, 0);
}

@Override
public boolean onTouch(View arg0, MotionEvent arg1) {
// TODO Auto-generated method stub
	if (luz.equals("verde"))
		luz="rojo";
		else
		if (luz.equals("rojo"))
		luz="verde";
this.invalidate();
return false;
}
}