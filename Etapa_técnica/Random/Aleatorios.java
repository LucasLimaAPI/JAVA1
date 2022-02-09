package Etapa_técnica.Random;

import java.util.Random;
import java.util.Scanner;

public class Aleatorios {
    
    public static void main(String[] args) {
        Random random = new Random();
        try (Scanner scan = new Scanner(System.in)) {
            int escolha;
            System.out.println("Escolha um numero de 0-10");
   escolha = scan.nextInt();
   System.out.println("O numero escolhido foi: "+ escolha);
            int[] numerosAleatórios = new int[5];

            

            for(int i= 0 ; i < numerosAleatórios.length; i++) {
      int numero= random.nextInt(10);
      numerosAleatórios[i]= numero;
      if(escolha == numero){
            System.out.println("Voce acertou !!");
     }else{
              System.out.println("Voce errou!");
     }
            }

            System.out.println("Numeros aleatórios: ");
            for (int numero : numerosAleatórios) {
                System.out.println((numero+1) + " ");
                
            }
        }
       

        
    }

}
