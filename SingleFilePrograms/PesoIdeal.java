package SingleFilePrograms;/*Tendo como entrada a altura e o sexo de uma pessoa,
construa um programa que exibe o peso ideal para ela, em quilos. 
Use as seguintes fórmulas (adote ℎ como a altura e em metros):
• Homens: 72,7 × ℎ − 58
• Mulheres: 62,1 × ℎ − 44,7 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class PesoIdeal {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        int gender = JOptionPane.showOptionDialog(null, 
                                                  "Escolha seu gênero", 
                                                  "Seleção", 
                                                  JOptionPane.YES_NO_OPTION, 
                                                  JOptionPane.QUESTION_MESSAGE, 
                                                  null, 
                                                  new Object[] {"Masculino", "Feminino"}, 
                                                  "Masculino");
        double height = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura em metros:"));

        if (gender == JOptionPane.YES_OPTION) {
            double ideal = 72.7 * height - 58;
            String idealFormatado = df.format(ideal);
            JOptionPane.showMessageDialog(null, "O seu peso ideal seria "+idealFormatado+" kg");
        }
        else if (gender == JOptionPane.NO_OPTION) {
            double ideal = 62.1 * height - 44.7;
            String idealFormatado = df.format(ideal);
            JOptionPane.showMessageDialog(null, "O seu peso ideal seria "+idealFormatado+" kg");
        }        
    }
}