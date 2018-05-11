package capacite;

import jeu.HearthstoneException;

public class InvocationDeServiteurs extends Capacite {
	
	private int att, pdv;

	public InvocationDeServiteurs() {
		super("Invocation de serviteurs", "Crée automatiquement, au moment de sa mise en jeu, un nouveau serviteur.");
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
