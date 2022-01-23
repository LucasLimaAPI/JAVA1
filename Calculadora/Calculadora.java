package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int a, b;

            System.out.print("Digite o primeiro valor:");
            a = scan.nextInt();
            System.out.print("Digite o segundo valor:");
            b = scan.nextInt();

            int somar = soma(a, b);
            int sub = subtrair(a, b);
            int mult = mult(a, b);
            int div = div(a, b);

            System.out.println("Somar:" + somar);
            System.out.println("Subtrair:" + sub);
            System.out.println("multiplicar:" + mult);
            System.out.println("Dividir:" + div);
        }

    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }
}
