package Sales;

public class Sales {
	int saleId;
	String saleName;
	
	public Sales(int saleId, String saleName) {
		super();
		this.saleId = saleId;
		this.saleName = saleName;
	}

	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public String getSaleName() {
		return saleName;
	}

	public void setSaleName(String saleName) {
		this.saleName = saleName;
	}
	
}
