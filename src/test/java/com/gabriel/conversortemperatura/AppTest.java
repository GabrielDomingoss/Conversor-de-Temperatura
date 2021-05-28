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
	
    @BeforeEach
	public void setup() {
		conv = new Conversor(28);
	}
    
    @Test
    public void testeConversao() {
        conv.alterar();

        assertEquals(conv.getTemp().getTemperatura(), 82.40);
    }
}
