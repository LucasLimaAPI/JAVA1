package poo.exercicios;

public class Caderno {
    String modelo;
    String cor;
    Boolean aberto;
    int materias;
    double valor;
   

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Está aberto?: " + this.aberto);
        System.out.println("Matérias: " + this.materias);
        System.out.println("Valor: "+ this.valor);
    }

    
    
    void aberto(){
        this.aberto = true;
    
    }

    void fechado(){
        this.aberto = false;

    }



    
}
