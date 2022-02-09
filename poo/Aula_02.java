package poo;

public class Aula_02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic crystal";
        c1.cor= "Azul";
        c1.ponta= 0.5f;//é real então utilizamos f
        c1.destampar();
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo= "Hostnet";
        c2.cor = "Preto";
        c2.ponta = 1.0f;
        c2.destampar();
        c2.status();
        c2.rabiscar();

    }
    
}
