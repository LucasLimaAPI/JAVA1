package Estudos.Logica_Pogramacao.comparativos;

import java.util.Scanner;

public class Op_comparativos {

    public static void main(String[] args) {
        
        try (Scanner in = new Scanner(System.in)) {
            int idade;
            System.out.println("Digite sua idade");
            idade = in.nextInt(); 

            
            System.out.println((idade >= 18 ? "Você é maior de idade" : "Você é menor de idade"));
        }


    }
    
}
