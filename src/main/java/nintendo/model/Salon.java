package nintendo.model;

import java.time.LocalDate;

public class Salon extends Console{

	public Salon(String nom, double prix, LocalDate dateSortie) {
		super(nom, prix, dateSortie);
	}

	@Override
	public String toString() {
		return "Salon [nom=" + getNom() + ", prix=" + getPrix() + ", DateSortie=" + getDateSortie()
				+ "]";
	}

	

}
