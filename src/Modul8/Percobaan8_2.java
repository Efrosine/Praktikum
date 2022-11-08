package Modul8;

import javax.swing.*;
import java.awt.*;

public class Percobaan8_2 extends JFrame {
    JTextField jp = new JTextField();

    Percobaan8_2() {
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
                JButton jb = new JButton(s[index++]);
                jb.setBounds(column, row, 50, 40);
                jb.setBackground(bg);
                add(jb);
                column += 60;
            }
            row += 50;
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        Percobaan8_2 pb = new Percobaan8_2();
        pb.tampil(null);
    }
}