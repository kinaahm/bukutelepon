/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukutelepon;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sakinah
 */
public class NewJFrame extends javax.swing.JFrame {
    DefaultTableModel tabMode;
    public NewJFrame() {
        initComponents();
        //koneksi();
        Object[] row= {"Kode","Nama", "Telepon","E-Mail","Alamat","Status"};
        tabMode = new DefaultTableModel(null,row);
        jTable1.setModel(tabMode);
        jScrollPane2.getViewport().add(jTable1,null);
        tampilkandata();
    }
    
     public void tampilkandata() {
        try{
          java.sql.Connection conn =(java.sql.Connection)koneksi.koneksiDB();
            String sql="Select * from daftar ORDER BY Kode Asc";
            java.sql.Statement stat=conn.createStatement();
            ResultSet set=stat.executeQuery(sql);
            while (set.next()){
                String[] data={set.getString("Kode"),set.getString("Nama"),set.getString("NoTelepon"),set.getString("E_mail"),set.getString("Alamat"),set.getString("Status")};
                tabMode.addRow(data);
            }
        }
        catch(Exception e){
        }
    }
    
     public void hapustabel(){
        int row=tabMode.getRowCount();
        for(int i=0;i<row;i++){
            tabMode.removeRow(0);
        }
    }
     
     public void hapustex(){
       txtkode.setText("");
       txtnama.setText("");
       txttelp.setText("");
       txtemail.setText("");
       txtalamat.setText("");
       cmbstat.setSelectedItem("-");
     }
  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    txtnama = new javax.swing.JTextField();
    txttelp = new javax.swing.JTextField();
    txtemail = new javax.swing.JTextField();
    txtalamat = new javax.swing.JTextField();
    jScrollPane2 = new javax.swing.JScrollPane();
    tabelkontak = new javax.swing.JTable();
    jButton2 = new javax.swing.JButton();
    jLabel6 = new javax.swing.JLabel();
    cmbstat = new javax.swing.JComboBox();
    jButton3 = new javax.swing.JButton();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    txtkode = new javax.swing.JTextField();
    jButton4 = new javax.swing.JButton();

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jTable1MouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(jTable1);

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setText("PERSONAL PHONE BOOK");

    jLabel2.setText("Nama");

    jLabel3.setText("No Telepon");

    jLabel4.setText("E-mail");

    jLabel5.setText("Alamat");

    jButton1.setText("Save");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    txtalamat.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtalamatActionPerformed(evt);
      }
    });

    tabelkontak.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    tabelkontak.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tabelkontakMouseClicked(evt);
      }
    });
    jScrollPane2.setViewportView(tabelkontak);

    jButton2.setText("Delete");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    jLabel6.setText("Status");

    cmbstat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Teman", "Keluarga", "Mentor", "" }));

    jButton3.setText("Edit");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton3ActionPerformed(evt);
      }
    });

    jLabel7.setText("Daftar");

    jLabel8.setText("Kode");

    txtkode.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtkodeActionPerformed(evt);
      }
    });

    jButton4.setText("Baru");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton4ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(14, 14, 14)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel8)
          .addComponent(jLabel6)
          .addComponent(jLabel5)
          .addComponent(jLabel4)
          .addComponent(jLabel3)
          .addComponent(jLabel2))
        .addGap(44, 44, 44)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(cmbstat, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txttelp, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jButton2)
                  .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(122, 122, 122))))
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(213, 213, 213)
            .addComponent(jLabel1))
          .addGroup(layout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel7)))
        .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(49, 49, 49)
            .addComponent(jLabel8))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(txttelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel4)))
              .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(11, 11, 11)
                .addComponent(jButton2)
                .addGap(11, 11, 11)
                .addComponent(jButton3)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel5))))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(cmbstat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel6))
        .addGap(18, 18, 18)
        .addComponent(jLabel7)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(72, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    // TODO add your handling code here:
    hapustabel();
    try {
        String sql = "DELETE FROM daftar WHERE Kode = '"+txtkode.getText()+"'";
        java.sql.Connection conn = (java.sql.Connection) koneksi.koneksiDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "berhasil dihapus");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    tampilkandata();
  }//GEN-LAST:event_jButton2ActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
    hapustabel();
    try {
        String sql = "insert into daftar values('"+txtkode.getText()+"','"+txtnama.getText()+"','"+txttelp.getText()+"','"+txtemail.getText()+"','"+txtalamat.getText()+"','"+cmbstat.getSelectedItem()+"')";
        java.sql.Connection conn = (java.sql.Connection) koneksi.koneksiDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "berhasil disimpan");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    tampilkandata();
  }//GEN-LAST:event_jButton1ActionPerformed

  private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    // TODO add your handling code here:
    hapustabel();
    try {
        String sql = "update daftar set Nama='"+txtnama.getText()+"',NoTelepon='"+txttelp.getText()+"',E_mail='"+txtemail.getText()+"',Alamat='"+txtalamat.getText()+"',Status='"+cmbstat.getSelectedItem()+"' where Kode='"+txtkode.getText()+"'";
        java.sql.Connection conn = (java.sql.Connection) koneksi.koneksiDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "berhasil diubah");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    tampilkandata();
  }//GEN-LAST:event_jButton3ActionPerformed

  private void tabelkontakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelkontakMouseClicked
    // TODO add your handling code here:
    
  }//GEN-LAST:event_tabelkontakMouseClicked

  private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    // TODO add your handling code here:
    try {
            int row =jTable1.getSelectedRow();
            String tabel_klik=(jTable1.getModel().getValueAt(row, 0).toString());
            java.sql.Connection conn =(java.sql.Connection)koneksi.koneksiDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from daftar where Kode='"+tabel_klik+"'");
            if(sql.next()){
                String add1 = sql.getString("Kode");
                txtkode.setText(add1);
                String add2 = sql.getString("Nama");
                txtnama.setText(add2);
                String add3 = sql.getString("NoTelepon");
                txttelp.setText(add3);
                String add4 = sql.getString("E_mail");
                txtemail.setText(add4);
                String add5 = sql.getString("alamat");
                txtalamat.setText(add5);
                String add6 = sql.getString("Status");
                cmbstat.setSelectedItem(add6);
            }
        } catch (Exception e) {
        }
  }//GEN-LAST:event_jTable1MouseClicked

  private void txtalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalamatActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtalamatActionPerformed

  private void txtkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodeActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtkodeActionPerformed

  private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    // TODO add your handling code here:
    hapustex();
  }//GEN-LAST:event_jButton4ActionPerformed

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
      java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
        //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new NewJFrame().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox cmbstat;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JTable jTable1;
  private javax.swing.JTable tabelkontak;
  private javax.swing.JTextField txtalamat;
  private javax.swing.JTextField txtemail;
  private javax.swing.JTextField txtkode;
  private javax.swing.JTextField txtnama;
  private javax.swing.JTextField txttelp;
  // End of variables declaration//GEN-END:variables
}
