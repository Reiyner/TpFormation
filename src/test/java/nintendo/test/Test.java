package nintendo.test;




import nintendo.model.Client;

import java.time.LocalDate;

import nintendo.model.Boutique;
import nintendo.model.Console;
import nintendo.model.Hybride;
import nintendo.model.Jeu;
import nintendo.model.Portable;
import nintendo.model.Salon;

public class Test {

	public static void main(String[] args) {
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
		
		
	}

}
