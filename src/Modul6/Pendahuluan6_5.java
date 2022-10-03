package Modul6;

public class Pendahuluan6_5 {
    public static void main(String[] args) {
        int data2[][] = { { 4, 6, 4, 7, 8, 3, 2, 10 }, { 4, 6, 4, 2, 8, 8, 2, 10 } };

        System.out.println("For Loop");
        for(int i =0;i<data2.length;i++){
            for(int j = 0;j<data2[i].length;j++){
                System.out.print(data2[i][j]);
            }
        }

        System.out.println("\nWhile Loop");
        int column =0;
        while(column<data2.length){
            int row = 0;
            while(row<data2[column].length){
                System.out.print(data2[column][row]);
                row++;
            }
            column++;
        }

        System.out.println("\nDo While Loop");
        int column2 =0;
        do{
            int row = 0;
            do{
                System.out.print(data2[column2][row]);
                row++;
            } while(row<data2[column2].length);
            column2++;
        }while(column2<data2.length);
        
    }
}
