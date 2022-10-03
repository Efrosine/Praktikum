package Modul4;

public class ContohStar {
    public static void main(String[] args) {
        
        int baris = 7;
        // for (int i=0; i<15; i++) {
        // for (int j=0; j<i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        
        // for (int i=0; i<baris; i++) {
        // for (int k=baris; k>i; k--) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
    
        for (int i=1; i<=baris; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }

            for (int k=baris; k>=i; k--) {
                System.out.print(" ");
            }

            for (int l=baris; l>=i; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    
    // for (int i=1; i<=baris; i++) {
    //     for (int j=1; j<=2; j++){
    //         String s = "* ";
    //         for (int k=0; k<baris; k++){
                
    //             if ((baris-k)<=i) {
    //                 s="  ";
    //             }
    //             System.out.print(s);
    //         }
    //     }
    //     System.out.println();
    // }
    
    
    
    }
}
