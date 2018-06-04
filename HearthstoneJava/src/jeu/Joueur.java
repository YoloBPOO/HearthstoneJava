package jeu;

import java.util.ArrayList;
import java.util.Collections;
import capacite.*;
import carte.*;


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
	
	// Méthodes
	
	public void creationDeckMage(IJoueur joueur) throws HearthstoneException  {
		Serviteur cmm = new Serviteur("Chasse-maree murloc", 2, joueur, 1, 2,new InvocationDeServiteurs("Murloc","",new Serviteur("Murloc",0,joueur,1,1,null),1));
		deck.add(cmm);

		Serviteur cdh = new Serviteur("Champion de Hurlevent", 7, joueur, 6, 6,new EffetPermanent(1,1));
		deck.add(cdh);

		Serviteur cdr = new Serviteur("Chef de raid", 3, joueur, 2, 2, new EffetPermanent(0,1));
		deck.add(cdr);
		
		Provocation p = new Provocation();
		Serviteur gbb = new Serviteur("Garde de Baie-du-butin", 5, joueur, 4, 5, p);
		deck.add(gbb);
		
		Charge c = new Charge();
		Serviteur lmt = new Serviteur("La missiliere temeraire", 6, joueur, 2, 5, c);
		deck.add(lmt);
		
		Serviteur om = new Serviteur("L'ogre-magi", 4, joueur, 4, 4, p);
		deck.add(om);
		
		Serviteur am = new Serviteur("Archimage", 6, joueur, 7, 4, p);
		deck.add(am);
		
		Serviteur gl = new Serviteur("Gnome lepreux", 1, joueur, 1, 1, new Lepre());
		deck.add(gl);
		
		Serviteur gm = new Serviteur("Golem des moissons", 3, joueur, 3, 2, new Golemisation(joueur));
		deck.add(gm);
		
		Sort ch = new Sort("Charge", 1, joueur, c);
		deck.add(ch);
		
		Sort attm = new Sort("Attaque mentale", 2, joueur, new AttaqueCiblee(2));
		deck.add(attm);
		
		Sort cdf = new Sort("Choc de flamme", 7, joueur, new AttaqueTotale(4));
		deck.add(cdf);
		
		Sort edg = new Sort("Eclair de givre", 2, joueur, new AttaqueCiblee(3));
		deck.add(edg);
		
		Sort ida = new Sort("Intelligence des arcanes", 2, joueur, new Pioche(2));
		deck.add(ida);
		
		Sort im = new Sort("Image mirroir", 1, joueur, new ImageMirroir(joueur));
		deck.add(im);
		
		Sort epy = new Sort("Explosion pyrotechnique", 10, joueur, new AttaqueCiblee(10));
		deck.add(epy);
	}
	
	public void creationDeckChasseur(IJoueur joueur) throws HearthstoneException {
		Serviteur cmm = new Serviteur("Chasse-maree murloc", 2, joueur, 1, 2,new InvocationDeServiteurs("Murloc","",new Serviteur("Murloc",0,joueur,1,1,null),1));
		deck.add(cmm);

		Serviteur cdh = new Serviteur("Champion de Hurlevent", 7, joueur, 6, 6,new EffetPermanent(1,1));
		deck.add(cdh);

		Serviteur cdr = new Serviteur("Chef de raid", 3, joueur, 2, 2, new EffetPermanent(0,1));
		deck.add(cdr);
		
		Provocation p = new Provocation();
		Serviteur gbb = new Serviteur("Garde de Baie-du-butin", 5, joueur, 4, 5, p);
		deck.add(gbb);
		
		Charge c = new Charge();
		Serviteur lmt = new Serviteur("La missiliere temeraire", 6, joueur, 2, 5, c);
		deck.add(lmt);
		
		Serviteur om = new Serviteur("L'ogre-magi", 4, joueur, 4, 4, p);
		deck.add(om);
		
		Serviteur am = new Serviteur("Archimage", 6, joueur, 7, 4, p);
		deck.add(am);
		
		Serviteur gl = new Serviteur("Gnome lepreux", 1, joueur, 1, 1, new Lepre());
		deck.add(gl);
		
		Serviteur gm = new Serviteur("Golem des moissons", 3, joueur, 3, 2, new Golemisation(joueur));
		deck.add(gm);
		
		Sort ch = new Sort("Charge", 1, joueur, c);
		deck.add(ch);
		
		Sort attm = new Sort("Attaque mentale", 2, joueur, new AttaqueCiblee(2));
		deck.add(attm);
		
		Sort mdc = new Sort("Marque du chasseur", 1, joueur, new MarqueDuChasseur());
		deck.add(mdc);
		
		Sort tda = new Sort("Tir des arcanes", 1, joueur, new AttaqueCiblee(2));
		deck.add(tda);
		
		Sort llc = new Sort("Lacher les chiens", 3, joueur, new InvocationDesChiens(joueur));
		deck.add(llc);
		
		Sort odt = new Sort("Ordre de tuer", 3, joueur, new AttaqueCiblee(3));
		deck.add(odt);
		
		Serviteur ba = new Serviteur("Busard affame", 5, joueur, 2, 3, new Pioche(1));
		deck.add(ba);
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
			if(carte.getNom().contains(nomCarteMain)){
			    return carte;
			}
		}
		return null;
	}

	public void prendreTour() throws HearthstoneException {
		if (this.getMana()<MAX_MANA)
			this.mana += 1; 
		this.stockMana = this.mana;
		this.piocher();
		for(ICarte carte :this.jeu) {
			if (carte instanceof Serviteur) {
				if ( ((Serviteur) carte).getJouable()==false) {
					((Serviteur) carte).setJouable(true);
				}
			}
		}
	}

	@Override
	public void finirTour() throws HearthstoneException {
		for (ICarte carte : this.getJeu())
			carte.executerEffetFinTour(Plateau.getInstance().getAdversaire(this));
		Plateau.getInstance().finTour(this);
	}

	public void melanger() {
		Collections.shuffle(deck);
	}
	
	@Override
	public void piocher() throws HearthstoneException {
		if (this.jeu.size()!=0) {
			this.main.add(this.deck.get(0));
			this.deck.remove(0);
		}
	}

	@Override
	public void jouerCarte(ICarte carte) throws HearthstoneException {
			if (carte.getCout() > this.getStockMana())
				throw new HearthstoneException("Mana insuffisant");
			this.getMain().remove(carte);
			if(carte instanceof Serviteur) {
				if (this.jeu.size()>=MAX_PLATEAU)
					throw new HearthstoneException("Plateau plein");
				this.jeu.add(carte);
			}
			carte.executerEffetDebutMiseEnJeu(carte);
			this.setMs(this.getStockMana()-carte.getCout());
	}

	
	@Override
	public void jouerCarte(ICarte carte, Object cible) throws HearthstoneException {
		if (carte.getCout() > this.getStockMana())
			throw new HearthstoneException("Mana insuffisant");
		this.getMain().remove(carte);
		if(carte instanceof Serviteur) {
			if (this.jeu.size()>=MAX_PLATEAU)
				throw new HearthstoneException("Plateau plein");
			this.jeu.add(carte);
		}
		carte.executerEffetDebutMiseEnJeu(cible);
		this.setMs(this.getStockMana()-carte.getCout());
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
