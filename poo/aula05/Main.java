package poo.aula05;

public  class Main {
    
    public static void main(String[] args) {
     
        Banco p1 = new Banco();
        p1.setNumConta(111112);
        p1.setDono("Lucas");
        p1.abrirConta("CP");
        

        Banco p2 = new Banco();
        p2.setNumConta(12322);
        p2.setDono("May");
        p2.abrirConta("CC");

        p1.depositar(500f);
        p2.depositar(150f);
        p1.estadoAtual();
        p2.estadoAtual();


    }


}
