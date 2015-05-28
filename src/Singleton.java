
public class Singleton {
	
	private Peleable piedraUnica;
	
	public Singleton(){
		
		this.piedraUnica = new Piedra();
	}

	public Peleable getPiedra() {
		
		return (this.piedraUnica);
	}
	
	

}
