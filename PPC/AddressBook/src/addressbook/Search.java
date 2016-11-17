package addressbook;
/**
 *
 * @author RJ
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import net.proteanit.sql.DbUtils;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Search extends JFrame {

	private final JPanel contentPane;
	private JTable table;
	private JTextField textSearch;

	/**
	 * Launch the application.
     * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
                    try {
                        Search frame = new Search();
                        frame.setVisible(true);
                    } catch (Exception e) {
                    }
                });
	}

	/**
	 * Create the frame.
	 */
	public Search() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1007, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCantFindA = new JLabel("Can't Find a Contact? No Problem! We are here to help!");
		lblCantFindA.setFont(new Font("Yu Gothic Light", Font.PLAIN, 26));
		lblCantFindA.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantFindA.setBounds(10, 10, 971, 50);
		contentPane.add(lblCantFindA);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 170, 971, 203);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblEnterName = new JLabel("Enter Name To Search:");
		lblEnterName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnterName.setFont(new Font("Arial", Font.PLAIN, 15));
		lblEnterName.setBounds(274, 82, 200, 39);
		contentPane.add(lblEnterName);
		
		textSearch = new JTextField();
		textSearch.setBounds(531, 83, 200, 39);
		contentPane.add(textSearch);
		textSearch.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener((ActionEvent arg0) -> {
                    PreparedStatement ps = null;
                    try{
                        
                        
                        String Searchname=textSearch.getText();
                        String host = "jdbc:mysql://localhost:3306/addressbook";
                         String uName = "root";
                        String uPass = "123456";
                        Connection con = DriverManager.getConnection(host, uName, uPass);
                        
                        Statement stmt = con.createStatement( );
                        String SQL = "SELECT * FROM information WHERE Name = '"+Searchname+"'";
                        
                        
                        
                        ResultSet rs = stmt.executeQuery( SQL );
                        table.setModel(DbUtils.resultSetToTableModel(rs));
                        
                        
                        
                    }catch(SQLException err ){
                        
                    }
                });
		btnSearch.setBounds(531, 136, 89, 23);
		contentPane.add(btnSearch);
	}
}