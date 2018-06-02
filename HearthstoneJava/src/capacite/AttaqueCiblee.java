package capacite;

import jeu.*;
import carte.*;

/**
 * AttaqueCiblee est une capacit� qui permet � un sort ou � un serviteur d'infliger des d�g�ts � une cible
 * @author BIVER - ROUSSEL
 * @version 0.1.0
 * @see Capacite
 */

public class AttaqueCiblee extends Attaque {

	public AttaqueCiblee(int d) {
		super("Attaque ciblee", "Permet � la carte qui la poss�de d'attaquer une cible, soit le h�ros, soit l'un de ses serviteurs. Cette capacit� est sensible � la provocation.", d);
	}
	
	@Override
	public void executerEffetDebutTour() throws HearthstoneException {}

	@Override
	public void executerEffetFinTour() throws HearthstoneException {}

	@Override
	public void executerAction(Object cible) throws HearthstoneException {
		if (cible == null)
			throw new HearthstoneException ("Aucune cible");
		
		if (cible instanceof Heros)
			((Heros) cible).setPdv(((Heros) cible).getPdv()-getDegat());
		else {
			((Serviteur) cible).setPdv(((Serviteur) cible).getPdv()-getDegat());
			if (((Serviteur) cible).disparait())
				((Serviteur) cible).getProprietaire().perdreCarte((ICarte) cible);
		}
	}
	

	@Override
	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {
		this.executerAction(cible);
	}

	@Override
	public void executerEffetDisparition(Object cible) throws HearthstoneException {}
}
