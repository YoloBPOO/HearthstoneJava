package jeu;

import carte.*;
import capacite.*;


public class application {
	
	public static void main(String[] args) {
		InvocationDeServiteurs ids = new InvocationDeServiteurs(1,1);
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
		Serviteur lmt = new Serviteur("La missilière téméraire", 6, null, 2, 5, c);
		System.out.println(lmt.toString());
		
		Serviteur om = new Serviteur("L'ogre-magi", 4, null, 4, 4, p);
		System.out.println(om.toString());
		
		Serviteur am = new Serviteur("Archimage", 6, null, 7, 4, p);
		System.out.println(am.toString());
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
