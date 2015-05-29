import  org.junit.Assert;

import org.junit.Test;


public class testJuego {
	
	private Peleable piedra;
	private Peleable papel;
	private Peleable tijera;
	
	Singleton single = new Singleton();

	@Test
	public void testPiedraContraPiedra() {
		
		Peleable otraPiedra = single.getPiedra();
		piedra = single.getPiedra();
		
		Assert.assertEquals(piedra,otraPiedra);
		
	}
	
	@Test
	public void testPiedraContraPapel() {
		
		papel = single.getPapel();
		piedra = single.getPiedra();
		
		Assert.assertEquals(papel,piedra.vs(papel));
		
	}

}
