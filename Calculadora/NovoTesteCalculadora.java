package Calculadora;

public class NovoTesteCalculadora {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println("soma 3 inteiros: " + c.soma(2, 3, 4));
        System.out.println("soma tipos diferentes: " + c.soma(2, "345", 1.65));
        System.out.println("soma 2 doubles: " + c.soma(3.5, -1.4));
    }
}
