package villagegaulois;

import personnages.Gaulois;
import produits.*;

public class Etal <P extends IProduit> implements IEtal {
	private Gaulois vendeur;
	private P[] produit;
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
		this.produit = produit;
		this.nbProduit = produit.length;
		this.prix = prix;
		this.vendeur = vendeur;
	}
	
	@Override
	public int contientProduit(String produit, int quantiteSouhaitee) {
		int quantiteAVendre = 0;
		if(nbProduit != 0 && this.produit[0].getNom().equals(produit)) {
			if(nbProduit >= quantiteSouhaitee) {
				quantiteAVendre = quantiteSouhaitee;
			} else {
				quantiteAVendre = nbProduit;
			}
		}
		return quantiteAVendre;
	}
	
	@Override
	public int acheterProduit(int quantiteeSouhaite) {
		int prixPaye = 0;
		for	(int i = nbProduit -1; i > nbProduit - quantiteeSouhaite-1 || i>1; i--) {
			prixPaye += produit[i].calculerPrix(prix);
		}
		if(nbProduit >= quantiteeSouhaite) {
			nbProduit -= quantiteeSouhaite;
		} else {
			nbProduit = 0;
		}
		return prixPaye;
	}
	
	@Override
	public String etatEtal() {
		StringBuilder chaine = new StringBuilder(vendeur.getNom());
		if(nbProduit>0) {
			chaine.append("vend ");
			chaine.append(nbProduit + " produit:");
			for (int i = 0; i < nbProduit; i++) {
				chaine.append("\n- " + produit[i].decrireProduit());
			}
		} else {
			chaine.append("n'a plus rien à vendre.");
		}
		chaine.append("\n");
		return chaine.toString();
	}
}
