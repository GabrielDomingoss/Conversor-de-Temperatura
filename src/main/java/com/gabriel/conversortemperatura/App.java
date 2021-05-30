package com.gabriel.conversortemperatura;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {	
    	Scanner entrada = new Scanner(System.in);
    	System.out.println("Digite um valor em Celsius para converter para Fahrenheit: ");
    	int valor = entrada.nextInt();
		Conversor conv = new Conversor(valor);
		conv.alterar();
	}
}
