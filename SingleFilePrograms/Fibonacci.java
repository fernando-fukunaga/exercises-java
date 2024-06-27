package SingleFilePrograms;

import java.util.Scanner;
public class Fibonacci {
    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite quantas vezes deseja repetir");
        int numero = scanner.nextInt();

        for (int i = 0; i < numero; i++) {
                System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");
            }

        scanner.close();
    }
}
