package ConversorMoeda;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda(5);
        System.out.println("O valor em R$ é: "+conversor.converterDolarParaReal(conversor.valorDolar));
    }
}
