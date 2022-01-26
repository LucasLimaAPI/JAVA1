package src.loops;

import java.util.Scanner;

public class notas {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int nota;

            System.out.println("Nota: ");
            nota = scan.nextInt();

            while (nota < 0 | nota > 10) {
                System.out.println("Nota Inválida Digite novamente: ");
                nota = scan.nextInt();
            }
        }

    }

}
