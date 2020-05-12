import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		
		
		int cod_produto, quantidade;
		double valor_total = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("     Produto      |      Código      |     Preço     ");
		System.out.println();
		System.out.println(" Cachorro-quente  |       100        |      3.2      ");   
		System.out.println(" Bauru simples    |       101        |      4.3      ");
		System.out.println(" Bauru com ovo    |       102        |      5.5      ");
		System.out.println(" Hambúrger        |       103        |      3.2      ");
		System.out.println(" Cheeseburger     |       104        |      4.3      ");
		System.out.println(" Refrigerante     |       105        |      4.0      ");
		System.out.println();
		
		System.out.print("Digite o código do produto: ");
		cod_produto = leitor.nextInt();
		
		System.out.print("Digite a quantidade do produto: ");
		quantidade = leitor.nextInt();
		
		
		System.out.print("\nVocê escolheu a opção: ");
		
		switch (cod_produto) {
		
		case 100:
			System.out.println("Cachorro-Quente");
			valor_total = quantidade * 3.2;
			break;
		
		case 101:
			System.out.println("Bauru simples");
			valor_total = quantidade * 4.3;
			break;
		
		case 102:
			System.out.println("Bauru com ovo");
			valor_total = quantidade * 5.5;
			break;
		
		case 103:
			System.out.println("Hambúrger");
			valor_total = quantidade * 3.2;
			break;
		
		case 104:
			System.out.println("Cheeseburger");
			valor_total = quantidade * 4.3;
			break;	
		
		case 105:
			System.out.println("Refrigerante");
			valor_total = quantidade * 4.0;
			break;	
		}
		
		System.out.println("Valor total do produto: "+valor_total);
		
		
		
		
		
		
		
		
		
	}

}
