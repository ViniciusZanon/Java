package aulasenai3;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite opção desejada:");
		System.out.println("1 - Pizza!");
		System.out.println("2 - Lanche!");
		System.out.println("3 - Espeto!");
		System.out.println("4 - Frango Frito!");
		int opcao = entrada.nextInt();
		
		switch(opcao) {
		
		case 1:
			System.out.println("Você escolheu Pizza!");
			break;
		case 2:
			System.out.println("Você escolheu Lanche!");
			break;
		case 3:
			System.out.println("Você escolheu Espeto!");
			break;
		case 4:
			System.out.println("Você escolheu Frango Frito!");
			break;
		}
		
	}

}
