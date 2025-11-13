package personnages;

public class CUnite {
	enum Unite {
		G("g"), KG("kg"), L("l"), ML("ml"), PIECE("piece");
		
		private String unitCode;
		
		Unite(String unitCode){
			this.unitCode = unitCode;
		}
		
		public String toString() {
			return unitCode;
		}
	}
}
