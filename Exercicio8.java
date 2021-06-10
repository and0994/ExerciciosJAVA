package exercicio;

import java.util.Scanner;

/* Escreva um programa para ler o raio de um circulo, calcular e escrever sua area
 *  (pR2)*/
public class Exercicio8 {
	
	public static void main (String[]args) {
		double pi, raio, area;
		Scanner sc= new Scanner(System.in);
		System.out.print("Qual o raio do circulo:");
		raio=sc.nextDouble();
		pi = Math.PI;
		area = pi * raio * raio;
		
		System.out.println("A área do circulo é de:"+ area);
		
	}
	
}
