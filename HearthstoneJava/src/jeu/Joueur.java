package jeu;

import java.util.ArrayList;

import carte.ICarte;

public class Joueur implements IJoueur {
	
	// Attributs
	
	private Heros hero;
	private String pseudo;
	private int mana;
	private int stockMana;
	
	// Constructeur

	public Joueur(Heros h, String p, int m, int ms) {
		setHeros(h);
		setPseudo(p);
		setMana(m);
		setMs(ms);
	}
	
	// Setters

	public void setMs(int ms) {
		this.stockMana=ms;		
	}

	public void setMana(int m) {
		this.mana=m;
	}

	public void setPseudo(String p) {
		this.pseudo=p;
	}

	public void setHeros(Heros h) {
		this.hero=h;
	}

	
	// Getters
	
	
	public Heros getHeros() {
		return hero;
	}

	public String getPseudo() {
		return pseudo;
	}

	public int getMana() {
		return mana;
	}

	public int getStockMana() {
		return stockMana;
	}
	
	// M�thodes

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
