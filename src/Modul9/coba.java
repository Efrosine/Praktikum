package Modul9;

import java.awt.*;  
import java.awt.event.*;  

public class coba extends Frame implements MouseListener{

    Label l;
    coba(){
        addMouseListener(this);

        l = new Label();
        l.setBounds(20, 50, 100, 20);

        add(l);
        setSize(300,300);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        //l.setText("Mouse Clicked");
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        l.setText("Mouse Pressed");
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        l.setText("Mouse Released");
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        l.setText("Mouse Entered");
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        l.setText("Mouse Exit");
        
    }
    public static void main(String[] args) {
        new coba();
    }
    
}
