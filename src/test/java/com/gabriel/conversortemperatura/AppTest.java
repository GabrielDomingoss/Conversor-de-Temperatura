package com.gabriel.conversortemperatura;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private Conversor conv;
    private Conversor conv2;
    private Conversor conv3;
	
    @BeforeEach
	public void setup() {
		conv = new Conversor(28);
		conv2 = new Conversor(55);
		conv3 = new Conversor(40);
		
	}
    
    @Test
    public void testeConversao1() {
    	System.out.printf("Temperatura em Celsius: %.2f \n", conv.getTemp().getTemperatura());
        conv.alterar();
        double resultado1;
        resultado1 = conv.getTemp().getTemperatura();
        assertEquals(resultado1, 82.40);
    }
    @Test
    public void testeConversao2() {
    	System.out.printf("Temperatura em Celsius: %.2f \n", conv2.getTemp().getTemperatura());
        conv2.alterar();
        double resultado2;
        resultado2 = conv2.getTemp().getTemperatura();
        assertEquals(resultado2, 131.00);
    }
    @Test
    public void testeConversao3() {
    	System.out.printf("Temperatura em Celsius: %.2f \n", conv3.getTemp().getTemperatura());
        conv3.alterar();
        double resultado3;
        resultado3 = conv3.getTemp().getTemperatura();
        assertEquals(resultado3, 104.00);
    }
}
