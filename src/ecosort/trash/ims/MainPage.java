/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ecosort.trash.ims;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author User
 */
public class MainPage extends javax.swing.JFrame {

        
    /**
     * Creates new form MainPage
     */
    public MainPage() {
        initComponents();
    }

        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txttrash = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcompany = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        r1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        badd = new javax.swing.JButton();
        bupdate = new javax.swing.JButton();
        bdelete = new javax.swing.JButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Recyclables = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        abouts = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recycable Items");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("EcoSort: Trash Inventory Management System");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trash", "Company", "Date", "Category"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Trash:");

        jLabel3.setText("Company:");

        jLabel4.setText("Date:");

        buttonGroup1.add(r1);
        r1.setText("Recycable");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Category:");

        badd.setText("ADD");
        badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddActionPerformed(evt);
            }
        });

        bupdate.setText("UPDATE");
        bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bupdateActionPerformed(evt);
            }
        });

        bdelete.setText("DELETE");
        bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeleteActionPerformed(evt);
            }
        });

        buttonGroup1.add(r2);
        r2.setText("Composable");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r3);
        r3.setText("Disposable");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        Recyclables.setText("Recycables");
        Recyclables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RecyclablesMouseClicked(evt);
            }
        });
        Recyclables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecyclablesActionPerformed(evt);
            }
        });
        jMenu1.add(Recyclables);

        jMenuItem2.setText("Disposables");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Composables");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        abouts.setText("About");
        abouts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutsActionPerformed(evt);
            }
        });
        jMenu1.add(abouts);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(badd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bupdate)
                        .addGap(34, 34, 34)
                        .addComponent(bdelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txttrash)
                                .addComponent(txtcompany)
                                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txttrash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(r1)
                            .addComponent(jLabel5)
                            .addComponent(r3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(badd)
                            .addComponent(bupdate)
                            .addComponent(bdelete)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void bdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdeleteActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        
        if(jTable1.getSelectedRowCount()==1){
            
            tblModel.removeRow(jTable1.getSelectedRow());
        } else {
            if(jTable1.getRowCount()== 0){
                
                JOptionPane.showMessageDialog(this, "Table is empty");
            }else{
                JOptionPane.showMessageDialog(this, "Please Select Single Row");
            }
        }
    }//GEN-LAST:event_bdeleteActionPerformed

    private void baddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddActionPerformed
        // TODO add your handling code here:
        
       // Check if any of the text fields are empty
                if (txttrash.getText().equals("") || txtcompany.getText().equals("") || txtdate.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter All Data");
            } else if (!r1.isSelected() && !r2.isSelected() && !r3.isSelected()) {
                // Check if none of the radio buttons are selected
                JOptionPane.showMessageDialog(null, "Please select one of the categories");
            } else {
            // Determine which radio button is selected
            String selectedCategory = "";
            if (r1.isSelected()) {
                selectedCategory = r1.getText();
            } else if (r2.isSelected()) {
                selectedCategory = r2.getText();
            } else if (r3.isSelected()) {
                selectedCategory = r3.getText();
            }

            // Prepare data for the table
            String data[] = {txttrash.getText(), txtcompany.getText(), txtdate.getText(), selectedCategory};

            // Add data to the table
            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
            tblModel.addRow(data);
            
            if (selectedCategory.equalsIgnoreCase("recyclable")) {
            DefaultTableModel rectableModel = (DefaultTableModel) jTable1.getModel();
            rectableModel.addRow(data);
            } else if (selectedCategory.equalsIgnoreCase("disposable")) {
            DefaultTableModel distableModel = (DefaultTableModel) jTable1.getModel();
            distableModel.addRow(data);
            } else if (selectedCategory.equalsIgnoreCase("composable")) {
            DefaultTableModel comtableModel = (DefaultTableModel) jTable1.getModel();
            comtableModel.addRow(data);
        }       

            // Show success message
            JOptionPane.showMessageDialog(this, "Data Added Successfully");

            // Clear input fields
            txttrash.setText("");
            txtcompany.setText("");
            txtdate.setText("");
            r1.setSelected(false); // Deselect radio buttons
            r2.setSelected(false);
            r3.setSelected(false);
}
    }//GEN-LAST:event_baddActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        
        String tbltrash = tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String tblcompany = tblModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tbldate = tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String rcategory = tblModel.getValueAt(jTable1.getSelectedRow(), 3).toString();
        
        txttrash.setText(tbltrash);
        txtcompany.setText(tblcompany);
        txtdate.setText(tbldate);
        
        r1.setSelected(false);
        r2.setSelected(false);
        r3.setSelected(false);
        
        if (rcategory.equals(r1.getText())) {
        r1.setSelected(true);
        } else if (rcategory.equals(r2.getText())) {
            r2.setSelected(true);
        } else if (rcategory.equals(r3.getText())) {
            r3.setSelected(true);
        }

  
    }//GEN-LAST:event_jTable1MouseClicked

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r3ActionPerformed

    private void bupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupdateActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
    
    // Check if exactly one row is selected
    if (jTable1.getSelectedRowCount() == 1) {
        
        // Retrieve text from input fields
        String trash = txttrash.getText();
        String company = txtcompany.getText();
        String date = txtdate.getText();
        
        // Determine which radio button is selected
        String selectedCategory = "";
        if (r1.isSelected()) {
            selectedCategory = r1.getText();
        } else if (r2.isSelected()) {
            selectedCategory = r2.getText();
        } else if (r3.isSelected()) {
            selectedCategory = r3.getText();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a category");
            return; // Exit the method if no radio button is selected
        }
        
        // Update the table with new values
        int selectedRow = jTable1.getSelectedRow();
        tblModel.setValueAt(trash, selectedRow, 0);
        tblModel.setValueAt(company, selectedRow, 1);
        tblModel.setValueAt(date, selectedRow, 2);
        tblModel.setValueAt(selectedCategory, selectedRow, 3); // Update the category
        
        // Show success message
        JOptionPane.showMessageDialog(this, "Update Successful");
        
    } else {
        // Handle cases where no rows or multiple rows are selected
        if (jTable1.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Table is empty");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a single row to update");
        }
    }
    }//GEN-LAST:event_bupdateActionPerformed

    private void RecyclablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecyclablesActionPerformed
        // TODO add your handling code here:
        
        new RecycableItems().setVisible(true);
    }//GEN-LAST:event_RecyclablesActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new DisposableItems().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        new ComposableItems().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void RecyclablesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecyclablesMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_RecyclablesMouseClicked

    private void aboutsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutsActionPerformed
        // TODO add your handling code here:
        new Abouts().setVisible(true);
    }//GEN-LAST:event_aboutsActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Recyclables;
    private javax.swing.JMenuItem abouts;
    private javax.swing.JButton badd;
    private javax.swing.JButton bdelete;
    private javax.swing.JButton bupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JTextField txtcompany;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txttrash;
    // End of variables declaration//GEN-END:variables
}
