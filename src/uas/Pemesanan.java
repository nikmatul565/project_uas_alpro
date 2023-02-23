package uas;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;

public class Pemesanan extends javax.swing.JFrame {
      
int lionAir, Sriwijaya, Garuda,maskapai,  harga,hargavip, hargaekonomi, beli, total, bayar, kembali;

double vip, ekonomi;

private void save_data(){                                                       //MEMBUAT METHOD SAVE DATA UNTUK DIPANGGIL
    try {
    String url = "INSERT INTO data_penumpang VALUES ("                          //MEMASUKKAN NILAI NILAI KE DALAM DATABASE TABEL DATA_PENUMPANG 
            + " '"+txtNomor.getText()+"',"                                      //MENGAMBIL DATA TEXTNOMOR UNTUK DIMASUKKAN KE DALAM KOLOM 1 PADA DATABASE
            + " '"+txtNama.getText()+"',"                                       //MENGAMBIL DATA NAMA UNTUK DIMASUKKAN KE DALAM KOLOM 2 PADA DATABASE
            + " '"+cbRute.getSelectedItem()+"',"                                //MENGAMBIL DATA RUTE UNTUK DIMASUKKAN KE DALAM KOLOM 3 PADA DATABASE
            + " '"+cbMaskapai.getSelectedItem()+"',"                            //MENGAMBIL DATA MASKAPAI UNTUK DIMASUKKAN KE DALAM KOLOM 4 PADA DATABASE
            + " '"+cbJenis.getSelectedItem()+"',"                               //MENGAMBIL DATA JENIS UNTUK DIMASUKKAN KE DALAM KOLOM 5 PADA DATABASE
            + " '"+txtJumlah.getText()+"',"                                     //MENGAMBIL DATA TEXTJUMLAH UNTUK DIMASUKKAN KE DALAM KOLOM 6 PADA DATABASE
            + " '"+txtTotal.getText()+"')";                                     //MENGAMBIL DATA TEXTTOTAL UNTUK DIMASUKKAN KE DALAM KOLOM 7 PADA DATABASE
    
    java.sql.Connection conn = (Connection)Database.configDB();                 //MENGKONEKSIKAN KE DATABASE
    java.sql.PreparedStatement stm = conn.prepareStatement(url);                //MEMBUAT STATEMENT DATABASE
    stm.execute();                                                              //MENGEKSEKUSI STATEMENT
    
    JOptionPane.showMessageDialog(null, "Data berhasil disimpan");              //MENAMPILKAN JOPTION DENGAN TAMPILAN "DATA BERHASIL DISIMPAN"
    }
    catch(SQLException e){
        JOptionPane.showMessageDialog
        (this, "Silahkan Isi Nomor Kursi Lain", 
               "Nomor Kursi Telah Terisi", JOptionPane.ERROR_MESSAGE);          //JIKA PRIMARY(NOMOR KURSI) PADA DATABASE TELAH TERISI
        System.out.println("error on" + e.getMessage());                        //JIKA TERJADI ERROR PADA TRY MAKA ERROR AKAN DITAMPILKAN PADA KONSOL
    }
}
private void reset_form(){                                                      //MEMNUAT METHOD RESET UNTUK DIPANGGIL
        cbMaskapai.setSelectedItem("Pilih");                                    //FUNGSI MENGKOSONGKAN FORM
        txtHarga.setText("");
        cbRute.setSelectedItem("Pilih");
        txtNomor.setText("");
        txtNama.setText("");
        txtTotal.setText("");
        txtJumlah.setText("");
        txtBayar.setText("");
        txtKembali.setText("");
        txtCetak.setText("");
}

    public Pemesanan() { 
        initComponents();                                                       //MEMANGGIL METHOD INITCOMPONENT
        this.setLocationRelativeTo(null);                                       //TAMPILAN OUTPUT AUTOMATIS BERADA DI TENGAH LAYAR
           txtKembali.setEditable(false);                                       //TEXTFIELD KEMBALI TIDAK DAPAT DI EDIT
           txtTotal.setEditable(false);                                         //TEXTFIELD TOTAL TIDAK DAPAT DI EDIT
           txtHarga.setEditable(false);                                         //TEXTFIELD HARGA TIDAK DAPAT DI EDIT
           
          
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbMaskapai = new javax.swing.JComboBox<>();
        cbJenis = new javax.swing.JComboBox<>();
        txtHarga = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbRute = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNomor = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtBayar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtKembali = new javax.swing.JTextField();
        BG = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCetak = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        btReset = new javax.swing.JButton();
        btCetak = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PENJUALAN TIKET PESAWAT");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(290, 0, 300, 40);

        jPanel1.setBackground(new java.awt.Color(50, 66, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesan Tiket Pesawat", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 18), new java.awt.Color(153, 204, 255)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Maskapai");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 86, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jenis");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 86, 31));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Harga");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 86, 31));

        cbMaskapai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Lion Air", "Garuda Indonesia", "Sriwijaya" }));
        cbMaskapai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaskapaiActionPerformed(evt);
            }
        });
        jPanel1.add(cbMaskapai, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 126, -1));

        cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VIP", "Ekonomi" }));
        cbJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJenisActionPerformed(evt);
            }
        });
        jPanel1.add(cbJenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, 30));

        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });
        jPanel1.add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 126, 31));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Rute");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 41, 86, -1));

        cbRute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Surabaya-Jakarta", "Surabaya-Bali", "Palembang-Surabaya", "Jakarta-Surabaya", "Samarinda-Surabaya", "Manukwari-Makassar", "Makassar-Surabaya", "Bali-Jakarta", " ", " ", " " }));
        cbRute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRuteActionPerformed(evt);
            }
        });
        jPanel1.add(cbRute, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 126, -1));

        jPanel2.add(jPanel1);
        jPanel1.setBounds(30, 50, 270, 260);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nomor Kursi");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(330, 78, 140, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nama Penumpang");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(330, 117, 150, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Jumlah Tiket");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(330, 156, 140, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Bayar");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(330, 195, 140, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Uang Bayar");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(330, 241, 140, 30);

        txtNomor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomorActionPerformed(evt);
            }
        });
        jPanel2.add(txtNomor);
        txtNomor.setBounds(485, 78, 260, 30);

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        jPanel2.add(txtNama);
        txtNama.setBounds(485, 117, 260, 30);

        txtJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahActionPerformed(evt);
            }
        });
        txtJumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJumlahKeyReleased(evt);
            }
        });
        jPanel2.add(txtJumlah);
        txtJumlah.setBounds(485, 156, 260, 30);

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        txtTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTotalKeyReleased(evt);
            }
        });
        jPanel2.add(txtTotal);
        txtTotal.setBounds(485, 195, 260, 30);

        txtBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBayarActionPerformed(evt);
            }
        });
        txtBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBayarKeyReleased(evt);
            }
        });
        jPanel2.add(txtBayar);
        txtBayar.setBounds(485, 241, 260, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Uang Kembali");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(330, 290, 140, 20);

        txtKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKembaliActionPerformed(evt);
            }
        });
        txtKembali.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKembaliKeyReleased(evt);
            }
        });
        jPanel2.add(txtKembali);
        txtKembali.setBounds(485, 280, 260, 30);
        jPanel2.add(BG);
        BG.setBounds(580, 20, 0, 0);

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCetak.setEditable(false);
        txtCetak.setBackground(new java.awt.Color(197, 241, 250));
        txtCetak.setColumns(20);
        txtCetak.setRows(5);
        jScrollPane1.setViewportView(txtCetak);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 630, 170));

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Data Pemesanan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, 170, -1));

        btReset.setBackground(new java.awt.Color(0, 102, 153));
        btReset.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btReset.setForeground(new java.awt.Color(255, 255, 255));
        btReset.setText("Input lagi");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });
        jPanel4.add(btReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 170, 30));

        btCetak.setBackground(new java.awt.Color(0, 102, 153));
        btCetak.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btCetak.setForeground(new java.awt.Color(255, 255, 255));
        btCetak.setText("Cetak");
        btCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCetakActionPerformed(evt);
            }
        });
        jPanel4.add(btCetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 170, -1));

        btExit.setBackground(new java.awt.Color(0, 102, 153));
        btExit.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btExit.setForeground(new java.awt.Color(255, 255, 255));
        btExit.setText("Exit");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        jPanel4.add(btExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, 170, 30));

        jButton2.setText("<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/abstract4.png"))); // NOI18N
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 550));

        jPanel2.add(jPanel4);
        jPanel4.setBounds(0, 0, 880, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void txtKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKembaliActionPerformed

    private void txtBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBayarActionPerformed

    }//GEN-LAST:event_txtBayarActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahActionPerformed

    }//GEN-LAST:event_txtJumlahActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void cbMaskapaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaskapaiActionPerformed
        if (cbMaskapai.getSelectedItem().equals("Lion Air")) {              //JIKA COMBO BOX YANG DIPILIH LION AIR MAKA
            maskapai = lionAir;                                             //NILAI MASKAPAI ADALAH LION AIR
        }
        else if (cbMaskapai.getSelectedItem().equals("Sriwijaya")) {        //JIKA COMBO BOX YANG DIPILIH SRIWIJAYA MAKA
            maskapai = Sriwijaya;                                           //NILAI MASKAPAI ADALAH GARUDA INDONESIA
        }
        else if (cbMaskapai.getSelectedItem().equals("Garuda Indonesia")) { //JIKA COMBO BOX YANG DIPILIH GARUDA INDONESIA MAKA
            maskapai = Garuda;                                              //NILAI MASKAPAI ADALAH GARUDA INDONESIA
        }
    }//GEN-LAST:event_cbMaskapaiActionPerformed
   
        
    private void cbRuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRuteActionPerformed
        if(cbRute.getSelectedItem().equals("Pilih Rute")){                  //NILAI DEFAULT
            txtHarga.setText("");                                           //KOSONG
        }
        else if(cbRute.getSelectedItem().equals("Surabaya-Jakarta")){       //JIKA RUTE YANG DIPILIH SURABAYA JAKARTA MAKA
            lionAir = 480000;                                               //NILAI DARI LION AIR SEBAGAI BERIKUT
            Sriwijaya = 450000;                                             //NILAI DARI SRIWIJAYA SEBAGAI BERIKUT
            Garuda =  1280000;                                              //NILAI DARI GARUDA SEBAGAI BERIKUT
        }
        else if(cbRute.getSelectedItem().equals("Surabaya-Bali")){          //JIKA RUTE YANG DIPILIH SURABAYA BALI MAKA
            lionAir = 330000;                                               //NILAI DARI LION AIR SEBAGAI BERIKUT
            Sriwijaya = 320000;                                             //NILAI DARI SRIWIJAYA SEBAGAI BERIKUT
            Garuda = 700000;                                                //NILAI DARI GARUDA SEBAGAI BERIKUT
        }
         else if(cbRute.getSelectedItem().equals("Palembang-Surabaya")){    //JIKA RUTE YANG DIPILIH PALEMBANG SURABAYA
            lionAir = 700000;                                               //NILAI DARI LION AIR SEBAGAI BERIKUT
            Sriwijaya = 328000;                                             //NILAI DARI SRIWIJAYA SEBAGAI BERIKUT
            Garuda = 2312000;                                               //NILAI DARI GARUDA SEBAGAI BERIKUT
        }
        else if(cbRute.getSelectedItem().equals("Jakarta-Surabaya")){       //JIKA RUTE YANG DIPILLIH JAKARTA SURABAYA
            lionAir = 398000;                                               //NILAI DARI LION AIR SEBAGAI BERIKUT
            Sriwijaya = 492000;                                             //NILAI DARI SRIWIJAYA SEBAGAI BERIKUT
            Garuda = 1190000;                                               //NILAI DARI GARUDA SEBAGAI BERIKUT
        }
         else if(cbRute.getSelectedItem().equals("Samarinda-Surabaya")){    //JIKA RUTE YANG DIPILIH SAMARINDA SURABAYA
            lionAir = 700000;                                               //NILAI DARI LION AIR SEBAGAI BERIKUT
            Sriwijaya = 700000;                                             //NILAI DARI SRIWIJAYA SEBAGAI BERIKUT
            Garuda = 2100000;                                               //NILAI DARI GARUDA SEBAGAI BERIKUT
        }
        else if(cbRute.getSelectedItem().equals("Manukwari-Makassar")){     //JIKA RUTE YANG DIPILIH MANUKWARI MAKASSAR
            lionAir = 1843000;                                              //NILAI DARI LION AIR SEBAGAI BERIKUT
            Sriwijaya = 1895000;                                            //NILAI DARI SRIWIJAYA SEBAGAI BERIKUT
            Garuda = 2180000;                                               //NILAI DARI GARUDA SEBAGAI BERIKUT
        }
        else if(cbRute.getSelectedItem().equals("Makassar-Surabaya")){      //JIKA RUTE YANG DIPILIH MAKASSAR SURABAYA
            lionAir = 500000;                                               //NILAI DARI LION AIR SEBAGAI BERIKUT
            Sriwijaya = 532000;                                             //NILAI DARI SRIWIJAYA SEBAGAI BERIKUT
            Garuda = 1400000;                                               //NILAI DARI GARUDA SEBAGAI BERIKUT
        }
        else if(cbRute.getSelectedItem().equals("Bali-Jakarta")){           //JIKA RUTE YANG DIPILIH BALI MAKASSAR
            lionAir = 407000;                                               //NILAI DARI LION AIR SEBAGAI BERIKUT
            Sriwijaya = 511000;                                             //NILAI DARI SRIWIJAYA SEBAGAI BERIKUT
            Garuda = 1480000;                                               //NILAI DARI GARUDA SEBAGAI BERIKUT
        }

    }//GEN-LAST:event_cbRuteActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void cbJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJenisActionPerformed
        if(cbJenis.getSelectedItem().equals("VIP")){                        //JIKA COMBO BOX YANG DIPILIH ADALAH VIP MAKA
            vip = 1.5;                                                      //INISIALISASI VIP = 1.5
            hargavip =(int)( maskapai * vip);                               //KONVERSI DATA KE INT DAN MENGHITUNG NILAI HARGAVIP MASKAPAI * VIP
            txtHarga.setText(String.valueOf(hargavip));                     //MENAMPILKAN PERHITUNGAN DARI HARGA KE DALAM TEXTFIELD TXTHARGA
            
        }
        else if(cbJenis.getSelectedItem().equals("Ekonomi")){               //JIKA COMBO BOX YANG DIPILIH ADALAH EKONOMI MAKA
            ekonomi = 1;                                                    //INISIALISASI EKONOMI = 1
            hargaekonomi = (int)( maskapai * ekonomi);                      //KONVERSI DATA KE INT DAN MENGHITUNG NILAI HARGAVIP MASKAPAI * VIP
            txtHarga.setText(String.valueOf(hargaekonomi));                 //MENAMPILKAN PERHITUNGAN DARI HARGA KE DALAM TEXTFIELD TXTHARGA
            
        }
 
    }//GEN-LAST:event_cbJenisActionPerformed

    private void txtJumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahKeyReleased
       //JIKA TXTJUMLAH DI KETIKKAN ANGKA
       int a,b,c;                                                        //DEKLARASI TIPE DATA INT 
       a=Integer.valueOf(txtHarga.getText());                            //MENGAMBIL NILAI TXTHARGA DAN DIKONVERSI MENJADI INT KEMUDIAN DISIMPAN DALAM VAR A
       b=Integer.valueOf(txtJumlah.getText());                           //MENGAMBIL NILAI TXTJUMLAH DAN DIKONVERSI MENJADI INT KEMUDIAN DISIMPAN DALAM VAR B
       c=a*b;                                                            //OPERASI ARITMATIKA UNTUK MENGHITUNG NILAI TOTAL HARGA
       txtTotal.setText(""+c);                                           //AUTOMATIS TEXTFIELD TOTAL AKAN MENAMPILKAN TOTAL HARGA
    }//GEN-LAST:event_txtJumlahKeyReleased

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        reset_form();                                                       //MEMANGGIL METHOD RESET_FORM UNTUK MENGKOSONGKAN FORM
    }//GEN-LAST:event_btResetActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
       //BUTTON EXIT ACTION
        int answer=JOptionPane.showConfirmDialog                            //MENYIMPAN DATA OK OPTION KEDALAM VAR ANSWER
           (null,"Anda Yakin Keluar","Keluar",JOptionPane.OK_OPTION);       //MENAMPILKAN JOPTIONPANE DAN MENANYAKAN APAKAH YAKIN UNTUK KELUAR?
       if (answer==JOptionPane.OK_OPTION){                                  //JIKA USER MENEKAN OKE MAKA
           dispose();                                                       //TAMPILAN PEMESANAN AKAN TERTUTUP
       }
        
    }//GEN-LAST:event_btExitActionPerformed

    private void txtKembaliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKembaliKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKembaliKeyReleased

    private void txtBayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBayarKeyReleased
       //JIKA TXTBAYAR DIKETIKKAN ANGKA  
        int a,b,c;                                                       //DEKLARASI INT
       a=Integer.valueOf(txtBayar.getText());                            //MENGAMBIL NILAI TXTBAYAR DAN DIKONVERSI MENJADI INT KEMUDIAN DISIMPAN DALAM VAR A
       b=Integer.valueOf(txtTotal.getText());                            //MENGAMBIL NILAI TXTTOTAL DAN DIKONVERSI MENJADI INT KEMUDIAN DISIMPAN DALAM VAR B
       c=a-b;                                                            //OPERASI ARITMATIKA UNTUK MENGHITUNG KEMBALIAN
       txtKembali.setText(""+c);                                         //AUTOMATIS TEXTFIELD KEMBALI AKAN MENAMPILKAN KEMBALIAN  
    }//GEN-LAST:event_txtBayarKeyReleased

    private void txtTotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalKeyReleased
    
    private void txtNomorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomorActionPerformed

        
    }//GEN-LAST:event_txtNomorActionPerformed

    private void btCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCetakActionPerformed
        //BUTTON CETAK ACTION
        if (txtNomor.getText().equals("")  ||           //JIKA SALAH SATU DARI TEXTFIELD KOSONG MAKA                           
            txtNama.getText().equals("")   ||
            txtJumlah.getText().equals("") ||
            txtTotal.getText().equals("")  ||
            txtBayar.getText().equals("")  ||
            txtKembali.getText().equals("")) 
        {
            JOptionPane.showMessageDialog                               //JOPTION ERROR MESSAGE AKAN DITAMPILKAN
                (this, "Mohon Isi Formulir Pemesanan",                  //BERISI MOHON ISI FORMULIR PEMESANAN
                       "transaksi error", JOptionPane.ERROR_MESSAGE);   //JUDUL MESSAGE TRANSAKSI ERROR
        }else{                                          //JIKA SEMUA TERISI DENGAN BENAR MAKA JALANKAN PROGRAM
            if (Integer.parseInt(txtKembali.getText())>=0) {            //JIKA PEMBAYARAN DILAKUKAKAN DENGAN BENAR (TIDAK KURANG)
                txtCetak.setText(                                       //TEXTAREA AKAN MENCETAK NOMOR, NAMA, JUMLAH TIKET, TOTAL HARGA, TERBAYAR, DAN KEMABALIAN
                "Nomor kursi\t\t:" + txtNomor.getText() + "\n" +
                "Nama\t\t:" + txtNama.getText()  + "\n" +
                "Jumlah Tiket\t\t:" + txtJumlah.getText()+ "\n" +
                "Total Harga\t\t:" + txtTotal.getText() + "\n" +
                "Terbayar\t\t:" + txtBayar.getText() + "\n" +
                "Uang Kembali\t\t:" + txtKembali.getText()
            );
            save_data();                                                //DENGAN MEMANGGIL METHOD SAVE_DATA MAKA DATA AKAN DISIMPAN DALAM DATABASE
            reset_form();
        }
            else{                                                       //JIKA PEMBAYARAN DILAKUKAN TIDAK BENAR (KURANG)
                JOptionPane.showMessageDialog                           //ERROR MESSAGE AKAN DITAMPILKAN
                    (this, "silahkan masukkan pembayaran dengan benar", 
                           "pembayaran tidak dapat dilakukan", 
                           JOptionPane.ERROR_MESSAGE);
        }
        }
        
        
        
    }//GEN-LAST:event_btCetakActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //BUTTON DATA PEMESANAN
        Tabel_Pemesanan data = new Tabel_Pemesanan();                   //MENDEKLARASIKAN KELAS TABEL_PEMESANAN UNTUK DIPANGGIL
        data.setVisible(true);                                          //MENAMPILKAN TAMPILAN TABEL_PEMESANAN
        dispose();                                                      //TAMPILAN PEMESANAN AKAN TERTUTUP
    }//GEN-LAST:event_jButton1ActionPerformed
 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        login back = new login();                                       //MENDEKLARASIKAN KELAS LOGIN UNTUK DIPANGGIL
        back.setVisible(true);                                          //MENAMPILKAN TAMPILAN LOGIN MENU
        dispose();                                                      //TAMPILAN PEMESANAN AKAN TERTUTUP
    }//GEN-LAST:event_jButton2ActionPerformed

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
                new Pemesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton btCetak;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btReset;
    private javax.swing.JComboBox<String> cbJenis;
    private javax.swing.JComboBox<String> cbMaskapai;
    private javax.swing.JComboBox<String> cbRute;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextArea txtCetak;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKembali;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNomor;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
