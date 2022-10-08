package Modul5;

import java.text.MessageFormat;
import java.util.*;
import javax.swing.*;

public class Percobaan5_2 {
    static List<Integer> getIndex(int[] a, int ind){
        List<Integer> index = new ArrayList<>();
        for(int i =0;i<a.length;i++){
            if(a[i] == ind) index.add(i);
        }
        return index;
    }
 public static void main(String[] args) {

    
   
        int data[] = new int[10];
        for (int a = 0; a < data.length; a++) {
            data[a] = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Element Index ke " + a));  
        }
        int dumyBest = data[0],dumyKec = data[0];
        for(int i = 0 ;i<data.length;i++){
            if(i <data.length-1) {
                dumyBest = dumyBest>data[i+1]?dumyBest:data[i+1];
                dumyKec = dumyKec<data[i+1]?dumyKec:data[i+1];
            }
        }
        System.out.print("isi dari array tersesbut adalah : "+Arrays.toString(data)+"\n");
        System.out.println(MessageFormat.format("NIlai tertinggi adalah {0} berada di index {1}",dumyBest,getIndex(data, dumyBest)));
        System.out.println(MessageFormat.format("NIlai terendah adalah {0} berada di index {1}",dumyKec,getIndex(data, dumyKec)));

        int sum =0;
        for(int a:data){
            sum+=a;
        }
        System.out.println("Reratanya adalah "+sum/data.length);

        int sIndex = Integer.parseInt(JOptionPane.showInputDialog("Massukan angka yang diganti"));
        int nData =  Integer.parseInt(JOptionPane.showInputDialog("Massukan angka penganti"));
        
        List<Integer> arrTemp = getIndex(data, sIndex);
        for(int i=0;i<arrTemp.size();i++){
            int temp = arrTemp.get(i);
            data[temp] = nData;
        }
        System.out.println(MessageFormat.format("Setelah pergantian {0} ke {1}",sIndex,nData));
        System.out.print("isi dari array tersesbut adalah : "+Arrays.toString(data)+"\n");
    }
}
