package one.dio.com;

public class Main {

    public static void main(String[] args) {

        System.out.println("A quantidade de lados de um quadrilatero é?");

        //Retornos
        double araeQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado:" + araeQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8,9);
        System.out.println("Área do trapézio:" + areaTrapezio);
    }
}
