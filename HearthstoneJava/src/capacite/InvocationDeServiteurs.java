package capacite;
/**
* InvocationDeServiteur
* @author ROUSSEL - BIVER
* @version 0.9.0
* @see capacite
*/
import jeu.*;
import carte.*;

public class InvocationDeServiteurs extends Capacite {
	
	private int nb;
	private Serviteur serviteur;

	public InvocationDeServiteurs(String n, String d ,Serviteur serv, int nb) {
		super(n, d);
		this.setServ(serv);
		this.setNb(nb);
	}
	
	// getter
	
	public Serviteur getServ() {
		return this.serviteur;
	}
	
	public int getNb() {
		return this.nb;
	}

	// setter

	public void setServ(Serviteur serv) {
		this.serviteur=serv;
	}
	
	public void setNb(int n) {
		this.nb=n;
	}
	
	public void executerEffetDebutTour() throws HearthstoneException {}

	public void executerEffetFinTour() throws HearthstoneException {}

	public void executerAction(Object cible) throws HearthstoneException {
		int nb;
		IJoueur joue=Plateau.getInstance().getJoueurCourant();
		if (joue.getJeu().size()+getNb() > IJoueur.MAX_PLATEAU){
			nb= IJoueur.MAX_PLATEAU-joue.getJeu().size();
		}
		else {
			nb= getNb();;
		}
		
		for(int k=0; k<nb; k++) {
			joue.getJeu().add(new Serviteur(this.getServ()));
		}
	}

	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {
		this.executerAction(cible);
	}

	public void executerEffetDisparition(Object cible) throws HearthstoneException {}
}
