package Laprak2;

import java.util.ArrayList;
import java.util.List;

public class LatihanArray {

    public double rerata(int[] arr) {
        int total = 0;
        for (int a : arr) {
            total += a;
        }
        return total / (double) arr.length;
    }

    public int getMax(int[] arr) {
        int max = arr[0];
        for (int temp : arr) {
            max = max > temp ? max : temp;
        }
        return max;
    }

    public int getMin(int[] arr) {
        int min = arr[0];
        for (int temp : arr) {
            min = min < temp ? min : temp;
        }
        return min;
    }

    public List<Integer> getIndex(int[] arr, int a) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] deret = { -5, -3, -6, -3, -4 };
        Arr arr = new Arr();
        LatihanArray la = new LatihanArray();
        arr.setBarisAngka(deret);
        System.out.print("Deret Angka : ");
        arr.tampil(deret);
        System.out.println("Nilai Rerata : " + la.rerata(arr.getBarisAngka()));
        System.out.println("Nilai Max : " + la.getMax(arr.getBarisAngka()));
        System.out.println("Nilai Min : " + la.getMin(arr.getBarisAngka()));
        System.out.println("Angka -3 terdapat pada index : " + la.getIndex(arr.getBarisAngka(), -3));

    }
}