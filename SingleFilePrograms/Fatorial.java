package SingleFilePrograms;

import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print ("digite seu numero para o fatorial: ");
        int n = entrada.nextInt();
        int fatorial = n;
        while (n > 1) {
            n--;
            fatorial = fatorial * n;
        }
        System.out.println ("fatorial = " + fatorial);
        entrada.close();
    }
}
