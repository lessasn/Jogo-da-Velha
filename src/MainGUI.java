import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainGUI extends JFrame {
    private JPanel mainPainel;
    private JTextField user1TextField;
    private JTextField user2TextField;
    private JButton JOGARButton;
    private JLabel velhaLabel;


    public MainGUI(String title){
        // Constutor do painel!
        super(title);
        this.setContentPane(mainPainel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocation(500,100);
        this.setSize(450,320);




        JOGARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Criando objeto da classe para pegar as variáveis.
               CallPlayers players = new CallPlayers();
               // Passando o valor do TextField para as variáveis pelo metodo set.
               players.setP1(user1TextField.getText());
               players.setP2(user2TextField.getText());
               // Abrindo a nova janela.
               GameGUI frame = new GameGUI("");
               frame.setVisible(true);
               // Chamando o metodo do Frame GameGUI para pegar as variaveis digitadas.
               frame.exportarPlayers(players);
               MainGUI.this.dispose();

            }
        });

    }
    public static void main(String[] args){
        // Instanciado a janela Login
        JFrame frame = new MainGUI("Beeem vindo!");
        frame.setVisible(true);


    }


}
