package produits;

import personnages.Gaulois;

public class Poisson extends Produit{
	int poids;
	Gaulois chasseur;
	protected Poisson(int poids, Gaulois chasseur) {
		super("poisson", Unite.PIECE);
		this.poids = poids;
		this.chasseur = chasseur;
		
	}
	
	@Override
	public String decrireProduit() { 
		return nom + "de " + poids + unite.toString() + " chassé par " + chasseur.getNom() + ".";
	}

}
