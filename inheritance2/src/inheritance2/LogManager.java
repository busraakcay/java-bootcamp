package inheritance2;
//-
public class LogManager {
	public void log(int logType) {
		if(logType == 1) {
			System.out.println("veri taban�na logland�");
		}else if(logType == 2) {
			System.out.println("dosyaya logland�");
		}else {
			System.out.println("email g�nderildi");
		}
	}
}
