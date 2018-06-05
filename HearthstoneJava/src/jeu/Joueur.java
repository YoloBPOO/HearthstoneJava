package jeu;

import java.util.ArrayList;
import java.util.Collections;
import capacite.*;
import carte.*;
/**
* Joueur : cette classe gere la creation des deux joueurs
* @author ROUSSEL - BIVER
* @version 0.9.0
* @see capacite
*/
public class Joueur implements IJoueur {
	
	// Attributs	
	private Heros heros;
	private String pseudo;
	private int mana;
	private int stockMana;
	private ArrayList<ICarte> deck = new ArrayList<ICarte>();
	public ArrayList<ICarte> main = new ArrayList<ICarte>();
	public ArrayList<ICarte> jeu = new ArrayList<ICarte>();
	
	// Constructeur

	public Joueur(Heros h, String p, int m, int ms) throws HearthstoneException {
		setHeros(h);
		setPseudo(p);
		setMana(m);
		setMs(ms);
		this.deck=new ArrayList<ICarte>();
		this.jeu=new ArrayList<ICarte>();
		this.main=new ArrayList<ICarte>();
		if (heros.getNom().contains("Jaina")) 
			this.creationDeckMage();
		else if (heros.getNom().contains("Rexxar")) 
			this.creationDeckChasseur();
		melanger();
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
		this.heros=h;
	}

	
	// Getters
	
	
	public Heros getHeros() {
		return heros;
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
	
	public void creationDeckMage() throws HearthstoneException  {
		Serviteur cmm = new Serviteur("Chasse-maree murloc", 2, this, 1, 2,new InvocationDeServiteurs("Murloc","",new Serviteur("Murloc",0,this,1,1,null),1));
		this.deck.add(cmm);

		Serviteur cdh = new Serviteur("Champion de Hurlevent", 7, this, 6, 6,new EffetPermanent(1,1));
		this.deck.add(cdh);

		Serviteur cdr = new Serviteur("Chef de raid", 3, this, 2, 2, new EffetPermanent(0,1));
		this.deck.add(cdr);
		
		Provocation p = new Provocation();
		Serviteur gbb = new Serviteur("Garde de Baie-du-butin", 5, this, 4, 5, p);
		this.deck.add(gbb);
		
		Charge c = new Charge();
		Serviteur lmt = new Serviteur("La missiliere temeraire", 6, this, 2, 5, c);
		this.deck.add(lmt);
		
		Serviteur om = new Serviteur("L'ogre-magi", 4, this, 4, 4, p);
		this.deck.add(om);
		
		Serviteur am = new Serviteur("Archimage", 6, this, 7, 4, p);
		this.deck.add(am);
		
		Serviteur gl = new Serviteur("Gnome lepreux", 1, this, 1, 1, new Lepre());
		this.deck.add(gl);
		
		Serviteur gm = new Serviteur("Golem des moissons", 3, this, 3, 2, new Golemisation(this));
		this.deck.add(gm);
		
		Sort ch = new Sort("Charge", 1, this, c);
		this.deck.add(ch);
		
		Sort attm = new Sort("Attaque mentale", 2, this, new AttaqueCiblee(2));
		this.deck.add(attm);
		
		Sort cdf = new Sort("Choc de flamme", 7, this, new AttaqueTotale(4));
		this.deck.add(cdf);
		
		Sort edg = new Sort("Eclair de givre", 2, this, new AttaqueCiblee(3));
		this.deck.add(edg);
		
		Sort ida = new Sort("Intelligence des arcanes", 2, this, new Pioche(2));
		this.deck.add(ida);
		
		Sort im = new Sort("Image mirroir", 1, this, new ImageMirroir(this));
		this.deck.add(im);
		
		Sort epy = new Sort("Explosion pyrotechnique", 10, this, new AttaqueCiblee(10));
		this.deck.add(epy);
	}
	
	public void creationDeckChasseur() throws HearthstoneException {
		Serviteur cmm = new Serviteur("Chasse-maree murloc", 2, this, 1, 2,new InvocationDeServiteurs("Murloc","",new Serviteur("Murloc",0,this,1,1,null),1));
		this.deck.add(cmm);

		Serviteur cdh = new Serviteur("Champion de Hurlevent", 7, this, 6, 6,new EffetPermanent(1,1));
		this.deck.add(cdh);

		Serviteur cdr = new Serviteur("Chef de raid", 3, this, 2, 2, new EffetPermanent(0,1));
		this.deck.add(cdr);
		
		Provocation p = new Provocation();
		Serviteur gbb = new Serviteur("Garde de Baie-du-butin", 5, this, 4, 5, p);
		this.deck.add(gbb);
		
		Charge c = new Charge();
		Serviteur lmt = new Serviteur("La missiliere temeraire", 6, this, 2, 5, c);
		this.deck.add(lmt);
		
		Serviteur om = new Serviteur("L'ogre-magi", 4, this, 4, 4, p);
		this.deck.add(om);
		
		Serviteur am = new Serviteur("Archimage", 6, this, 7, 4, p);
		this.deck.add(am);
		
		Serviteur gl = new Serviteur("Gnome lepreux", 1, this, 1, 1, new Lepre());
		this.deck.add(gl);
		
		Serviteur gm = new Serviteur("Golem des moissons", 3, this, 3, 2, new Golemisation(this));
		this.deck.add(gm);
		
		Sort ch = new Sort("Charge", 1, this, c);
		this.deck.add(ch);
		
		Sort attm = new Sort("Attaque mentale", 2, this, new AttaqueCiblee(2));
		this.deck.add(attm);
		
		Sort mdc = new Sort("Marque du chasseur", 1, this, new MarqueDuChasseur());
		this.deck.add(mdc);
		
		Sort tda = new Sort("Tir des arcanes", 1, this, new AttaqueCiblee(2));
		this.deck.add(tda);
		
		Sort llc = new Sort("Lacher les chiens", 3, this, new InvocationDesChiens(this));
		this.deck.add(llc);
		
		Sort odt = new Sort("Ordre de tuer", 3, this, new AttaqueCiblee(3));
		this.deck.add(odt);
		
		Serviteur ba = new Serviteur("Busard affame", 5, this, 2, 3, new Pioche(1));
		this.deck.add(ba);
	}
		
	
	public ArrayList<ICarte> getMain() {
		return this.main;
	}
	public int size() {
		return main.size();
	}

	public ArrayList<ICarte> getJeu() {
		return this.jeu;
	}
	
	public ArrayList<ICarte> getDeck() {
		return this.deck;
	}

	public ICarte getCarteEnJeu(String nomCarte){
		for (ICarte carte : this.jeu) {
			if(carte.getNom().contains(nomCarte)){
			    return carte;
			}
		}
		return null;
	}

	public ICarte getCarteEnMain(String nomCarteMain) {
		for (ICarte carte : this.main) {
			if(carte.getNom().contains(nomCarteMain)){
			    return carte;
			}
		}
		return null;
	}

	public void prendreTour() throws HearthstoneException {
		if (this.getMana()<MAX_MANA)
			this.mana += 1; 
		this.getHeros().setPouvoirJouable(true);
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
		if (!this.getDeck().isEmpty()) {
			this.main.add(this.deck.get(0));
			this.deck.remove(0);
		}
	}

	@Override
	public void jouerCarte(ICarte carte) throws HearthstoneException {
		try {
			if (carte.getCout() > this.getStockMana())
				throw new HearthstoneException("Mana insuffisant");
			else {
				this.getMain().remove(carte);
				
				try {
					if(carte instanceof Serviteur) {
						if (this.jeu.size()>=MAX_PLATEAU)
							throw new HearthstoneException("Plateau plein");
						this.jeu.add(carte);
					}
				} catch (HearthstoneException e) {
					System.out.println("Le plateau est plein, impossible de poser plus de serviteurs");
				}
				
					carte.executerEffetDebutMiseEnJeu(carte);
					this.setMs(this.getStockMana()-carte.getCout());
					
					ICarte c;
					
					do {
						c = null;
						for( ICarte card :Plateau.getInstance().getAdversaire(this).getJeu())
							if(card.disparait())
								c=card;
						if (c!=null)
							Plateau.getInstance().getAdversaire(this).perdreCarte(c);
					}while(c!=null);
			}		
		} catch (HearthstoneException e) {
			System.out.println("Vous n'avez pas assez de mana");
		}
	}

	
	@Override
	public void jouerCarte(ICarte carte, Object cible) throws HearthstoneException {
		try {
			if (carte.getCout() > this.getStockMana())
				throw new HearthstoneException("Mana insuffisant");
			else {
				this.getMain().remove(carte);
				
				try {
					if(carte instanceof Serviteur) {
						if (this.jeu.size()>=MAX_PLATEAU)
							throw new HearthstoneException("Plateau plein");
						this.jeu.add(carte);
					}
				} catch (HearthstoneException e) {
					System.out.println("Le plateau est plein, impossible de poser plus de serviteurs");
				}
				
				carte.executerEffetDebutMiseEnJeu(cible);
				this.setMs(this.getStockMana()-carte.getCout());
				
				ICarte c;
				
				do {
					c = null;
					for( ICarte card :Plateau.getInstance().getAdversaire(this).getJeu())
						if(card.disparait())
							c=card;
					if (c!=null)
						Plateau.getInstance().getAdversaire(this).perdreCarte(c);
				}while(c!=null);
			}
		} catch (HearthstoneException e) {
			System.out.println("Vous n'avez pas assez de mana");
		}
	}

	@Override
	public void utiliserCarte(ICarte carte, Object cible) throws HearthstoneException {
		try {
			if ( !((Serviteur) carte).getJouable()) 
				throw new HearthstoneException("Cette carte ne peut pas jouer");
		} catch (HearthstoneException e) {
			System.out.println("Cette carte ne peut pas encore jouer");
		}
		try {
			if (cible instanceof Heros) {
				if (((Joueur)Plateau.getInstance().getAdversaire(this)).ProvocationEnJeu()) 
					throw new HearthstoneException("Vous pouvez seulement attaquer le serviteur avec provocation");
				else {
				((Heros)cible).setPdv(((Heros) cible).getPdv()-((Serviteur )carte).getAtt());
				((Serviteur)carte).setJouable(false);
				}
			}
			if (cible instanceof Serviteur) {
				if (((Joueur)Plateau.getInstance().getAdversaire(this)).ProvocationEnJeu()) {
					if (!(((Serviteur)cible).getCapacite() instanceof Provocation)) 
						throw new HearthstoneException("Vous pouvez seulement attaquer le serviteur avec provocation");
					else  if (((Serviteur)carte).getJouable()){
						((Serviteur)cible).setPdv(((Serviteur) cible).getPdv()-((Serviteur)carte).getAtt());
						((Serviteur)carte).setPdv(((Serviteur) carte).getPdv()-((Serviteur)cible).getAtt());
						((Serviteur)carte).getJouable();
					}
				}
				else {
					((Serviteur)cible).setPdv(((Serviteur) cible).getPdv()-((Serviteur)carte).getAtt());
					((Serviteur)carte).setPdv(((Serviteur) carte).getPdv()-((Serviteur)cible).getAtt());
					((Serviteur)carte).getJouable();
				}
				
				ICarte d = null, b = null;
				for( ICarte card:this.getJeu()) 
					if(carte.disparait())
						d=card;
				for( ICarte card:Plateau.getInstance().getAdversaire(this).getJeu()) 
					if(card.disparait())
						b=card;
				if (d!=null)
				this.perdreCarte(d);
				if (b!=null)
					Plateau.getInstance().getAdversaire(this).perdreCarte(b);
			}
		} catch (HearthstoneException e) {
			System.out.println("Vous pouvez seulement attaquer le serviteur avec provocation !");
		}
	}

	@Override
	public void utiliserPouvoir(Object cible) throws HearthstoneException {
		try {
			if (this.heros.getPouvoirJouable()) {
				try {
					if (getStockMana() >= 2) {
						heros.getCapacite().executerAction(cible);
						heros.setPouvoirJouable(false);
						setMs(getStockMana() - 2);
					}
					else {
						throw new HearthstoneException ("Pas assez de mana");
					}	
				} catch (HearthstoneException e) {
					System.out.println("Pas assez de mana !");
				}	
			 }
		else {
			throw new HearthstoneException ("Vous avez deja utiliser votre pouvoir");
		}
		} catch (HearthstoneException e) {
			System.out.println("Vous avez deja utiliser votre pouvoir !");
		}
	}

	@Override
	public void perdreCarte(ICarte carte) throws HearthstoneException {
		this.jeu.remove(carte);
		carte.executerEffetDisparition(carte);
	}
	
	public boolean ProvocationEnJeu() {
		for (ICarte carte : this.getJeu()) {
            if (((Serviteur) carte).getCapacite() instanceof Provocation) 
            	return true;
        }
		return false;
	}

}
