package uas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Tabel_Pemesanan extends javax.swing.JFrame {

  
    public Tabel_Pemesanan() {
        initComponents();                               //MEMANGGIL METHOD INITCOMPONENTS
        this.setLocationRelativeTo(null);               //OUTPUT AUTOMATIS BERADA DI TENGAH
        tabel();                                        //MEMANGGIL METHOD TABEL
        
      }
        private void tabel(){               
       DefaultTableModel tbl=new DefaultTableModel();   //MENDEKLARASIKAN TABEL
       tbl.addColumn("Nomor");                          //PADA TABEL KOLOM 1 BERISI NOMOR
       tbl.addColumn("Nama");                           //PADA TABEL KOLOM 2 BERISI NAMA
       tbl.addColumn("Rute");                           //PADA TABEL KOLOM 2 BERISI RUTE
       tbl.addColumn("Maskapai");                       //PADA TABEL KOLOM 4 BERISI MASKAPAI
       tbl.addColumn("Jenis");                          //PADA TABEL KOLOM 5 BERISI JENIS
       tbl.addColumn("Total Tiket");                    //PADA TABEL KOLOM 6 BERISI TOTAL TIKET
       tbl.addColumn("Total Harga");                    //PADA TABEL KOLOM 7 BERISI HARGA
       jTable1.setModel(tbl);                           //PADA JTABLE DIMASUKKAN NILAI TB1
       try{
       Statement statement = (Statement) Database.configDB().createStatement();     //MEMBUAT STATEMENT DATABASE
       ResultSet res = statement.executeQuery("SELECT * from data_penumpang");      //MENGEKSEKUSI STATEMENT DIAMBIL DARI DATABASE DATA_PENUMPANG
       while(res.next())                                                            
       {
           tbl.addRow(new Object[]{                                                 //MENGATUR PADA DATA BARIS DENGAN NEW OBJECT
           res.getString(1),                                                        //MENGAMBIL NILAI DARI DATABASE KOLOM 1 
           res.getString(2),                                                        //MENGAMBIL NILAI DARI DATABASE KOLOM 2 
           res.getString(3),                                                        //MENGAMBIL NILAI DARI DATABASE KOLOM 3 
           res.getString(4),                                                        //MENGAMBIL NILAI DARI DATABASE KOLOM 4 
           res.getString(5),                                                        //MENGAMBIL NILAI DARI DATABASE KOLOM 5 
           res.getString(6),                                                        //MENGAMBIL NILAI DARI DATABASE KOLOM 6 
           res.getString(7),                                                        //MENGAMBIL NILAI DARI DATABASE KOLOM 7 
       });
           jTable1.setModel(tbl);                                                   //MENAMPILKAN NILAI YANG SUDAH DIAMBIL PADA DATABASE KE DALAM TABEL
       }
       }catch(SQLException e){
           JOptionPane.showMessageDialog(rootPane, e);
       }
        }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nomor", "Nama", "Rute", "Maskapai", "Jenis", "Total tiket", "Total Harga"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setText("Data Pemesanan Tiket");

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(319, 319, 319))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelMouseClicked
    
            tabel();
    }//GEN-LAST:event_jTabelMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //BUTTON KEMBALI ACTION
        Pemesanan back = new Pemesanan();                                           //MENDEKLARASIKAN KELAS PEMESANAN UNTUK DIPANGGIL                               
        back.setVisible(true);                                                      //MENAMPILKAN TAMPILAN PEMESANAN MENU
        dispose();                                                                  //TAMPILAN TABEL TERTUTUP
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Tabel_Pemesanan().setVisible(true);
             
            }
            });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

