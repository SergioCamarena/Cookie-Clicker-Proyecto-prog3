package code;

import java.util.Timer;
import java.util.TimerTask;

public class Cookie {
	private int clickCookie;
	private double valorCookie;
	
	//constructor
	public Cookie(int clickCookie, int valorCookie) {
		super();
		this.clickCookie = clickCookie;
		this.valorCookie = valorCookie;
	}
	
	//getters y setters

	public int getClickCookie() {
		return clickCookie;
	}

	public void setClickCookie(int clickCookie) {
		this.clickCookie = clickCookie;
	}

	public double getValorCookie() {
		return valorCookie;
	}

	public void setValorCookie(int valorCookie) {
		this.valorCookie = valorCookie;
	}
	
	//metodo suma de valor
	public void sumaValor() {
		
		//incrementar un 30% al valor de cookie
		valorCookie = valorCookie * 0.3;
		
		//Incrementar cada 30 segundos
		TimerTask timerTask = new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				sumaValor();
			}
			
		};
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(timerTask, 0, 30);
	}

}
