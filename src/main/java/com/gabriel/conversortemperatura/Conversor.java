package com.gabriel.conversortemperatura;

public class Conversor {
	private Temperatura temp;

	public Conversor(double temperatura) {
		this.temp = new Temperatura(temperatura);
		System.out.printf("Temperatura em Celsius: %.2f \n", this.getTemp().getTemperatura());
	}

	public Temperatura getTemp(){
		return this.temp;
	}

	public void conversao(){
		double celsius, fahrenheit;

		celsius = this.getTemp().getTemperatura();
		fahrenheit = (celsius*1.8)+32.0;

		this.getTemp().setTemperatura(fahrenheit);
		System.out.printf(celsius+"°C é equivalente à %.2f°F", this.getTemp().getTemperatura());
	}

	public void alterar(){
		System.out.println("Aguarde...");
		this.conversao();
	}
}
