package aulasenai3;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número que deseja saber a tabuada!:");
		int numero = entrada.nextInt();
		int x;
		for(x = 0; x < 11; x +=1) {
			int resultado = numero * x;
			System.out.printf("%s x %s = %s", numero, x, resultado);
			System.out.println();
		
		}
		
	}

}
