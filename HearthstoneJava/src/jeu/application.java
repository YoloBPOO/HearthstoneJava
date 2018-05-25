package jeu;

import carte.*;
import java.util.ArrayList;
import java.util.Scanner;

import capacite.*;


public class application {
	
	public static void main(String[] args) throws HearthstoneException {
		ArrayList<ICarte> deck = new ArrayList<ICarte>();
		int i;
		String pseudoJ1, pseudoJ2, choix;
		char carac;
		Scanner sc = new Scanner(System.in);
		Joueur joueur1, joueur2;
		
		/*InvocationDeServiteurs ids = new InvocationDeServiteurs(1,1);
		Serviteur cmm = new Serviteur("Chasse-marée murloc", 2, null, 1, 2, ids);
		System.out.println(cmm.toString());
		
		EffetPermanent ep = new EffetPermanent(1,1);
		Serviteur cdh = new Serviteur("Champion de Hurlevent", 7, null, 6, 6, ep);
		System.out.println(cdh.toString());
		
		EffetPermanent epe = new EffetPermanent(0,1);
		Serviteur cdr = new Serviteur("Chef de raid", 3, null, 2, 2, epe);
		System.out.println(cdr.toString());
		
		Provocation p = new Provocation();
		Serviteur gbb = new Serviteur("Garde de Baie-du-butin", 5, null, 4, 5, p);
		System.out.println(gbb.toString());
		
		Charge c = new Charge();
		Serviteur lmt = new Serviteur("La missiliere temeraire", 6, null, 2, 5, c);
		System.out.println(lmt.toString());
		
		Serviteur om = new Serviteur("L'ogre-magi", 4, null, 4, 4, p);
		System.out.println(om.toString());
		
		Serviteur am = new Serviteur("Archimage", 6, null, 7, 4, p);
		System.out.println(am.toString());
		
		Serviteur gl = new Serviteur("Gnome lepreux", 1, null, 1, 1, p);
		System.out.println(gl.toString());
		
		Serviteur gm = new Serviteur("Golem des moissons", 3, null, 3, 2, p);
		System.out.println(gm.toString());
		
		Pioche pio1 = new Pioche(1);
		Serviteur ba = new Serviteur("Busard affame", 5, null, 2, 3, pio1);
		System.out.println(ba.toString());
		
		Sort ch = new Sort("Charge", 1, null, c);
		System.out.println(ch.toString());
		
		AttaqueCiblee ac = new AttaqueCiblee();
		Sort attm = new Sort("Attaque mentale", 2, null, ac);
		System.out.println(attm.toString());
		
		AttaqueTotale at = new AttaqueTotale();
		Sort cdf = new Sort("Choc de flamme", 7, null, at);
		System.out.println(cdf.toString());
		
		Sort edg = new Sort("Eclair de givre", 2, null, ac);
		System.out.println(edg.toString());
		
		Pioche pio2 = new Pioche(2);
		Sort ida = new Sort("Intelligence des arcanes", 2, null, pio2);
		System.out.println(ida.toString());
		
		Sort im = new Sort("Image mirroir", 1, null, pio1); // invocation de monstre A FAIRE !!!!!!!!!!!!
		System.out.println(im.toString());
		
		Sort epy = new Sort("Explosion pyrotechnique", 10, null, ac);
		System.out.println(epy.toString());
		
		Sort mdc = new Sort("Marque du chasseur", 1, null, ac );  // abaisse les pdv a 1  A FAIRE !!!!!!!!!!!
		System.out.println(mdc.toString());
		
		Sort tda = new Sort("Tir des arcanes", 1, null, ac);
		System.out.println(tda.toString());
		
		Sort llc = new Sort("Lacher les chiens", 3, null, p); // invocation de monstre A FAIRE !!!!!!!!!!!!
		System.out.println(llc.toString());
		
		Sort odt = new Sort("Ordre de tuer", 3, null, ac);
		System.out.println(odt.toString());	*/

		BouleDeFeu bdf = new BouleDeFeu();
		Heros jaina = new Heros("Jaina", 15, bdf);
		
		FlecheDuChasseur fdc = new FlecheDuChasseur();
		Heros rexxar = new Heros("Rexxar", 15, fdc);
		
	//	for (ICarte carte : joueur1.getDeck()) {
			//System.out.println(carte.toString());
	//	}		
			
			System.out.println("Entrez le pseudo du joueur 1 : ");
			pseudoJ1 = sc.nextLine();
			System.out.println("Quel Heros voulez-vous jouer (J/R) : ");
			do{
				choix = sc.nextLine();
				carac = choix.charAt(0);
			}while (carac != 'J' && carac != 'R' && carac != 'j' && carac != 'r');
			
			
			if (carac == 'J' || carac == 'j') {
				joueur1 = new Joueur(jaina,pseudoJ1,0,0);
			}
			else {
				joueur1 = new Joueur(rexxar,pseudoJ1,0,0);
			}
			
			joueur1.creationDeck();
			joueur1.melanger();
			
			
			System.out.println("Entrez le pseudo du joueur 2 : ");
			pseudoJ2 = sc.nextLine();
			System.out.println("Quel Heros voulez-vous jouer (J/R) : ");
			do{
				choix = sc.nextLine();
				carac = choix.charAt(0);
			}while (carac != 'J' && carac != 'R' && carac != 'j' && carac != 'r');
			
			if (carac == 'J' || carac == 'j') {
				joueur2 = new Joueur(jaina,pseudoJ2,0,0);
			}
			else {
				joueur2 = new Joueur(rexxar,pseudoJ2,0,0);
			}
			
			joueur2.creationDeck();
			joueur2.melanger();
			
			System.out.println("Le combat oppose " + pseudoJ1 + " qui incarne " + joueur1.getHeros() + " contre " + pseudoJ2 + " qui incarne " + joueur2.getHeros());
			
			for(i=0 ; i<2 ; i++)
			{
				joueur1.piocher();
				joueur2.piocher();
			}
					
			System.out.println("Joueur 1 carte en main :");		
			for(i=0 ; i < joueur1.main.size() ; i++)
			{
				System.out.println(joueur1.main.get(i));
			}
			
			System.out.println("Joueur 2 carte en main : ");
			for(i=0 ; i < joueur2.main.size() ; i++)
			{
				System.out.println(joueur2.main.get(i));
			}

			
			
	}
	

	
	
	
	
	
	
	
	
	/*Scanner sc = new Scanner(System.in);
	
	String p, choix;
	
	Heros h;
	
	System.out.println("Entrez un pseudo : ");
	p=sc.nextLine();
	
	System.out.println("Choisisez un héros : Jaina (J) ou Rexxar (R)");
	choix=sc.nextLine();
	
	if (choix=="J") {
		h.Heros("Jaina", 15, BouleDeFeu);
	}
	else h.Heros("Rexxar", 15, TirAssure);
	
	joueur.Joueur(h, p, 0, 0);*/
}
