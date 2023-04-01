import javax.swing.JOptionPane;
public class Pares0a100comDo {
    public static void main(String[] args) {
        int x=0;
        String msg = "";
        do {
            msg = msg + x + " ";
            x += 2;
        } while (x <= 100);
        JOptionPane.showMessageDialog(null, msg, 
        "Pares de 0 a 100", JOptionPane.WARNING_MESSAGE);
    }
}