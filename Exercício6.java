import java.util.Scanner;

public class Exerc�cio6 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int cod;
		float salario, salario_final;

		System.out.println("   Cargo      |   C�digo  ");
		System.out.println();
		System.out.println("  Diretor     |    001    ");
		System.out.println("  Engenheiro  |    002    ");
		System.out.println("  T�cnico     |    003    ");
		System.out.println("  Gerente     |    004    ");
		System.out.println("  Analista    |    005    ");
		System.out.println("  Cooerdenador|    006    ");
		System.out.println();
		System.out.print("Digite o c�digo do funcion�rio: 00");
		cod = leitor.nextInt();
		
		System.out.print("Digite seu sal�rio: ");
		salario = leitor.nextFloat();
		
		switch (cod) {
		
		case 1:
			salario_final = (salario*10) / 100;
			System.out.println("Seu sal�rio final �: "+(salario + salario_final));
			break;
		
		case 2:
			salario_final = (salario*20) / 100;
			System.out.println("Seu sal�rio final �: "+(salario + salario_final));
			break;
		
		case 3:
			salario_final = (salario*30) / 100;
			System.out.println("Seu sal�rio final �: "+(salario + salario_final));
			break;
		
		case 4:
			salario_final = (salario*10) / 100;
			System.out.println("Seu sal�rio final �: "+(salario + salario_final));
			break;
		
		case 5:
			salario_final = (salario*30) / 100;
			System.out.println("Seu sal�rio final �: "+(salario + salario_final));
			break;
		
		case 6:
			salario_final = (salario*20) / 100;
			System.out.println("Seu sal�rio final �: "+(salario + salario_final));
			break;
			
		default:
			salario_final = (salario*40) / 100;
			System.out.println("Seu sal�rio final �: "+(salario + salario_final));
			break;
			
		}
		
		
		

	}

}
