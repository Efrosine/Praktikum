package Modul8;

import java.awt.*;
public class Pendahuluan8_3 extends Frame{
    Label label1 = new Label("Massukan angka pertama :");
    Label label2 = new Label("Massukan angka kedua :");
    Label label3 = new Label("Massukan angka pertama :");
    TextField tf1 = new TextField(15);
    TextField tf2 = new TextField(15);
    TextField tf3 = new TextField(15);
    Button bt1 = new Button("  +  ");
    Button bt2 = new Button("  -  ");
    Button bt3 = new Button("  /  ");
    Button bt4 = new Button("  *  ");
    Pendahuluan8_3(){
        setTitle("Design");
        setSize(180, 400);

        setLayout(new FlowLayout());
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
    }
    void tampil(){
        setVisible(true);
    }
    public static void main(String[] args) {
        Pendahuluan8_3 pd = new Pendahuluan8_3();
        pd.tampil();
    }
}
