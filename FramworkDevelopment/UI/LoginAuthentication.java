package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginAuthentication {

	private JFrame frame;
	private JTextField usernamefield;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginAuthentication window = new LoginAuthentication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginAuthentication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(new Color(0, 139, 139));
		frame.setBounds(100, 100, 554, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setBackground(new Color(205, 92, 92));
		lblUsername.setBounds(69, 73, 97, 26);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setBounds(69, 110, 81, 14);
		frame.getContentPane().add(lblPassword);
		
		usernamefield = new JTextField();
		usernamefield.setBounds(202, 76, 127, 20);
		frame.getContentPane().add(usernamefield);
		usernamefield.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(202, 107, 127, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblUser = new JLabel("Welcome to \"SBC\" to run the Automation Scripts. ");
		lblUser.setBackground(new Color(0, 0, 0));
		lblUser.setForeground(new Color(255, 255, 255));
		lblUser.setBounds(50, 50, 999, 14);
		frame.getContentPane().add(lblUser);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(255, 255, 255));
		btnLogin.setForeground(new Color(0, 0, 0));
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String uname=usernamefield.getText();
				String pass=passwordField.getText();
				if (uname.equals("") && pass.equals(""))	
				{
					JOptionPane.showMessageDialog(frame, "you are authorised to access scripts");
                    frame.setVisible(false);
                    script1.ScriptsFrame();
                    //Scripts.ScriptsFrame();
					//MHCScripts.MhcScriptsFrame();
				}
				else 	
				{
					JOptionPane.showMessageDialog(frame, "Sorry! you are not authorised.");
				}
			}
		});
		
		
		btnLogin.setBounds(168, 168, 89, 23);
		frame.getContentPane().add(btnLogin);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Rizwan\\Automation\\lib\\Jars\\crm.png"));
		lblNewLabel.setBounds(352, 50, 156, 152);
		frame.getContentPane().add(lblNewLabel);
		
	}
}
