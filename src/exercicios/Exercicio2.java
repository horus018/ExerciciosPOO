package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int idade;
		int peso;
		String sexo;
		int doacoesNoAno;

		idade = entrada.nextInt();
		peso = entrada.nextInt();
		sexo = entrada.next();
		doacoesNoAno = entrada.nextInt();
		
		entrada.close();
		
		if(idade < 18 || idade > 67) {
			System.out.println("Não pode doar sangue");
		}else if(peso < 46) {
			System.out.println("Não pode doar sangue");
		}else if(sexo.equals("m") && doacoesNoAno >= 4) {
			System.out.println("Não pode doar sangue");
		}else if(sexo.equals("f") && doacoesNoAno >= 3) {
			System.out.println("Não pode doar sangue");
		}else {
			System.out.println("Pode doar sangue");
		}
		
	}

}
