package poo.exercicios;

public class Main {

    public static void main(String[] args) {
        Caderno c1 = new Caderno();
        c1.modelo = "RedNose";
        c1.materias= 20;
        c1.aberto();
        c1.cor = "vermelho e preto";
        c1.valor= 38.00;
        c1.status();
        

        Caderno c2 = new Caderno();
        c2.modelo = "Surfing";
        c2.materias= 15;
        c2.fechado();
        c2.cor = "vermelho e preto";
        c2.valor= 25.00;
        c2.status();
        





    }
    
}
