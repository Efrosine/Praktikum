package Modul6;

public class Percobaan6_3 {
    public static void main(String[] args) {

        String[][] data = {
                { "NAMA", "ALAMAT      ", "TELEPON" }, 
                { "ABDUL", "KEDIRI   ", "085436668991" },
                { "KUSNO", "TRENGGALEK", "085436668992" }, 
                { "PONIRAN", "BOJONEGORO", "085436668999" }
        };
        for (int i = 0; i < data.length; i++) {
            String rows = "";
            for (int j = 0; j < data[i].length; j++) {
                rows += (data[i][j] + "\t");
            }
            System.out.println(rows);
        }
        //pake  jframe
    }
}
