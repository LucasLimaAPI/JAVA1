package poo.aula04;


//O METODO GETTER SETTER PROTEGE OS ATRIBUTOS
public class Caneta {
    
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
   
    public Caneta(String modelo, float ponta, String cor) {//METODO CONSTRUTOR
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
    }

    


    public String getModelo() {
        return modelo;
    }




    public void setModelo(String modelo) {
        this.modelo = modelo;
    }




    public float getPonta() {
        return ponta;
    }




    public void setPonta(float ponta) {
        this.ponta = ponta;
    }




    public boolean isTampada() {
        return tampada;
    }




    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }




    public String getCor() {
        return cor;
    }




    public void setCor(String cor) {
        this.cor = cor;
    }



    public void status() {
        for(int i = 0 ; i <=3 ; i++){
            System.out.print(" "+i+"...");
            if(i == 3){
                System.out.println(" Aceitando pagamento! ");
            }
        }

        System.out.println("\t\t|=======SOBRE A CANETA=======|");
        System.out.println("\t\t|\t Modelo: " + this.getModelo()+"\t     |");
        System.out.println("\t\t|\t Ponta: " + this.getPonta()+"\t     |");
        System.out.println("\t\t|\t Cor: " + this.cor+"\t     |");
        System.out.println("\t\t|\t Tampada: " + this.tampada+"\t     |");
        System.out.println("\t\t|============================|");



    }

}
