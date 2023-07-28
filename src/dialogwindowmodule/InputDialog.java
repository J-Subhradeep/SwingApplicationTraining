package dialogwindowmodule;

import javax.swing.JOptionPane;

public class InputDialog {
    public InputDialog(){
        String name = JOptionPane.showInputDialog(null, "Enter Your Password");
        JOptionPane.showMessageDialog(null, name+" Welcome");

    }
}
