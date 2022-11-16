package Modul9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Percobaan9_1 extends JFrame {
    //deklarasi komponen yang digunakan
    JTextArea nama = new JTextArea(10, 10);
    JButton bt = new JButton("Copy");
    JTextArea txnama = new JTextArea(10, 10);

    //Proses mengatur Frame
    Percobaan9_1() {
        super("Coba Event Handling");
        setLocation(200, 300);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    //tambahkan komponen kedalam Frame
    void tampilan() {
        getContentPane().add(nama);
        nama.append("nama kamu siapa");
        getContentPane().add(bt);
        getContentPane().add(txnama);
        txnama.setBackground(Color.LIGHT_GRAY);
        getContentPane().setLayout(new FlowLayout());
        setVisible(true);
    }

    //membuat fungsi dari button
    void aksi_reaksi() {
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txnama.append(nama.getSelectedText());

            }
        });
    }

    //panggil 2 method yang telah dibuat
    public static void main(String[] args) {
        Percobaan9_1 pb = new Percobaan9_1();
        pb.tampilan();
        pb.aksi_reaksi();
    }
}
