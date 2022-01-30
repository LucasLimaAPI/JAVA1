package banco;


public class Poupança extends Conta {

    public Poupança(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("****Extrato Poupança****");  
        super.imprimirInfosComuns();       
      
    }

    @Override
    public void pix(Double valor, Conta contaDestino) {
        
    }
    

}
