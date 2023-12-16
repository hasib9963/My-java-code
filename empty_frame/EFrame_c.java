package empty_frame;
import javax.swing.*;
public class EFrame_c extends JFrame {
    JFrame frame;
    EFrame_c()
    {
        setTitle("My First GUI Frame");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new EFrame_c();
    }
}

