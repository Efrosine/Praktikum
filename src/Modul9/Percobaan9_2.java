package Modul9;

//import class yang diperlukan
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Percobaan9_2 extends JFrame implements ActionListener {
    // Deklarasi class JTextFiled
    JTextField textF = new JTextField();
    // Deklarasi array JButton untuk menyimpan button yang sesuai fungsinya
    JButton[] numeric = new JButton[10], operand = new JButton[6];
    // inisialisasi var (int) untuk menyimpan hasil, value pertama, dan value kedua
    int equal, n1, n2;
    // Inisialisasi var (char) untuk menyimpan operator
    char op;

    // Setting JFrame sesuai keinginan
    Percobaan9_2() {
        setTitle("DesignPreview");
        setSize(270, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void tampil(Color bg) {
        textF.setBounds(10, 10, 230, 40);
        add(textF);
        int row = 60, xString = 0, xNum = 0, xOper = 0;
        String[] s = { "1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "0", "C", "=", "/" };
        for (int i = 0; i < 4; i++) {
            int column = 10;
            for (int j = 0; j < 4; j++) {
                JButton jb = new JButton(s[xString]);
                jb.setBounds(column, row, 50, 40);
                jb.setBackground(bg);
                jb.addActionListener(this);
                add(jb);
                column += 60;
                //Block try catch digunakan untuk menegelompokkan button
                try {
                    int test = Integer.parseInt(s[xString++]);
                    numeric[xNum++] = jb;
                } catch (NumberFormatException e) {
                    operand[xOper++] = jb;
                }
            }
            row += 50;
        }
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Deklarasi JButton yang menyimpan button yang digunakan
        JButton button = (JButton) e.getSource();
        if (button == operand[3]) { // operand3 == "C"
            equal = n1 = n2 = 0;
            textF.setText("");
        } else if (button == operand[4]) { // operand4 == "="
            n2 = Integer.parseInt(textF.getText());
            eval();
            textF.setText(String.valueOf(equal));
        } else {
            boolean opf = false;

            // Menetapkan value op sesuai operator yang di pilih
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

            if (opf) { // Jika button operator ditekan value tf di tetapkan sebagai n1
                n1 = Integer.parseInt(textF.getText());
                textF.setText("");
            } else { // Jika button numerik ditekan value tf akan bertambah
                for (int i = 0; i < numeric.length; i++) {
                    if (button == numeric[i]) {
                        String text = textF.getText();
                        text += numeric[i].getText();
                        textF.setText(text);
                    }
                }
            }
        }
    }

    //Method yang digunakan menghitung hasil perhitungan
    private void eval() {
        switch (op) {
            case '+':
                equal = n1 + n2;
                break;
            case '-':
                equal = n1 - n2;
                break;
            case '*':
                equal = n1 * n2;
                break;
            case '/':
                equal = n1 / n2;
                break;
        }
    }

    public static void main(String[] args) {
        Percobaan9_2 pb = new Percobaan9_2();
        pb.tampil(null);
    }
}