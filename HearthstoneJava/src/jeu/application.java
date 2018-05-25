package jeu;

import carte.*;
import java.util.ArrayList;
import capacite.*;


public class application {
	
	public static void main(String[] args) {
		ArrayList<ICarte> deck = new ArrayList<ICarte>();
		int i;
		
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
		System.out.println(jaina.toString());
		
		FlecheDuChasseur fdc = new FlecheDuChasseur();
		Heros rexxar = new Heros("Rexxar", 15, fdc);
		System.out.println(rexxar.toString());
		
		Joueur joueur1 = new Joueur(rexxar, "Drakox", 0 , 0);
		joueur1.creationDeck();
		deck = joueur1.getDeck();
		System.out.println(joueur1.deck.size());
		System.out.println(joueur1.deck.size());
		for (ICarte carte : deck) {
			System.out.println(carte.toString());
			System.out.println(joueur1.deck.size());
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
