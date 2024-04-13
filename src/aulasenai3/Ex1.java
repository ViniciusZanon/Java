package aulasenai3;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo número:");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("O " + num1 + " é maior que o " + num2);	
		}else if (num1 < num2) {
			System.out.println("O " + num1 + " é menor que o " + num2);
		}else {
			System.out.println("Os números são iguais!");
		}
	}
	
}
