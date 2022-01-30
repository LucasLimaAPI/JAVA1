package banco;

public interface IAconta {

    void sacar(double valor);
    
    void depositar(double valor);
    
    void transferir(double valor , Conta contaDestino);

    void pix(Double valor , Conta contaDestino);

    void imprimirExtrato();

    
}
