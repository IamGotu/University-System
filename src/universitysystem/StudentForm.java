package universitysystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StudentForm extends javax.swing.JFrame {

    /**
     * Creates new form StudentForm
     */
    public StudentForm() {
        initComponents();
        
        // Populate the Table and Combo box
        displayStudents();
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

        txt_search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_students = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txt_tot_cred = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        combo_departments = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("STUDENTS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 490, 34));

        table_students.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        table_students.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "DEPARTMENT", "TOTAL CREDIT"
            }
        ));
        table_students.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_students.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_studentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_students);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 64, 639, 365));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("ADD NEW STUDENT"));

        txt_tot_cred.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

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
        jLabel7.setText("TOTAL CREDIT");

        btn_save.setBackground(new java.awt.Color(102, 102, 255));
        btn_save.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_save.setText("SAVE");
        btn_save.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        btn_edit.setBackground(new java.awt.Color(102, 102, 255));
        btn_edit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_edit.setText("EDIT");
        btn_edit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        btn_delete.setBackground(new java.awt.Color(102, 102, 255));
        btn_delete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        btn_refresh.setBackground(new java.awt.Color(102, 102, 255));
        btn_refresh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_refresh.setText("REFRESH");
        btn_refresh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                            .addComponent(txt_tot_cred, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_refresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_save)))
                .addGap(86, 86, 86))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_delete, btn_edit, btn_refresh, btn_save});

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
                    .addComponent(txt_tot_cred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_save)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_delete)
                        .addComponent(btn_refresh)))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_delete, btn_edit, btn_refresh, btn_save});

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 64, 398, 365));

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
        getContentPane().add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 132, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\mark\\UniversitySystem\\src\\universitysystem\\pexels-pixabay-235985.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_searchMouseClicked

    }//GEN-LAST:event_btn_searchMouseClicked

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        searchStudent(txt_search.getText());
    }//GEN-LAST:event_btn_searchActionPerformed

    private void table_studentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_studentsMouseClicked
        if(table_students.getSelectedRow() > -1) {
            getStudentData();
        }
    }//GEN-LAST:event_table_studentsMouseClicked

    private void btn_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deleteMouseClicked
       DefaultTableModel model = (DefaultTableModel) table_students.getModel();
        int selectedRow = table_students.getSelectedRow();

        if (selectedRow != -1) { // Check if a row is selected
            String id = model.getValueAt(selectedRow, 0).toString();
            String name = model.getValueAt(selectedRow, 1).toString();
            String department = model.getValueAt(selectedRow, 2).toString();
            int credits = Integer.parseInt(model.getValueAt(selectedRow, 3).toString());
            deleteStudent(id, name, department, credits);
            displayStudents();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete.");
        }
    }//GEN-LAST:event_btn_deleteMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void combo_departmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_departmentsActionPerformed

    }//GEN-LAST:event_combo_departmentsActionPerformed

    private void btn_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveMouseClicked

        // check ID duplicates before adding new Student
        if(checkId(txt_id.getText())) {
            JOptionPane.showMessageDialog(null, "ID taken. Please use another ID.");
        } else {
            addStudent(txt_id.getText(),
                txt_name.getText(),
                combo_departments.getSelectedItem().toString(),
                Integer.parseInt(txt_tot_cred.getText()));

            displayStudents();

            clearTextFields();
        }

    }//GEN-LAST:event_btn_saveMouseClicked

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseClicked

    }//GEN-LAST:event_btn_editMouseClicked

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        DefaultTableModel model = (DefaultTableModel) table_students.getModel();
        int selectedRow = table_students.getSelectedRow();

        if (selectedRow != -1) { // Check if a row is selected
        String id = model.getValueAt(selectedRow, 0).toString();
        String name = txt_name.getText();
        String department = combo_departments.getSelectedItem().toString();
        int tot_cred = Integer.parseInt(txt_tot_cred.getText());
        updateStudentData(id, name, department, tot_cred);
            displayStudents();
            clearTextFields();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to edit.");
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        displayStudents();
        clearTextFields(); // Clear text fields
    }//GEN-LAST:event_btn_refreshActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentForm().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_students;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_tot_cred;
    // End of variables declaration//GEN-END:variables
    
    // Display all student data to the table
    private void displayStudents() {
        DatabaseConnection conn = new DatabaseConnection();
        DefaultTableModel model = (DefaultTableModel) table_students.getModel();
        model.setRowCount(0);

        
        String query = "select id, name, dept_name, tot_cred from student";
        
        try(Statement stmt = conn.getConnection().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String dept_name = rs.getString("dept_name");
                int tot_cred = rs.getInt("tot_cred");
                
                model.addRow(new Object[] {id, name, dept_name, String.valueOf(tot_cred)});
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
    
    // Display Student Data from Table to Text fields and Combobox.
    private void getStudentData() {
        DefaultTableModel model = (DefaultTableModel) table_students.getModel();
        
        String id = model.getValueAt(table_students.getSelectedRow(), 0).toString();
        String name = model.getValueAt(table_students.getSelectedRow(), 1).toString();
        String department = model.getValueAt(table_students.getSelectedRow(), 2).toString();
        String tot_cred = model.getValueAt(table_students.getSelectedRow(), 3).toString();

        txt_id.setText(id);
        txt_name.setText(name);
        txt_tot_cred.setText(tot_cred);        
        
        // for the department combo box.
        for(int item = 0; item < combo_departments.getItemCount(); item++) {
            if(combo_departments.getItemAt(item).equals(department)) {
                combo_departments.setSelectedIndex(item); // 0
            }
        }   
        // end
        
    }
    
    // Add a new Student
    public void addStudent(String id,
                           String name,
                           String dept_name,
                           int tot_cred) {
        DatabaseConnection conn = new DatabaseConnection();
        
        String query = "INSERT INTO student (id, name, dept_name, tot_cred) VALUES (?, ?, ?, ?)";
        try(PreparedStatement pstmt = conn.getConnection().prepareStatement(query)) {
            pstmt.setString(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, dept_name);
            pstmt.setDouble(4, tot_cred);
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Added new student successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add new student.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error adding student: " + ex.getMessage());
            ex.printStackTrace(); // Print stack trace for debugging
        }
    }
    
    // Delete student
    private void deleteStudent(String id, String name, String department, int credits) {
        DatabaseConnection conn = new DatabaseConnection();
        String query = "DELETE FROM student WHERE id = ? AND name = ? AND dept_name = ? AND tot_cred = ?";

        try (PreparedStatement pstmt = conn.getConnection().prepareStatement(query)) {
            pstmt.setString(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, department);
            pstmt.setDouble(4, credits);
            
            int rowsDeleted = pstmt.executeUpdate(); // Execute the query and get the number of rows affected
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Successfully deleted the record");
            } else {
                JOptionPane.showMessageDialog(null, "No records found");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    // Update student data
    private void updateStudentData(String id, String name, String department, int tot_cred) {        
        DatabaseConnection conn = new DatabaseConnection();
        String query = "UPDATE student SET name = ?, dept_name = ?, tot_cred = ? WHERE id = ?";

        try (PreparedStatement pstmt = conn.getConnection().prepareStatement(query)) {
            pstmt.setString(1, name);
            pstmt.setString(2, department);
            pstmt.setInt(3, tot_cred);
            pstmt.setString(4, id);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Student data updated successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update student data.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error updating student data: " + ex.getMessage());
            ex.printStackTrace();   // Print stack trace for debugging
        }
    }
    
    // Search student using Search Text field and display to table
    private void searchStudent(String name) {
        DatabaseConnection conn = new DatabaseConnection();
        DefaultTableModel model = (DefaultTableModel) table_students.getModel();

        model.setRowCount(0);
        String query = "select id, dept_name, tot_cred " +
                        " from student where name = '" + name + "'";

        try(Statement stmt = conn.getConnection().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
             
            
            while(rs.next()) {
 
                String id = rs.getString("id");
               
                String dept_name = rs.getString("dept_name");
                int tot_cred = rs.getInt("tot_cred");
                
                model.addRow(new Object[] {id, name, dept_name, String.valueOf(tot_cred)});
            }
            
           
        } catch(SQLException ex) {
        }
    }

    // Check ID duplicates.
    public Boolean checkId(String id) {
        DatabaseConnection conn = new DatabaseConnection();

        String query = "select id, dept_name, tot_cred " +
                        " from student where id = '" + id + "'";

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

    public void clearTextFields() {
        txt_id.setText("");
        txt_name.setText("");
        txt_tot_cred.setText("");
        combo_departments.setSelectedIndex(0);
        txt_search.setText("");   
    }
}
