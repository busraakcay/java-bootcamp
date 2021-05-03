package staticDemo;

public class ProductValidator {
	
	static { // statik nesne �a��r�ld���nda constructor g�revi g�r�r
		System.out.println("static yap�c� blok �al��t�");
	}
	
	public ProductValidator() {
		System.out.println("yap�c� blok �al��t�");
	}
	
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	//inner class
	public static class OrnekClass{
		public static void sil() {
			
		}
	}
	
}
