package produits;

public class Poisson extends Produit{
	String date;
	public Poisson(String date) {
		super("poisson", Unite.PIECE);
		this.date = date;
	}
	
	@Override
	public String decrireProduit() {
		return nom + " pêché " + date + ".";
	}
	
	@Override
	public int calculerPrix(int prix) {
		return prix;
	}

}
