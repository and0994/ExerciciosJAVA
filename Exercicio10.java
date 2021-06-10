package exercicio;

import java.util.Scanner;

/*Escrreva um algoritmo para ler as dimensões de um triângulo, calcular e 
 * escrever a area do triângulo*/
public class Exercicio10 {

	public static void  main(String[]args) {
		float base, alt, area;
		Scanner sc= new Scanner(System.in);
		System.out.print("Digite a base do triângulo:");
		base=sc.nextFloat();
		System.out.print("Digite a altura do triângulo:");
		alt=sc.nextFloat();
		area=base* alt / 2;
		
		System.out.print("A area do triângulo é de:"+area);
	}
	
}
