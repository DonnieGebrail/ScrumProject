/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrumproject;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;


/**
 *
 * @author donniegebrail
 */
public class CreatePost extends javax.swing.JFrame {
    
      private static InfDB idb;
    /**
     * Creates new form CreatePost
     */
    public CreatePost() {
        initComponents();
    
    try{
        //Connects to database with an absolute path
            Path path = Paths.get("ScrumProject.FDB").toRealPath(LinkOption.NOFOLLOW_LINKS);
            idb = new InfDB(path.toString());
        }catch(InfException | IOException e){
            JOptionPane.showMessageDialog(null, e);
        }

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
        txtPost = new javax.swing.JTextArea();
        btnConfirm = new javax.swing.JButton();
        btnAddFile = new javax.swing.JButton();
        cbChooseCategory = new javax.swing.JComboBox<>();
        btnAddCategory = new javax.swing.JButton();
        txtAddCate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnReturnStartPage = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtheader = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPost.setColumns(20);
        txtPost.setRows(5);
        txtPost.setBorder(javax.swing.BorderFactory.createTitledBorder("Skapa ett inlägg\n"));
        jScrollPane1.setViewportView(txtPost);

        btnConfirm.setText("Bekräfta");

        btnAddFile.setText("Infoga fil");

        cbChooseCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj kategori" }));
        cbChooseCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbChooseCategoryMouseClicked(evt);
            }
        });

        btnAddCategory.setText("Lägg till");
        btnAddCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddCategoryMouseClicked(evt);
            }
        });

        jLabel1.setText("Lägg till en ny kategori:");

        btnReturnStartPage.setText("Tillbaka");
        btnReturnStartPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnStartPageActionPerformed(evt);
            }
        });

        jLabel2.setText("Skriv in rubrik:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(173, 173, 173))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReturnStartPage)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtheader, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)
                                .addComponent(txtAddCate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddCategory))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbChooseCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(btnAddFile)))
                        .addContainerGap(60, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtheader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddCate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddCategory))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddFile)
                    .addComponent(cbChooseCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConfirm)
                .addGap(18, 18, 18)
                .addComponent(btnReturnStartPage)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCategoryMouseClicked
        // TODO add your handling code here:
        Validation val = new Validation();
        String addCate = txtAddCate.getText();
    
        
        if(val.checkIfTxtIsEmpty(addCate) == false){
            try{
       //int id = 
              
        String sqlInsert = "Insert into Category (CategoryID, Category)\n"
                + "Values(" + idb.getAutoIncrement("Category","CategoryID") + ", '" + addCate + "')";
        idb.insert(sqlInsert);
        JOptionPane.showMessageDialog(null, "Du har lagt till en ny kategory!");
        }
            catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, "Fel i databasen");
        }
            
        }
        
    }//GEN-LAST:event_btnAddCategoryMouseClicked

    private void cbChooseCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbChooseCategoryMouseClicked
        Validation Val = new Validation();
        Val.getCategoryComboBox(cbChooseCategory);
    }//GEN-LAST:event_cbChooseCategoryMouseClicked

    private void btnReturnStartPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnStartPageActionPerformed
        StartPage startPage = new StartPage(); 
        this.setVisible(false); 
        startPage.setVisible(true);
    }//GEN-LAST:event_btnReturnStartPageActionPerformed

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
            java.util.logging.Logger.getLogger(CreatePost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreatePost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreatePost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreatePost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreatePost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCategory;
    private javax.swing.JButton btnAddFile;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnReturnStartPage;
    private javax.swing.JComboBox<String> cbChooseCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAddCate;
    private javax.swing.JTextArea txtPost;
    private javax.swing.JTextField txtheader;
    // End of variables declaration//GEN-END:variables
}
