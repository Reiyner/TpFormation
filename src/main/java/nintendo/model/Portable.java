package nintendo.model;

public class Portable extends Console{

	public Portable(String nom) {
		super(nom);
	}

	public String toString() {
		return "Portable [getNom()=" + getNom() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
}
