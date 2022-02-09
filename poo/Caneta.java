package poo;

public class Caneta {
    public String modelo;
    public String cor;
   float ponta;
    int carga; 
    boolean tampa;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor); //this autoreferencia vai ser substituido pelo atributo por exemplo c1
        System.out.println("Ponta: " + this.ponta);
        System.out.println("carga: " + this.carga );
        System.out.println("Está tampada? " + this.tampa);
    }

    void rabiscar(){
        if(this.tampa == true){
            System.out.println("A caneta está tampada!!");
        }else{
            System.out.println("Rabiscando");
        }

    }
    void tampar(){
        this.tampa = true;

    }
    void destampar(){
        this.tampa = false;

    }
  
    
}
