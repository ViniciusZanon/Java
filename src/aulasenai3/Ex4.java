package aulasenai3;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número:");
		int numero = entrada.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O número é par");
	    }else {
		   System.out.println("O número é impar");
	   }
}
}