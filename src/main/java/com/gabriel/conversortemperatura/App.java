package com.gabriel.conversortemperatura;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner entrada = new Scanner(System.in);
		double celsius, fahrenheit;
		
		System.out.println("Digite uma temperatura em Celsius para converter para Fahrenheit: ");
		celsius = entrada.nextDouble();
		fahrenheit=(celsius*1.8)+32;

		System.out.println(celsius+"C e equivalente a " + fahrenheit + "F\n");
    }
}
