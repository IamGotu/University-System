
package universitysystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TakesForm extends javax.swing.JFrame {

    /**
     * Creates new form Takes
     */
    public TakesForm() {
        initComponents();
        
        displayTakes();
        displaySection();
        getStudentID();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_section = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txt_grade = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        combo_student = new javax.swing.JComboBox<>();
        btn_refresh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_takes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ENROLL STUDENTS");
        setBackground(new java.awt.Color(0, 0, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_section.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        table_section.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COURSE ID", "SECTION ID", "SEMESTER", "YEAR"
            }
        ));
        table_section.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_section.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_sectionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_section);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 24, 671, 199));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("ENROLL STUDENT"));

        txt_grade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

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

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("GRADE");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("STUDENT ID");

        combo_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_studentActionPerformed(evt);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_grade, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(combo_student, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 149, Short.MAX_VALUE)
                        .addComponent(btn_refresh)
                        .addGap(18, 18, 18)
                        .addComponent(btn_save)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_refresh, btn_save});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(combo_student, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save)
                    .addComponent(btn_refresh))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_refresh, btn_save});

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 116, -1, -1));
        jPanel1.getAccessibleContext().setAccessibleName("");

        table_takes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        table_takes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STUDENT ID", "GRADES"
            }
        ));
        table_takes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_takes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_takesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_takes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 241, 671, 199));

        jLabel1.setIcon(new javax.swing.ImageIcon("F:\\mark\\UniversitySystem\\src\\universitysystem\\pexels-pixabay-235985.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        displayTakes();
        clearTextFields(); // Clear text fields
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void table_sectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_sectionMouseClicked

    }//GEN-LAST:event_table_sectionMouseClicked

    private void btn_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveMouseClicked
        addTakes(combo_student.getSelectedItem().toString(),
                    txt_grade.getText());

        
        displayTakes();

        clearTextFields(); // Clear text fields
    }//GEN-LAST:event_btn_saveMouseClicked

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

    }//GEN-LAST:event_btn_saveActionPerformed

    private void table_takesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_takesMouseClicked

    }//GEN-LAST:event_table_takesMouseClicked

    private void combo_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_studentActionPerformed

    }//GEN-LAST:event_combo_studentActionPerformed

        private void displaySection() {
        DatabaseConnection conn = new DatabaseConnection();
        DefaultTableModel model = (DefaultTableModel) table_section.getModel();
        model.setRowCount(0);

        
        String query = "select course_id, sec_id, semester, year from section";
        
        try(Statement stmt = conn.getConnection().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                String course_id = rs.getString("course_id");
                String sec_id = rs.getString("sec_id");
                String semester = rs.getString("semester");
                double year = rs.getInt("year");
                
                model.addRow(new Object[] {course_id, sec_id, semester, String.valueOf(year)});
            }
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
        
        private void displayTakes() {
        DatabaseConnection conn = new DatabaseConnection();
        DefaultTableModel model = (DefaultTableModel) table_takes.getModel();
        model.setRowCount(0);

        
        String query = "select ID, grade from takes";
        
        try(Statement stmt = conn.getConnection().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                String ID = rs.getString("ID");
                String grades = rs.getString("grade");

                
                model.addRow(new Object[] {ID,grades});
            }
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
        
        
        private void getStudentID() {
        DatabaseConnection conn = new DatabaseConnection();
        
        String query = "SELECT DISTINCT ID FROM takes";
        
        try(Statement stmt = conn.getConnection().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {  
                combo_student.addItem(rs.getString(1));
            }
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
        
        public void addTakes(String ID, String grade) {
        DatabaseConnection conn = new DatabaseConnection();
        
        String query = "INSERT INTO takes (ID, grade)"
                + "     VALUES (?, ?)";
        try(PreparedStatement pstmt = conn.getConnection().prepareStatement(query)) {
            pstmt.setString(1, ID);
            pstmt.setString(2, grade);
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Added new section successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add new section.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error adding section: " + ex.getMessage());
            ex.printStackTrace(); // Print stack trace for debugging
        }
    }
        
        public void clearTextFields() {
        combo_student.setSelectedIndex(0);
        txt_grade.setText(""); 
    }
    
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
            java.util.logging.Logger.getLogger(TakesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakesForm().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox<String> combo_student;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_section;
    private javax.swing.JTable table_takes;
    private javax.swing.JTextField txt_grade;
    // End of variables declaration//GEN-END:variables
}
