package jeu;

import java.util.ArrayList;

public class Joueur implements IJoueur {

	@Override
	public Heros getHeros() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPseudo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMana() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getStockMana() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<ICarte> getMain() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ICarte> getJeu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICarte getCarteEnJeu(String nomCarte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICarte getCarteEnMain(String nomCarteMain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void prendreTour() throws HearthstoneException {
		// TODO Auto-generated method stub

	}

	@Override
	public void finirTour() throws HearthstoneException {
		// TODO Auto-generated method stub

	}

	@Override
	public void piocher() throws HearthstoneException {
		// TODO Auto-generated method stub

	}

	@Override
	public void jouerCarte(ICarte carte) throws HearthstoneException {
		// TODO Auto-generated method stub

	}

	@Override
	public void jouerCarte(ICarte carte, Object cible) throws HearthstoneException {
		// TODO Auto-generated method stub

	}

	@Override
	public void utiliserCarte(ICarte carte, Object cible) throws HearthstoneException {
		// TODO Auto-generated method stub

	}

	@Override
	public void utiliserPouvoir(Object cible) throws HearthstoneException {
		// TODO Auto-generated method stub

	}

	@Override
	public void perdreCarte(ICarte carte) throws HearthstoneException {
		// TODO Auto-generated method stub

	}

}
