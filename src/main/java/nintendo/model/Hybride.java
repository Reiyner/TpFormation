package nintendo.model;


import java.time.LocalDate;

public class Hybride extends Console{

	public Hybride(String nom, double prix, LocalDate dateSortie) {
		super(nom, prix, dateSortie);
	}

	@Override
	public String toString() {
		return "Hybride [nom=" + getNom() + ",prix=" + getPrix() + ", DateSortie=" + getDateSortie()
				+ "]";
	}

	
}
