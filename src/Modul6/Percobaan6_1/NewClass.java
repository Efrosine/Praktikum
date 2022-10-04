package Modul6.Percobaan6_1;

public class NewClass {
    public static void main(String[] args) {
        int data2[][] = { { 4,6,4,2,8,4,2,10 }, { 4,6,4,2,8,4,2,10} };
        for(int a = 0;a<data2.length;a++){
            for(int b =0 ;b<data2[0].length;b++){
                System.out.println( data2[a][b]+" ");
            }
            System.out.println("\n");
        }
    }
}
