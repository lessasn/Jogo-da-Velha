import kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker;
import org.w3c.dom.css.RGBColor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameGUI extends JFrame{
    private String nome;
    private JButton x1y1;
    private JButton x2y1;
    private JButton x3y1;
    private JButton x1y2;
    private JButton x2y2;
    private JButton x3y2;
    private JButton x1y3;
    private JButton x2y3;
    private JButton x3y3;
    private JPanel mainPainel;
    private JLabel messageLabel;
    private JTextField player01TextField;
    private JTextField player02TextField;
    private JLabel player01Label;
    private JLabel player02Label;
    private JButton clearButton;
    int player, play1, play2, jogadas,velha = 0;
    String simbol;



    public void exportarPlayers(CallPlayers players){
        player01Label.setText(players.getP1());
        player02Label.setText(players.getP2());
    }

    public  GameGUI(String title){
        super(title);
        this.setContentPane(mainPainel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocation(470,100);
        setSize(500,630);

        x1y1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Choice();
                x1y1.setText(simbol);
                x1y1.setEnabled(false);
                jogadas += 1;
                check();
                corBotao();
            }
        });
        x1y2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Choice();
                x1y2.setText(simbol);
                x1y2.setEnabled(false);
                jogadas += 1;
                check();
                corBotao();
            }
        });
        x1y3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Choice();
                x1y3.setText(simbol);
                x1y3.setEnabled(false);
                jogadas += 1;
                check();
                corBotao();
            }
        });
        x2y1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Choice();
                x2y1.setText(simbol);
                x2y1.setEnabled(false);
                jogadas += 1;
                check();
                corBotao();
            }
        });
        x2y2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Choice();
                x2y2.setText(simbol);
                x2y2.setEnabled(false);
                jogadas += 1;
                check();
                corBotao();
            }
        });
        x2y3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Choice();
                x2y3.setText(simbol);
                x2y3.setEnabled(false);
                jogadas += 1;
                check();
                corBotao();
            }
        });
        x3y1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Choice();
                x3y1.setText(simbol);
                x3y1.setEnabled(false);
                jogadas += 1;
                check();
                corBotao();
            }
        });
        x3y2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Choice();
                x3y2.setText(simbol);
                x3y2.setEnabled(false);
                jogadas += 1;
                check();
                corBotao();
            }
        });
        x3y3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Choice();
                x3y3.setText(simbol);
                x3y3.setEnabled(false);
                jogadas += 1;
                check();
                corBotao();
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                x1y1.setText("");
                x1y1.setEnabled(true);
                x1y1.setBackground(new Color(201,206,101));
                x1y2.setText("");
                x1y2.setEnabled(true);
                x1y2.setBackground(new Color(201,206,101));
                x1y3.setText("");
                x1y3.setEnabled(true);
                x1y3.setBackground(new Color(201,206,101));
                x2y1.setText("");
                x2y1.setEnabled(true);
                x2y1.setBackground(new Color(201,206,101));
                x2y2.setText("");
                x2y2.setEnabled(true);
                x2y2.setBackground(new Color(201,206,101));
                x2y3.setText("");
                x2y3.setEnabled(true);
                x2y3.setBackground(new Color(201,206,101));
                x3y1.setText("");
                x3y1.setEnabled(true);
                x3y1.setBackground(new Color(201,206,101));
                x3y2.setText("");
                x3y2.setEnabled(true);
                x3y2.setBackground(new Color(201,206,101));
                x3y3.setText("");
                x3y3.setEnabled(true);
                x3y3.setBackground(new Color(201,206,101));
                messageLabel.setText("Olá, vamos começar?");
                player = 0;
                jogadas =0;
                velha = 0;
            }
        });
    }

    public void Choice(){
        if(player == 0){
            simbol = "X";
            player = 1;
            messageLabel.setText("É a vez do jogador 2");
        }else{
            simbol = "O";
            player = 0;
            messageLabel.setText("É a vez do jogador 1");
        }
    }
    public void corBotao(){
        if (this.getForeground() != Color.white){
            this.setForeground(Color.white);
        }
    }

    public void check(){
        if (x1y1.getText().equals("X") & (x1y2.getText().equals("X")) & x1y3.getText().equals("X")){
            messageLabel.setText("O Jogador X ganhou!");
            x1y1.setBackground(Color.getHSBColor(173,138,208));
            x1y2.setBackground(Color.getHSBColor(173,138,208));
            x1y3.setBackground(Color.getHSBColor(173,138,208));
            play1 = play1 + 1;
            velha = 1;
            player01TextField.setText(String.valueOf(play1));

        }
        if (x2y1.getText().equals("X") & (x2y2.getText().equals("X")) & x2y3.getText().equals("X")){
            messageLabel.setText("O Jogador X ganhou!");
            x2y1.setBackground(Color.getHSBColor(173,138,208));
            x2y2.setBackground(Color.getHSBColor(173,138,208));
            x2y3.setBackground(Color.getHSBColor(173,138,208));
            play1 = play1 + 1;
            velha = 1;
            player01TextField.setText(String.valueOf(play1));
        }
        if (x3y1.getText().equals("X") & (x3y2.getText().equals("X")) & x3y3.getText().equals("X")){
            messageLabel.setText("O Jogador X ganhou!");
            x3y1.setBackground(Color.getHSBColor(173,138,208));
            x3y2.setBackground(Color.getHSBColor(173,138,208));
            x3y3.setBackground(Color.getHSBColor(173,138,208));
            play1 = play1 + 1;
            velha = 1;
            player01TextField.setText(String.valueOf(play1));
        }
        if (x1y1.getText().equals("O") & (x1y2.getText().equals("O")) & x1y3.getText().equals("O")){
            messageLabel.setText("O Jogador O ganhou!");
            x1y1.setBackground(Color.getHSBColor(173,138,208));
            x1y2.setBackground(Color.getHSBColor(173,138,208));
            x1y3.setBackground(Color.getHSBColor(173,138,208));
            play2 = play2 + 1;
            velha = 1;
            player02TextField.setText(String.valueOf(play2));
        }
        if (x2y1.getText().equals("O") & (x2y2.getText().equals("O")) & x2y3.getText().equals("O")){
            messageLabel.setText("O Jogador O ganhou!");
            x2y1.setBackground(Color.getHSBColor(173,138,208));
            x2y2.setBackground(Color.getHSBColor(173,138,208));
            x2y3.setBackground(Color.getHSBColor(173,138,208));
            play2 = play2 + 1;
            velha = 1;
            player02TextField.setText(String.valueOf(play2));
        }
        if (x3y1.getText().equals("O") & x3y2.getText().equals("O") & x3y3.getText().equals("O")){
            messageLabel.setText("O Jogador O ganhou!");
            x3y1.setBackground(Color.getHSBColor(173,138,208));
            x3y2.setBackground(Color.getHSBColor(173,138,208));
            x3y3.setBackground(Color.getHSBColor(173,138,208));
            play2 = play2 + 1;
            velha = 1;
            player02TextField.setText(String.valueOf(play2));
        }
        if (x1y1.getText().equals("X") & x2y1.getText().equals("X") & x3y1.getText().equals("X")){
            x1y1.setBackground(Color.getHSBColor(173,138,208));
            x2y1.setBackground(Color.getHSBColor(173,138,208));
            x3y1.setBackground(Color.getHSBColor(173,138,208));
            messageLabel.setText("O Jogador X ganhou");
            play1 = play1 + 1;
            velha = 1;
            player01TextField.setText(String.valueOf(play1));
        }
        if (x1y2.getText().equals("X") & x2y2.getText().equals("X") & x3y2.getText().equals("X")){
            x1y2.setBackground(Color.getHSBColor(173,138,208));
            x2y2.setBackground(Color.getHSBColor(173,138,208));
            x3y2.setBackground(Color.getHSBColor(173,138,208));
            messageLabel.setText("O Jogador X ganhou");
            play1 = play1 + 1;
            velha = 1;
            player01TextField.setText(String.valueOf(play1));
        }
        if (x1y3.getText().equals("X") & x2y3.getText().equals("X") & x3y3.getText().equals("X")){
            x1y3.setBackground(Color.getHSBColor(173,138,208));
            x2y3.setBackground(Color.getHSBColor(173,138,208));
            x3y3.setBackground(Color.getHSBColor(173,138,208));
            messageLabel.setText("O Jogador X ganhou");
            play1 = play1 + 1;
            velha = 1;
            player01TextField.setText(String.valueOf(play1));
        }
        if (x1y1.getText().equals("O") & x2y1.getText().equals("O") & x3y1.getText().equals("O")){
            x1y1.setBackground(Color.getHSBColor(173,138,208));
            x2y1.setBackground(Color.getHSBColor(173,138,208));
            x3y1.setBackground(Color.getHSBColor(173,138,208));
            messageLabel.setText("O Jogador O ganhou");
            play2 = play2 + 1;
            velha = 1;
            player02TextField.setText(String.valueOf(play2));
        }
        if (x1y2.getText().equals("O") & x2y2.getText().equals("O") & x3y2.getText().equals("O")){
            x1y2.setBackground(Color.getHSBColor(173,138,208));
            x2y2.setBackground(Color.getHSBColor(173,138,208));
            x3y2.setBackground(Color.getHSBColor(173,138,208));
            messageLabel.setText("O Jogador O ganhou");
            play2 = play2 + 1;
            velha = 1;
            player02TextField.setText(String.valueOf(play2));
        }
        if (x1y3.getText().equals("O") & x2y3.getText().equals("O") & x3y3.getText().equals("O")){
            x1y3.setBackground(Color.getHSBColor(173,138,208));
            x2y3.setBackground(Color.getHSBColor(173,138,208));
            x3y3.setBackground(Color.getHSBColor(173,138,208));
            messageLabel.setText("O Jogador O ganhou");
            play2 = play2 + 1;
            velha = 1;
            player02TextField.setText(String.valueOf(play2));
        }
        if (x1y1.getText().equals("X") & x2y2.getText().equals("X") & x3y3.getText().equals("X")){
            x1y1.setBackground(Color.getHSBColor(173,138,208));
            x2y2.setBackground(Color.getHSBColor(173,138,208));
            x3y3.setBackground(Color.getHSBColor(173,138,208));
            messageLabel.setText("O Jogador X ganhou");
            play1 = play1 + 1;
            velha = 1;
            player01TextField.setText(String.valueOf(play1));

        }
        if (x1y1.getText().equals("O") & x2y2.getText().equals("O") & x3y3.getText().equals("O")){
            x1y1.setBackground(Color.getHSBColor(173,138,208));
            x2y2.setBackground(Color.getHSBColor(173,138,208));
            x3y3.setBackground(Color.getHSBColor(173,138,208));
            messageLabel.setText("O Jogador 0 ganhou");
            play1 = play1 + 1;
            velha = 1;
            player01TextField.setText(String.valueOf(play1));

        }
        if (x1y3.getText().equals("X") & x2y2.getText().equals("X") & x3y1.getText().equals("X")){
            x1y3.setBackground(Color.getHSBColor(173,138,208));
            x2y2.setBackground(Color.getHSBColor(173,138,208));
            x3y1.setBackground(Color.getHSBColor(173,138,208));
            messageLabel.setText("O Jogador X ganhou");
            play1 = play1 + 1;
            velha = 1;
            player01TextField.setText(String.valueOf(play1));

        }
        if (x1y3.getText().equals("O") & x2y2.getText().equals("O") & x3y1.getText().equals("O")){
            x1y3.setBackground(Color.getHSBColor(173,138,208));
            x2y2.setBackground(Color.getHSBColor(173,138,208));
            x3y1.setBackground(Color.getHSBColor(173,138,208));
            messageLabel.setText("O Jogador O ganhou");
            play1 = play1 + 1;
            velha = 1;
            player01TextField.setText(String.valueOf(play1));

        }if(jogadas == 9 && velha == 0){
                corBotao();
                messageLabel.setText("Deu velha! EMPATE !");
                x1y1.setBackground(Color.getHSBColor(173,138,208));
                x1y1.setForeground(Color.white);
                x1y2.setBackground(Color.getHSBColor(173,138,208));
                x1y2.setForeground(Color.white);
                x1y3.setBackground(Color.getHSBColor(173,138,208));
                x1y3.setForeground(Color.white);
                x2y1.setBackground(Color.getHSBColor(173,138,208));
                x2y1.setForeground(Color.white);
                x2y2.setBackground(Color.getHSBColor(173,138,208));
                x2y2.setForeground(Color.white);
                x2y3.setBackground(Color.getHSBColor(173,138,208));
                x2y3.setForeground(Color.white);
                x3y1.setBackground(Color.getHSBColor(173,138,208));
                x3y1.setForeground(Color.white);
                x3y2.setBackground(Color.getHSBColor(173,138,208));
                x3y2.setForeground(Color.white);
                x3y3.setBackground(Color.getHSBColor(173,138,208));
                x3y3.setForeground(Color.white);
                jogadas = 0;
            }
        }



    public static void main(String[] args) {
        JFrame frame = new GameGUI("Jogo da Velha");
        frame.setVisible(true);
    }
}
