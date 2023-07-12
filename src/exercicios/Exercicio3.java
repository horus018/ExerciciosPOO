package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] vetor = new int[10];
		int valoresIncorretos = 0;
		int[] valoresCorretos = new int[10];
		int somaPares = 0;

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = entrada.nextInt();

			// SE FOR 0 SAI DO FOR IMEDIATAMENTE
			if (vetor[i] == 0) {
				// System.out.println("Passou aqui");
				break;
			}

			if (vetor[i] < 0 || vetor[i] > 100) {
				valoresIncorretos++;
			} else {
				valoresCorretos[i] = vetor[i];

				if (vetor[i] % 2 == 0) {
					// ver se soma ele mais o proximo
					somaPares += vetor[i];
				}

			}

			if (i + 1 == vetor.length) {
				vetor[i] = entrada.nextInt();
				System.out.println("capacidade de armazenamento esgotada");
			}

		}

		for (int i = 0; i < valoresIncorretos; i++) {
			System.out.println("número inválido");
		}

		System.out.print("números armazenados: ");

		for (int i = 0; i < valoresCorretos.length; i++) {

			if (valoresCorretos[i] != 0) {
				System.out.print(valoresCorretos[i] + "; ");
			}

		}
		
		System.out.print("\nsoma dos números pares: "+somaPares);

		entrada.close();
	}

}
