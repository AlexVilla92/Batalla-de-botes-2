
public class Singleton {
	
	private Peleable piedraUnica;
	private Peleable papelUnico;
	
     Singleton(){
		
		this.piedraUnica = new Piedra();
		this.papelUnico =  new Papel();
	}

	public Peleable getPiedra() {
		
		return (this.piedraUnica);
	}

	public Peleable getPapel() {
		
		return (this.papelUnico);
	}

}
