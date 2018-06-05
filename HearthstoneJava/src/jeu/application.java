package jeu;

import carte.*;
import java.util.Scanner;
import capacite.*;
/**
* Application: cette classe gere le programme et son execution
* @author ROUSSEL - BIVER
* @version 0.9.0
* @see jeu
*/
public class application {
	private static String pseudoJ1;
	private static String pseudoJ2;
	private static String choix, choix2;
	private static Scanner sc = new Scanner(System.in);
	private static char carac;
	private static Joueur joueur1;
	private static Joueur joueur2;
	
	private static void jouer() throws HearthstoneException {
			System.out.println("Que voulez-vous faire? \n 1 -> Jouer une carte \n 2 -> Utiliser un serviteur sur le terrain \n 3 -> Utiliser votre pouvoir heroique \n 4 -> Finir votre tour \n");
			do {
			choix = sc.nextLine();
			carac = choix.charAt(0);
			}while (carac != '1' && carac!= '2' && carac!= '3' && carac!= '4');
			
			switch (carac)
			{
			  case '1':
				jouerCarte();
			    break;
			  case '2':
				utiliserCarte();
			    break;
			  case '3':
				pouvoirHeroique();
			    break;
			  case '4':
				finirLeTour();
				break;
			  default:
			  	throw new HearthstoneException("Choisissez entre 1, 2, 3, 4");
			  
			}
	}
	
	public static void board() throws HearthstoneException {
				
		System.out.println("_______________________________________________________");
		System.out.println(Plateau.getInstance().getAdversaire(Plateau.getInstance().getJoueurCourant()).getPseudo()+"  [Point de vie: " +Plateau.getInstance().getAdversaire(Plateau.getInstance().getJoueurCourant()).getHeros().getPdv() + " || Mana: " + Plateau.getInstance().getAdversaire(Plateau.getInstance().getJoueurCourant()).getStockMana()+"/"+Plateau.getInstance().getAdversaire(Plateau.getInstance().getJoueurCourant()).getMana()+ "]");
		System.out.println("\n");
		System.out.println("-------------------------------------------------------");
		System.out.println("=======================================================");
		System.out.println(Plateau.getInstance().getAdversaire(Plateau.getInstance().getJoueurCourant()).getJeu());
		System.out.println("*******************************************************");
		System.out.println("*******************************************************");
		System.out.println(Plateau.getInstance().getJoueurCourant().getJeu());
		System.out.println("=======================================================");
		System.out.println("-------------------------------------------------------");
		System.out.println("\n");
		System.out.println(Plateau.getInstance().getJoueurCourant().getPseudo() +"  [Point de vie: " +Plateau.getInstance().getJoueurCourant().getHeros().getPdv() + " || Mana: " + Plateau.getInstance().getJoueurCourant().getStockMana()+"/"+Plateau.getInstance().getJoueurCourant().getMana()+ "]");
		System.out.println("\n");
		System.out.println("Vos carte en main :\n" + Plateau.getInstance().getJoueurCourant().getMain());
		System.out.println("_______________________________________________________");
	}
	
	private static void jouerCarte() throws HearthstoneException {
			System.out.println("Tapez les 5 premieres lettres de la carte que vous voullez jouer");
			choix=sc.nextLine();
			
			Carte c= (Carte) Plateau.getInstance().getJoueurCourant().getCarteEnMain(choix);
			
			System.out.println(c);
			if (c!=null) {
				if (c.getCapacite() instanceof AttaqueCiblee) {
					do{
						System.out.println("Voulez-Vous cibler :\n1 -> Un heros \n2 -> Une carte");
						choix=sc.nextLine();
						carac = choix.charAt(0);		
					}while(carac!='1' && carac!='2');
					
					if (carac=='2') {
						System.out.println("Tapez les 5 premieres lettres de la cible");
						choix2=sc.nextLine();
						
						ICarte cible=Plateau.getInstance().getAdversaire(c.getProprietaire()).getCarteEnJeu(choix2);
						Plateau.getInstance().getJoueurCourant().jouerCarte(c,cible);
					}
					else {
						Heros cible=Plateau.getInstance().getAdversaire(c.getProprietaire()).getHeros();
						Plateau.getInstance().getJoueurCourant().jouerCarte(c,cible);
						if (cible.getPdv()<=0) 
							Plateau.getInstance().gagnePartie(c.getProprietaire());
					}
				}
				else 
					Plateau.getInstance().getJoueurCourant().jouerCarte(c);
				if (c.getCapacite() instanceof AttaqueDuHeros) {
					Plateau.getInstance().getJoueurCourant().jouerCarte(c);
					IJoueur adversaire = Plateau.getInstance().getAdversaire(c.getProprietaire());
					if (adversaire.getHeros().getPdv()<=0) 
						Plateau.getInstance().gagnePartie(c.getProprietaire());
				}
			}
			else 
				System.out.println("Vous n'avez pas cette carte en main");
	}
	
	private static void utiliserCarte() throws HearthstoneException {
			System.out.println("Tapez les 5 premieres lettres de la carte que vous voullez jouer");
			choix=sc.nextLine();
			
			ICarte c= Plateau.getInstance().getJoueurCourant().getCarteEnJeu(choix);
			
			if (c!=null) {
				do{
					System.out.println("Voulez-Vous cibler :\n1 -> Un heros \n2 -> Une carte");
					choix=sc.nextLine();
					carac = choix.charAt(0);
				}while(carac!='1' && carac!='2');
				if (carac=='2') {
					System.out.println("Tapez les 5 premieres lettres de la cible");
					choix2=sc.nextLine();
					ICarte cible=Plateau.getInstance().getAdversaire(c.getProprietaire()).getCarteEnJeu(choix2);
					Plateau.getInstance().getJoueurCourant().utiliserCarte(c,cible);
				}
				else {
					Heros cible=Plateau.getInstance().getAdversaire(c.getProprietaire()).getHeros();
					Plateau.getInstance().getJoueurCourant().utiliserCarte(c,cible);
					if (cible.getPdv()<=0) Plateau.getInstance().gagnePartie(c.getProprietaire());
				}
			}
			else System.out.println("Cette carte n'est pas sur le plateau");
	}
	
	private static void pouvoirHeroique() throws HearthstoneException {
			IJoueur adversaire = Plateau.getInstance().getAdversaire(Plateau.getInstance().getJoueurCourant());
			if (Plateau.getInstance().getJoueurCourant().getHeros().getCapacite().getNom().contains("tir assure")){
				Plateau.getInstance().getJoueurCourant().utiliserPouvoir(adversaire.getHeros());
			}
			else {
				do {
					System.out.println("Voulez-Vous cibler :\n1 -> Un heros \n2 -> Une carte");
					choix=sc.nextLine();
					carac = choix.charAt(0);
				}while(carac!='1' && carac!='2');
				if (carac=='1') {
					Plateau.getInstance().getJoueurCourant().utiliserPouvoir(adversaire.getHeros());
					if (adversaire.getHeros().getPdv()<=0) Plateau.getInstance().gagnePartie(Plateau.getInstance().getJoueurCourant());
				}
				else {
					System.out.println("Tapez les 5 premieres lettres de la cible");
					choix=sc.nextLine();
					Plateau.getInstance().getJoueurCourant().utiliserPouvoir(adversaire.getCarteEnJeu(choix));
				}
			}
	}
	
	private static void finirLeTour() throws HearthstoneException {
		Plateau.getInstance().getJoueurCourant().finirTour();
	}

	public static void main(String[] args) throws HearthstoneException {
		BouleDeFeu bdf = new BouleDeFeu();
		Heros jaina = new Heros("Jaina", 15, bdf);
		
		FlecheDuChasseur fdc = new FlecheDuChasseur();
		Heros rexxar = new Heros("Rexxar", 15, fdc);
		
		System.out.println("Entrez le pseudo du joueur 1 : ");
		pseudoJ1 = sc.nextLine();
		System.out.println("Quel Heros voulez-vous jouer (J/R) : ");
		do{
			choix = sc.nextLine();
			carac = choix.charAt(0);
		}while (carac != 'J' && carac != 'R' && carac != 'j' && carac != 'r');
				
		if (carac == 'J' || carac == 'j') {
			joueur1 = new Joueur(jaina,pseudoJ1,0,0);
			joueur1.piocher();
			joueur1.piocher();
			joueur1.piocher();
		}
		else {
			joueur1 = new Joueur(rexxar,pseudoJ1,0,0);
			joueur1.piocher();
			joueur1.piocher();
			joueur1.piocher();
		}		
			
		System.out.println("Entrez le pseudo du joueur 2 : ");
		pseudoJ2 = sc.nextLine();
		System.out.println("Quel Heros voulez-vous jouer (J/R) : ");
		do{
			choix = sc.nextLine();
			carac = choix.charAt(0);
		}while (carac != 'J' && carac != 'R' && carac != 'j' && carac != 'r');
			
		if (carac == 'J' || carac == 'j') {
			joueur2 = new Joueur(jaina,pseudoJ2,0,0);
			joueur2.piocher();
			joueur2.piocher();
			joueur2.piocher();
		}
		else {
			joueur2 = new Joueur(rexxar,pseudoJ2,0,0);
			joueur2.piocher();
			joueur2.piocher();
			joueur2.piocher();
		}		

		Plateau.getInstance().ajouterJoueur(joueur1);
		Plateau.getInstance().ajouterJoueur(joueur2);
	
		System.out.println("Le combat oppose " + pseudoJ1 + " qui incarne " + joueur1.getHeros().getNom() + " contre " + pseudoJ2 + " qui incarne " + joueur2.getHeros().getNom());

		Plateau.getInstance().demarrerPartie();
		while (Plateau.getInstance().estDemarree()) {
			board();
			jouer();
		}
			
	}
	
}