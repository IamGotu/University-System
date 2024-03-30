package universitysystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CourseForm extends javax.swing.JFrame {

    /**
     * Creates new form CourseForm
     */
    public CourseForm() {
        initComponents();
        
        // Populate the Table and Combo box
        displayCourses();
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

        btn_search = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_courses = new javax.swing.JTable();
        btn_delete = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt_credits = new javax.swing.JTextField();
        txt_course_id = new javax.swing.JTextField();
        txt_title = new javax.swing.JTextField();
        combo_departments = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Course");

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

        txt_search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        table_courses.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        table_courses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COURSE ID", "TITLE", "DEPARTMENT", "CREDITS"
            }
        ));
        table_courses.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_courses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_coursesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_courses);

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

        btn_refresh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_refresh.setText("REFRESH");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("ADD NEW COURSE"));

        txt_credits.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_course_id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        combo_departments.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        combo_departments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_departmentsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("COURSE ID");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("TITLE");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("DEPARTMENT");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("CREDITS");

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

        btn_edit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_course_id)
                    .addComponent(txt_title, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addComponent(combo_departments, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_credits, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_course_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_title)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_departments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_credits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_save)
                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_refresh)
                                .addGap(32, 32, 32))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 914, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_refresh, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_delete, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_searchMouseClicked

    }//GEN-LAST:event_btn_searchMouseClicked

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        searchCourse(txt_search.getText());
    }//GEN-LAST:event_btn_searchActionPerformed

    private void table_coursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_coursesMouseClicked
        if(table_courses.getSelectedRow() > -1) {
            getCourseData();
        }
    }//GEN-LAST:event_table_coursesMouseClicked

    private void btn_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deleteMouseClicked
        DefaultTableModel model = (DefaultTableModel) table_courses.getModel();
        String course_id = model.getValueAt(table_courses.getSelectedRow(), 0).toString();
        deleteCourse(course_id);

        displayCourses();
    }//GEN-LAST:event_btn_deleteMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        displayCourses();
        clearTextFields(); // Clear text fields
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void combo_departmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_departmentsActionPerformed

    }//GEN-LAST:event_combo_departmentsActionPerformed

    private void btn_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveMouseClicked

        // check course_id duplicates before adding new Course
        if(checkCourseId(txt_course_id.getText())) {
            JOptionPane.showMessageDialog(null, "Course ID taken. Please use another ID.");
        } else {
            addCourse(txt_course_id.getText(),
                txt_title.getText(),
                combo_departments.getSelectedItem().toString(),
                Integer.parseInt(txt_credits.getText()));

            displayCourses();

            clearTextFields();
        }

    }//GEN-LAST:event_btn_saveMouseClicked

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseClicked

    }//GEN-LAST:event_btn_editMouseClicked

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        updateCourseData();
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
            java.util.logging.Logger.getLogger(CourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseForm().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_courses;
    private javax.swing.JTextField txt_course_id;
    private javax.swing.JTextField txt_credits;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_title;
    // End of variables declaration//GEN-END:variables
    
    // Search course using Search Text field and display to table
    private void searchCourse(String title) {
        DatabaseConnection conn = new DatabaseConnection();
        DefaultTableModel model = (DefaultTableModel) table_courses.getModel();

        model.setRowCount(0);
        String query = "select course_id, dept_name, credits " +
                        " from course where title = '" + title + "'";

        try(Statement stmt = conn.getConnection().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
             
            
            while(rs.next()) {
 
                String course_id = rs.getString("course_id");
                String dept_name = rs.getString("dept_name");
                int credits = rs.getInt("credits");
                
                model.addRow(new Object[] {course_id, title, dept_name, String.valueOf(credits)});
            }
            
           
        } catch(SQLException ex) {
        }
    }

    // Display Instructor Data from Table to Text fields and Combobox.
    private void getCourseData() {
        DefaultTableModel model = (DefaultTableModel) table_courses.getModel();
        
        String course_id = model.getValueAt(table_courses.getSelectedRow(), 0).toString();
        String title = model.getValueAt(table_courses.getSelectedRow(), 1).toString();
        String department = model.getValueAt(table_courses.getSelectedRow(), 2).toString();
        String credits = model.getValueAt(table_courses.getSelectedRow(), 3).toString();

        txt_course_id.setText(course_id);
        txt_title.setText(title);
        txt_credits.setText(credits);        
        
        // for the department combo box.
        for(int item = 0; item < combo_departments.getItemCount(); item++) {
            if(combo_departments.getItemAt(item).equals(department)) {
                combo_departments.setSelectedIndex(item); // 0
            }
        }   
        // end
        
    }
    
    // Delete course
    private void deleteCourse(String course_id) {
        DatabaseConnection conn = new DatabaseConnection();
        String query = "DELETE FROM course WHERE course_id = ?";
        
        try(PreparedStatement pstmt = conn.getConnection().prepareStatement(query)) {
            pstmt.setString(1, course_id);
            if(pstmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Successfully deleted a record.");
            }
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    // Display all course data to the table
    private void displayCourses() {
        DatabaseConnection conn = new DatabaseConnection();
        DefaultTableModel model = (DefaultTableModel) table_courses.getModel();
        model.setRowCount(0);

        
        String query = "select course_id, title, dept_name, credits from course";
        
        try(Statement stmt = conn.getConnection().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                String course_id = rs.getString("course_id");
                String title = rs.getString("title");
                String dept_name = rs.getString("dept_name");
                int credits = rs.getInt("credits");
                
                model.addRow(new Object[] {course_id, title, dept_name, String.valueOf(credits)});
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

    public void clearTextFields() {
        txt_course_id.setText("");
        txt_title.setText("");
        txt_credits.setText("");
        combo_departments.setSelectedIndex(0);
        txt_search.setText("");
        
    }
    
    // Check course_id duplicates.
    private boolean checkCourseId(String course_id) {
        DatabaseConnection conn = new DatabaseConnection();

        String query = "select course_id, dept_name, credits " +
                        " from course where course_id = '" + course_id + "'";

        try(Statement stmt = conn.getConnection().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
             
            int count = 0;
            while(rs.next()) {
                count ++;
            }
            
            if (count > 0){
                // course_id taken
                return true;
            }                       
        } catch(SQLException ex) {
            //
        }
        // course_id is available
        return false;
    }
    
    // Add a new Course
    public void addCourse(String course_id,
                          String title,
                          String dept_name,
                          int credits) {
        DatabaseConnection conn = new DatabaseConnection();
        
        String query = "INSERT INTO course (course_id, title, dept_name, credits) VALUES (?, ?, ?, ?)";
        try(PreparedStatement pstmt = conn.getConnection().prepareStatement(query)) {
            pstmt.setString(1, course_id);
            pstmt.setString(2, title);
            pstmt.setString(3, dept_name);
            pstmt.setInt(4, credits);
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Added new course successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add new course.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error adding course: " + ex.getMessage());
            ex.printStackTrace(); // Print stack trace for debugging
        }
    }
    
    // Update course data
    private void updateCourseData() {
        DefaultTableModel model = (DefaultTableModel) table_courses.getModel();
        int selectedRowIndex = table_courses.getSelectedRow();

        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row to edit.");
            return;
        }

        String course_id = model.getValueAt(selectedRowIndex, 0).toString();
        String title = txt_title.getText();
        String department = combo_departments.getSelectedItem().toString();
        int credits = Integer.parseInt(txt_credits.getText());

        DatabaseConnection conn = new DatabaseConnection();
        String query = "UPDATE course SET title = ?, dept_name = ?, credits = ? WHERE course_id = ?";

        try (PreparedStatement pstmt = conn.getConnection().prepareStatement(query)) {
            pstmt.setString(1, title);
            pstmt.setString(2, department);
            pstmt.setInt(3, credits);
            pstmt.setString(4, course_id);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Course data updated successfully.");
                displayCourses(); // Refresh table after update
                clearTextFields();    // Clear text fields after update
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update course data.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error updating course data: " + ex.getMessage());
            ex.printStackTrace(); // Print stack trace for debugging
        }
    }
}
