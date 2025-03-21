package nintendo.test;




import nintendo.model.Client;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import nintendo.model.Achat;
import nintendo.model.Boutique;
import nintendo.model.Console;
import nintendo.model.Hybride;
import nintendo.model.Jeu;
import nintendo.model.Portable;
import nintendo.model.Salon;

public class Test {

	public static void main(String[] args) {
		
	    List<Achat> listeAchatsClient1 = new ArrayList();
	    List<Achat> listeAchatsClient2 = new ArrayList();
	    
		// TODO Auto-generated method stub
		Console nintendoSwitch = new Hybride("switch", 300, LocalDate.parse("2017-03-03"));
		Console playstationV = new Salon("playstationV", 600, LocalDate.parse("2020-11-12"));
		Console xbox = new Salon("xbox", 200, LocalDate.parse("2001-11-15"));
		Console nintendoDS = new Portable("nintendoDS", 200, LocalDate.parse("2004-11-21"));
		Console pc  = new Hybride("pc", 1800, LocalDate.parse("2023-11-25"));

		Jeu hades = new Jeu("Hades",playstationV);
		Jeu	zelda = new Jeu("Zelda",nintendoSwitch);
		Jeu	pokemon = new Jeu("Pokemon",nintendoDS);
		Jeu civilisation = new Jeu("Civilisation",pc);
		Jeu titanFall = new Jeu("Titan Fall",xbox);
		
		Client client1 = new Client ("Doe","John");
		Client client2 = new Client ("Doe","Jane");	

		Boutique boutique = new Boutique("Micromania", "Arras");
		
		Achat achat1 = new Achat(titanFall,LocalDate.parse("2004-11-21"),45.0);
		Achat achat2 = new Achat(pokemon,LocalDate.parse("2004-11-21"),45.0);
		Achat achat3 = new Achat(hades,LocalDate.parse("2004-11-21"),45.0);
		Achat achat4 = new Achat(zelda,LocalDate.parse("2004-11-21"),45.0);
		
		listeAchatsClient1.add(achat4);
		listeAchatsClient1.add(achat3);
		listeAchatsClient2.add(achat2);
		listeAchatsClient2.add(achat1);
		
		
		
		hades.setBoutique(boutique);
		zelda.setBoutique(boutique);
		pokemon.setBoutique(boutique);
		civilisation.setBoutique(boutique);
		titanFall.setBoutique(boutique);
		
		client1.setListeAchats(listeAchatsClient1);
		client2.setListeAchats(listeAchatsClient2);
		
		

		System.out.println(boutique);
		System.out.println(client1);
		System.out.println(client2);
		
		
	}

}
