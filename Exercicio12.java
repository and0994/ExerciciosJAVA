package exercicio;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int cont=0;
		while(cont<3) {
			System.out.println("Digite o seu nome:");
			String nome=sc.next();
			System.out.println("Qual o seu sexo?");
			String sexo=sc.next();
			System.out.println("Digite sua primeira nota:");
			float n1=sc.nextFloat();
			System.out.println("Digite sua segunda nota:");
			float n2=sc.nextFloat();
			System.out.println("Digite sua terceira nota:");
			float n3=sc.nextFloat();
			System.out.println("Digite sua quarta nota:");
			float n4=sc.nextFloat();
			float media= (n1 + n2 + n3 + n4) / 4;
			
			System.out.println(nome);
			System.out.println(sexo);
			System.out.println(media);
			cont=cont+1;
		}
	}
}
