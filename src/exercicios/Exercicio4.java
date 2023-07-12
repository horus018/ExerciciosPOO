package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		double impostoBasico = 0.115;
		Scanner entrada = new Scanner(System.in);
		
		int salario = entrada.nextInt();
		String estadoCivil = entrada.next();
		String dependentes = entrada.next();
		
		if (estadoCivil.equals("solteiro")) {
			impostoBasico += 0.023;
		}
		
		if(dependentes.equals("não")) {
			impostoBasico += 0.011;
		}
		
		if(salario > 500000) {
			impostoBasico += 0.095;
		}else if(salario > 100000) {
			impostoBasico += 0.075;
		}else if(salario > 50000) {
			impostoBasico += 0.065;
		}
		
		System.out.println("taxa de imposto aplicada: "+impostoBasico*100+"%");
		System.out.println("valor devido R$: "+salario*impostoBasico);
		
		entrada.close();
	}

}
