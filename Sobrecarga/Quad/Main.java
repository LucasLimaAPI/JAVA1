package Sobrecarga.Quad;

public class Main {

    public static void main(String[] args) {

        System.out.println("Retornos");

        double areaQuadrado = Quad.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quad.area(5,5);
        System.out.println("Área do retangulo: " + areaRetangulo);

        double areaTrapezio = Quad.area(7,8,9);
        System.out.println("Área do trapézio: " + areaTrapezio);

        
    }
    
}
