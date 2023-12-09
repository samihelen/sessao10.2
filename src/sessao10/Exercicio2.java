package sessao10;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Exercicio laço de repetição WHILE
		int idade;
		Scanner leia = new Scanner(System.in);
		int idMenor = 0, idMaior = 50, inval = 0;		
		
		while(idMenor<=21 && idMaior>=50 || inval>0) {
			System.out.println("Digite sua idade: \nOu digite um número negativo para sair");
			idade = leia.nextInt();
						
			if(idMenor<21) {
				idMenor++;								
			}else if(idMaior>50){
				idMaior++;
			}else {
				inval++;
			}
		}
		System.out.println("Total de pessoas menores de 21 anos: " + idMenor);
		System.out.println("Total de pessoas maiores de 50 anos: " + idMaior);
		
	}

}
