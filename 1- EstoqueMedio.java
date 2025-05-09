import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Faça um programa para calcular o estoque médio de uma peça, sendo que:
		//ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2
		
		int estoqueMedio;		
		
		Scanner leitor = new Scanner(System.in); 
		
		System.out.println("Quantidade mínima: ");
		int qtdMinima = leitor.nextInt();
		
		System.out.println("Quantidade máxima: ");
		int qtdMaxima = leitor.nextInt();
		
		estoqueMedio = calcularEstoqueMedio(qtdMinima, qtdMaxima); 
		System.out.println("O estoque médio é: " + estoqueMedio);
		
		leitor.close(); 
			
	}
	
	public static int calcularEstoqueMedio(int minimo, int maximo) {
		return (minimo/maximo) / 2;
	}

}
