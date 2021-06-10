package exercicio;

import java.util.Scanner;

public class Exercicio7 {

	public static void main (String[]args) {
		int larg, alt, res;
		Scanner sc= new Scanner(System.in);
		System.out.print("Digite a largura do retângulo:");
		larg=sc.nextInt();
		System.out.print("Digite a altura do retângulo:");
		alt=sc.nextInt();
		res=larg * alt;

		System.out.println("A dimensão do retângulo é de:"+res );
		
	}
	
}
