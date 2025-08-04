import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login{

     public static void main(String[] args){
    
     // base || janela

    JFrame frame = new JFrame("LOGIN <>");
    frame.setSize(200,300); //tam pixels
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fecha programa ao sair
    
    

    // tela p componentes 

    JPanel panel = new JPanel();
     panel.setBackground(Color.WHITE);
     panel.setLayout(new BorderLayout());

    
// Componentes <>
        
        //botão para acesso 
        JButton loginButton = new JButton ("Acess"); 

          loginButton.setBackground(Color.MAGENTA);//fundo
          loginButton.setForeground(Color.PINK);//text

         JTextFieldPlaceholder campoTexto = new JTextFieldPlaceholder("ex: usuario_xx");
             campoTexto.setColumns(20);//marca d'agua num campo de texto
             campoTexto.setForeground(Color.GRAY);//cor texto
         JTextField fieldUsuario = new JTextField(campoTexto);//campo de texto
        
       // Botão para cadastro
        JButton loginButton2 = new JButton("register");
          loginButton2.setBackground(Color.MAGENTA);//fundo
          loginButton2.setForeground(Color.PINK);//text
          
           JTextFieldPlaceholder campoTexto2 = new JTextFieldPlaceholder("ex: senha123@");
             campoTexto.setColumns(20);//marca d'agua num campo de texto
             campoTexto.setForeground(Color.GRAY);//cor texto
           JTextField fieldCadastro = new JTextField(campoTexto2);//campo de texto
          


       // textos exibição
       
          JLabel labelUsario = new JLabel("usuário");
             labelUsuario.setForeground(Color.MAGENTA);
             labelUsuario.setFont(new Font("Serif", Font.BOLD, 11));//cuidado -- verificar espaçamento
             labelUsuario.setHorizontalAlignment(JLabel.CENTER);
         
           JLabel labelSenha = new JLabel("senha");
             labelSenha.setForeground(Color.MAGENTA);
             labelSenha.setFont(new Font("Serif", Font.BOLD, 11));//cuidado -- verificar se possui espaçamento
             labelSenha.setHorizontalAlignment(JLabel.CENTER);

        

/*
        // Botão para alternar entre temas
        JButton toggleButton = new JButton ("Tema Escuro");
        panel.add(toggleButton, BorderLayout.SOUTH);
        toggleButton.setForeground(Color.BLACK);
        toggleButton.setBackground(Color.LIGHT_GRAY);

            // Adiciona um ActionListener ao botão
        toggleButton.addActionListener(new ActionListener() {
          private boolean isDarkTheme = false; // Variável para rastrear o tema atual

            @Override
            public void actionPerformed(ActionEvent e) {
                if (isDarkTheme) {

                    // Muda para tema claro
                    panel.setBackground(Color.WHITE);//painel branco
                    toggleButton.setForeground(Color.BLACK);//texto preto
                    toggleButton.setBackground(Color.LIGHT_GRAY);//cor do botão cinza
                    toggleButton.setText("Tema Escuro");

                    } else {

                    // Muda para tema escuro
                    panel.setBackground(Color.DARK_GRAY);//painel
                    toggleButton.setForeground(Color.WHITE);//texto
                    toggleButton.setBackground(Color.GRAY);//cor do butão
                    toggleButton.setText("Tema Claro");
                }
                isDarkTheme = !isDarkTheme; // Alterna o estado do tema
            }
        });

*/

         panel.add(fieldUsuario);
         panel.add(loginButton);
         panel.add(loginButton2);

        
         frame.setLocationRelativeTo(null);
         frame.add(panel); 
    
         frame.setVisible(true);

    }
}