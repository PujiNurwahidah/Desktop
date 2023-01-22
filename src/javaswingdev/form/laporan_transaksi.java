package javaswingdev.form;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 1572
 */
public class laporan_transaksi extends javax.swing.JFrame {

  
    public laporan_transaksi() {
        initComponents();
        table_laporan.fixTable(jScrollPane1);
        Tampil_laporan();
        this.setLocationRelativeTo(null);

    }
    
     private DefaultTableModel tabmode;
    private Connection conn = new koneksi().connect();
    public void Tampil_laporan()
    {
        
        table_laporan.fixTable(jScrollPane1);
        Object []baris = {"Tanggal", "Keterangan", "Pemasukan", "Pengeluaran"};
        tabmode = new DefaultTableModel(null, baris);
        table_laporan.setModel(tabmode);
        
            String bulan = form_laporan_bulanan.txt_bulan.getText();
            String tahun = form_laporan_bulanan.txt_tahun.getText();
            
            String bln = "";
            
            if("JANUARI".equals(bulan))
            {
                bln = "1";
            }else if("FEBRUARI".equals(bulan))
            {
                bln = "2";
            }else if("MARET".equals(bulan))
            {
                bln = "3";
            }else if("APRIL".equals(bulan))
            {
                bln = "4";
            }else if("MEI".equals(bulan))
            {
                bln = "5";
            }else if("JUNI".equals(bulan))
            {
                bln = "6";
            }else if("JULI".equals(bulan))
            {
                bln = "7";
            }else if("AGUSTUS".equals(bulan))
            {
                bln = "8";
            }else if("SEPTEMBER".equals(bulan))
            {
                bln = "9";
            }else if("OKTOBER".equals(bulan))
            {
                bln = "10";
            }else if("NOVEMBER".equals(bulan))
            {
                bln = "11";
            }else if("DESEMBER".equals(bulan))
            {
                bln = "12";
            } 
            try {
                String sql = "select * from tb_transaksi WHERE month(tanggal) = '"+bln+"' && year(tanggal) = '"+tahun+"'";
                java.sql.Statement stat = conn.createStatement();
                java.sql.ResultSet hasil = stat.executeQuery(sql);
                while (hasil.next()){
                    String tanggal = hasil.getString("tanggal");
                    String keterangan = hasil.getString("keterangan");
                    String pemasukan = hasil.getString("jumlah_pemasukan");
                    String pengeluaran = hasil.getString("jumlah_pengeluaran");
                    String[] data = {tanggal, keterangan, pemasukan, pengeluaran};
                    tabmode.addRow(data);
                    
                }
                
                
                  try {
                        String sqli = "select SUM(jumlah_pemasukan) from tb_transaksi WHERE month(tanggal) = '"+bln+"' && year(tanggal) = '"+tahun+"'";
                        java.sql.Statement state = conn.createStatement();
                        java.sql.ResultSet hsl = state.executeQuery(sqli);
                        
                        String ttl = "";
                        while (hsl.next()){
   
                            int total = hsl.getInt(1);
                            ttl = String.valueOf(total);
                          
                        }
                        
                         total_pemasukan.setText(ttl); 
                         
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Tampil data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
                    }
                  
                   try {
                        String sqli = "select SUM(jumlah_pengeluaran) from tb_transaksi WHERE month(tanggal) = '"+bln+"' && year(tanggal) = '"+tahun+"'";
                        java.sql.Statement state = conn.createStatement();
                        java.sql.ResultSet hsl = state.executeQuery(sqli);
                        
                        String ttl = "";
                        while (hsl.next()){
   
                            int total = hsl.getInt(1);
                            ttl = String.valueOf(total);
                          
                        }
                        
                         total_pengeluaran.setText(ttl); 
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Tampil data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
                    }
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
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

        area = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_laporan = new javaswingdev.swing.table.Table();
        jLabel2 = new javax.swing.JLabel();
        total_pemasukan = new javax.swing.JLabel();
        total_pengeluaran = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("LAPORAN KEUANGAN KURSUS PEMROGRAMAN");

        table_laporan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tanggal", "Keterangan", "Jumlah Pemasukan", "Jumlah Pengeluaran"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_laporan);

        txt_tahun.setBackground(new java.awt.Color(0, 0, 0));
        txt_tahun.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_tahun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txt_bulan.setBackground(new java.awt.Color(0, 0, 0));
        txt_bulan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_bulan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setText("Total");

        total_pemasukan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        total_pemasukan.setText("Total");

        total_pengeluaran.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        total_pengeluaran.setText("Total");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_tahun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_bulan)
                .addGap(254, 254, 254))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(total_pemasukan, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(total_pengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tahun)
                    .addComponent(txt_bulan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 471, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(total_pemasukan)
                    .addComponent(total_pengeluaran))
                .addGap(86, 86, 86))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(105, 105, 105)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(120, Short.MAX_VALUE)))
        );

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout areaLayout = new javax.swing.GroupLayout(area);
        area.setLayout(areaLayout);
        areaLayout.setHorizontalGroup(
            areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        areaLayout.setVerticalGroup(
            areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       // try{
            //textarea.print();
         //   laporan_transaksi.print();

        //}catch(Exception E){}
            
            Toolkit tkp = jPanel1.getToolkit();
            PrintJob pjp = tkp.getPrintJob(this, null, null);
            Graphics g = pjp.getGraphics();
            jPanel1.print(g);
            g.dispose();
            pjp.end();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(laporan_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(laporan_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(laporan_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(laporan_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new laporan_transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel area;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javaswingdev.swing.table.Table table_laporan;
    private javax.swing.JLabel total_pemasukan;
    private javax.swing.JLabel total_pengeluaran;
    public static final javax.swing.JLabel txt_bulan = new javax.swing.JLabel();
    public static final javax.swing.JLabel txt_tahun = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables

    void print() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
