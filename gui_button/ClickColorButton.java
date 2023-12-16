package gui_button;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BackGroundChange{
    JFrame fm = new JFrame("Click to Change the color");
    JButton rb, gb;
    void running(){
        rb = new JButton("Red");
        gb = new JButton("Green");

        fm.setLayout(new FlowLayout());
        fm.add(rb);
        fm.add(gb);
        fm.setSize(300,300);
        fm.setVisible(true);

        rb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                fm.getContentPane().setBackground(Color.RED);
            }
        });
        
        gb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                fm.getContentPane().setBackground(Color.GREEN);
            }
        });
    }
}

public class ClickColorButton {
    public static void main(String[] args) {
        BackGroundChange cbgr = new BackGroundChange();
        cbgr.running();        
    }
}
