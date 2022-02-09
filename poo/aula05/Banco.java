package poo.aula05;

public  class Banco {
    //ATRIBUTOS
    public int numConta;
    protected String tipo ;
    private String dono; 
    private float saldo;
    private boolean status;



    //Métodos

    public Banco() {
        this.saldo =  0;
        this.status =  false;
    }

    public void estadoAtual(){
        System.out.println("-------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("Saldo: " + this.getSaldo());

    }

    
    public void abrirConta(String tipo){
        setTipo(tipo);
        setStatus(true);
        System.out.println("Conta aberta com sucesso");
        if(tipo == "CC"){
           System.out.println(saldo = 50);
        }else if(tipo == "CP"){
            System.out.println(saldo = 150);
        }
    }

    public void fecharConta(){
        if(saldo > 0){
            System.out.println("A conta possui dinheiro!");
        }else if(saldo < 0){
            System.out.println("Sua conta está em Débito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }

    }
    public void depositar(float valor){
        if(status == true){
          this.setSaldo(this.getSaldo() + valor);
           System.out.println("Depositado na conta de: "+this.getDono());
        }else{
            System.out.println("Impossivel fazer depósito nessa conta!");
        }
    }
    public void sacar(float valor){
        if(status == true){
        }else{
            System.out.println("Impossivel sacar");
        }
        if(saldo > valor){
            this.setSaldo(this.getSaldo()-valor);
            System.out.println("Saque realizado na conta de: "+ this.getDono());
        }else{
            System.out.println("Saldo insuficiente!");
        }
    

    }
    public void pagarMensal(Float v){
         if(tipo =="CC"){
            v= 12f;
         }else if(tipo == "CP"){
            v = 20f;
         }

         if(status == true){
             
         }else{
             System.out.println("Impossivel pagar");
         }
         if(saldo > v){
            setSaldo(getSaldo() - v);
            System.out.println("Mensalidade Paga Com Sucesso!!");
         }else{
             System.out.println("Saldo insuficiente");
         }

    }



    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    



    
}
