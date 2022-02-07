package banco;

import java.util.Scanner;

public class Pix  extends Conta{



    protected Pix(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        try (Scanner scan = new Scanner(System.in)) {
            double pix;
            System.out.print("Digite o Valor Pix %d:");
            pix= scan.nextDouble();
            
            
            System.out.println(pix);
        }
        System.out.println("****Extrato Pix****");   
    }

    @Override
    public void pix(Double valor, Conta contaDestino) {
        try (Scanner scan = new Scanner(System.in)) {
            double pix;
            System.out.print("Digite o Valor Pix %d:");
            pix= scan.nextDouble();
            
            
            System.out.println(pix);
        }
        System.out.println("****Extrato Pix****");   
    }

    }

    
    
    

