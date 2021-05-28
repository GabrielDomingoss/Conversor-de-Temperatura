package com.gabriel.conversortemperatura;

public class Temperatura {
	private double temperatura;

	public Temperatura(double temperatura){
		this.setTemperatura(temperatura);
	}
	
	public double getTemperatura(){
		return this.temperatura;
	}

	public void setTemperatura(double temperatura){
		this.temperatura = temperatura;
	}
}
