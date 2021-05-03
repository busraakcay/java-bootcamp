package staticDemo;

public class ProductValidator {
	
	static { // statik nesne çaðýrýldýðýnda constructor görevi görür
		System.out.println("static yapýcý blok çalýþtý");
	}
	
	public ProductValidator() {
		System.out.println("yapýcý blok çalýþtý");
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
