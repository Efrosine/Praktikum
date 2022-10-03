package Modul6;

public class Pendahuluan6_6 {
    public static void main(String[] args) {
        int data2[][] = { { 4, 6, 4, 7, 8, 3, 2, 10 }, { 4, 6, 4, 2, 8, 8, 2, 10 } };

        int sumArr =0,lengthArr=0;

        for(int i =0;i<data2.length;i++){
            for(int j =0;j<data2[i].length;j++){
                sumArr += data2[i][j];
                lengthArr++;
            }
        }

        int rerata = sumArr/lengthArr;
        System.out.println("Nilai Reratanya : "+rerata);
    }
}
