package nintendo.model;

import java.time.LocalDate;

public class Achat {
	Jeu jeu;
	LocalDate date;
	double prix;
	
	public Achat(Jeu jeu, LocalDate date, double prix) {
		this.jeu = jeu;
		this.date = date;
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Achat [jeu=" + jeu + ", date=" + date + ", prix=" + prix + "]";
	}
	

}
