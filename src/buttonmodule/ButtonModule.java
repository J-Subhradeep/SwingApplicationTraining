package buttonmodule;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;

import java.awt.Container;
import java.awt.Cursor;


public class ButtonModule {
    public ButtonModule() {
        JFrame frame = new JFrame();
        Container c = new Container();
        c = frame.getContentPane();
        c.setLayout(null);

        JButton button = new JButton("Click Me");
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        button.setCursor(cursor);
        button.setBounds(200, 100, 100, 50);

        button.setBackground(Color.magenta);
        c.add(button);

        ImageIcon icon = new ImageIcon(getClass().getResource("tick.png"));
        JButton button2 = new JButton(icon);
        button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button2.setBounds(200, 152, 100, 50);
        c.add(button2);

        frame.setSize(500, 400);
        // frame.setLocation(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

