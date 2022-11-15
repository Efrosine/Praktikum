package Modul8;

import java.awt.*;
import javax.swing.*;
public class Pendahuluan8_3 extends Frame{
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

    Pendahuluan8_3(){
        setTitle("Design");
        setSize(180, 400);
        setLayout(new FlowLayout());
       
    }
    void tampil(){
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
    public static void main(String[] args) {
        Pendahuluan8_3 pd = new Pendahuluan8_3();
        pd.tampil();
    }
}
