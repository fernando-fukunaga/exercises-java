package CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    double altura;
    double largura;

    public CalculadoraSalaRetangular(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }

    @Override
    public double calcularPerimetro() {
        return (altura * 2) + (largura * 2);
    }
}
