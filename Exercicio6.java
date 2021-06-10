package exercicio;

import java.util.Scanner;
public class Exercicio6 {

	public static void main (String[]args) {
		int num, res;
		Scanner sc= new Scanner(System.in);
		System.out.print("Digite um número:");
		num=sc.nextInt();
		res =num + 1;
		
		System.out.println("O números sucessor ao digitado é:"+res);
		
	}
}
