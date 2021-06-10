package exercicio;

import java.util.Scanner;

/*Escreva um programa para ler as dimensões de um quadrado, calcular e escrever
 * a área do quadrado*/

public class Exercicio11 {
	
	public static void main(String[]args) {
		
		float lado1, lado2, area;
		Scanner sc= new Scanner(System.in);
		System.out.print("Digite o valor do primeiro lado:");
		lado1=sc.nextFloat();
		System.out.print("Digite o valor do segundo lado:");
		lado2=sc.nextFloat();
		
		area=lado1 * lado2;
		
		System.out.print("A área do quadrado é de:"+area);
		
	}

}
