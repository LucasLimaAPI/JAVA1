package CalculosDeMedia;

import java.util.Scanner;

public class CalcDeMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos= {"Lucas","may","Mayara","Laura"};

        double media = CalcMediaTurma(alunos, scan);
        
        System.out.printf("Media da turma %.2f", media);
    }

    public static double CalcMediaTurma (String[] alunos, Scanner scanner){

        double soma = 0;
        for(String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;

    }
    
}
