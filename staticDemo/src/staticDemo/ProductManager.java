package staticDemo;

public class ProductManager {
	public void add(Product product) {
		//ProductValidator validator = new ProductValidator(); #ProductValidator static olarak i�aretlendi�i i�in gerek olmad�.
		if(ProductValidator.isValid(product)) {
			System.out.println("eklendi");
		}else {
			System.out.println("�r�n bilgileri ge�ersizdir");
		}
		
	}
}
