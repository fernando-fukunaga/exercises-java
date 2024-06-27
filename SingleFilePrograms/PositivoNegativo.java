package SingleFilePrograms;

import java.util.Scanner;
public class PositivoNegativo {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um número inteiro");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo");
        }
        else if (numero < 0) {
            System.out.println("O número é negativo");
        }
        else if (numero == 0) {
            System.out.println("O número é nulo");
        }

        scanner.close();
    }
}
