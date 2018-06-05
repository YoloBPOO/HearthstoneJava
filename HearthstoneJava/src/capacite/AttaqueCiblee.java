package capacite;

import jeu.*;
import carte.*;

/**
 * AttaqueCiblee est une capacité qui permet à un sort ou à un serviteur d'infliger des dégâts à une cible
 * @author ROUSSEL - BIVER
 * @version 0.9.0
 * @see capacite
 */

public class AttaqueCiblee extends Attaque {

	public AttaqueCiblee(int d) {
		super("Attaque ciblee", "Inflige "+d+" points de degat à une cible", d);
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
