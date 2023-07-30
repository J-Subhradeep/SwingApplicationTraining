package textfieldmodule;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldModule {
    public TextFieldModule() {

        JFrame frame = new JFrame("Swing Text Field");
        Container c = new Container();
        c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);
        JTextField tf = new JTextField();
        tf.setBounds(50, 50, 200, 30);
        tf.setFont(new Font("Arial", Font.BOLD, 15));
        tf.setHorizontalAlignment(JTextField.RIGHT);


        // action listner
        tf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String s = tf.getText();
                if(!s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You Typed: "+s,"success",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Type something","error",JOptionPane.ERROR_MESSAGE);
                    
                }

            }
            
            
        });


        c.add(tf);

        frame.setBounds(200, 200, 400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
