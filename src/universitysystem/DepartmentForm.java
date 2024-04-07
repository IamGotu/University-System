package universitysystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DepartmentForm extends javax.swing.JFrame {

    /**
     * Creates new form DepartmentForm
     */
    public DepartmentForm() {
        initComponents();
        
        // Populate the Table
        displayDepartments();
        getBuildings();
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
        table_departments = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txt_budget = new javax.swing.JTextField();
        txt_department = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        combo_building = new javax.swing.JComboBox<>();
        btn_refresh = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DEPARTMENT");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 445, 34));

        table_departments.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        table_departments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DEPARTMENT", "BUILDING", "BUDGET"
            }
        ));
        table_departments.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_departments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_departmentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_departments);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 611, 359));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("ADD NEW DEPARTMENT"));

        txt_budget.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_department.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("BUILDING");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("DEPARTMENT");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("BUDGET");

        combo_building.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btn_refresh.setBackground(new java.awt.Color(102, 102, 255));
        btn_refresh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_refresh.setText("REFRESH");
        btn_refresh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(102, 102, 255));
        btn_delete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_department)
                            .addComponent(combo_building, 0, 251, Short.MAX_VALUE)
                            .addComponent(txt_budget)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_refresh)
                        .addGap(18, 18, 18)
                        .addComponent(btn_delete)
                        .addGap(18, 18, 18)
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_save)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_delete, btn_edit, btn_refresh, btn_save});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(combo_building, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_budget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save)
                    .addComponent(btn_edit)
                    .addComponent(btn_delete)
                    .addComponent(btn_refresh))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {combo_building, jLabel5, jLabel6, jLabel7, txt_budget, txt_department});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_delete, btn_edit, btn_refresh, btn_save});

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 440, 270));

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
        getContentPane().add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 132, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\universitydb\\UniversitySystem\\src\\universitysystem\\pexels-pixabay-235985.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_searchMouseClicked

    }//GEN-LAST:event_btn_searchMouseClicked

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        searchDepartment(txt_search.getText());
    }//GEN-LAST:event_btn_searchActionPerformed

    private void table_departmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_departmentsMouseClicked
        if(table_departments.getSelectedRow() > -1) {
            getDepartmentData();
        }
    }//GEN-LAST:event_table_departmentsMouseClicked

    private void btn_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deleteMouseClicked
        DefaultTableModel model = (DefaultTableModel) table_departments.getModel();
        int selectedRow = table_departments.getSelectedRow();

        if (selectedRow != -1) { // Check if a row is selected
            String department = model.getValueAt(selectedRow, 0).toString();
            String building = model.getValueAt(selectedRow, 1).toString();
            double budget = Double.parseDouble(model.getValueAt(selectedRow, 2).toString());
            deleteDepartment(department, building, budget);
            displayDepartments();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete.");
        }
    }//GEN-LAST:event_btn_deleteMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        displayDepartments();
        clearTextFields(); // Clear text fields
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveMouseClicked
        // check department duplicates before adding new Deparmtent
        if(checkdepartment(txt_department.getText())) {
            JOptionPane.showMessageDialog(null, "Department already exist. Please input another Department.");
        } else {
            addDepartment(txt_department.getText(), 
                    combo_building.getSelectedItem().toString(), 
                    Double.parseDouble(txt_budget.getText()));

            displayDepartments();

            clearTextFields();            
        }
    }//GEN-LAST:event_btn_saveMouseClicked

    
    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseClicked

    }//GEN-LAST:event_btn_editMouseClicked

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        DefaultTableModel model = (DefaultTableModel) table_departments.getModel();
        int selectedRow = table_departments.getSelectedRow();

        if (selectedRow != -1) { // Check if a row is selected
            String department = model.getValueAt(selectedRow, 0).toString();
            String building = combo_building.getSelectedItem().toString();
            double budget = Double.parseDouble(txt_budget.getText());
            updateDepartmentData(department, building, budget);
            displayDepartments();
            clearTextFields();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to edit.");
        }
    }//GEN-LAST:event_btn_editActionPerformed
    
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
            java.util.logging.Logger.getLogger(DepartmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepartmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepartmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepartmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepartmentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_search;
    private javax.swing.JComboBox<String> combo_building;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_departments;
    private javax.swing.JTextField txt_budget;
    private javax.swing.JTextField txt_department;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
    
    // Search department using Search Text field and display to table
    private void searchDepartment(String dept_name) {
        DatabaseConnection conn = new DatabaseConnection();
        DefaultTableModel model = (DefaultTableModel) table_departments.getModel();

        model.setRowCount(0);
        String query = "select building, budget " +
                        " from department where dept_name = '" + dept_name + "'";

        try(Statement stmt = conn.getConnection().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
             
            
            while(rs.next()) {
              
                String building = rs.getString("building");
                double budget = rs.getDouble("budget");
                
                model.addRow(new Object[] {dept_name, building, String.valueOf(budget)});
            }
            
           
        } catch(SQLException ex) {
        }
    }
    
    // Display Department Data from Table to Text fields.
    private void getDepartmentData() {
        DefaultTableModel model = (DefaultTableModel) table_departments.getModel();
        
        String dept_name = model.getValueAt(table_departments.getSelectedRow(), 0).toString();
        String building = model.getValueAt(table_departments.getSelectedRow(), 1).toString();
        String budget = model.getValueAt(table_departments.getSelectedRow(), 2).toString();

        txt_department.setText(dept_name);
        txt_budget.setText(budget);

        // for the building combo box.
        for(int item = 0; item < combo_building.getItemCount(); item++) {
            if(combo_building.getItemAt(item).equals(building)) {
                combo_building.setSelectedIndex(item); // 0
            }
        }   
        // end
        
    }
    
    // Delete department
    private void deleteDepartment(String department, String building, double budget) {
        DatabaseConnection conn = new DatabaseConnection();
        String query = "DELETE FROM department WHERE dept_name = ? AND building = ? AND budget = ?";

        try (PreparedStatement pstmt = conn.getConnection().prepareStatement(query)) {
            pstmt.setString(1, department);
            pstmt.setString(2, building);
            pstmt.setDouble(3, budget);
            
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
    
    // Display all department data to the table
    private void displayDepartments() {
        DatabaseConnection conn = new DatabaseConnection();
        DefaultTableModel model = (DefaultTableModel) table_departments.getModel();
        model.setRowCount(0);

        
        String query = "select dept_name, building, budget from department";
        
        try(Statement stmt = conn.getConnection().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                String dept_name = rs.getString("dept_name");
                String building = rs.getString("building");
                double budget = rs.getDouble("budget");
                
                model.addRow(new Object[] {dept_name, building, String.valueOf(budget)});
            }
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void clearTextFields() {
        txt_department.setText("");
        combo_building.setSelectedIndex(0);
        txt_budget.setText("");
        txt_search.setText("");
    }
    
    // Update department data
    private void updateDepartmentData(String department, String building, double budget) {
        DatabaseConnection conn = new DatabaseConnection();
        String query = "UPDATE department SET building = ?, budget = ? WHERE dept_name = ?";

        try (PreparedStatement pstmt = conn.getConnection().prepareStatement(query)) {
            pstmt.setString(1, building);
            pstmt.setDouble(2, budget);
            pstmt.setString(3, department);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Department data updated successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update department data.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error updating department data: " + ex.getMessage());
            ex.printStackTrace(); // Print stack trace for debugging
        }
    }

    
    // Check department duplicates.
    private boolean checkdepartment(String dept_name) {
        DatabaseConnection conn = new DatabaseConnection();

        String query = "select dept_name, building, budget " +
                        " from department where dept_name = '" + dept_name + "'";

        try(Statement stmt = conn.getConnection().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
             
            int count = 0;
            while(rs.next()) {
                count ++;
            }
            
            if (count > 0){
                // dept_name taken
                return true;
            }                       
        } catch(SQLException ex) {
            //
        }
        // dept_name is available
        return false;
    }
    
    // Add a new Department
    public void addDepartment(String dept_name,
                              String building,
                              double budget) {
        DatabaseConnection conn = new DatabaseConnection();
        
        String query = "INSERT INTO department (dept_name, building, budget) VALUES (?, ?, ?)";
        try(PreparedStatement pstmt = conn.getConnection().prepareStatement(query)) {
            pstmt.setString(1, dept_name);
            pstmt.setString(2, building);
            pstmt.setDouble(3, budget);
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Added new department successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add new department.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error adding department: " + ex.getMessage());
            ex.printStackTrace(); // Print stack trace for debugging
        }
    }
    
    // Populate the building combobox
    private void getBuildings() {
        DatabaseConnection conn = new DatabaseConnection();
        
        String query = "SELECT DISTINCT building FROM classroom";
        
        try(Statement stmt = conn.getConnection().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {  
                combo_building.addItem(rs.getString(1));
            }
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
