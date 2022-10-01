package Modul4;

import java.text.MessageFormat;
import java.util.*;
import javax.swing.*;

public class Percobaan4_4 {    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> nim=new ArrayList<>();
 
        while(true){
            System.out.print("Input Nim(genap) = ");
            int input = scan.nextInt();
            if (input == 0){
                scan.close();
                break;
            }
            nim.add(input);
        }
        while(true){
            int input = Integer.parseInt(JOptionPane.showInputDialog("Input Nim(ganjil) = "));
            if(input == 0) break;
            nim.add(input);
        }

        List<Integer> evenNim = new ArrayList<>(),oddNim = new ArrayList<>();
        for(int i=0;i<nim.size();i++){
           if(nim.get(i)%2==0) evenNim.add(nim.get(i));
           else oddNim.add(nim.get(i));
        }
        for(int i = 0;i<evenNim.size();i++){
            String format = MessageFormat.format("Nim : {0} adalah GENAP", evenNim.get(i));
            System.out.println(format);
        }
        System.out.println("Total NIM genap adalah "+evenNim.size());

        for(int i = 0;i<oddNim.size();i++){
            String format = MessageFormat.format("Nim : {0} adalah GANJIL", oddNim.get(i));
            System.out.println(format);
        }
        System.out.println("Total NIM ganjil adalah "+oddNim.size());
    }
}
