package nintendo.test;




import nintendo.model.Client;
import nintendo.model.Boutique;
import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console nintendoSwitch = new Console("switch");
		Console playstationV = new Console("playstationV");
		Console xbox = new Console("xbox");
		Console nintendoDS = new Console("nintendoDS");
		Console pc  = new Console("pc");

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
