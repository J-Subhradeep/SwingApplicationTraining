package framemodule;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

public class MainFrame {
    Container c;

    private Font f;

    public MainFrame() {
        JFrame frame = new JFrame();

        // frame.setSize(400,300);

        // to center the frame
        // frame.setLocationRelativeTo(null);

        // to give position to the frame
        // frame.setLocation(200,50);

        // the combination of setSize and setLocation
        frame.setBounds(200, 50, 400, 300);

        // to set the title
        frame.setTitle("Demo Swings");

        // to make resizable false
        // frame.setResizable(false);

        // setting icon
        ImageIcon icon = new ImageIcon(getClass().getResource("tick.png"));
        System.out.println(getClass().getResource("tick.png"));
        frame.setIconImage(icon.getImage());

        // setting background color of frame
        c = frame.getContentPane();
        c.setLayout(null);
        // c.setBackground(Color.yellow);

        // setText and setLabel
        // f = new Font("arial", Font.BOLD, 10);
        // JLabel userLabel = new JLabel();
        // userLabel.setText("Enter your name :");
        // userLabel.setBounds(50, 20, 150, 50);
        // userLabel.setFont(f);
        // // set background and text color of label
        // userLabel.setOpaque(true);
        // userLabel.setBackground(Color.blue);
        // userLabel.setForeground(Color.white);

        // //set tooltip
        // userLabel.setToolTipText("User Name");
        // c.add(userLabel);

        



        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
