package Estudos.Logica_Pogramacao.ferramentas;

import java.util.Scanner;

public class if_else {

    public static void main(String[] args) {
    try (Scanner Scan = new Scanner(System.in)) {
        int nota1;
        int nota2;
        int idade;
        int  result;

        System.out.println("Digite sua Idade ");
        idade= Scan.nextInt();
        System.out.println("Digite sua nota: ");
        nota1= Scan.nextInt();
        System.out.println("Digite sua nota: ");
        nota2= Scan.nextInt();

        result = (nota1 + nota2)/2;


        if(result > 5 && idade >=18){
            System.out.println("Voce passou!!");
            System.out.println(result);
        }else{
            System.out.println("Voce Reprovou!");
            System.out.println(result);

        }
    }



    }
    
}
