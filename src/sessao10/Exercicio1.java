package sessao10;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// exercicio laço de repetição FOR
		
		int numero;
		Scanner leia = new Scanner(System.in);
		int contador = 0, contadorImpar = 0;
		
		for(int num=1; num<=10; num++) {
			System.out.println("Digite "+num+"º:");
			numero = leia.nextInt();
			
			if(numero%2==0) {
				contador++;								
			}else {
				contadorImpar++;								
			}
		}
		System.out.println("Total de números pares: " + contador);
		System.out.println("Total de números impares: " + contadorImpar);
		 
	}

}
