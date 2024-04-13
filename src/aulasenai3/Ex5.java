package aulasenai3;

import java.util.Scanner;

public class Ex5 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um número:");
        double num1 = entrada.nextDouble();
        System.out.println("Insira o segundo número:");
        double num2 = entrada.nextDouble();
        System.out.println("Digite o terceiro número:");
        double num3 = entrada.nextDouble();
        
        double maior = num1;
        
        if (num2 > maior) {
            maior = num2; 
        }
        
        if (num3 > maior) {
            maior = num3;
        }
        
        if (num1 == num2 && num2 == num3) {
            System.out.println("Os números são iguais");
        } else {
            System.out.println("O maior número é: " + maior);
        }
        
        entrada.close();
    }
}

