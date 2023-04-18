package Calculadora;

public class Calculadora {
    public int soma(int a, int b) {
        return a + b;
    }

    //sobrecarga para somar doubles
    public double soma(double a, double b) {
        return a + b;
    }

    //Sobrecarga para somar 3 inteiros
    public int soma(int a, int b, int c) {
        return a + b + c;
    }

    //Sobrecarga para somar um int, mais uma string, mais um double, 3 tipos diferentes
    public double soma(int a, String b, double c) {
        int num1 = a;
        int num2 = Integer.parseInt(b);
        double num3 = c;
        return num1 + num2 + num3;
    }

    public int subtracao(int a, int b) {
        return a - b;
    }

    public int multiplicacao(int a, int b) {
        return a * b;
    }

    public int divisao(int a, int b) {
        return a / b;
    }
}
