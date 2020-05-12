import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		

	Scanner leitor = new Scanner(System.in);	
		
	int num1, num2, num3, op1;
	float mp, ma;
	
	System.out.println("Digite a primeira nota: ");
	num1 = leitor.nextInt();	
		
	System.out.println("Digite a segunda nota: ");
	num2 = leitor.nextInt();	
		
	System.out.println("Digite a terceira nota: ");
	num3 = leitor.nextInt();	
		
	System.out.println("Qual a opção desejada?"
			+ "\n "
			+ "\nEscolha uma opção: "
			+ "\n"
			+ "\n(1) média aritmética"
			+ "\n(2) média aritmética ponderada");
		
	op1 = leitor.nextInt();
		
		switch (op1) {
		
		case 1:
			ma = (num1 + num2 + num3) /3;
			System.out.println("Sua média é: "+ma);
			break;
		
		case 2:
			mp = (num1*3 + num2 *3 + num3*4) / (3+3+4);
			System.out.println("Sua média é: "+mp);
			break;
		
		
		
		}
	
	
		
	}

}
