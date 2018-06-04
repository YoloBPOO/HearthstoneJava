package capacite;

import carte.*;
import jeu.*;

public class InvocationDesChiens extends InvocationDeServiteurs {

	public InvocationDesChiens(IJoueur joueur) throws HearthstoneException{
		super("Lacher les chiens", "Invoque un chien 1/1 avec la capacite charge pour chaque serviteur sur le terrain adverse", new Serviteur("Chien", 1, joueur, 1, 1, new Charge()), 0);
}
	
	@Override
	public void executerEffetDebutTour() throws HearthstoneException {}

	@Override
	public void executerEffetFinTour() throws HearthstoneException {}

	@Override
	public void executerAction(Object cible) throws HearthstoneException {}

	@Override
	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {
		this.setNb( Plateau.getInstance().getAdversaire(((ICarte)cible).getProprietaire()).getJeu().size());
		super.executerAction(cible);
	}

	@Override
	public void executerEffetDisparition(Object cible) throws HearthstoneException {}
}
