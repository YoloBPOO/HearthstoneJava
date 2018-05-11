package capacite;

import jeu.HearthstoneException;
import carte.*;
import jeu.*;

public class InvocationDeServiteurs extends Capacite {
	
	private int att, pdv;

	public InvocationDeServiteurs(int att,int pdv) {
		super("Invocation de serviteurs", "Crée automatiquement, au moment de sa mise en jeu, un nouveau serviteur.");
		this.setAtt(att);
		this.setPdv(pdv);
		
	}
	
	public void setPdv(int p) {
		this.pdv=p;
	}
	
	public void setAtt(int a) {
		this.att=a;
	}
	
	public int getPdv() {
		return this.pdv;
	}
	
	public int getAtt() {
		return this.att;
	}
	
	@Override
	public void executerEffetDebutTour() throws HearthstoneException {}

	@Override
	public void executerEffetFinTour() throws HearthstoneException {}

	@Override
	public void executerAction(Object cible) throws HearthstoneException {}

	@Override
	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {
		Serviteur s = new Serviteur("Invocation",0,((Joueur)cible),this.getPdv(),this.getAtt(),null);
	}

	@Override
	public void executerEffetDisparition(Object cible) throws HearthstoneException {}
}
