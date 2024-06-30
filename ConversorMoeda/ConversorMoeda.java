package ConversorMoeda;

public class ConversorMoeda implements ConversaoFinanceira {
    double valorDolar;
    double valorReal;

    public ConversorMoeda(double valorDolar) {
        this.valorDolar = valorDolar;
    }

    @Override
    public double converterDolarParaReal(double valorDolar) {
        valorReal = valorDolar * 5;
        return valorReal;
    }
}