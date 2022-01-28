package banco;

import java.util.Scanner;

public  abstract class Conta implements IAconta{

    private static final int AGENCIA_PADRAO = 1;
    
    
    private static int SEQUENCIAL = 1;
    
    protected static final double Pix = 0;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;  
    
    
    
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        
    }
    
    @Override
    public void sacar(double valor) {
        saldo -= valor;
        
    }
    @Override
    public void depositar(double valor) {
        
        saldo += valor;
        
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        contaDestino.depositar(Pix);
        
        try (Scanner scan = new Scanner(System.in)) {
            double pix;
            System.out.print("Digite o Valor Pix:");
            pix= scan.nextDouble();
            System.out.println(pix);
            System.out.print("*****Enviando para conta corrente******");
        }
        System.out.println(valor+Pix);  

        }
        
    
    
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s",this.cliente.getNome()));   
        System.out.println(String.format("Agencia: %d",this.agencia));   
        System.out.println(String.format("Numero: %d", this.numero));     
        System.out.println(String.format("Saldo: %.2f R$", this.saldo));

    }

    
    


    
}
