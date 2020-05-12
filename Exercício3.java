import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		
		int cod1;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("(1) Executa a rotina de Inclusão de alunos ");
		System.out.println("(2) Executa a rotina de Alteração de alunos ");
		System.out.println("(3) Executa a rotina de Exclusão de alunos ");
		System.out.println("(4) Executa a rotina de Consulta de alunos ");
		System.out.println(); 
		
		
		
		System.out.print("Escolha uma opção de acordo com o número mostrado acima: ");
		cod1 = leitor.nextInt();
		
		switch (cod1) {
			
		case 1:
			System.out.println("Executa a rotina de Inclusão de alunos");
			break;
		
		case 2:
			System.out.println("Executa a rotina de Alteração de alunos");
			break;
			
		case 3:
			System.out.println("Executa a rotina de Exclusão de alunos");
			break;
			
		case 4:
			System.out.println("Executa a rotina de Consulta de alunos");
			break;
			
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
	}

}
