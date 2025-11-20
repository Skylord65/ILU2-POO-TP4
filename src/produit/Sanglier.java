package produit;

public class Sanglier extends Produit {

	String date;
	
	protected Sanglier(String date) {
		super("sanglier", Unite.KG);
		this.date = date;
	}

	@Override
	public String decrireProduit() {
		return nom + " pêché " + date + ".";
	}

}
