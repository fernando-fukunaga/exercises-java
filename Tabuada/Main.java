package Tabuada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva de qual número você quer uma tabuada: ");
        int numeroTabuada = scanner.nextInt();

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao(numeroTabuada);
        tabuada.mostrarTabuada();
        scanner.close();
    }
}
