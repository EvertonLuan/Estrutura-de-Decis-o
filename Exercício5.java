import java.util.Scanner;

public class Exerc�cio5 {

	public static void main(String[] args) {
		

		Scanner leitor = new Scanner(System.in);
		
		float prod, valor_final;
		int cod; 
		
	System.out.println("Digite o valor do produto: ");
	prod = leitor.nextFloat();
		
	System.out.println("(1) � vista em dinheiro ou cheque com 10% de desconto");
	System.out.println("(2) � vista com cart�o de cr�dito 5% de desconto");
	System.out.println("(3) Em duas vezes com o pre�o normal da etiqueta sem juros");
	System.out.println("(4) Em 3 vezes com 10% de juros");
	cod = leitor.nextInt();
	
	switch (cod) {
	
	case 1:
		valor_final = (prod*10) /100;
		System.out.println("O valor final do produto �: "+ (prod - valor_final));
		break;
	
	case 2:
		valor_final = (prod*5) /100;
		System.out.println("O valor final do produto �: "+ (prod - valor_final));
		break;
	
	case 3:
		valor_final = prod /2;
		System.out.println("O valor final do produto �: "+ (valor_final));
		break;
	
	case 4:	
		valor_final = (prod*10) /100;
		System.out.println("O valor final do produto �: "+ ((prod + valor_final)/3));
		break;
		
		
		
	}
		
		
		
		
		
		
		
	}

}
