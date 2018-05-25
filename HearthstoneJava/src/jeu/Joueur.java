package jeu;

import java.util.ArrayList;
import java.util.Collections;

import capacite.AttaqueCiblee;
import capacite.AttaqueTotale;
import capacite.BouleDeFeu;
import capacite.Charge;
import capacite.EffetPermanent;
import capacite.FlecheDuChasseur;
import capacite.InvocationDeServiteurs;
import capacite.Pioche;
import capacite.Provocation;
import carte.Carte;
import carte.ICarte;
import carte.Serviteur;
import carte.Sort;

public class Joueur implements IJoueur {
	
	// Attributs
	
	private Heros hero;
	private String pseudo;
	private int mana;
	private int stockMana;
	ArrayList<ICarte> deck = new ArrayList<ICarte>();
	ArrayList<ICarte> main = new ArrayList<ICarte>();
	ArrayList<ICarte> jeu = new ArrayList<ICarte>();
	
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
	
	// MÈthodes
	
	public void creationDeck() {
		InvocationDeServiteurs ids = new InvocationDeServiteurs(1,1);
		Serviteur cmm = new Serviteur("Chasse-mar√©e murloc", 2, null, 1, 2, ids);
		deck.add(cmm);
		
		EffetPermanent ep = new EffetPermanent(1,1);
		Serviteur cdh = new Serviteur("Champion de Hurlevent", 7, null, 6, 6, ep);
		deck.add(cdh);

		EffetPermanent epe = new EffetPermanent(0,1);
		Serviteur cdr = new Serviteur("Chef de raid", 3, null, 2, 2, epe);
		deck.add(cdr);
		
		Provocation p = new Provocation();
		Serviteur gbb = new Serviteur("Garde de Baie-du-butin", 5, null, 4, 5, p);
		deck.add(gbb);
		
		Charge c = new Charge();
		Serviteur lmt = new Serviteur("La missiliere temeraire", 6, null, 2, 5, c);
		deck.add(lmt);
		
		Serviteur om = new Serviteur("L'ogre-magi", 4, null, 4, 4, p);
		deck.add(om);
		
		Serviteur am = new Serviteur("Archimage", 6, null, 7, 4, p);
		deck.add(am);
		
		Serviteur gl = new Serviteur("Gnome lepreux", 1, null, 1, 1, p);
		deck.add(gl);
		
		Serviteur gm = new Serviteur("Golem des moissons", 3, null, 3, 2, p);
		deck.add(gm);
		
		Pioche pio1 = new Pioche(1);
		Serviteur ba = new Serviteur("Busard affame", 5, null, 2, 3, pio1);
		deck.add(ba);
		
		Sort ch = new Sort("Charge", 1, null, c);
		deck.add(ch);
		
		AttaqueCiblee ac = new AttaqueCiblee();
		Sort attm = new Sort("Attaque mentale", 2, null, ac);
		deck.add(attm);
		
		AttaqueTotale at = new AttaqueTotale();
		Sort cdf = new Sort("Choc de flamme", 7, null, at);
		deck.add(cdf);
		
		Sort edg = new Sort("Eclair de givre", 2, null, ac);
		deck.add(edg);
		
		Pioche pio2 = new Pioche(2);
		Sort ida = new Sort("Intelligence des arcanes", 2, null, pio2);
		deck.add(ida);
		
		Sort im = new Sort("Image mirroir", 1, null, pio1); // invocation de monstre A FAIRE !!!!!!!!!!!!
		deck.add(im);
		
		Sort epy = new Sort("Explosion pyrotechnique", 10, null, ac);
		deck.add(epy);
		
		Sort mdc = new Sort("Marque du chasseur", 1, null, ac );  // abaisse les pdv a 1  A FAIRE !!!!!!!!!!!
		deck.add(mdc);
		
		Sort tda = new Sort("Tir des arcanes", 1, null, ac);
		deck.add(tda);
		
		Sort llc = new Sort("Lacher les chiens", 3, null, p); // invocation de monstre A FAIRE !!!!!!!!!!!!
		deck.add(llc);
		
		Sort odt = new Sort("Ordre de tuer", 3, null, ac);
		deck.add(odt);
	}
		
	
	public ArrayList<ICarte> getMain() {
		return main;
	}
	public int size() {
		return main.size();
	}

	public ArrayList<ICarte> getJeu() {
		return jeu;
	}
	
	public ArrayList<ICarte> getDeck() {
		return deck;
	}

	public ICarte getCarteEnJeu(String nomCarte){
		for (ICarte carte : jeu) {
			if(jeu.contains(nomCarte)){
			    return carte;
			}
		}
		return null;
	}

	public ICarte getCarteEnMain(String nomCarteMain) {
		for (ICarte carte : main) {
			if(main.contains(nomCarteMain)){
			    return carte;
			}
		}
		return null;
	}

	public void prendreTour() throws HearthstoneException {
		this.stockMana += 1; 
		this.mana = this.stockMana;
	}

	@Override
	public void finirTour() throws HearthstoneException {
		
	}

	public void melanger() {
		Collections.shuffle(deck);
	}
	
	@Override
	public void piocher() throws HearthstoneException {
		this.main.add(this.deck.get(0));
		this.deck.remove(0);
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
