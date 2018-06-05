package capacite;
/**
* Attaque
* @author ROUSSEL - BIVER
* @version 0.9.0
* @see capacite
*/
public abstract class Attaque extends Capacite {
	private int degat;
	
	public Attaque(String n, String d, int degat) {
		super(n,d);
		this.setDegat(degat);
	}
	
	public int getDegat() {
		return this.degat;
	}
	
	public void setDegat (int d) {
		this.degat = d;
	}
}
