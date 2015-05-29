
public class Piedra implements Peleable {

	@Override
	public Peleable vs(Peleable unPeleable) {
		
		return (this);
	}
	
	public Peleable vs(Papel unPapel){
		
		return (unPapel);
	}

}
