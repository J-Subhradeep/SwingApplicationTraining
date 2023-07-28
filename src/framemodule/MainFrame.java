package framemodule;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainFrame {
    public MainFrame(){
        JFrame frame = new JFrame();



        frame.setVisible(true);
        // frame.setSize(400,300);

        // to center the frame
        // frame.setLocationRelativeTo(null);

        // to give position to the frame
        // frame.setLocation(200,50);

        // the combination of setSize and setLocation
        frame.setBounds(200,50,400,300);


        // to set the title 
        // frame.setTitle("Demo Swings");

        // to make resizable false
        frame.setResizable(false);

        //setting icon
        ImageIcon icon = new ImageIcon(getClass().getResource("tick.png"));
        System.out.println(getClass().getResource("tick.png"));
        frame.setIconImage(icon.getImage());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
