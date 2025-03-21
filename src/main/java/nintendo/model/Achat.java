package nintendo.model;

import java.time.LocalDateTime;

public class Achat {
	Jeu jeu;
	LocalDateTime date;
	int prix;
	
	public Achat(Jeu jeu, LocalDateTime date, int prix) {
		this.jeu = jeu;
		this.date = date;
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Achat [jeu=" + jeu + ", date=" + date + ", prix=" + prix + "]";
	}
	

}
