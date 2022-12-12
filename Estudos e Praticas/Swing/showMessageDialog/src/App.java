import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        JOptionPane.showMessageDialog(null, "Olá Mundo");
        JOptionPane.showMessageDialog(null, "Olá mundo 2", "Mensagem de Boas vindas", JOptionPane.ERROR_MESSAGE);
        ImageIcon icone = new ImageIcon("ifpb.png");
        JOptionPane.showMessageDialog(null, "Olá mundo 3", "Mensagem de Boas vindas", JOptionPane.INFORMATION_MESSAGE, icone); 
    }
}