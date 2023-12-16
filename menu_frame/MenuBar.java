package menu_frame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Bar ");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a MenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create Menus
        JMenu fileMenu = new JMenu("File");
        //JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        // Create MenuItems
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save as");
        //JMenuItem exitItem = new JMenuItem("Exit");
        //JMenuItem cutItem = new JMenuItem("Cut");
        //JMenuItem copyItem = new JMenuItem("Copy");
        //JMenuItem pasteItem = new JMenuItem("Paste");
        JMenuItem helpItem = new JMenuItem("Contact");

        // Add ActionListeners to MenuItems
//        exitItem.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);
//            }
//        });

        // Add MenuItems to Menus
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        //fileMenu.addSeparator(); // Separator line in the menu
        //fileMenu.add(exitItem);

//        editMenu.add(cutItem);
//        editMenu.add(copyItem);
//        editMenu.add(pasteItem);
          helpMenu.add(helpItem);

        // Add Menus to MenuBar
        menuBar.add(fileMenu);
        //menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Set the MenuBar for the frame
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}
