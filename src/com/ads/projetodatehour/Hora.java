package com.ads.projetodatehour;

import java.util.GregorianCalendar;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

/**
 * 
 * @authores:
 * Daniel Nazareth Farias ----------201301895008
 * Dioni da Silva Pinho ------------201301181251
 * Natanny Pessanha dos Santos -----201301106372
 * 
 */

public class Hora extends Activity {

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_hora);
        
        
        GregorianCalendar calendario = new GregorianCalendar();
        
        int h = calendario.get(GregorianCalendar.HOUR_OF_DAY);
        int m = calendario.get(GregorianCalendar.MINUTE);
        int s = calendario.get(GregorianCalendar.SECOND);
        
        final TextView relogio = (TextView)findViewById(R.id.hora1);
        relogio.setTextSize(50);
        relogio.setText(h+":"+m+":"+s+s);
        
        GregorianCalendar datas = new GregorianCalendar();

        int dia = datas.get(GregorianCalendar.DAY_OF_MONTH);
        int mes = datas.get(GregorianCalendar.MONTH);
        int ano = datas.get(GregorianCalendar.YEAR);

        
        
        
        final TextView Date = (TextView)findViewById(R.id.Date1);
        Date.setTextSize(30);
        Date.setText(dia+"/"+mes+"/"+ano);
        
  

	
	final Handler atualizador = new Handler();
	atualizador.post(new Runnable() {
	  
		
			
		@Override
	    public void run() {
	        atualizaHora(relogio);
	        atualizador.postDelayed(this, 100);
	    }
	});
	}

	public void atualizaHora(TextView relogio) {
	    GregorianCalendar calendario = new GregorianCalendar();

	    int h = calendario.get(GregorianCalendar.HOUR_OF_DAY);
	    int m = calendario.get(GregorianCalendar.MINUTE);
	    int s = calendario.get(GregorianCalendar.SECOND);

	    relogio.setText(h+":"+m+":"+s);
	}



	
}

