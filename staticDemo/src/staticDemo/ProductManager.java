package staticDemo;

public class ProductManager {
	public void add(Product product) {
		//ProductValidator validator = new ProductValidator(); #ProductValidator static olarak iþaretlendiði için gerek olmadý.
		if(ProductValidator.isValid(product)) {
			System.out.println("eklendi");
		}else {
			System.out.println("ürün bilgileri geçersizdir");
		}
		
	}
}
