import javax.swing.*;

public class TestaConversaoImplicita {

    public static void main(String[] args) {
        ConversaoImplicita c1 = new ConversaoImplicita();
        // Passando int: retorna resultado correto: 9
        JOptionPane.showMessageDialog(null,"Quadrado de 3 = " + c1.retornaQuadradoNumero(3));
        // Passando string: retorna resultado incorreto: 2601
        JOptionPane.showMessageDialog(null,"Quadrado de 3 = " + c1.retornaQuadradoNumero('3'));
    }
}
