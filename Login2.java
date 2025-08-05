import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login2 {

    public static void main(String[] args) {

        // Criação da janela
        JFrame frame = new JFrame("LOGIN <>");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        


        // Painel principal com layout vertical
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Espaçamento superior
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Campo de usuário
        JLabel labelUsuario = new JLabel("usuario");//exibe
        labelUsuario.setForeground(Color.MAGENTA);//cor do texto
        labelUsuario.setFont(new Font("Serif", Font.BOLD, 14));//fonte e tam
        labelUsuario.setAlignmentX(Component.CENTER_ALIGNMENT);//centralizado

        JTextField fieldUsuario = new JTextField("ex: usuario_xx"); //exibe texto detro do campo
        fieldUsuario.setMaximumSize(new Dimension(200, 30));//dimensão -- pesquisar mais
        fieldUsuario.setAlignmentX(Component.CENTER_ALIGNMENT); //

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

        panel.add(labelSenha);
        panel.add(fieldSenha);

        // Espaçamento
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Botões de login e registro
        JButton loginButton = new JButton("Acessar");
        loginButton.setBackground(Color.LIGHT_GRAY);
        loginButton.setForeground(Color.BLACK);
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        loginButton.addActionListener(e -> {
            JOptionPane.showMenssageDialog(null, textField.getText(), "Acesso Negado <...>",JOptionPane.INFORMATION_MENSSAGE);
        })


        JButton registerButton = new JButton("Registrar");
        registerButton.setBackground(Color.LIGHT_GRAY);
        registerButton.setForeground(Color.BLACK);
        registerButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // nova tela atraves do botão;
       /* public class Cadastro extends */
       registerButton.addActionListener(e -> {
            JOptionPane.showMenssageDialog(null, textField.getText(), " <...>",JOptionPane.INFORMATION_MENSSAGE);
        })

        

        panel.add(loginButton);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));// pesquisar
        panel.add(registerButton);

        // Espaçamento
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Botão de alternância de tema
        JButton toggleButton = new JButton("Tema Escuro");
        toggleButton.setBackground(Color.LIGHT_GRAY);
        toggleButton.setForeground(Color.BLACK);
        toggleButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(toggleButton);

        // Lógica de alternância de tema
        toggleButton.addActionListener(new ActionListener() {
            private boolean isDarkTheme = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (isDarkTheme) {
                    panel.setBackground(Color.WHITE);
                    toggleButton.setForeground(Color.BLACK);
                    toggleButton.setBackground(Color.LIGHT_GRAY);
                    toggleButton.setText("Tema Escuro");
                } else {
                    panel.setBackground(Color.DARK_GRAY);
                    toggleButton.setForeground(Color.WHITE);
                    toggleButton.setBackground(Color.GRAY);
                    toggleButton.setText("Tema Claro");
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
