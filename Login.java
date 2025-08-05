import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent; // guarda as ações
import java.awt.event.ActionListener; // ação 

public class Login {

    public static void main(String[] args) {

        // Criação da janela principal
        JFrame frame = new JFrame("LOGIN <>");
        frame.setSize(300, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Painel principal com layout vertical
        JPanel panel = new JPanel();
        panel.setBackground(new Color(72,209,204));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Espaçamento superior
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Campo de usuário
        JLabel labelUsuario = new JLabel("Usuario");
        labelUsuario.setForeground(Color.MAGENTA);
        labelUsuario.setFont(new Font("Serif", Font.BOLD, 14));
        labelUsuario.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextField fieldUsuario = new JTextField("ex: usuario_xx");
        fieldUsuario.setMaximumSize(new Dimension(200, 30));
        fieldUsuario.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(labelUsuario);
        panel.add(fieldUsuario);

        // Espaçamento
        panel.add(Box.createRigidArea(new Dimension(0, 15)));

        // Campo de senha
        JLabel labelSenha = new JLabel("Senha");
        labelSenha.setForeground(Color.MAGENTA);
        labelSenha.setFont(new Font("Serif", Font.BOLD, 14));
        labelSenha.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextField fieldSenha = new JTextField("ex: senha123@");
        fieldSenha.setMaximumSize(new Dimension(200, 30));
        fieldSenha.setAlignmentX(Component.CENTER_ALIGNMENT);
        
          ImageIcon imagemOriginal = new ImageIcon("imagemcód.png");
         Image imagemRedimensionada = imagemOriginal.getImage().getScaledInstance(1980, 1200, Image.SCALE_SMOOTH);
         ImageIcon imagem = new ImageIcon(imagemRedimensionada);
 
        JLabel imagemLabel = new JLabel(imagem);
        imagemLabel.setHorizontalAlignment(JLabel.CENTER);
        imagemLabel.setVerticalAlignment(JLabel.CENTER);
        panel.add(imagemLabel, BorderLayout.CENTER);

        panel.add(labelSenha);
        panel.add(fieldSenha);

        // Espaçamento
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Botão de login
        JButton loginButton = new JButton("Acessar");
        loginButton.setBackground( new Color(0,206,209));
        loginButton.setForeground(Color.MAGENTA);
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        loginButton.addActionListener(e -> {
            String usuario = fieldUsuario.getText();
            String senha = fieldSenha.getText();
            JOptionPane.showMessageDialog(null, "Usuário: " + usuario + "\nSenha: " + senha, "Acesso Negado <...>", JOptionPane.INFORMATION_MESSAGE);
        
        });

        // Botão de registro
        JButton registerButton = new JButton("Registrar");
        registerButton.setBackground(Color.LIGHT_GRAY);
        registerButton.setForeground(Color.MAGENTA);
        registerButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Nova tela ao clicar em "Registrar"
         registerButton.addActionListener(e -> {
            JFrame cadastroFrame = new JFrame("Cadastro");
            cadastroFrame.setSize(300, 200);
            cadastroFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            cadastroFrame.setLocationRelativeTo(null);// local nulo (meio ou proximo)

            JPanel cadastroPanel = new JPanel();
            cadastroPanel.setLayout(new FlowLayout());
            cadastroPanel.add(new JLabel("Tela de Cadastro<> ..."));
            
            JLabel labelCadastro = new JLabel("Usuario");
           labelCadastro.setForeground(Color.MAGENTA);
           labelCadastro.setFont(new Font("Serif", Font.BOLD, 14));
           labelCadastro.setAlignmentX(Component.CENTER_ALIGNMENT);

            cadastroFrame.add(cadastroPanel);
            cadastroFrame.setVisible(true);
        });

        // Adiciona botões ao painel
        panel.add(loginButton);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(registerButton);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));



        // Botão de alternância de tema
        JButton toggleButton = new JButton("Escuro");
        toggleButton.setBackground(Color.LIGHT_GRAY);
        toggleButton.setForeground(Color.MAGENTA);
        toggleButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(toggleButton);

        // Lógica de alternância de tema
        toggleButton.addActionListener(new ActionListener() {
            private boolean isDarkTheme = false;

            @Override //modificando <>
            public void actionPerformed(ActionEvent e) {
                if (isDarkTheme) {
                    panel.setBackground(new Color(0,191,255));
                    toggleButton.setForeground(Color.MAGENTA);
                    toggleButton.setBackground(new Color(0,191,255));
                    toggleButton.setText("Escuro");
                } else {
                    panel.setBackground(new Color(0,0,205));
                    toggleButton.setForeground(Color.WHITE);
                    toggleButton.setBackground(new Color(64,224,208));
                    toggleButton.setText("Claro");
                }
                isDarkTheme = !isDarkTheme;
            }
        });

        // Adiciona o painel à janela
        frame.add(panel);
        frame.setLocationRelativeTo(null); // Centraliza na tela
        frame.setVisible(true);
    }
}
