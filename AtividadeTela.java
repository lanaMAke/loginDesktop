import java.awt.*;
import javax.swing.*;

public class AtividadeTela{

    public static void main(String[] args){

        //Janela
        JFrame miJFrame = new JFrame("Exemplo - java Swing");
        miJFrame.setSize(500,300);

        //Tela
        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300,300);
        miJPanel.setLayout(new GridBagLayout());

        JLabel miJLabel = new JLabel();
        miJLabel.setText("Diga - me sua opinião sobre Java String.: ");

        JTextArea miJTextArea = new JTextArea(5,20);

        miJPanel.add(miJLabel); 
        miJPanel.add(miJTextArea);
        miJFrame.add(miJPanel);
        miJFrame.setVisible(true);
    }
}