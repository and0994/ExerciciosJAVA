package exercicio;

import java.util.Scanner;

public class Temporizador2 {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Temporizador");
		System.out.println("Configure seu temporizador");
		System.out.println("Digite os minutos");
		int k=sc.nextInt();
		System.out.println("Digite os segundos");
		int m=sc.nextInt();
		for (int i=k; i >= 0; i--) {
			for (int j = m; j >= 0; j--) {
				System.out.println(+i + " : " + j);
				Thread.sleep(1);
			}
		}

}}
