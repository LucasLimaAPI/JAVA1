package Estudos.Logica_Pogramacao.entrada_saida;

import java.util.Scanner;

public class Entrada_saida_dados {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String pedirNome = "";
            pedirNome = scan.nextLine();
            
            System.out.println("Olá "+pedirNome+" Seja bem vindo");
        }
       
        
        



 
        
    }
    
}
