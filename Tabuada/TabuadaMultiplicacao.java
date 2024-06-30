package Tabuada;

public class TabuadaMultiplicacao implements Tabuada {
    public int numero;

    public TabuadaMultiplicacao(int numero) {
        this.numero = numero;
    }

    public void mostrarTabuada() {
        System.out.println(numero+"x1 = "+numero);
        System.out.println(numero+"x2 = "+numero*2);
        System.out.println(numero+"x3 = "+numero*3);
        System.out.println(numero+"x4 = "+numero*4);
        System.out.println(numero+"x5 = "+numero*5);
        System.out.println(numero+"x6 = "+numero*6);
        System.out.println(numero+"x7 = "+numero*7);
        System.out.println(numero+"x8 = "+numero*8);
        System.out.println(numero+"x9 = "+numero*9);
        System.out.println(numero+"x10 = "+numero*10);
    }
}
