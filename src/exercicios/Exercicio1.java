package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] vetor = new int[5];
		int contador = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = entrada.nextInt();
		}
		
		entrada.close();
		
		for (int j = 0; j < vetor.length; j++) {
			if (vetor[j] == 1) {
				contador++;
			}
		}
		
		if(contador == 2) {
			System.out.println("Suspeita");
		}else if (contador > 2 && contador < 5) {
			System.out.println("Cúmplice");
		}else if (contador == 5) {
			System.out.println("Assassino");
		}else {
			System.out.println("Inocente");
		}
		
	}

}
