package abstractClasses;

public abstract class GameCalculator { //abstract classlardan obje oluþturulamaz
//	public void hesapla() {
//		System.out.println("Puanýnýz: 100");
//	}
	
	public abstract void hesapla();
	
	public final void gameOver() { // baþka bir sýnýf tarafýndan override edilemez
		System.out.println("Oyun biti");
	}
	
}
