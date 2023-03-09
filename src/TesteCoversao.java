
public class TesteCoversao {
	
	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		int x = 200000; //só guarda números até 2 bilhões ou -2 bilhões
		long numeroGrande = 2522585846l; //esse guarda um número gigante é de 64 bits, quando o número escrito aqui passa do tamanho do int escreve o l
		short valorPequeno = 2131; //numeros pequenos 16bytes
		byte b = 127; //menor ainda é 1 byte
		float pontoFlutuante = 3.14f;//o float tem 32bytes
		
		double valor1= 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
	}

}
