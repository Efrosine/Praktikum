package Modul7;

public class Percobaan7_2 {
    static int sigma(int n,int x){
        int y =0;
        for(int i =1;i<=n;i++){
            y += x+(2*i);
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println("Y = "+sigma(3,2));
    }
}