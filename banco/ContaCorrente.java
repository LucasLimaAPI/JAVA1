package banco;

import java.util.Scanner;

public class ContaCorrente extends Conta{




    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("****Extrato Conta Corrente****");   
        imprimirInfosComuns();       
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

    


