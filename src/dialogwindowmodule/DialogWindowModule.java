package dialogwindowmodule;

import javax.swing.*;

public class DialogWindowModule {

	public DialogWindowModule() {
		// TODO Auto-generated constructor stub

		// type 1 with 2 params
		// JOptionPane.showMessageDialog(null, "Wrong Password");

		// with 4 params
		// JOptionPane.showMessageDialog(null, "Wrong Username or Password", "Error",
		// JOptionPane.ERROR_MESSAGE);

		// with 5 params
		ImageIcon icon = new ImageIcon(System.getProperty("user.dir") + "\\src\\dialogwindowmodule\\tick.png");
		JOptionPane.showMessageDialog(null, "Login Successful", "Done", JOptionPane.PLAIN_MESSAGE, icon);
	}

}
