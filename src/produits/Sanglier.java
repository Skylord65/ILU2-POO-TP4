package produits;

import personnages.Gaulois;

public class Sanglier extends Produit {

	Gaulois chasseur;
	int poids;
	
	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier", Unite.KG);
		this.poids = poids;
		this.chasseur = chasseur;
	}


	@Override
	public String decrireProduit() { 
		return nom + "de " + poids + unite.toString() + " chassé par " + chasseur.getNom() + ".";
	}

	@Override
	public int calculerPrix(int prix) {
		return this.poids*prix;
	}
}
