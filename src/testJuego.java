import  org.junit.Assert;
import org.junit.Test;


public class testJuego {
	
//	private Peleable piedra;
	private Peleable papel;
	@SuppressWarnings("unused")
	private Peleable tijera;
	
	Singleton single = new Singleton();

	public void testPiedraContraPiedra() {
		
		//Peleable otraPiedra = single.getPiedra();
		//piedra = single.getPiedra();
		//ndedkwekdwjkdjk
		Peleable otraPiedra = /* fhfhf*/Piedra.getPiedra();
		Assert.assertEquals(otraPiedra,otraPiedra);
		
	}
	
	@Test
	public void testPiedraContraPapel() {
		
	//	papel = single.getPapel();
	//	piedra = single.getPiedra();
		Piedra piedra = Piedra.getPiedra();
		Assert.assertEquals(papel,piedra.vs(papel));
		
	}
	@Test
	public void testPapelContraPiedra() {
		
		papel = single.getPapel();
		Peleable piedra = Piedra.getPiedra(); //metodo de clase
		
		Assert.assertEquals(papel,papel.vs(piedra));
		
	}
}
