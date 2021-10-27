import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Frame {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
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
	public Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 662, 304);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(44, 32, 107, 15);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(53, 83, 70, 15);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(147, 30, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(159, 81, 125, 19);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("login");
		btnLogin.setBounds(231, 123, 117, 25);
		frame.getContentPane().add(btnLogin);
	}
}
