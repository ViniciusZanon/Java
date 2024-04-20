package aulasenai4;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int vetor[] = new int [10];
		
		vetor[0] = 10;
		vetor[1] = 5;
		vetor[2] = 3;
		
		for(int x = 3; x < 10; x++) {
			System.out.println("Digite um número: ");
			vetor[x] = entrada.nextInt();
		}
		
		for(int x =0; x < 10; x++) {
			System.out.println("Olá eu sou o N°" + vetor[x] + " e estou na posição: " + x);
		}
	}

}
