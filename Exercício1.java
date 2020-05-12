import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
	
		String cod_produto;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o código do produto: 00");
		cod_produto = leitor.next();
		
		System.out.print("Item escolhido: ");
		
		switch (cod_produto) {
		
			case "1":
				System.out.print("Parafuso");
			break;
		
			case "2":
				System.out.print("Porca");
				break;
			
			case "3":
				System.out.print("Prego");
				break;
			
			case "4":
				System.out.print("Ferramenta");
				break;
			
			
			
			
			
			
		}
		
			
		
		
		
		
		
		
		
		
		
		
		
	}

}
