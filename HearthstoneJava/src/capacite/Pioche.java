package capacite;
/**
* Pioche : pioche une ou plusieurs carte dans le deck pour les mettrent dans la main  
* @author ROUSSEL - BIVER
* @version 0.9.0
* @see capacite
*/
import jeu.HearthstoneException;
import carte.ICarte;

public class Pioche extends Capacite {
	
	private int nbr;

	public Pioche(int nb) {
		super("Pioche", "Pioche "+nb+" carte");
		setNbr(nb);
	}
	
	// setter 
	
	public void setNbr(int n) {
		this.nbr=n;
	}
	
	// getter
	
	public int getNbr() {
		return this.nbr;
	}
	
	// methode
	
	public void executerEffetDebutTour() throws HearthstoneException {}

	public void executerEffetFinTour() throws HearthstoneException {}

	public void executerAction(Object cible) throws HearthstoneException {
		for(int i = 0; i < this.nbr; i++) {
			((ICarte) cible).getProprietaire().piocher();
		}
	}

	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {
		this.executerAction(cible);
	}

	public void executerEffetDisparition(Object cible) throws HearthstoneException {}

}
