package Modul6;
import javax.swing.*;
public class Percobaan6_3 {
    public static void main(String[] args) {

        String[][] data = {
                { "ABDUL", "KEDIRI", "085436668991" },
                { "KUSNO", "TRENGGALEK", "085436668992" }, 
                { "PONIRAN", "BOJONEGORO", "085436668999" }
        };

        JFrame f = new JFrame();        
        String column[]={"NAMA","ALAMAT","TELEPON"};         
        JTable jt=new JTable(data,column);      
        JScrollPane js=new JScrollPane(jt);    
        f.add(js);          
        f.setSize(300,200);    
        f.setVisible(true);  
    }
}
