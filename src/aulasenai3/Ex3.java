package aulasenai3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int num1 = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Digite o operador(+, -, *, /)");
		String operador = entrada.nextLine();
		System.out.println("Digite Outro:");
		int num2 = entrada.nextInt();
		
		switch (operador) {
		case "+":
			System.out.println("O resultado é: " + (num1 + num2));
			break;
		case "-":
			System.out.println("o resultado é: " + (num1 - num2));
			break;
		case "*":
			System.out.println("O resultado é: " + (num1 * num2));
			break;
		case "/":
			System.out.println("O resultado é: " + (num1 / num2));
			break;
			
		
		}
	}

}
