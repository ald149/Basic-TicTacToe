package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Board extends JFrame {

    private JPanel mainPanel;
    private JPanel Title;
    private JButton button0;
    private JButton button3;
    private JButton button6;
    private JButton button1;
    private JButton button4;
    private JButton button7;
    private JButton button8;
    private JButton button5;
    private JButton button2;
    private JTextField player1UsesXTextField;
    private JTextField textField3;
    private JButton button9;
    private JTextField textField1;
    public static String test;
    public static int count = 0;
    public String[] XO = new String[9];

    public void paint(Graphics g){
        super.paint(g);

    }

    public Board() throws HeadlessException {

        super.setSize( 500, 500 );
        super.setContentPane( this.mainPanel );
        super.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        super.paramString();
        super.setVisible( true );

        button0.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (count % 2 == 0) {
                    button0.setFont(button0.getFont().deriveFont(55f));
                    button0.setText("X");
                    test = button0.getText();
                    XO[0] = test;
                } else {
                    button0.setText("O");
                    test = button0.getText();
                    XO[0] = test;
                }
                testWinner(XO);

                System.out.println(XO[0]);
                count ++;
            }

        });
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                button1.setFont(button1.getFont().deriveFont(55f));
                if (count % 2 == 0) {
                    button1.setText("X");
                    test = button1.getText();
                    XO[1] = test;
                } else {
                    button1.setText("O");
                    test = button1.getText();
                    XO[1] = test;
                }
                testWinner(XO);
                System.out.println(XO[1]);
                count ++;
            }
        });
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                button2.setFont(button2.getFont().deriveFont(55f));
                if (count % 2 == 0) {
                    button2.setText("X");
                    test = button1.getText();
                    XO[2] = test;
                } else {
                    button2.setText("O");
                    test = button2.getText();
                    XO[2] = test;
                }
                testWinner(XO);
                System.out.println(XO[2]);
                count ++;
            }
        });
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                button3.setFont(button3.getFont().deriveFont(55f));
                if (count % 2 == 0) {
                    button3.setText("X");
                    test = button3.getText();
                    XO[3] = test;
                } else {
                    button3.setText("O");
                    test = button3.getText();
                    XO[3] = test;
                }
                testWinner(XO);
                System.out.println(XO[3]);
                count ++;
            }
        });
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                button4.setFont(button4.getFont().deriveFont(55f));
                if (count % 2 == 0) {
                    button4.setText("X");
                    test = button4.getText();
                    XO[4] = test;
                } else {
                    button4.setText("O");
                    test = button4.getText();
                    XO[4] = test;
                }
                testWinner(XO);
                System.out.println(XO[4]);
                count ++;
            }
        });
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                button5.setFont(button5.getFont().deriveFont(55f));
                if (count % 2 == 0) {
                    button5.setText("X");
                    test = button5.getText();
                    XO[5] = test;
                } else {
                    button5.setText("O");
                    test = button5.getText();
                    XO[5] = test;
                }
                testWinner(XO);
                System.out.println(XO[5]);
                count ++;
            }
        });
        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                button6.setFont(button6.getFont().deriveFont(55f));
                if (count % 2 == 0) {
                    button6.setText("X");
                    test = button6.getText();
                    XO[6] = test;
                } else {
                    button6.setText("O");
                    test = button6.getText();
                    XO[6] = test;
                }
                testWinner(XO);
                System.out.println(XO[6]);
                count ++;
            }
        });
        button7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                button7.setFont(button7.getFont().deriveFont(55f));
                if (count % 2 == 0) {
                    button7.setText("X");
                    test = button7.getText();
                    XO[7] = test;
                } else {
                    button7.setText("O");
                    test = button7.getText();
                    XO[7] = test;
                }
                testWinner(XO);
                System.out.println(XO[7]);
                count++;
            }
        });
        button8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                button8.setFont(button8.getFont().deriveFont(55f));
                if (count % 2 == 0) {
                    button8.setText("X");
                    test = button8.getText();
                    XO[8] = test;
                } else {
                    button8.setText("O");
                    test = button8.getText();
                    XO[8] = test;
                }
                testWinner(XO);
                System.out.println(XO[8]);
                count ++;
            }
        });

        button9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                button0.setText("-");
                button1.setText("-");
                button2.setText("-");
                button3.setText("-");
                button4.setText("-");
                button5.setText("-");
                button7.setText("-");
                button8.setText("-");
            }
        });
    }


    public void testWinner(String XO[]){
        if (XO[0] == "X" && XO[3] == "X" && XO[6] == "X") {
            button1.setText("Player");
            button4.setText("One");
            button7.setText("WINS!");
            button9.setText("Start Over");
        }
        if (XO[1] == "X" && XO[4] == "X" && XO[7] == "X") {
            button1.setText("Player");
            button4.setText("One");
            button7.setText("WINS!");
            button9.setText("Start Over");
        }
        if (XO[2] == "X" && XO[5] == "X" && XO[8] == "X") {
            button1.setText("Player");
            button4.setText("One");
            button7.setText("WINS!");
            button9.setText("Start Over");
        }
        if (XO[0] == "X" && XO[1] == "X" && XO[2] == "X") {
            button1.setText("Player");
            button4.setText("One");
            button7.setText("WINS!");
            button9.setText("Start Over");
        }
        if (XO[3] == "X" && XO[4] == "X" && XO[5] == "X") {
            System.out.println("Player1 wins!");
            button1.setText("Player");
            button4.setText("One");
            button7.setText("WINS!");
            button9.setText("Start Over");

        }
        if (XO[6] == "X" && XO[7] == "X" && XO[8] == "X") {
            button1.setText("Player");
            button4.setText("One");
            button7.setText("WINS!");
            button9.setText("Start Over");
        }
        if (XO[2] == "X" && XO[4] == "X" && XO[6] == "X") {
            button1.setText("Player");
            button4.setText("One");
            button7.setText("WINS!");
            button9.setText("Start Over");
        }
        if (XO[0] == "X" && XO[4] == "X" && XO[8] == "X") {
            button1.setText("Player");
            button4.setText("One");
            button7.setText("WINS!");
            button9.setText("Start Over");
        }

        if (XO[0] == "O" && XO[3] == "O" && XO[6] == "O") {
            button1.setText("Player");
            button4.setText("TWO");
            button7.setText("WINS!");
            button9.setText("Start Over");
        }
        if (XO[1] == "O" && XO[4] == "O" && XO[7] == "O") {
            button1.setText("Player");
            button4.setText("TWO");
            button7.setText("WINS!");
            button9.setText("Start Over");
        }
        if (XO[2] == "O" && XO[5] == "O" && XO[8] == "O") {
            button1.setText("Player");
            button4.setText("TWO");
            button7.setText("WINS!");
            button9.setText("Start Over");
        }
        if (XO[0] == "O" && XO[1] == "O" && XO[2] == "O") {
            button1.setText("Player");
            button4.setText("TWO");
            button7.setText("WINS!");
            button9.setText("Start Over");
        }
        if (XO[3] == "O" && XO[4] == "O" && XO[5] == "O") {
            button1.setText("Player");
            button4.setText("TWO");
            button7.setText("WINS!");
            button9.setText("Start Over");
        }
        if (XO[6] == "O" && XO[7] == "O" && XO[8] == "O") {
            button1.setText("Player");
            button4.setText("TWO");
            button7.setText("WINS!");
            button9.setText("Start Over");
        }
        if (XO[2] == "O" && XO[4] == "O" && XO[6] == "O") {
            button1.setText("Player");
            button4.setText("TWO");
            button7.setText("WINS!");
            button9.setText("Start Over");
        }
        if (XO[0] == "O" && XO[4] == "O" && XO[8] == "O") {
            button1.setText("Player");
            button4.setText("TWO");
            button7.setText("WINS!");
            button9.setText("Start Over");
        }

    }

}