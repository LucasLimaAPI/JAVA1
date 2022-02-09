package poo.aula03;

public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    protected int carga; 
    private boolean tampa;


    

   public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor); //this autoreferencia vai ser substituido pelo atributo por exemplo c1
        System.out.println("Ponta: " + this.ponta);
        System.out.println("carga: " + this.carga );
        System.out.println("Está tampada? " + this.tampa);
    }

    public void rabiscar(){
        if(this.tampa == true){
            System.out.println("A caneta está tampada!!");
        }else{
            System.out.println("Rabiscando");
        }

    }
   public void tampar(){
        this.tampa = true;

    }
    public void destampar(){
        this.tampa = false;

    }
  
    
}
