//compilar: javac arquivo.java
//excecutar: java nomedaclasse
import javax.swing.JOptionPane;
public class CalculadoraCientifica {
    public static void main (String args[]) {
        String auxiliar;
        double numero;

        auxiliar = JOptionPane.showInputDialog("digite um numero qualquer positivo");
        numero = Double.parseDouble(auxiliar);

        double raiz = Math.sqrt(numero);

        JOptionPane.showMessageDialog(null, "a raiz de "+numero+" é igual a "+raiz);

    }
}
