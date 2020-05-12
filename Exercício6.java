import java.util.Scanner;

public class Exercício6 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int cod;
		float salario, salario_final;

		System.out.println("   Cargo      |   Código  ");
		System.out.println();
		System.out.println("  Diretor     |    001    ");
		System.out.println("  Engenheiro  |    002    ");
		System.out.println("  Técnico     |    003    ");
		System.out.println("  Gerente     |    004    ");
		System.out.println("  Analista    |    005    ");
		System.out.println("  Cooerdenador|    006    ");
		System.out.println();
		System.out.print("Digite o código do funcionário: 00");
		cod = leitor.nextInt();
		
		System.out.print("Digite seu salário: ");
		salario = leitor.nextFloat();
		
		switch (cod) {
		
		case 1:
			salario_final = (salario*10) / 100;
			System.out.println("Seu salário final é: "+(salario + salario_final));
			break;
		
		case 2:
			salario_final = (salario*20) / 100;
			System.out.println("Seu salário final é: "+(salario + salario_final));
			break;
		
		case 3:
			salario_final = (salario*30) / 100;
			System.out.println("Seu salário final é: "+(salario + salario_final));
			break;
		
		case 4:
			salario_final = (salario*10) / 100;
			System.out.println("Seu salário final é: "+(salario + salario_final));
			break;
		
		case 5:
			salario_final = (salario*30) / 100;
			System.out.println("Seu salário final é: "+(salario + salario_final));
			break;
		
		case 6:
			salario_final = (salario*20) / 100;
			System.out.println("Seu salário final é: "+(salario + salario_final));
			break;
			
		default:
			salario_final = (salario*40) / 100;
			System.out.println("Seu salário final é: "+(salario + salario_final));
			break;
			
		}
		
		
		

	}

}
