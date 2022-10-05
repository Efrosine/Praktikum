package Modul7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pendahuluan7_3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nama = "";
        try {
           nama = reader.readLine(); 
        } catch (IOException e) {
           System.out.println("error");
        }finally{
            System.out.println("code dijalankan");
        }
    }
}