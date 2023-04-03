/*Faça um programa que recebe duas notas, 
exibe a média aritmética das notas e uma mensagem indicando 
se o aluno foi aprovado ou reprovado. A média para aprovação deve ser maior que seis.*/
import javax.swing.JOptionPane;
public class MediaNotas{
    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        double media = (nota1 + nota2) / 2;
        if (media >= 6) {
            JOptionPane.showMessageDialog(null, "A média total foi: "+media+"\nAluno Aprovado!");
        } else {
            JOptionPane.showMessageDialog(null, "A média total foi: "+media+"\nAluno Reprovado!");
        }
    }
}