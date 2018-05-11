package capacite;

import carte.Serviteur;
import jeu.HearthstoneException;
import jeu.Joueur;

public class InvocationDesChiens extends Capacite {

	public InvocationDesChiens() {
		super("Invocation des chiens", "Lorsqu'une carte possédant cette capacité est mise en jeu, des serviteurs chiens sont créés. Il y a autant de chiens que le joueur adverse a de serviteurs. Un chien est un serviteur +1/+1 avec \"Charge\".");
	}
	
	@Override
	public void executerEffetDebutTour() throws HearthstoneException {}

	@Override
	public void executerEffetFinTour() throws HearthstoneException {}

	@Override
	public void executerAction(Object cible) throws HearthstoneException {}

	@Override
	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {
		Charge c = new Charge();
		Serviteur s = new Serviteur("Chien",0,((Joueur)cible),1,1,c);
	}

	@Override
	public void executerEffetDisparition(Object cible) throws HearthstoneException {}
}
