import java.util.Scanner;

public class Exerc�cio4 {

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
		
	System.out.println("Qual a op��o desejada?"
			+ "\n "
			+ "\nEscolha uma op��o: "
			+ "\n"
			+ "\n(1) m�dia aritm�tica"
			+ "\n(2) m�dia aritm�tica ponderada");
		
	op1 = leitor.nextInt();
		
		switch (op1) {
		
		case 1:
			ma = (num1 + num2 + num3) /3;
			System.out.println("Sua m�dia �: "+ma);
			break;
		
		case 2:
			mp = (num1*3 + num2 *3 + num3*4) / (3+3+4);
			System.out.println("Sua m�dia �: "+mp);
			break;
		
		
		
		}
	
	
		
	}

}
