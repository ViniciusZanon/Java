package aulasenai4;

import java.util.Scanner;

public class DesafioInvest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		while(true) {
		
			System.out.println("Digite o valor inicial:");
		int inicial = entrada.nextInt();
			System.out.println("Digite o depósito mensal:");
		int mensal = entrada.nextInt();
			System.out.println("Digite a taxa de juros");
		double taxa = entrada.nextDouble();
		
		double acumulado = (inicial + (inicial * (taxa / 100)) + mensal);
		
		for(int periodo = 1; periodo <= 12; periodo++) {
		
			System.out.printf("O valor acumulado no %s° mês será de R$:%s \n", periodo, acumulado);
			
		acumulado = acumulado + (acumulado * (taxa / 100)) + mensal;
		}
		
			System.out.println("Deseja simular mais um ano ?\n1 - sim \n0 - não");
		int opcao = entrada.nextInt(); 
		if (opcao == 0) {
		break;
	  }
	}
  }	
}
