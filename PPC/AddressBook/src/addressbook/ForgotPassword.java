package addressbook;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class ForgotPassword extends JFrame {
	DbUtil dbUtil;
    Connection con;

	private final JPanel contentPane;
	private JTextField UNtextField;
	private JTextField PCtextField;
	private final JButton btnDone;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
     * @param args
	 */
	public static void main(String[] args) {
	
		
		
		
		EventQueue.invokeLater(() -> {
                    try {
                        ForgotPassword frame = new ForgotPassword();
                        frame.setVisible(true);
                    } catch (Exception e) {
                    }
                });
	}

	/**
	 * Create the frame.
	 */
	public ForgotPassword() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblForgotPassword = new JLabel("FORGOT PASSWORD!?");
		lblForgotPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblForgotPassword.setFont(new Font("Yu Gothic Light", Font.PLAIN, 26));
		lblForgotPassword.setBounds(10, 22, 682, 33);
		contentPane.add(lblForgotPassword);
		
		JLabel lblUsername = new JLabel("USERNAME:");
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setFont(new Font("Arial", Font.BOLD, 14));
		lblUsername.setBounds(10, 104, 294, 33);
		contentPane.add(lblUsername);
		
		JLabel lblPincode = new JLabel("PINCODE:");
		lblPincode.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPincode.setFont(new Font("Arial", Font.BOLD, 14));
		lblPincode.setBounds(10, 160, 294, 33);
		contentPane.add(lblPincode);
		
		JLabel lblNewPassword = new JLabel("NEW PASSWORD:");
		lblNewPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewPassword.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewPassword.setBounds(20, 218, 284, 26);
		contentPane.add(lblNewPassword);
		
		UNtextField = new JTextField();
		UNtextField.setBounds(322, 104, 200, 33);
		contentPane.add(UNtextField);
		UNtextField.setColumns(10);
		
		PCtextField = new JTextField();
		PCtextField.setBounds(322, 161, 200, 33);
		contentPane.add(PCtextField);
		PCtextField.setColumns(10);
		
		btnDone = new JButton("DONE");
		btnDone.addActionListener((ActionEvent arg0) -> {
                    try {
                        String host = "jdbc:mysql://localhost:3306/addressbook";
                        String uName = "root";
                        String uPass = "123456";
                        Connection con1 = DriverManager.getConnection(host, uName, uPass);
                        String pc = PCtextField.getText();
                        String np = String.valueOf(passwordField.getPassword());
                        String un = UNtextField.getText();
                        String sql = "UPDATE usernamespasswords SET password = '"+np+"' WHERE pincode = '"+pc+"' AND username = '"+un+"'";
                        try (PreparedStatement pst = con1.prepareStatement(sql)) {
                            pst.execute();
                            JOptionPane.showMessageDialog(null, "Password Changed Successfully!");
                        }
                    }catch(SQLException | HeadlessException e){
                        
                        JOptionPane.showMessageDialog(null, "Error");
                        
                    }
                });
		btnDone.setBounds(603, 274, 89, 23);
		contentPane.add(btnDone);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(322, 216, 200, 33);
		contentPane.add(passwordField);
	}
}