package exercicio;

import java.util.Iterator;

public class Cronometro {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i <= 23; i++) {
			for (int j = 0; j <= 59; j++) {
				for (int k = 0; k <= 59; k++) {
					System.out.println(i + " : " + j + " : " + k);
					Thread.sleep(500);
				}
			}
		}

	}

}
