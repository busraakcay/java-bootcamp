package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		
		String internetSubaButonu = "�nternet �ubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.15;
		int vade = 36;
		boolean dustuMu = true; // false;		
		
		System.out.println(internetSubaButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar d��t� resmi");
		}else if(dolarBugun>dolarDun) {
			System.out.println("Dolar y�kseldi resmi");
		}else {
			System.out.println("Dolar e�ittir resmi");
		}
		
		System.out.println("----------------------------------");
		
		String kredi1 = "H�zl� Kredi";
		String kredi2 = "Mutlu Emekli Kredisi";
		String kredi3 = "Konut Kredisi";
		String kredi4 = "�ift�i Kredisi";
		String kredi5 = "Msb Kredisi";

//		System.out.println(kredi1);
//		System.out.println(kredi2);
//		System.out.println(kredi3);
//		System.out.println(kredi4);
//		System.out.println(kredi5);
		
		String[] krediler = {"H�zl� Kredi","Mutlu Emekli Kredisi","Konut Kredisi","�ift�i Kredisi","Msb Kredisi","Meb Kredisi"};
		
		//foreach
		for(String kredi:krediler) {
			System.out.println(kredi);
		}
		
		System.out.println("----------------------------------");
		
		for(int i = 0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		
		
		
		
		
		
		
	}

}