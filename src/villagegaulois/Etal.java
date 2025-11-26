package villagegaulois;

import personnages.Gaulois;
import produits.*;

public class Etal {
	private Gaulois vendeur;
	private IProduit<P>[] produit;
	private int nbProduit = 0;
	private int quantiteDebutMarche;
	private int quantite;
	private boolean etalOccupe = false;
	private int prix;

	public boolean isEtalOccupe() {
		return etalOccupe;
	}

	public Gaulois getVendeur() {
		return vendeur;
	}

	public int getQuantite() {
		return quantite;
	}
	
	public void installerVendeur(Gaulois vendeur, P[] produit, int prix) {
	}
}
