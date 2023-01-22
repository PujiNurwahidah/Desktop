/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaswingdev.form;

import java.sql.Connection;
import javaswingdev.card.ModelCard;
import static javaswingdev.form.form_uang_keluar.username_login;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 1572
 */
public class form_kategori_pemasukan extends javax.swing.JFrame {

    /**
     * Creates new form form_menu_utama
     */
    public form_kategori_pemasukan() {
        initComponents();
        Tampil_pemasukan();
        username_login.setText(form_login.txtUsername.getText());
        //init();
            panelLaporan.setVisible(false);
        panelTransaksi.setVisible(false);
        panelMasterData.setVisible(false);
        panellogout.setVisible(false);
    }
    
    public void pencarian_pemasukan(){
        String cari = txt_cari.getText();
         table_pengeluaran.fixTable(jScrollPane1);
        Object []baris = {"No Kwitansi", "Nama Pembayar", "Nama Admin", "Tanggal", "Keterangan", "Jumlah"};
        tabmode = new DefaultTableModel(null, baris);
        table_pengeluaran.setModel(tabmode);
        
            try {
                String sql = "select * from tb_penerimaan WHERE nama_pembayar like '%"+cari+"%' || no_kwitansi like '%"+cari+"%'";
                java.sql.Statement stat = conn.createStatement();
                java.sql.ResultSet hasil = stat.executeQuery(sql);
                while (hasil.next()){
                    String no_kwitansi = hasil.getString("no_kwitansi");
                    String nama_pembayar = hasil.getString("nama_pembayar");
                    String nama_admin = hasil.getString("nama_admin");
                    String tanggal = hasil.getString("tanggal");
                    String keterangan = hasil.getString("keterangan");
                    String jumlah = hasil.getString("jumlah");
                    String[] data = {no_kwitansi, nama_pembayar, nama_admin, tanggal, keterangan, jumlah};
                    tabmode.addRow(data);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
    }
    
    private DefaultTableModel tabmode;
    private Connection conn = new koneksi().connect();
    public void Tampil_pemasukan()
    {
        table_pengeluaran.fixTable(jScrollPane1);
        Object []baris = {"No Kwitansi", "Nama Pembayar", "Nama Admin", "Tanggal", "Keterangan", "Jumlah"};
        tabmode = new DefaultTableModel(null, baris);
        table_pengeluaran.setModel(tabmode);
        
            try {
                String sql = "select * from tb_penerimaan order by id asc";
                java.sql.Statement stat = conn.createStatement();
                java.sql.ResultSet hasil = stat.executeQuery(sql);
                while (hasil.next()){
                    String no_kwitansi = hasil.getString("no_kwitansi");
                    String nama_pembayar = hasil.getString("nama_pembayar");
                    String nama_admin = hasil.getString("nama_admin");
                    String tanggal = hasil.getString("tanggal");
                    String keterangan = hasil.getString("keterangan");
                    String jumlah = hasil.getString("jumlah");
                    String[] data = {no_kwitansi, nama_pembayar, nama_admin, tanggal, keterangan, jumlah};
                    tabmode.addRow(data);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
    
    }
    
    private void init() {
        table_pengeluaran.fixTable(jScrollPane1);
        table_pengeluaran.addRow(new Object[]{"1", "Mike Bhand", "mikebhand@gmail.com", "Admin", "25 Apr,2018"});
        table_pengeluaran.addRow(new Object[]{"2", "Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018"});
       table_pengeluaran.addRow(new Object[]{"3", "Ross Kopelman", "rosskopelman@gmail.com", "Subscriber", "25 Apr,2018"});
        table_pengeluaran.addRow(new Object[]{"4", "Mike Hussy", "mikehussy@gmail.com", "Admin", "25 Apr,2018"});
       table_pengeluaran.addRow(new Object[]{"5", "Kevin Pietersen", "kevinpietersen@gmail.com", "Admin", "25 Apr,2018"});
        table_pengeluaran.addRow(new Object[]{"6", "Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018"});
        table_pengeluaran.addRow(new Object[]{"7", "Ross Kopelman", "rosskopelman@gmail.com", "Subscriber", "25 Apr,2018"});
        table_pengeluaran.addRow(new Object[]{"8", "Mike Hussy", "mikehussy@gmail.com", "Admin", "25 Apr,2018"});
        table_pengeluaran.addRow(new Object[]{"9", "Kevin Pietersen", "kevinpietersen@gmail.com", "Admin", "25 Apr,2018"});
        table_pengeluaran.addRow(new Object[]{"10", "Kevin Pietersen", "kevinpietersen@gmail.com", "Admin", "25 Apr,2018"});
        table_pengeluaran.addRow(new Object[]{"11", "Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018"});
        table_pengeluaran.addRow(new Object[]{"12", "Ross Kopelman", "rosskopelman@gmail.com", "Subscriber", "25 Apr,2018"});
        table_pengeluaran.addRow(new Object[]{"13", "Mike Hussy", "mikehussy@gmail.com", "Admin", "25 Apr,2018"});
        table_pengeluaran.addRow(new Object[]{"14", "Kevin Pietersen", "kevinpietersen@gmail.com", "Admin", "25 Apr,2018"});

        //  init card data
//        card1.setData(new ModelCard(null, null, null, "$ 500.00", "Report Income Monthly"));
//        card2.setData(new ModelCard(null, null, null, "$ 800.00", "Report Expense Monthly"));
//        card3.setData(new ModelCard(null, null, null, "$ 300.00", "Report Profit Monthly"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUtama = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        btnMasterData = new javax.swing.JButton();
        btnTransaksi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelMasterData = new javax.swing.JPanel();
        btnPengeluaran = new javax.swing.JButton();
        btnPenerimaan = new javax.swing.JButton();
        panelTransaksi = new javax.swing.JPanel();
        btnBarangMasuk = new javax.swing.JButton();
        btnBarangKeluar = new javax.swing.JButton();
        btnLaporan1 = new javax.swing.JButton();
        panelLaporan = new javax.swing.JPanel();
        btnLapBarangKeluar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_cari = new javax.swing.JTextField();
        btnBarangMasuk1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_pengeluaran = new javaswingdev.swing.table.Table();
        btnTambah = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panellogout = new javax.swing.JPanel();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelUtama.setBackground(new java.awt.Color(153, 255, 255));
        panelUtama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelUtamaMouseClicked(evt);
            }
        });

        panelMenu.setBackground(new java.awt.Color(0, 153, 204));

        btnMasterData.setBackground(new java.awt.Color(0, 153, 204));
        btnMasterData.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnMasterData.setForeground(new java.awt.Color(255, 255, 255));
        btnMasterData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dashb.png"))); // NOI18N
        btnMasterData.setText("  Master Data");
        btnMasterData.setBorder(null);
        btnMasterData.setContentAreaFilled(false);
        btnMasterData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMasterData.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnMasterData.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnMasterData.setMaximumSize(new java.awt.Dimension(86, 19));
        btnMasterData.setOpaque(true);
        btnMasterData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMasterDataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMasterDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMasterDataMouseExited(evt);
            }
        });
        btnMasterData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasterDataActionPerformed(evt);
            }
        });

        btnTransaksi.setBackground(new java.awt.Color(0, 153, 204));
        btnTransaksi.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        btnTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dollar.png"))); // NOI18N
        btnTransaksi.setText("  Transaksi");
        btnTransaksi.setBorder(null);
        btnTransaksi.setContentAreaFilled(false);
        btnTransaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransaksi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTransaksi.setOpaque(true);
        btnTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTransaksiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTransaksiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTransaksiMouseExited(evt);
            }
        });
        btnTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaksiActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kursus");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pemrograman");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gr.png"))); // NOI18N

        panelMasterData.setBackground(new java.awt.Color(0, 153, 204));
        panelMasterData.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnPengeluaran.setBackground(new java.awt.Color(0, 153, 204));
        btnPengeluaran.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnPengeluaran.setForeground(new java.awt.Color(255, 255, 255));
        btnPengeluaran.setText("  > Kategori Pengeluaran");
        btnPengeluaran.setBorder(null);
        btnPengeluaran.setContentAreaFilled(false);
        btnPengeluaran.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPengeluaran.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPengeluaran.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPengeluaran.setOpaque(true);
        btnPengeluaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPengeluaranMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPengeluaranMouseExited(evt);
            }
        });
        btnPengeluaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPengeluaranActionPerformed(evt);
            }
        });

        btnPenerimaan.setBackground(new java.awt.Color(0, 153, 204));
        btnPenerimaan.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnPenerimaan.setForeground(new java.awt.Color(255, 255, 255));
        btnPenerimaan.setText("  > Kategori Penerimaan");
        btnPenerimaan.setBorder(null);
        btnPenerimaan.setContentAreaFilled(false);
        btnPenerimaan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPenerimaan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPenerimaan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPenerimaan.setOpaque(true);
        btnPenerimaan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPenerimaanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPenerimaanMouseExited(evt);
            }
        });
        btnPenerimaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenerimaanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMasterDataLayout = new javax.swing.GroupLayout(panelMasterData);
        panelMasterData.setLayout(panelMasterDataLayout);
        panelMasterDataLayout.setHorizontalGroup(
            panelMasterDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPengeluaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPenerimaan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMasterDataLayout.setVerticalGroup(
            panelMasterDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMasterDataLayout.createSequentialGroup()
                .addComponent(btnPenerimaan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPengeluaran, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
        );

        panelTransaksi.setBackground(new java.awt.Color(0, 153, 204));
        panelTransaksi.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnBarangMasuk.setBackground(new java.awt.Color(0, 153, 204));
        btnBarangMasuk.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnBarangMasuk.setForeground(new java.awt.Color(255, 255, 255));
        btnBarangMasuk.setText("  > Uang Masuk");
        btnBarangMasuk.setBorder(null);
        btnBarangMasuk.setContentAreaFilled(false);
        btnBarangMasuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBarangMasuk.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBarangMasuk.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBarangMasuk.setOpaque(true);
        btnBarangMasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBarangMasukMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBarangMasukMouseExited(evt);
            }
        });
        btnBarangMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarangMasukActionPerformed(evt);
            }
        });

        btnBarangKeluar.setBackground(new java.awt.Color(0, 153, 204));
        btnBarangKeluar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnBarangKeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnBarangKeluar.setText("  > Uang Keluar");
        btnBarangKeluar.setBorder(null);
        btnBarangKeluar.setContentAreaFilled(false);
        btnBarangKeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBarangKeluar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBarangKeluar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBarangKeluar.setOpaque(true);
        btnBarangKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBarangKeluarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBarangKeluarMouseExited(evt);
            }
        });
        btnBarangKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarangKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTransaksiLayout = new javax.swing.GroupLayout(panelTransaksi);
        panelTransaksi.setLayout(panelTransaksiLayout);
        panelTransaksiLayout.setHorizontalGroup(
            panelTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBarangMasuk, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
            .addComponent(btnBarangKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTransaksiLayout.setVerticalGroup(
            panelTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransaksiLayout.createSequentialGroup()
                .addComponent(btnBarangMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBarangKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnLaporan1.setBackground(new java.awt.Color(0, 153, 204));
        btnLaporan1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnLaporan1.setForeground(new java.awt.Color(255, 255, 255));
        btnLaporan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book.png"))); // NOI18N
        btnLaporan1.setText("  Laporan");
        btnLaporan1.setBorder(null);
        btnLaporan1.setContentAreaFilled(false);
        btnLaporan1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLaporan1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLaporan1.setOpaque(true);
        btnLaporan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLaporan1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLaporan1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLaporan1MouseExited(evt);
            }
        });

        panelLaporan.setBackground(new java.awt.Color(0, 153, 204));
        panelLaporan.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnLapBarangKeluar1.setBackground(new java.awt.Color(0, 153, 204));
        btnLapBarangKeluar1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnLapBarangKeluar1.setForeground(new java.awt.Color(255, 255, 255));
        btnLapBarangKeluar1.setText("  > Laporan Bulanan");
        btnLapBarangKeluar1.setBorder(null);
        btnLapBarangKeluar1.setContentAreaFilled(false);
        btnLapBarangKeluar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLapBarangKeluar1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLapBarangKeluar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLapBarangKeluar1.setOpaque(true);
        btnLapBarangKeluar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLapBarangKeluar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLapBarangKeluar1MouseExited(evt);
            }
        });
        btnLapBarangKeluar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLapBarangKeluar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLaporanLayout = new javax.swing.GroupLayout(panelLaporan);
        panelLaporan.setLayout(panelLaporanLayout);
        panelLaporanLayout.setHorizontalGroup(
            panelLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLapBarangKeluar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        panelLaporanLayout.setVerticalGroup(
            panelLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLapBarangKeluar1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMenuLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnLaporan1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMasterData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelMasterData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelTransaksi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTransaksi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                        .addComponent(panelLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(btnMasterData, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelMasterData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLaporan1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Male_User_30px_5.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        username_login.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        username_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down.png"))); // NOI18N
        username_login.setText("Puji Lestari ");
        username_login.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        username_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                username_loginMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txt_cari.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnBarangMasuk1.setBackground(new java.awt.Color(0, 153, 204));
        btnBarangMasuk1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnBarangMasuk1.setForeground(new java.awt.Color(255, 255, 255));
        btnBarangMasuk1.setText("Cari");
        btnBarangMasuk1.setBorder(null);
        btnBarangMasuk1.setContentAreaFilled(false);
        btnBarangMasuk1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBarangMasuk1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBarangMasuk1.setOpaque(true);
        btnBarangMasuk1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBarangMasuk1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBarangMasuk1MouseExited(evt);
            }
        });
        btnBarangMasuk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarangMasuk1ActionPerformed(evt);
            }
        });

        table_pengeluaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Name", "Email", "Position", "Date Join"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_pengeluaran);

        btnTambah.setBackground(new java.awt.Color(0, 153, 204));
        btnTambah.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("+ Tambah");
        btnTambah.setBorder(null);
        btnTambah.setContentAreaFilled(false);
        btnTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambah.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTambah.setOpaque(true);
        btnTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTambahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTambahMouseExited(evt);
            }
        });
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(588, 588, 588)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBarangMasuk1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(38, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_cari)
                    .addComponent(btnBarangMasuk1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(273, 273, 273)
                .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel6.setText("Kategori Pemasukan");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/round.png"))); // NOI18N
        jLabel7.setText(">");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        panellogout.setBackground(new java.awt.Color(153, 255, 255));

        logout.setBackground(new java.awt.Color(0, 153, 204));
        logout.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        logout.setContentAreaFilled(false);
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logout.setOpaque(true);
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panellogoutLayout = new javax.swing.GroupLayout(panellogout);
        panellogout.setLayout(panellogoutLayout);
        panellogoutLayout.setHorizontalGroup(
            panellogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
            .addGroup(panellogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panellogoutLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        panellogoutLayout.setVerticalGroup(
            panellogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
            .addGroup(panellogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panellogoutLayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(8, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panelUtamaLayout = new javax.swing.GroupLayout(panelUtama);
        panelUtama.setLayout(panelUtamaLayout);
        panelUtamaLayout.setHorizontalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(username_login))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelUtamaLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panellogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelUtamaLayout.setVerticalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(username_login))
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panellogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUtama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMasterDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasterDataMouseClicked
        panelMasterData.setVisible(true);
        panelTransaksi.setVisible(false);
        panelLaporan.setVisible(false);
                panellogout.setVisible(false);
    }//GEN-LAST:event_btnMasterDataMouseClicked

    private void btnMasterDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasterDataMouseEntered
        //btnMasterData.setForeground(Color.red);
        //btnMasterData.setBackground(new Color(0,0,102));
    }//GEN-LAST:event_btnMasterDataMouseEntered

    private void btnMasterDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasterDataMouseExited
        //btnMasterData.setForeground(Color.white);
        //btnMasterData.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_btnMasterDataMouseExited

    private void btnMasterDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasterDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMasterDataActionPerformed

    private void btnTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransaksiMouseClicked
        panelTransaksi.setVisible(true);
        panelMasterData.setVisible(false);
        panelLaporan.setVisible(false);
                panellogout.setVisible(false);
    }//GEN-LAST:event_btnTransaksiMouseClicked

    private void btnTransaksiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransaksiMouseEntered
        //btnTransaksi.setForeground(Color.red);
        //btnTransaksi.setBackground(new Color(0,0,102));
    }//GEN-LAST:event_btnTransaksiMouseEntered

    private void btnTransaksiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransaksiMouseExited
        // btnTransaksi.setForeground(Color.white);
        // btnTransaksi.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_btnTransaksiMouseExited

    private void btnTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTransaksiActionPerformed

    private void btnPengeluaranMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPengeluaranMouseEntered
        // btnDataSupplier.setForeground(Color.red);
        // btnDataSupplier.setBackground(new Color(0,0,102));
    }//GEN-LAST:event_btnPengeluaranMouseEntered

    private void btnPengeluaranMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPengeluaranMouseExited
        // btnDataSupplier.setForeground(Color.white);
        // btnDataSupplier.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_btnPengeluaranMouseExited

    private void btnPengeluaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPengeluaranActionPerformed
         this.dispose();
        panelMasterData.setVisible(false);
        //new dataSupplier(this, rootPaneCheckingEnabled).show();
 
        form_kategori_pengeluaran mn = new form_kategori_pengeluaran();
        mn.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mn.setVisible(true);
    }//GEN-LAST:event_btnPengeluaranActionPerformed

    private void btnPenerimaanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenerimaanMouseEntered
        // btnDataBarang.setForeground(Color.red);
        // btnDataBarang.setBackground(new Color(0,0,102));
    }//GEN-LAST:event_btnPenerimaanMouseEntered

    private void btnPenerimaanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenerimaanMouseExited
        // btnDataBarang.setForeground(Color.white);
        // btnDataBarang.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_btnPenerimaanMouseExited

    private void btnPenerimaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenerimaanActionPerformed
 this.dispose();
           panelMasterData.setVisible(false);
        form_kategori_pemasukan mn = new form_kategori_pemasukan();
        mn.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mn.setVisible(true);
    }//GEN-LAST:event_btnPenerimaanActionPerformed

    private void btnBarangMasukMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBarangMasukMouseEntered
        //  btnBarangMasuk.setForeground(Color.red);
        //  btnBarangMasuk.setBackground(new Color(0,0,102));
    }//GEN-LAST:event_btnBarangMasukMouseEntered

    private void btnBarangMasukMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBarangMasukMouseExited
        //   btnBarangMasuk.setForeground(Color.white);
        //  btnBarangMasuk.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_btnBarangMasukMouseExited

    private void btnBarangMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarangMasukActionPerformed
         this.dispose();
        panelTransaksi.setVisible(false);

        form_uang_masuk mn = new form_uang_masuk();
               mn.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mn.setVisible(true);
    }//GEN-LAST:event_btnBarangMasukActionPerformed

    private void btnBarangKeluarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBarangKeluarMouseEntered
        //  btnBarangKeluar.setForeground(Color.red);
        //  btnBarangKeluar.setBackground(new Color(0,0,102));
    }//GEN-LAST:event_btnBarangKeluarMouseEntered

    private void btnBarangKeluarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBarangKeluarMouseExited
        //  btnBarangKeluar.setForeground(Color.white);
        //  btnBarangKeluar.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_btnBarangKeluarMouseExited

    private void btnBarangKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarangKeluarActionPerformed
         this.dispose();
        panelTransaksi.setVisible(false);

        form_uang_keluar mn = new form_uang_keluar();
               mn.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mn.setVisible(true);
    }//GEN-LAST:event_btnBarangKeluarActionPerformed

    private void btnBarangMasuk1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBarangMasuk1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBarangMasuk1MouseEntered

    private void btnBarangMasuk1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBarangMasuk1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBarangMasuk1MouseExited

    private void btnBarangMasuk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarangMasuk1ActionPerformed
        // TODO add your handling code here:
        pencarian_pemasukan();
    }//GEN-LAST:event_btnBarangMasuk1ActionPerformed

    private void panelUtamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelUtamaMouseClicked
        panelMasterData.setVisible(false);
        panelTransaksi.setVisible(false);
        panelLaporan.setVisible(false);
        panellogout.setVisible(false);
    }//GEN-LAST:event_panelUtamaMouseClicked

    private void btnTambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahMouseEntered

    private void btnTambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahMouseExited

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:

        form_entry_pemasukan mn = new form_entry_pemasukan();;
        mn.setVisible(true);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnLaporan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLaporan1MouseClicked
        panelLaporan.setVisible(true);
        panelTransaksi.setVisible(false);
        panelMasterData.setVisible(false);
        panellogout.setVisible(false);
    }//GEN-LAST:event_btnLaporan1MouseClicked

    private void btnLaporan1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLaporan1MouseEntered
        //btnLaporan.setForeground(Color.red);
        //btnLaporan.setBackground(new Color(0,0,102));
    }//GEN-LAST:event_btnLaporan1MouseEntered

    private void btnLaporan1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLaporan1MouseExited
        //btnLaporan.setForeground(Color.white);
        //btnLaporan.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_btnLaporan1MouseExited

    private void btnLapBarangKeluar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLapBarangKeluar1MouseEntered
        //  btnLapBarangKeluar.setForeground(Color.red);
        //  btnLapBarangKeluar.setBackground(new Color(0,0,102));
    }//GEN-LAST:event_btnLapBarangKeluar1MouseEntered

    private void btnLapBarangKeluar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLapBarangKeluar1MouseExited
        //  btnLapBarangKeluar.setForeground(Color.white);
        //  btnLapBarangKeluar.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_btnLapBarangKeluar1MouseExited

    private void btnLapBarangKeluar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLapBarangKeluar1ActionPerformed
         this.dispose();
        panelLaporan.setVisible(false);
        //new laporanBarangKeluar(this, rootPaneCheckingEnabled).show();
         //new laporanBarangKeluar(this, rootPaneCheckingEnabled).show();
        form_laporan_bulanan mn = new form_laporan_bulanan();
        mn.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mn.setVisible(true);
    }//GEN-LAST:event_btnLapBarangKeluar1ActionPerformed

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutMouseExited

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.dispose();

        //new laporanBarangKeluar(this, rootPaneCheckingEnabled).show();
        form_login mn = new form_login();
        mn.setExtendedState(JFrame.MAXIMIZED_BOTH);
        form_login.txtUsername.setText("");
        form_login.txtPassword.setText("");
        mn.setVisible(true);

    }//GEN-LAST:event_logoutActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
                   panellogout.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void username_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username_loginMouseClicked
        // TODO add your handling code here:
                   panellogout.setVisible(true);
    }//GEN-LAST:event_username_loginMouseClicked

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
            java.util.logging.Logger.getLogger(form_kategori_pemasukan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_kategori_pemasukan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_kategori_pemasukan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_kategori_pemasukan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_kategori_pemasukan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBarangKeluar;
    private javax.swing.JButton btnBarangMasuk;
    private javax.swing.JButton btnBarangMasuk1;
    private javax.swing.JButton btnLapBarangKeluar1;
    private javax.swing.JButton btnLaporan1;
    private javax.swing.JButton btnMasterData;
    private javax.swing.JButton btnPenerimaan;
    private javax.swing.JButton btnPengeluaran;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTransaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JPanel panelLaporan;
    private javax.swing.JPanel panelMasterData;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelTransaksi;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JPanel panellogout;
    private javaswingdev.swing.table.Table table_pengeluaran;
    private javax.swing.JTextField txt_cari;
    public static final javax.swing.JLabel username_login = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
