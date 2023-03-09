
public class TestaSomatoria {
	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		while (contador <= 10) {
			System.out.println(contador);
			total += contador;
			contador++;
		}
		System.out.println("Somatória total = " + total);
	}
}
