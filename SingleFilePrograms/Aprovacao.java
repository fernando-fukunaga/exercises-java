package SingleFilePrograms;

import javax.swing.JOptionPane;

public class Aprovacao {
    public static void main (String args[]) {
        int A1 = Integer.parseInt(JOptionPane.showInputDialog("informar a nota da A1"));
        int A2 = Integer.parseInt(JOptionPane.showInputDialog("informar a nota da A2"));
        int A3 = Integer.parseInt(JOptionPane.showInputDialog("informar a nota da A3"));

        if (A1 >= 0 && A1 <= 30 && A2 >= 0 && A2 <= 30 && A3 >= 0 && A3 <= 40) {
            int NotaFinal = A1+A2+A3;
            String msg = NotaFinal >= 70 ? "Aprovado!!" : "Reprovado!!";
            JOptionPane.showMessageDialog(null, msg);
        }
        else {
            JOptionPane.showMessageDialog(null, "Valores fora do padrão");
        }
    }
}
