package src.arrays;

import java.util.Random;

public class Aleatorios {
    
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatórios = new int[20];

        for(int i= 0 ; i < numerosAleatórios.length; i++) {
       int numero= random.nextInt(100);
       numerosAleatórios[i]= numero;
        }

        System.out.println("Sucessores Numeros Aleatórios: ");
        for (int numero : numerosAleatórios) {
            System.out.println((numero+1) + " ");
        }

        
    }

}
