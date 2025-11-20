package produit;

public enum Unite {
	G("g"), KG("kg"), L("l"), ML("ml"), PIECE("piece");
	
	private String unitCode;
	
	private Unite(String unitCode){
		this.unitCode = unitCode;
	}
	
	@Override
	public String toString() {
		return unitCode;
	}
}
