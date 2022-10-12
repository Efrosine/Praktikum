package Modul5;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class Percobaan5_3 {

    static List<Integer> getIndex(int[] a, int ind) {
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ind)
                index.add(i);
        }
        return index;
    }

    public static void main(String[] args) {
        int[] data = new int[5];

        for (int i = 0; i < data.length; i++) {
            data[i] = Integer.parseInt(JOptionPane.showInputDialog("Massukkan Value Array : " + i));
        }
        System.out.println(Arrays.toString(data));

        int min = data[0], max = data[0], sum = 0, oddSum = 0;
        for (int i = 0; i < data.length; i++) {
            max = max > data[i] ? max : data[i];
            min = min < data[i] ? min : data[i];
            sum += data[i];
            if (i % 2 != 0)
                oddSum += data[i];
        }

        String sArray = MessageFormat.format("Min = {0} index : {1}, Max = {2} index : {3}",
                min, getIndex(data, min), max,
                getIndex(data, max));
        System.out.println(sArray);

        double avg = sum / (double) data.length;
        System.out
                .println(MessageFormat.format("Total nilai array = {0} dengan rerata = {1}", sum, avg));

        String oddString = oddSum % 2 == 0 ? "Genap" : "Ganjil";
        System.out.println(
                MessageFormat.format("Hasil penjumlahan Array index Ganjil({0}) adalah {1}", oddSum, oddString));

        Arrays.sort(data);
        System.out.println(Arrays.toString(data));
    }
}