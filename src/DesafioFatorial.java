
public class DesafioFatorial {
	public static void main(String[] args) {
		int fatorial = 0;
		for(int n = 6; n < 7; n++) {
			for(int multiplicador = 1; multiplicador < n; multiplicador++) {
				fatorial = multiplicador*n + fatorial;
			}
			System.out.println(fatorial);
		}
		
	}
}
//so there needs to be a original number (4) and this number needs to be multiplied by
// 1, 2, 3 and stop at four