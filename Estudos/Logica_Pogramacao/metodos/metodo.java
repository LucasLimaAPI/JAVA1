package Estudos.Logica_Pogramacao.metodos;

import java.util.Scanner;

public class metodo {
 
    public static void main(String[] args) {
        int i = 0;
       soma();

        while(i <= 5){
            System.out.println(i++);
        }      
    }
  
    
    public static void soma(){
        try (Scanner scan = new Scanner(System.in)) {
           
            System.out.println("Digite o primeiro numero: ");
            int num1 = scan.nextInt();
            
            System.out.println("Digite o primeiro numero: ");
            int num2 = scan.nextInt();

            System.out.println(num1 + num2);
        }
    }
}
