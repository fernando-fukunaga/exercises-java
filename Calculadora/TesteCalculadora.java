package Calculadora;

import javax.swing.JOptionPane;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        int opcao = Integer.parseInt(
            JOptionPane.showInputDialog("Escolha opção:\n1 para soma\n2 para subtracao\n3 para multiplicacao\n4 para divisao")
        );

        int num1 = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o primeiro número")
        );

        int num2 = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o segundo número")
        );

        int resultado;

        switch(opcao) {
            case 1:
                resultado = c.soma(num1, num2);
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                resultado = c.subtracao(num1, num2);
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                resultado = c.multiplicacao(num1, num2);
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                resultado = c.divisao(num1, num2);
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operacao invalida", "Resultado", JOptionPane.ERROR_MESSAGE);                                            
        }
    }
}
