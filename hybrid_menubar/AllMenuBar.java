package hybrid_menubar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AllMenuBar extends JFrame implements ActionListener {
    JTextArea outputArea;

    public AllMenuBar() {
        setTitle("Menu Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Create a TextArea for output
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Create the MenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create the Division Menu
        JMenu divisionMenu = new JMenu("Bangladesh Division");
        JMenuItem dhakaItem = new JMenuItem("Dhaka");
        JMenuItem chittagongItem = new JMenuItem("Chittagong");
        JMenuItem khulnaItem = new JMenuItem("Khulna");
        JMenuItem rangpurItem = new JMenuItem("Rangpur");
        JMenuItem rajshahiItem = new JMenuItem("Rajshahi");

        // Add ActionListeners to Division MenuItems
        dhakaItem.addActionListener(this);
        chittagongItem.addActionListener(this);
        khulnaItem.addActionListener(this);
        rangpurItem.addActionListener(this);
        rajshahiItem.addActionListener(this);

        // Add Division MenuItems to Division Menu
        divisionMenu.add(dhakaItem);
        divisionMenu.add(chittagongItem);
        divisionMenu.add(khulnaItem);
        divisionMenu.addSeparator();
        divisionMenu.add(rangpurItem);
        divisionMenu.add(rajshahiItem);

        // Create the District Menu
        JMenu districtMenu = new JMenu("Bangladesh District");
        JMenuItem gazipurItem = new JMenuItem("Gazipur");
        JMenuItem laksmipurItem = new JMenuItem("Laksmipur");
        JMenuItem bagerhatItem = new JMenuItem("Bagerhat");
        JMenuItem kurigramItem = new JMenuItem("Kurigram");
        JMenuItem chapaiItem = new JMenuItem("Chapainawabganj");

        // Add ActionListeners to District MenuItems
        gazipurItem.addActionListener(this);
        laksmipurItem.addActionListener(this);
        bagerhatItem.addActionListener(this);
        kurigramItem.addActionListener(this);
        chapaiItem.addActionListener(this);

        // Add District MenuItems to District Menu
        districtMenu.add(gazipurItem);
        districtMenu.add(laksmipurItem);
        districtMenu.addSeparator();
        districtMenu.add(bagerhatItem);
        districtMenu.add(kurigramItem);
        districtMenu.add(chapaiItem);

        // Add Menus to MenuBar
        menuBar.add(divisionMenu);
        menuBar.add(districtMenu);

        // Set MenuBar to the frame
        setJMenuBar(menuBar);

        // Add output area to the frame
        add(scrollPane, BorderLayout.CENTER);
    }

    // ActionListener implementation
    public void actionPerformed(ActionEvent e) {
        JMenuItem source = (JMenuItem) (e.getSource());
        String selectedItem = source.getText();
        if (selectedItem.equals("Dhaka") || selectedItem.equals("Chittagong") || selectedItem.equals("Khulna")
                || selectedItem.equals("Gazipur") || selectedItem.equals("Laksmipur")
                || selectedItem.equals("Bagerhat") || selectedItem.equals("Kurigram")
                || selectedItem.equals("Chapainawabganj")) {
            outputArea.setText(selectedItem);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AllMenuBar menuDemo = new AllMenuBar();
            menuDemo.setVisible(true);
        });
    }
}
