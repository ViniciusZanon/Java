package aulasenai3;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu Peso:");
		int peso = entrada.nextInt();
		System.out.println("Digite sua Altura:");
		double altura = entrada.nextDouble();
		
		double imc = peso / Math.pow((altura/100), 2);
		String imcFormatado = String.format("%.2f", imc);
		
		if (imc < 16) {
			System.out.print("Seu imc é: " + imcFormatado + " Magreza grau III");
		}else if (imc >= 16 && imc < 17) {
			System.out.print("Seu imc é: " + imcFormatado + " Magreza grau II");
		}else if (imc >= 17 && imc < 18.5) {
			System.out.print("Seu imc é: " + imcFormatado + " Magreza grau I");
		}else if (imc >= 18.5 && imc < 25) {
			System.out.print("Seu imc é: " + imcFormatado + " Eutrofia");
		}else if (imc >= 25 && imc < 30) {
			System.out.print("Seu imc é: " + imcFormatado + " Pré Obesidade");
		}else if (imc >= 30 && imc < 35) {
			System.out.print("Seu imc é: " + imcFormatado + " Obesidade moderada (Grau I)");
		}else if (imc >= 35 && imc < 40) {
			System.out.print("Seu imc é: " + imcFormatado + " Obesidade severa (Grau II)");
		}else if (imc >= 40) {
			System.out.print("Seu imc é: " + imcFormatado + " Obesidade muito severa (Grau III)");
		}
	}

}
