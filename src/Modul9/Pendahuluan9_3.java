package Modul9;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Pendahuluan9_3 extends Frame {
    Label label1 = new Label("Massukan angka pertama :");
    Label label2 = new Label("Massukan angka kedua :");
    Label label3 = new Label("Massukan angka pertama :");
    TextField tf1 = new TextField(15);
    TextField tf2 = new TextField(15);
    TextField tf3 = new TextField(15);
    JButton bt1 = new JButton("+");
    JButton bt2 = new JButton("-");
    JButton bt3 = new JButton("/");
    JButton bt4 = new JButton("*");
    int ip0, ip1;
    double hs;

    Pendahuluan9_3() {
        setTitle("Design");
        setSize(180, 400);
        setLayout(new FlowLayout());

    }

    void tampil() {
        add(label1);
        add(tf1);
        add(label2);
        add(tf2);
        add(label3);
        add(tf3);
        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        setVisible(true);
    }

    //fungsi button ditambahkan sesuai dengan operatornya
    void fungsi() {
        bt1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ip0 = Integer.parseInt(tf1.getText());
                ip1 = Integer.parseInt(tf2.getText());
                hs = ip0 + ip1;
                tf3.setText(String.valueOf(hs));
            }
        });
        bt2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ip0 = Integer.parseInt(tf1.getText());
                ip1 = Integer.parseInt(tf2.getText());
                hs = ip0 - ip1;
                tf3.setText(String.valueOf(hs));
            }
        });
        bt3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ip0 = Integer.parseInt(tf1.getText());
                ip1 = Integer.parseInt(tf2.getText());
                hs = ip0 / (double)ip1;
                tf3.setText(String.valueOf(hs));
            }
        });
        bt4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ip0 = Integer.parseInt(tf1.getText());
                ip1 = Integer.parseInt(tf2.getText());
                hs = ip0 * ip1;
                tf3.setText(String.valueOf(hs));
            }
        });
    }

    public static void main(String[] args) {
        Pendahuluan9_3 pd = new Pendahuluan9_3();
        pd.tampil();
        pd.fungsi();
    }
}
