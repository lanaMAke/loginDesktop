import javax.swing.*;
import java.awt.*;

public class TabelaCores extends JFrame {

    public TabelaCores() {
        setTitle("Tabela de Cores Java");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(0, 3, 5, 5)); // linhas automáticas, 3 colunas

        // Nome, Cor
        Object[][] cores = {
                {"BLACK", Color.BLACK},
                {"WHITE", Color.WHITE},
                {"RED", Color.RED},
                {"GREEN", Color.GREEN},
                {"BLUE", Color.BLUE},
                {"YELLOW", Color.YELLOW},
                {"PINK", Color.PINK},
                {"GRAY", Color.GRAY},
                {"LIGHT_GRAY", Color.LIGHT_GRAY},
                {"DARK_GRAY", Color.DARK_GRAY},
                {"ORANGE", Color.ORANGE},
                {"CYAN", Color.CYAN},
                {"MAGENTA", Color.MAGENTA}
        };

        for (Object[] item : cores) {
            String nome = (String) item[0];
            Color cor = (Color) item[1];

            // quadradinho colorido
            JPanel quadrado = new JPanel();
            quadrado.setPreferredSize(new Dimension(30, 30));
            quadrado.setBackground(cor);

            // nome
            JLabel nomeLabel = new JLabel(nome);

            // RGB
            String rgbString = "RGB(" + cor.getRed() + ", "
                    + cor.getGreen() + ", "
                    + cor.getBlue() + ")";
            JLabel rgbLabel = new JLabel(rgbString);

            painel.add(quadrado);
            painel.add(nomeLabel);
            painel.add(rgbLabel);
        }

        add(new JScrollPane(painel));
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TabelaCores());
    }
}
