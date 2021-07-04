package exercicio;

import java.util.Scanner;

public class Calculadora {

	public static void operacao(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor:");
		int v1 = sc.nextInt();
		System.out.println("Digite o segundo valor:");
		int v2 = sc.nextInt();
		System.out.println(
				"Insira o número correspondente a operação desejada \n 1.Soma \n 2.Subtração \n 3.Multiplicação \n 4.Divisão");
		int op = sc.nextInt();

		switch (op) {
		case 1: {
			float total = v1 + v2;
			System.out.println("O resultado da operção é: " + total);
			break;
		}
		case 2: {
		
			float total = v1 - v2;
			System.out.println("O resultado da operção é: " + total);
			break;
		}
		case 3: {
			float total = v1 * v2;
			System.out.println("O resultado da operção é: " + total);
			break;
		}
		case 4: {
			float total = v1 / v2;
			System.out.println("O resultado da operção é: " + total);
			break;
		}

		default:
			System.out.println("Erro");
		}
	}

	public static void main(String[] args) {
		operacao(args);
	}
}
