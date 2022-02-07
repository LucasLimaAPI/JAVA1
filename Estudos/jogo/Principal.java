package Estudos.jogo;

import java.util.Scanner;

public class Principal {

    Scanner scan = new Scanner(System.in);
    String[][] campo = new String[3][3];
    boolean jogadorX = true;
    boolean fim = false;
    int linha = 0;
    int coluna = 0;

    public static void main(String[] args) {
        System.out.println(".::.Jogo da velha.::.");

        new Principal();
    }

    public Principal() {
        inicializarCampo();
        atualizarCampo();
        Jogo();
    }

    public void Jogo() {

        do {
            System.out.println("É a vez do jogador:" + (jogadorX ? "X" : "O"));
            pedirPosicao();
            campo [linha - 1][coluna -1] =  (jogadorX ? "X" : "O");
            atualizarCampo();

        } while (!fim);

    }


    public void pedirPosicao() {

        int l, c;
        boolean verL = false;
        boolean verC = false;

       do{
        System.out.println("Digite a linha do jogador " + (jogadorX ? "X" : "O"));
        l = scan.nextInt();
        if (l < 4 && l > 0) {

            linha = l;
            verL = true;
        
       }
        }while(!verL);

        do{
            System.out.println("Digite a Coluna do jogador " + (jogadorX ? "X" : "O"));
            c = scan.nextInt();
            if (c < 4 && l > 0) {
    
                coluna = c;
                verC = true;
            
           }
            }while(!verC);


    }

    public void atualizarCampo() {
        for (int i = 0; i < campo.length; i++){
            for (int j = 0; j < campo[i].length; j++) {
                System.out.println(campo[i][j]);
                if(j < 2){
                    System.out.println(" | ");
                }
            }
        }

    }

    public void inicializarCampo() {
        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo[i].length; j++) {
                campo[i][j] = "_";

            }
            System.out.println();
        }
    }

}