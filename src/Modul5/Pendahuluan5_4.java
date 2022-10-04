package Modul5;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.*;

public class Pendahuluan5_4 {
    public static void main(String[] args) {

        int data[] = { 4, 6, 4, 2, 8, 4, 2, 11 };
        System.out.println(Arrays.toString(data));

        int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan angkanya : "));

        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == input)
                index.add(i);
        }
        String hIndex = MessageFormat.format("Angka {0} berada pada index = {1}", input, index.toString());
        System.out.println(hIndex);

    }
}
