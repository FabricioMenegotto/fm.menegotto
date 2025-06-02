import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import models.Usuario;

import javax.swing.*;
import java.awt.*;

public class Gerenciador_projetoAPP extends JFrame {

    private static final String EMPTY_SCREEN = "EMPTY_SCREEN" ;
    private  CardLayout cardLayout;
    private  JPanel mainPanel;

    public Gerenciador_projetoAPP(){
        setTitle("Gerenciador de projetos");
        //setSize(800,600);// tamanho
        setExtendedState(JFrame.MAXIMIZED_BOTH);//abre tamanho inteiro
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// X vermelho
        setLocationRelativeTo(null);

        JPanel emptyPanel = new JPanel(new BorderLayout());
        emptyPanel.add(new Label("Bem-Vindo! Use o menu para navegar", SwingConstants.CENTER),
                BorderLayout.CENTER);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);


        mainPanel.add (emptyPanel, EMPTY_SCREEN);

        JMenu menu = new JMenu("Menu");
        JMenuItem listUsersitem = new JMenuItem("Listar usuariios");
        JMenuItem exttitem = new JMenu("Sair");

        menu.add(listUsersitem);
        menu.add(exttitem);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);

        setJMenuBar(menuBar);



        exttitem.addActionListener(event -> {
            dispose();
        });
        add(mainPanel);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Gerenciador_projetoAPP().setVisible(true);

        });

    }
}
