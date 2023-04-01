import java.util.Scanner;
public class MaiorValor {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        int maior = 0;
        while (contador != 11){
            System.out.print("Digite o "+contador+" número");
            int num = scanner.nextInt();
            if (num > maior) {
                maior = num;
            }
            contador++;            
        }
        System.out.print("O maior número dos que você digitou é "+maior);
        scanner.close();
    }
}
