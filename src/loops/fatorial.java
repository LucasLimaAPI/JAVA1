package src.loops;

import java.util.Scanner;

public class fatorial {
    
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Fatorial: ");
            int fatorial = scan.nextInt();
            int multp = 1;

            System.out.println(fatorial +   "! =");

            for(int i = fatorial ;i > 1; i--){
                multp = multp * i;

            }
            System.out.println(multp);
        }

    }
}
