
public class Piedra implements Peleable {
	
	private static Piedra piedra = null; // variable de clase
	
	
    public static Piedra getPiedra(){ //metodo de clase
    	
    	if ( piedra == null ) {      //valido que solo haya
    		piedra = new Piedra();   // uno solo
    	}
    	return piedra;
    }
	
	private Piedra(){
	}

	@Override
	public Peleable vs(Peleable unPeleable) {
		
		return (this);
	}
	
	public Peleable vs(Papel unPapel){
		
		return (unPapel);
	}

}
