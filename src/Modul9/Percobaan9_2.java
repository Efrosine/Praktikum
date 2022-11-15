package Modul9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Percobaan9_2 extends JFrame implements ActionListener {
    JTextField jp = new JTextField();
    JButton[] numeric = new JButton[10], operand = new JButton[6];
    int iNum = 0, iOp = 0, eq, n1, n2;
    char op;

    Percobaan9_2() {
        setTitle("DesignPreview");
        setSize(270, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void tampil(Color bg) {
        jp.setBounds(10, 10, 230, 40);
        add(jp);
        int row = 60, index = 0;
        String[] s = { "1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "0", "C", "=", "/" };
        for (int i = 0; i < 4; i++) {
            int column = 10;
            for (int j = 0; j < 4; j++) {
                JButton jb = new JButton(s[index]);
                jb.setBounds(column, row, 50, 40);
                jb.setBackground(bg);
                jb.addActionListener(this);
                add(jb);
                column += 60;
                try {
                    int test = Integer.parseInt(s[index++]);
                    numeric[iNum++] = jb;
                } catch (Exception e) {
                    operand[iOp++] = jb;
                }
            }
            row += 50;
        }
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if (button == operand[3]) {
            eq = n1 = n2 = 0;
            jp.setText("");
        } else if (button == operand[4]) {
            n2 = Integer.parseInt(jp.getText());
            eval();
            jp.setText(String.valueOf(eq));

        } else {
            boolean opf = false;
            if (button == operand[0]) {
                op = '+';
                opf = true;
            }
            if (button == operand[1]) {
                op = '-';
                opf = true;
            }
            if (button == operand[2]) {
                op = '*';
                opf = true;
            }
            if (button == operand[5]) {
                op = '/';
                opf = true;
            }
            if (opf) {
                n1 = Integer.parseInt(jp.getText());
                jp.setText("");
            } else {
                for (int i = 0; i < numeric.length; i++) {
                    if (button == numeric[i]) {
                        String text = jp.getText();
                        text += numeric[i].getText();
                        jp.setText(text);
                    }
                }
            }
        }

    }

    private void eval() {
        switch (op) {
            case '+':
                eq = n1 + n2;
                break;
            case '-':
                eq = n1 - n2;
                break;
            case '*':
                eq = n1 * n2;
                break;
            case '/':
                eq = n1 / n2;
                break;
        }
    }

    public static void main(String[] args) {
        Percobaan9_2 pb = new Percobaan9_2();
        pb.tampil(null);
    }
}