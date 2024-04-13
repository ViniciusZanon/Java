package aulasenai3;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Digite sua nota:");
		 int nota = scan.nextInt();
		 
		 if (nota >= 7) {
			 System.out.println("Você foi aprovado!");			 
		 }else if (nota < 7 && nota >= 5) {
			 System.out.println("Você está de recuperação!");
		 }else if(nota < 5) {
			 System.out.println("Você foi reprovado!");
		 }
		 
	}

}
