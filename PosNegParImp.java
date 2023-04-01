import javax.swing.JOptionPane;

public class PosNegParImp {
    public static void main(String[] args) {
        // Lê o número digitado pelo usuário
        String input = JOptionPane.showInputDialog("Digite um número inteiro:");
        int numero = Integer.parseInt(input);

        // Verifica se o número é positivo ou negativo
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "O número é positivo");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O número é negativo");
        } else {
            JOptionPane.showMessageDialog(null, "O número é zero");
        }

        // Verifica se o número é par ou ímpar
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número é par");
        } else {
            JOptionPane.showMessageDialog(null, "O número é ímpar");
        }
    }
}
