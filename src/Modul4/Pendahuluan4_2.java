package Modul4;

public class Pendahuluan4_2 {
    public static void main(String[] args) {

        System.out.println("While loop");
        int a = 1;
        while(a<11){
            System.out.print(a);
            a++;
        }

        System.out.println("\nDo While loop");
        int b = 1;
        do{
            System.out.print(b);
            b++;
        }while(b<11);

        System.out.println("\nFor loop");
        for(int i = 1;i<11;i++){
            System.out.print(i);
        }
    }
}