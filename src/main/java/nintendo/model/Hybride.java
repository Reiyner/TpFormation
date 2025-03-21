package nintendo.model;

public class Hybride extends Console{

	public Hybride(String nom) {
		super(nom);
	}

	public String toString() {
		return "Hybride [getNom()=" + getNom() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
}
