package Operadores.out;

public class Main {

    public static void main(String[] args){

    boolean b1 = true;
    boolean b2 = false;
    boolean b3 = true;
    boolean b4 = false;

    System.out.println(b1 && b2);
    System.out.println(b1 && b3);

    System.out.println(b1 || b2);
    System.out.println(b3 || b4);

    System.out.println(b1 ^ b2);
    System.out.println(b3 ^ b4);

    System.out.println(!b1);
    System.out.println(!b2);


    double salarioMensal = 1745.00;
    double mediaSalario = 1700.00;

    int quantidadeDependentes =4;
    int mediaDependetentes = 2;

    System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependetentes));
    boolean salarioBaixo = salarioMensal < mediaSalario;
    boolean muitosDependentes = quantidadeDependentes >= mediaDependetentes;

    System.out.println((salarioBaixo) && (muitosDependentes));

    boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

    System.out.println("Recebe auxilio " + recebeAuxilio);
    }
}
