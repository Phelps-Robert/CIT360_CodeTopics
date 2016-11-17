package addressbook;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;
import java.awt.Font;




public class Data extends JFrame {

	private final JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
     * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
                    try {
                        Data frame = new Data();
                        frame.setVisible(true);
                    } catch (Exception e) {
                    }
                });
	}

	/**
	 * Create the frame.
	 */
	public Data() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1263, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Load Contacts");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton.addActionListener((ActionEvent arg0) -> {
                    try{
                        String host = "jdbc:mysql://localhost:3306/addressbook";
                        String uName = "root";
                        String uPass = "123456";
                        Connection con = DriverManager.getConnection(host, uName, uPass);
                        
                        Statement stmt = con.createStatement( );
                        String SQL = "SELECT * FROM information";
                        ResultSet rs = stmt.executeQuery( SQL );
                        
                        table.setModel(DbUtils.resultSetToTableModel(rs));
                        
                    }catch(SQLException err ){
                        
                    }
                });
		btnNewButton.setBounds(544, 20, 148, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 54, 1227, 498);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
