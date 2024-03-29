package universitysystem;

import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InstructorForm extends javax.swing.JFrame {
    
    
    public InstructorForm() {
        initComponents();
        
        
        // Populate the Table and Combo box
        displayInstructors();
        getDepartments();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btn_search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_instructors = new javax.swing.JTable();
        btn_refresh = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt_salary = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        combo_departments = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        btn_delete = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 255));
        setForeground(new java.awt.Color(153, 204, 255));
        setIconImages(null);

        btn_search.setBackground(new java.awt.Color(102, 102, 255));
        btn_search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_search.setForeground(new java.awt.Color(255, 255, 255));
        btn_search.setText("SEARCH");
        btn_search.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_searchMouseClicked(evt);
            }
        });
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        table_instructors.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        table_instructors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "DEPARTMENT", "SALARY"
            }
        ));
        table_instructors.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_instructors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_instructorsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_instructors);

        btn_refresh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_refresh.setText("REFRESH");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("ADD NEW INSTRUCTOR"));

        txt_salary.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        combo_departments.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        combo_departments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_departmentsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("ID");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("NAME");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("DEPARTMENT");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("SALARY");

        btn_save.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_save.setText("SAVE");
        btn_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_saveMouseClicked(evt);
            }
        });
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_edit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_edit.setText("EDIT");
        btn_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editMouseClicked(evt);
            }
        });
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_id)
                    .addComponent(combo_departments, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_save))))
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_departments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_save)
                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        txt_search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btn_delete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_deleteMouseClicked(evt);
            }
        });
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_refresh))
                    .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(582, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(btn_search)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_refresh)
                    .addComponent(btn_delete))
                .addGap(27, 27, 27))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(482, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        searchInstructor(txt_search.getText());
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_searchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_searchMouseClicked

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        displayInstructors();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void combo_departmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_departmentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_departmentsActionPerformed

    private void btn_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveMouseClicked
        
        // check ID duplicates before adding new Instructor
        if(checkId(txt_id.getText())) {
            JOptionPane.showMessageDialog(null, "ID taken. Please use another ID.");
        } else {
            addInstructor(txt_id.getText(), 
                    txt_name.getText(), 
                    combo_departments.getSelectedItem().toString(), 
                    Double.parseDouble(txt_salary.getText()));

            displayInstructors();

            clearTextFields();            
        }
        

    }//GEN-LAST:event_btn_saveMouseClicked

    public void clearTextFields() {
        txt_id.setText("");
        txt_name.setText("");
        txt_salary.setText("");
        combo_departments.setSelectedIndex(0);
    }
    
    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deleteMouseClicked
        DefaultTableModel model = (DefaultTableModel) table_instructors.getModel();
        String id = model.getValueAt(table_instructors.getSelectedRow(), 0).toString();
        deleteInstructor(id);
        
        displayInstructors();
    }//GEN-LAST:event_btn_deleteMouseClicked

    private void btn_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editMouseClicked

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        getInstructorData();
    }//GEN-LAST:event_btn_editActionPerformed

    private void table_instructorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_instructorsMouseClicked
        if(table_instructors.getSelectedRow() > -1) {
            getInstructorData();
        }
    }//GEN-LAST:event_table_instructorsMouseClicked

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_saveActionPerformed
    
    // Display Instructor Data from Table to Text fields and Combobox.
    private void getInstructorData() {
        DefaultTableModel model = (DefaultTableModel) table_instructors.getModel();
        
        String id = model.getValueAt(table_instructors.getSelectedRow(), 0).toString();
        String name = model.getValueAt(table_instructors.getSelectedRow(), 1).toString();
        String department = model.getValueAt(table_instructors.getSelectedRow(), 2).toString();
        String salary = model.getValueAt(table_instructors.getSelectedRow(), 3).toString();

        txt_id.setText(id);
        txt_name.setText(name);
        txt_salary.setText(salary);        
        
        // for the department combo box.
        for(int item = 0; item < combo_departments.getItemCount(); item++) {
            if(combo_departments.getItemAt(item).equals(department)) {
                combo_departments.setSelectedIndex(item); // 0
            }
        }   
        // end
        
    }
    
    // Check ID duplicates.
    public Boolean checkId(String id) {
        DatabaseConnection conn = new DatabaseConnection();

        String query = "select id, dept_name, salary " +
                        " from instructor where id = '" + id + "'";

        try(Statement stmt = conn.getConnection().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
             
            int count = 0;
            while(rs.next()) {
                count ++;
            }
            
            if (count > 0){
                // ID taken
                return true;
            }                       
        } catch(SQLException ex) {
            //
        }
        // ID is available
        return false;
    }
    
    // Search instructor using Search Text field and display to table
    private void searchInstructor(String name) {
        DatabaseConnection conn = new DatabaseConnection();
        DefaultTableModel model = (DefaultTableModel) table_instructors.getModel();

        model.setRowCount(0);
        String query = "select id, dept_name, salary " +
                        " from instructor where name = '" + name + "'";

        try(Statement stmt = conn.getConnection().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
             
            
            while(rs.next()) {
 
                String id = rs.getString("id");
               
                String dept_name = rs.getString("dept_name");
                double salary = rs.getDouble("salary");
                
                model.addRow(new Object[] {id, name, dept_name, String.valueOf(salary)});
            }
            
           
        } catch(SQLException ex) {
            //
        }
    }
    

    // Display all instructor data to the table
    private void displayInstructors() {
        DatabaseConnection conn = new DatabaseConnection();
        DefaultTableModel model = (DefaultTableModel) table_instructors.getModel();
        model.setRowCount(0);

        
        String query = "select id, name, dept_name, salary from instructor";
        
        try(Statement stmt = conn.getConnection().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String dept_name = rs.getString("dept_name");
                double salary = rs.getDouble("salary");
                
                model.addRow(new Object[] {id, name, dept_name, String.valueOf(salary)});
            }
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        } 
    }
    
    // Populate the department combobox
    public void getDepartments() {
        DatabaseConnection conn = new DatabaseConnection();
        
        String query = "SELECT DISTINCT dept_name FROM department";
        
        try(Statement stmt = conn.getConnection().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {  
                combo_departments.addItem(rs.getString(1));
            }
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    // Add a new Instructor
    public void addInstructor(String id, 
                              String name,
                              String dept_name,
                              double salary) {
        DatabaseConnection conn = new DatabaseConnection();
        
        String query = "INSERT INTO instructor (id, name, dept_name, salary) VALUES (?, ?, ?, ?)";
        try(PreparedStatement pstmt = conn.getConnection().prepareStatement(query)) {
            pstmt.setString(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, dept_name);
            pstmt.setDouble(4, salary);
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Added new instructor successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add new instructor.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error adding instructor: " + ex.getMessage());
            ex.printStackTrace(); // Print stack trace for debugging
        }
    }
    
    
    // Delete instructor
    private void deleteInstructor(String id) {
        DatabaseConnection conn = new DatabaseConnection();
        String query = "DELETE FROM instructor WHERE id = ?";
        
        try(PreparedStatement pstmt = conn.getConnection().prepareStatement(query)) {
            pstmt.setString(1, id);
            if(pstmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Successfully deleted a record.");
            }
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    
    
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InstructorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstructorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstructorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstructorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstructorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_search;
    private javax.swing.JComboBox<String> combo_departments;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_instructors;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
