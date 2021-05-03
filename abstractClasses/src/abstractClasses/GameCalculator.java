package abstractClasses;

public abstract class GameCalculator { //abstract classlardan obje olu�turulamaz
//	public void hesapla() {
//		System.out.println("Puan�n�z: 100");
//	}
	
	public abstract void hesapla();
	
	public final void gameOver() { // ba�ka bir s�n�f taraf�ndan override edilemez
		System.out.println("Oyun biti");
	}
	
}
