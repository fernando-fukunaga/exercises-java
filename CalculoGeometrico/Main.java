package CalculoGeometrico;

public class Main {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular(5, 5);
        double perimetro = calculadora.calcularPerimetro();
        double area = calculadora.calcularArea();
        System.out.println("A área da sala é de: "+area+" m. E o perímetro é de: "+perimetro+" m.");
    }
}
