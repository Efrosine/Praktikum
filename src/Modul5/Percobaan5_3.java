package Modul5;

import java.lang.reflect.Array;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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

    static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1)
                max = max > arr[i + 1] ? max : arr[i + 1];
        }
        return max;
    }

    static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1)
                min = min < arr[i + 1] ? min : arr[i + 1];
        }
        return min;
    }

    static int sumArr(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arrLength = 5;
        int[] evenNim = new int[arrLength], oddNim = new int[arrLength];

        for (int i = 0; i < evenNim.length; i++) {
            evenNim[i] = Integer.parseInt(JOptionPane.showInputDialog("Massukkan NIM Genap : "));
        }
        for (int i = 0; i < oddNim.length; i++) {
            System.out.print("Massukan NIM Ganjir : ");
            oddNim[i] = scan.nextInt();
        }
        scan.close();

        String sEvenNim = MessageFormat.format("(NIM Genap)Min = {0} index : {1}, Max = {2} index : {3}",
                getMin(evenNim), getIndex(evenNim, getMin(evenNim)), getMax(evenNim),
                getIndex(evenNim, getMax(evenNim)));
        System.out.println(sEvenNim);
        String sOddNim = MessageFormat.format("(NIM Ganjil)Min = {0} index : {1}, Max = {2} index : {3}",
                getMin(oddNim), getIndex(oddNim, getMin(oddNim)), getMax(oddNim), getIndex(oddNim, getMax(oddNim)));
        System.out.println(sOddNim);

        int sum = sumArr(oddNim) + sumArr(evenNim);
        int rerata = sum / arrLength * 2;

        System.out.println(MessageFormat.format("Total nilai array = {0} dengan rerata = {1}", sum, rerata));

        int oddSum = 0, evenSum = 0;
        for (int i = 0; i < evenNim.length; i++)
            if (i % 2 != 0)
                oddSum += evenNim[i];
        for (int i = 0; i < oddNim.length; i++)
            if (i % 2 == 0)
                evenSum += oddNim[i];

        String oddString = oddSum % 2 == 0 ? "Genap" : "Ganjil";
        String evenString = evenSum % 2 == 0 ? "Genap" : "Ganjil";

        System.out
                .println(MessageFormat.format("Hasil penjumlahan Array nim Genap({0}) adalah {1}", oddSum, oddString));
        System.out.println(
                MessageFormat.format("Hasil penjumlahan Array nim Ganjil({0}) adalah {1}", evenSum, evenString));

        Arrays.sort(evenNim);
        Arrays.sort(oddNim);

        System.out.println(evenNim.toString());
        System.out.println(oddNim.toString());

    }
}
