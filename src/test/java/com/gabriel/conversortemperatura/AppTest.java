package com.gabriel.conversortemperatura;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private Conversor conv;
	
    @Before
	public void setup() {
		conv = new Conversor(28);
	}
    
    @Test
    public void testeConvertendoDeCelsiusParaFahrenheit() {
        conv.alterar();

        assertEquals(conv.getTemp().getTemperatura(), 50.00);
    }
}
