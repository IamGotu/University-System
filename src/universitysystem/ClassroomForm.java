package universitysystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClassroomForm extends javax.swing.JFrame {

    /**
     * Creates new form Classroom
     */
    public ClassroomForm() {
        initComponents();
        
        // Populate the Table
        displayClassrooms();
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
        table_classrooms = new javax.swing.JTable();
        btn_delete = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt_capacity = new javax.swing.JTextField();
        txt_building = new javax.swing.JTextField();
        txt_roomNum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Classroom");

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

        table_classrooms.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        table_classrooms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BUILDING", "ROOM NUMBER", "CAPACITY"
            }
        ));
        table_classrooms.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_classrooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_classroomsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_classrooms);

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("ADD NEW CLASSROOMS"));

        txt_capacity.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_building.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_roomNum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("BUILDING");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("ROOM NUMBER");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("CAPACITY");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_save))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel1)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_building)
                            .addComponent(txt_roomNum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(txt_capacity, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_building, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_roomNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_capacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_save)
                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_refresh))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_refresh)
                    .addComponent(btn_delete))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_searchMouseClicked

    }//GEN-LAST:event_btn_searchMouseClicked

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        searchClassroom(txt_search.getText());
    }//GEN-LAST:event_btn_searchActionPerformed

    private void table_classroomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_classroomsMouseClicked
        if(table_classrooms.getSelectedRow() > -1) {
            getClassroomData();
        }
    }//GEN-LAST:event_table_classroomsMouseClicked

    private void btn_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deleteMouseClicked
        DefaultTableModel model = (DefaultTableModel) table_classrooms.getModel();
        int selectedRow = table_classrooms.getSelectedRow();

        if (selectedRow != -1) { // Check if a row is selected
            String room_number = model.getValueAt(selectedRow, 0).toString();
            deleteClassroom(room_number);
            displayClassrooms();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete.");
        }
    }//GEN-LAST:event_btn_deleteMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        displayClassrooms();
        clearTextFields(); // Clear text fields
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveMouseClicked
        
        // check room number duplicates before adding new Classroom
        if(checkRoomNum(txt_roomNum.getText())) {
            JOptionPane.showMessageDialog(null, "Room number is occuppied. Please input another room number.");
        } else {
            addClassroom(txt_building.getText(), 
                         txt_roomNum.getText(),                            
                         Integer.parseInt(txt_capacity.getText()));
      
            displayClassrooms();

            clearTextFields(); // Clear text fields
        }
    }//GEN-LAST:event_btn_saveMouseClicked

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseClicked

    }//GEN-LAST:event_btn_editMouseClicked

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        updateClassroomData();
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
            java.util.logging.Logger.getLogger(ClassroomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassroomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassroomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassroomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassroomForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_classrooms;
    private javax.swing.JTextField txt_building;
    private javax.swing.JTextField txt_capacity;
    private javax.swing.JTextField txt_roomNum;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables

    // Search classroom using Search Text field and display. to table
    private void searchClassroom(String building) {
        DatabaseConnection conn = new DatabaseConnection();
        DefaultTableModel model = (DefaultTableModel) table_classrooms.getModel();

        model.setRowCount(0);
        String query = "select room_number, capacity " +
                        " from classroom where building = '" + building + "'";

        try(Statement stmt = conn.getConnection().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
             
            
            while(rs.next()) {
              
                String room_number = rs.getString("room_number");
                int capacity = rs.getInt("capacity");
                
                model.addRow(new Object[] {building,room_number, String.valueOf(capacity)});
            }
            
           
        } catch(SQLException ex) {
        }
    }
    
    // Display Classroom Data from Table to Text fields.
    private void getClassroomData() {
        DefaultTableModel model = (DefaultTableModel) table_classrooms.getModel();
        
        String building = model.getValueAt(table_classrooms.getSelectedRow(), 0).toString();
        String room_number = model.getValueAt(table_classrooms.getSelectedRow(), 1).toString();
        String capacity = model.getValueAt(table_classrooms .getSelectedRow(), 2).toString();
        
        txt_building.setText(building);
        txt_roomNum.setText(room_number);        
        txt_capacity.setText(capacity);     
    }

    private void deleteClassroom(String room_number) {
        DatabaseConnection conn = new DatabaseConnection();
        String query = "DELETE FROM classroom WHERE room_number = ?";

        try (PreparedStatement pstmt = conn.getConnection().prepareStatement(query)) {
            pstmt.setString(1, room_number);
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 1) {
                JOptionPane.showMessageDialog(null, "Successfully deleted a record.");
            } else {
                JOptionPane.showMessageDialog(null, "No record found for deletion.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); // Print the exception stack trace for debugging
        }
    }
    
    // Display all classrooms data to the table
    private void displayClassrooms() {
        DatabaseConnection conn = new DatabaseConnection();
        DefaultTableModel model = (DefaultTableModel) table_classrooms.getModel();
        model.setRowCount(0);

        
        String query = "select building, room_number, capacity from classroom";
        
        try(Statement stmt = conn.getConnection().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                String building = rs.getString("building");
                String room_number = rs.getString("room_number");
                int capacity = rs.getInt("capacity");
                
                model.addRow(new Object[] {building, room_number, String.valueOf(capacity)});
            }
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void clearTextFields() {
        txt_building.setText("");
        txt_roomNum.setText("");
        txt_capacity.setText("");
        txt_search.setText("");
    }

    private void updateClassroomData() {
        DefaultTableModel model = (DefaultTableModel) table_classrooms.getModel();
    int selectedRowIndex = table_classrooms.getSelectedRow();

    if (selectedRowIndex == -1) {
        JOptionPane.showMessageDialog(null, "Please select a row to edit.");
        return;
    }

    String building = model.getValueAt(selectedRowIndex, 0).toString();
    String room_number = txt_roomNum.getText();
    int capacity = Integer.parseInt(txt_capacity.getText());

    DatabaseConnection conn = new DatabaseConnection();
    String query = "UPDATE classroom SET room_number = ?, capacity = ? WHERE building = ?";

    try (PreparedStatement pstmt = conn.getConnection().prepareStatement(query)) {
        pstmt.setString(1, room_number);
        pstmt.setDouble(2, capacity);
        pstmt.setString(3, building);

        int rowsAffected = pstmt.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Classroom data updated successfully.");
            displayClassrooms(); // Refresh table after update
            clearTextFields();    // Clear text fields after update
        } else {
            JOptionPane.showMessageDialog(null, "Failed to update classroom data.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error updating classroom data: " + ex.getMessage());
        ex.printStackTrace(); // Print stack trace for debugging
    }
    }
    
    // Add a new Classroom
    public void addClassroom(String building, String room_number, int capacity) {
        DatabaseConnection conn = new DatabaseConnection();
        
        String query = "INSERT INTO classroom (building, room_number, capacity) VALUES (?, ?, ?)";
        try(PreparedStatement pstmt = conn.getConnection().prepareStatement(query)) {
            pstmt.setString(1, building);
            pstmt.setString(2, room_number);
            pstmt.setInt(3, capacity);
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Added new classroom successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add new classroom.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error adding classroom: " + ex.getMessage());
            ex.printStackTrace(); // Print stack trace for debugging
        }
    }
    
    // Check room number duplicates.
    public boolean checkRoomNum(String room_number) {
        DatabaseConnection conn = new DatabaseConnection();

        String query = "select building, budget " +
                        " from classroom where room_number = '" + room_number + "'";

        try(Statement stmt = conn.getConnection().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
             
            int count = 0;
            while(rs.next()) {
                count ++;
            }
            
            if (count > 0){
                // room number occuppied
                return true;
            }                       
        } catch(SQLException ex) {
            //
        }
        // room number is available
        return false;
    }
}
