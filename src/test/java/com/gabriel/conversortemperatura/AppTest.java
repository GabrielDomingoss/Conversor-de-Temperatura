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
    public void testeConversao() {
        conv.alterar();
        conv2.alterar();
        conv3.alterar();
        double resultado1,resultado2,resultado3;
        resultado1 = conv.getTemp().getTemperatura();
        resultado2 = conv2.getTemp().getTemperatura();
        resultado3 = conv3.getTemp().getTemperatura();
        assertEquals(resultado1, 82.40);
        assertEquals(resultado2, 131.00);
        assertEquals(resultado3, 104.00);
    }
}
