package empty_frame;

import java.awt.*;

public class EFrame_a {
    void makeFrame(){
        Frame f = new Frame();
        f.setTitle("My First GUI Frame");

        f.setVisible(true);   //set frame visibilty true.


    }

    public static void main (String[] args)
    {
    	EFrame_a fa = new EFrame_a();   //creating a frame.
        fa.makeFrame();
    }
}  