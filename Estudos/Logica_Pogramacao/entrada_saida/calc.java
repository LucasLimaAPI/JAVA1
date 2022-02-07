package Estudos.Logica_Pogramacao.entrada_saida;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double num1, num2, sum, sub, mult, div;

            System.out.println("Digite um numero: ");
            num1 = scan.nextDouble();

            System.out.println("Digite um numero: ");
            num2 = scan.nextDouble();

            sum = num1 + num2;
            sub = num1 - num2;
            mult = num1 * num2;
            div = num1 / num2;

            System.out.println( num1 + "+" + num2 + "=" + sum +
                    "\n" + num1 + "+" + num2 + "=" + sub +
                    "\n" + num1 + "+" + num2 + "=" + mult +
                    "\n" + num1 + "+" + num2 + "=" + div );
        
        }

    }
}
