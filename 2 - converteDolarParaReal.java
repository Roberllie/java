import java.util.Scanner;

/*
 Faça um programa que:
- Leia a cotação do dólar
- Leia um valor em dólares
- Converta esse valor para Real
- Mostre o resultado
 */

public class Principal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int opcao = 1;
		
		while(opcao == 1) {
		System.out.println("Cotação do dolar: ");
		double cotacaoDolar = leitor.nextDouble();
		
		System.out.println("Valor em dólar: ");
		double valorEmDolar = leitor.nextDouble();
		
		double valorEmReal = converterDolarParaReal(cotacaoDolar, valorEmDolar);
		System.out.printf("Valor em reais: R$ %.2f " , valorEmReal);
		
		System.out.println("Deseja continuar? (1 = sim, 0 = não)");
		opcao = leitor.nextInt();
		}
		
	}
public static double converterDolarParaReal(double cotacao, double dolar) {
	return (cotacao * dolar); 
}

}
