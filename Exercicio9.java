package exercicio;

import java.util.Scanner;

/*Escreva um algoritmo para ler as dimensões de um paralelogramo, calcular
 * e escrever área do paralelogramo*/
public class Execicio9 {
	
	public static void main(String[]args) {
		float base, alt, area;
		Scanner sc= new Scanner(System.in);
		System.out.print("Digite o valor da base:");
		base=sc.nextFloat();
		System.out.print("Digite o valor da altura:");
		alt=sc.nextFloat();
		
		area= base * alt;
		
		System.out.print("A area do paralelograma é de:"+area);
		
		
		
	}

}
