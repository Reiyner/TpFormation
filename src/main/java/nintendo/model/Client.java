package nintendo.model;

import java.util.ArrayList;
import java.util.List;


public class Client {
	
	private String nom;
	private String prenom;
    private List<Achat> listeAchats = new ArrayList();
	
	public Client(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	

	public List<Achat> getListeAchats() {
		return listeAchats;
	}

	public void setListeAchats(List<Achat> listeAchats) {
		this.listeAchats = listeAchats;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", listeAchats=" + listeAchats + "]";
	}
	
	
}
