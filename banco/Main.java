package banco;

public class Main {

    public static void main(String[] args) {

        Cliente lucas = new Cliente();
        lucas.setNome("Lucas");

    

        Conta cc = new ContaCorrente(lucas);
        Conta cp = new Poupança(lucas);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
    
}
