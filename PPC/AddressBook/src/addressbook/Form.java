package addressbook;

/**
 *
 * @author RJ
 */
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;


public class Form extends javax.swing.JFrame {
    DbUtil dbUtil;
    Connection con;
    private int user_id;

    /**
     * Creates new form adressbookGui
     */
    public Form() {
        initComponents();
        dbUtil=new DbUtil();
    }
    
    public Form(int user_id) {
        this();
        this.user_id = user_id;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TFFirstName = new javax.swing.JTextField();
        TFLastName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Arial", Font.PLAIN, 13));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Arial", Font.PLAIN, 13));
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setFont(new Font("Arial", Font.PLAIN, 13));
        TFEmailAdress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setFont(new Font("Arial", Font.PLAIN, 13));
        TFCountry = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setFont(new Font("Arial", Font.PLAIN, 13));
        TFState = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setFont(new Font("Arial", Font.PLAIN, 13));
        TFZipCode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setFont(new Font("Arial", Font.PLAIN, 13));
        TFDOB = new javax.swing.JTextField();
        TFDOB.addActionListener((ActionEvent arg0) -> {
        });
        jLabel9 = new javax.swing.JLabel();
        jLabel9.setFont(new Font("Arial", Font.PLAIN, 13));
        TFPhone1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel11.setFont(new Font("Arial", Font.PLAIN, 13));
        TFHomeAdress = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        setResizable(false);

        jLabel1.setFont(new Font("Yu Gothic Light", Font.PLAIN, 32)); // NOI18N
        jLabel1.setText("General Information");

        TFFirstName.addActionListener((java.awt.event.ActionEvent evt) -> {
            TFFirstNameActionPerformed(evt);
        });

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Email Address");

        TFEmailAdress.addActionListener((java.awt.event.ActionEvent evt) -> {
            TFEmailAdressActionPerformed(evt);
        });

        jLabel5.setText("Country");

        TFCountry.addActionListener((java.awt.event.ActionEvent evt) -> {
            TFCountryActionPerformed(evt);
        });

        jLabel6.setText("City");

        jLabel7.setText("Zip Code");

        jLabel8.setText("Date of Birth");

        jLabel9.setText("Phone Number ");

        jLabel11.setText("Home Address");

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnSaveActionPerformed(evt);
        });
        
        lblDdmmyyyy = new JLabel("DD/MM/YYYY");
        lblDdmmyyyy.setFont(new Font("Arial", Font.ITALIC, 12));
        
        lblxxxxxxxxx = new JLabel("03xx-xxxxxxx");
        lblxxxxxxxxx.setFont(new Font("Arial", Font.ITALIC, 13));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(316)
        					.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(20)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(TFHomeAdress, 690, 690, 690)
        						.addComponent(jLabel11)
        						.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 366, GroupLayout.PREFERRED_SIZE)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(TFCountry, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
        							.addGap(71)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(TFState, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
        							.addGap(70)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        								.addComponent(TFZipCode, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(TFDOB, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(lblDdmmyyyy, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
        						.addComponent(TFEmailAdress, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(TFFirstName, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
        							.addGap(121)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        								.addComponent(TFLastName, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(TFPhone1, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(lblxxxxxxxxx, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
        						.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))))
        			.addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addGap(12)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(jLabel2))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(TFLastName, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(TFFirstName, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addGap(30)
        			.addComponent(jLabel4)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(TFEmailAdress, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        			.addGap(35)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(jLabel6)
        				.addComponent(jLabel7))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(TFState, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(TFCountry, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(TFZipCode, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
        			.addGap(33)
        			.addComponent(jLabel8)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(TFDOB, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblDdmmyyyy, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addGap(43)
        			.addComponent(jLabel9)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(TFPhone1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblxxxxxxxxx, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addGap(36)
        			.addComponent(jLabel11)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(TFHomeAdress, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        			.addGap(20))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFFirstNameActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_TFFirstNameActionPerformed

    private void TFEmailAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFEmailAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFEmailAdressActionPerformed

    private void TFCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFCountryActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
    	String name=TFFirstName.getText();
        String surname=TFLastName.getText();
        String email=TFEmailAdress.getText();
        String country=TFCountry.getText();
        String city=TFState.getText();
        String zipcode=TFZipCode.getText();
        String dob=TFDOB.getText();
        String phone=TFPhone1.getText();
        String address=TFHomeAdress.getText();
        
        String query="insert into information (name,surname,email,country,city,zipcode,dob,phone,address) values(?,?,?,?,?,?,?,?,?);";
        con=dbUtil.getConnection();
        PreparedStatement preparedStatement = null;
      
            
        
        
        try {
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, country);
            preparedStatement.setString(5, city);
            preparedStatement.setString(6, zipcode);
            preparedStatement.setString(7, dob);
            preparedStatement.setString(8, phone);
            preparedStatement.setString(9, address);
            
            
            preparedStatement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "record inserted successfully ","Info",JOptionPane.INFORMATION_MESSAGE);
            
            preparedStatement.close(); 
           
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "record not inserted successfully due to " + e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }finally{
            dbUtil.closeConnection();
        }
        TFFirstName.setText("");
        TFLastName.setText("");
        TFEmailAdress.setText("");
        TFCountry.setText("");
        TFState.setText("");
        TFZipCode.setText("");
        TFDOB.setText("");
        TFPhone1.setText("");
        TFHomeAdress.setText("");
        
            
        
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Form().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFCountry;
    private javax.swing.JTextField TFDOB;
    private javax.swing.JTextField TFEmailAdress;
    private javax.swing.JTextField TFFirstName;
    private javax.swing.JTextField TFHomeAdress;
    private javax.swing.JTextField TFLastName;
    private javax.swing.JTextField TFPhone1;
    private javax.swing.JTextField TFState;
    private javax.swing.JTextField TFZipCode;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private JLabel lblDdmmyyyy;
    private JLabel lblxxxxxxxxx;
    // End of variables declaration//GEN-END:variables
}