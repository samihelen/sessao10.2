package sessao10;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Exercicio laço de repetição DO WHILE
		Scanner leia = new Scanner(System.in);
		
		int num, p=0, n=0;
		
		do {
			System.out.println("Insira um número diferente de 0: ");
			num = leia.nextInt();
			
			if(p>0 && n<0) {
				num = p + num;
			}
		}while(num!=0);
		
		System.out.println("Total de números positivos: " + (num + p));
	}
	
}
