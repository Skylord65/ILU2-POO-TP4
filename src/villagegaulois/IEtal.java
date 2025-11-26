package villagegaulois;

import personnages.Gaulois;
import produits.IProduit;

public interface IEtal<Produit extends IProduit> {
	Gaulois getVendeur();
	int contientProduit(String produit, int quantiteSouhaitee);
	int acheterProduit(int quantiteSouhaitee);
	String etatEtal();
}
