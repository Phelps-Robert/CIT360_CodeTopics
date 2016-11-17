package addressbook;
/**
 *
 * @author RJ
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Delete extends JFrame {

	private final JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
     * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
                    try {
                        Delete frame = new Delete();
                        frame.setVisible(true);
                    } catch (Exception e) {
                    }
                });
	}

	/**
	 * Create the frame.
	 */
	public Delete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delete Contacts!");
		lblNewLabel.setFont(new Font("Yu Gothic Light", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 847, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblContactNameThat = new JLabel("Contact Name That You Want To Delete:");
		lblContactNameThat.setFont(new Font("Arial", Font.PLAIN, 16));
		lblContactNameThat.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContactNameThat.setBounds(92, 168, 316, 50);
		contentPane.add(lblContactNameThat);
		
		textField = new JTextField();
		textField.setBounds(414, 168, 326, 50);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnDeleteContact = new JButton("Delete Contact");
		btnDeleteContact.addActionListener((ActionEvent e) -> {
                    try{
                        
                        
                        String Searchname=textField.getText();
                        String host = "jdbc:mysql://localhost:3306/addressbook";
                        String uName = "root";
                        String uPass = "123456";
                        Connection con = DriverManager.getConnection(host, uName, uPass);
                        
                        
                        String SQL = "DELETE FROM information WHERE Name = '"+Searchname+"'";
                        
                        try (PreparedStatement pst = con.prepareStatement(SQL)) {
                            pst.execute();
                            
                            JOptionPane.showMessageDialog(null, "Contact Deleted!");
                        }
                        
                        
                        
                    }catch(SQLException err ){
                        
                        JOptionPane.showMessageDialog(null, "ERROR!!");
                    }
                });
		btnDeleteContact.setFont(new Font("Arial", Font.PLAIN, 13));
		btnDeleteContact.setBounds(507, 245, 131, 23);
		contentPane.add(btnDeleteContact);
	}

}
