package carte;

import jeu.*;
import capacite.*;

public class Serviteur extends Carte {
	
	private boolean jouable;
	private int pdv, att;

	public Serviteur(String n, int c, IJoueur p, int pdv, int a, Capacite capacite) {
		super(n, c, p, capacite);
		this.setAtt(a);
		this.setPdv(pdv);
		this.setJouable(false);
	}
	
	public Serviteur(Serviteur serv)throws HearthstoneException {
		super(serv.getNom(), serv.getCout(), serv.getProprietaire(), serv.getCapacite());
		setAtt(serv.getPdv());
		setPdv(serv.getPdv());
}
	
	public void setPdv(int p) {
		this.pdv=p;
	}
	
	public void setAtt(int a) {
		this.att=a;
	}

	public void setJouable(boolean b) {
		this.jouable=b;
	}
	
	public int getPdv() {
		return this.pdv;
	}
	
	public int getAtt() {
		return this.att;
	}
	
	public boolean getJouable() {
		return this.jouable;
	}
	
	public String toString() {
		String s = "Serviteur [" + super.toString() + " || PDV : " + this.getPdv() + " || ATT : " + this.getAtt();
		if (this.getCapacite() != null)
			s+= this.getCapacite();
		if (getJouable())
			s+= " Peut attaquer";
		s+= "]\n";
		return s;
	}
	
	public boolean disparait() {
		return this.getPdv()<=0;
	}

	public void executerEffetDebutTour(Object cible) throws HearthstoneException {
		this.setJouable(true);
		if (this.getCapacite()!=null)
			this.getCapacite().executerEffetDebutTour();
	}

	public void executerEffetFinTour(Object cible) throws HearthstoneException {
		if (this.getCapacite()!=null)
			this.getCapacite().executerEffetFinTour();
	}

	public void executerEffetDebutMiseEnJeu(Object cible) throws HearthstoneException {
		if (this.getCapacite() instanceof Charge) 
			this.setJouable(true);
		this.getCapacite().executerEffetMiseEnJeu(cible);
	}

	public void executerEffetDisparition(Object cible) throws HearthstoneException {
		if (this.getCapacite()!=null) 
			this.getCapacite().executerEffetDisparition(cible);
	}

	public void executerAction(Object cible) throws HearthstoneException {
		if (cible == null) 
			throw new HearthstoneException("Aucune cible");
		
		Joueur adv=(Joueur) Plateau.getInstance().getAdversaire(Plateau.getInstance().getJoueurCourant());
		if(cible instanceof Heros) {
			if(adv.ProvocationEnJeu())
				throw new HearthstoneException("Vous pouvez seulement attaquer le serviteur avec provocation");
			else 
				((Heros) cible).setPdv(((Heros) cible).getPdv()-this.getPdv());
		}
		else {
			if(cible instanceof Serviteur) {
				if(adv.ProvocationEnJeu())
					if(!(((Serviteur) cible).getCapacite() instanceof Provocation))
						throw new HearthstoneException("Vous pouvez seulement attaquer le serviteur avec provocation");
				else {
					((Serviteur) cible).setPdv(((Serviteur) cible).getPdv()-this.getAtt());
					this.setPdv(this.getPdv()-((Serviteur) cible).getAtt());
				}
			}
			else throw new HearthstoneException("Cible d'attaque incorrecte ! ");
		}
	}
}
