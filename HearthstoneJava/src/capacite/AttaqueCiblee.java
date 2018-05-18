package capacite;

import jeu.HearthstoneException;

/**
 * AttaqueCiblee est une capacité qui permet à un sort ou à un serviteur d'infliger des dégâts à une cible
 * @author BIVER - ROUSSEL
 * @version 0.1.0
 * @see Capacite
 */

public class AttaqueCiblee extends Capacite {

	public AttaqueCiblee() {
		super("Attaque ciblee", "Permet à la carte qui la possède d'attaquer une cible, soit le héros, soit l'un de ses serviteurs. Cette capacité est sensible à la provocation.");
	}
	
	@Override
	public void executerEffetDebutTour() throws HearthstoneException {}

	@Override
	public void executerEffetFinTour() throws HearthstoneException {}

	@Override
	public void executerAction(Object cible) throws HearthstoneException {}

	@Override
	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {}

	@Override
	public void executerEffetDisparition(Object cible) throws HearthstoneException {}
}
