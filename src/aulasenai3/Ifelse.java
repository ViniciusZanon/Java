package aulasenai3;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int resposta = 7;
		
		System.out.println("Digite um número entre 0 e 10");
		int x = entrada.nextInt();
		
		if(x == resposta) {
			System.out.println("Parabéns, você acertou!");
		}else if (x < resposta) {
			System.out.println("O número que digitou é menor que o número secreto.");
		}else {
			System.out.println("O número que digitou é maior que o número secreto.");
		}
		System.out.println("Saiu do if");
	}

}
