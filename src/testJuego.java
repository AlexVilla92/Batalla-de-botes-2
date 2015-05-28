import  org.junit.Assert;

import org.junit.Test;


public class testJuego {
	
	private Peleable piedra;
	private Peleable papel;
	private Peleable tijera;
	
	Singleton single = new Singleton();

	@Test
	public void testJuego() {
		
		Peleable otraPiedra = single.getPiedra();
		piedra = single.getPiedra();
		
		Assert.assertEquals(piedra,otraPiedra);
		
	}

}
