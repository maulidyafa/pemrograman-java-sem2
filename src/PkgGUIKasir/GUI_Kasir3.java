package PkgGUIKasir;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class GUI_Kasir3 extends javax.swing.JFrame {

    cBarang brg[] = new cBarang[50];
    cPelanggan plg[] = new cPelanggan[50];
    cPembelian pmb[] = new cPembelian[100];
    int jumbrg = 0, maksbrg = 50;
    int jumplg = 0, maksplg = 50;
    boolean isi, ada;
    JFrame frame = new JFrame();
    String row[][] = new String[100][4];
    public GUI_Kasir3() {
        brg[0] = new cBarang ("11B","Cookies",20000,100);
        brg[1] = new cBarang ("12B","Brownies",50000,30);
        brg[2] = new cBarang ("13B","Pastry",30000,40);
        brg[3] = new cBarang ("14B","Cake",10000,55);
        jumbrg=4;
        plg[0] = new cPelanggan ("Caca","2008201090","Malang", "085050281383");
        plg[1] = new cPelanggan ("Bobi","2008201055","Sidoarjo", "089102807367");
        jumplg=2;
        initComponents(); 
        jumlahbeli.setValue(0);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator4 = new javax.swing.JSeparator();
        KosmetikMirin = new javax.swing.JTabbedPane();
        panel_menuBarang = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_namaBarang = new javax.swing.JTextField();
        butt_tampilkanBarang = new javax.swing.JButton();
        butt_batal1 = new javax.swing.JButton();
        txt_kodeBarang = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_hargaBarang = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_barang = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        butt_tambahbarang = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txt_stockBarang = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        panel_menuPelanggan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_namaPelanggan = new javax.swing.JTextField();
        txt_idPelanggan = new javax.swing.JTextField();
        txt_noPelanggan = new javax.swing.JTextField();
        butt_tambahPelanggan = new javax.swing.JButton();
        butt_batal2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_pelanggan = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jButton9 = new javax.swing.JButton();
        butt_tampilkanPelanggan = new javax.swing.JButton();
        txt_alamatPelanggan = new javax.swing.JTextField();
        panel_menuKasir = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_barangPembelian = new javax.swing.JTextField();
        txt_hargaPembelian = new javax.swing.JTextField();
        txt_idPembelian = new javax.swing.JTextField();
        txt_namaPembelian = new javax.swing.JTextField();
        butt_total = new javax.swing.JButton();
        butt_batal3 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        butt_bayar = new javax.swing.JButton();
        txt_bayar = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_kembalian = new javax.swing.JTextField();
        jumlahbeli = new javax.swing.JSpinner();
        jButton8 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        butt_cekNama = new javax.swing.JButton();
        butt_cekKode = new javax.swing.JButton();
        txt_pembelianKode = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        jMenu1.setText("menuKasir");

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        KosmetikMirin.setBackground(new java.awt.Color(245, 245, 245));

        panel_menuBarang.setBackground(new java.awt.Color(243, 243, 243));

        jLabel6.setFont(new java.awt.Font("Eras Demi ITC", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(82, 79, 98));
        jLabel6.setText("Data Barang Toko Roll's Bakery");

        jLabel7.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(82, 79, 98));
        jLabel7.setText("Nama Barang :");

        jLabel9.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(82, 79, 98));
        jLabel9.setText("Kode Barang :");

        txt_namaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaBarangActionPerformed(evt);
            }
        });

        butt_tampilkanBarang.setForeground(new java.awt.Color(82, 79, 98));
        butt_tampilkanBarang.setText("Tampilkan");
        butt_tampilkanBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_tampilkanBarangActionPerformed(evt);
            }
        });

        butt_batal1.setForeground(new java.awt.Color(82, 79, 98));
        butt_batal1.setText("Batal");
        butt_batal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_batal1ActionPerformed(evt);
            }
        });

        txt_kodeBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kodeBarangActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(82, 79, 98));
        jLabel8.setText("Jumlah Stock :");

        jLabel10.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(82, 79, 98));
        jLabel10.setText("Harga/item   : ");

        txt_hargaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaBarangActionPerformed(evt);
            }
        });

        table_barang.setAutoCreateRowSorter(true);
        table_barang.setBackground(new java.awt.Color(243, 243, 243));
        table_barang.setForeground(new java.awt.Color(82, 79, 98));
        table_barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Barang", "Nama Barag", "Harga ", "Jumlah Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_barang.setSelectionForeground(new java.awt.Color(243, 243, 243));
        jScrollPane2.setViewportView(table_barang);

        jLabel11.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(82, 79, 98));
        jLabel11.setText("Data Barang tersedia :");

        butt_tambahbarang.setForeground(new java.awt.Color(82, 79, 98));
        butt_tambahbarang.setText("Tambah");
        butt_tambahbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_tambahbarangActionPerformed(evt);
            }
        });

        jButton5.setForeground(new java.awt.Color(82, 79, 98));
        jButton5.setText("Keluar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txt_stockBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_stockBarangActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(82, 79, 98));
        jLabel27.setText("RP");

        javax.swing.GroupLayout panel_menuBarangLayout = new javax.swing.GroupLayout(panel_menuBarang);
        panel_menuBarang.setLayout(panel_menuBarangLayout);
        panel_menuBarangLayout.setHorizontalGroup(
            panel_menuBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuBarangLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panel_menuBarangLayout.createSequentialGroup()
                .addGroup(panel_menuBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_menuBarangLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panel_menuBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_menuBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panel_menuBarangLayout.createSequentialGroup()
                                    .addComponent(butt_tambahbarang)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(butt_batal1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel_menuBarangLayout.createSequentialGroup()
                                    .addGroup(panel_menuBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(panel_menuBarangLayout.createSequentialGroup()
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txt_stockBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel_menuBarangLayout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(18, 18, 18)
                                            .addComponent(txt_namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(41, 41, 41)
                                    .addGroup(panel_menuBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel9))
                                    .addGap(18, 18, 18)
                                    .addGroup(panel_menuBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_kodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panel_menuBarangLayout.createSequentialGroup()
                                            .addComponent(jLabel27)
                                            .addGap(6, 6, 6)
                                            .addComponent(txt_hargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                            .addGroup(panel_menuBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panel_menuBarangLayout.createSequentialGroup()
                                    .addComponent(butt_tampilkanBarang)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton5))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_menuBarangLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_menuBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuBarangLayout.createSequentialGroup()
                                .addComponent(jSeparator2)
                                .addGap(106, 106, 106))
                            .addComponent(jSeparator1))))
                .addContainerGap())
        );
        panel_menuBarangLayout.setVerticalGroup(
            panel_menuBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(panel_menuBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_kodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_menuBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(txt_hargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_stockBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(30, 30, 30)
                .addGroup(panel_menuBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butt_batal1)
                    .addComponent(butt_tambahbarang))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panel_menuBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(butt_tampilkanBarang))
                .addContainerGap())
        );

        KosmetikMirin.addTab("Barang", panel_menuBarang);

        panel_menuPelanggan.setBackground(new java.awt.Color(243, 243, 243));

        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(82, 79, 98));
        jLabel1.setText("Data Pelanggan Toko Roll's Bakery");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(82, 79, 98));
        jLabel2.setText("Nama  :");

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(82, 79, 98));
        jLabel3.setText("No. Telp     :");

        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(82, 79, 98));
        jLabel4.setText("ID       :");

        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(82, 79, 98));
        jLabel5.setText("Alamat      :");

        butt_tambahPelanggan.setForeground(new java.awt.Color(82, 79, 98));
        butt_tambahPelanggan.setText("Tambah");
        butt_tambahPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_tambahPelangganActionPerformed(evt);
            }
        });

        butt_batal2.setForeground(new java.awt.Color(82, 79, 98));
        butt_batal2.setText("Batal");
        butt_batal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_batal2ActionPerformed(evt);
            }
        });

        table_pelanggan.setAutoCreateRowSorter(true);
        table_pelanggan.setBackground(new java.awt.Color(243, 243, 243));
        table_pelanggan.setForeground(new java.awt.Color(82, 79, 98));
        table_pelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama ", "ID Pelanggan", "Alamat", "No. Telp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_pelanggan.setGridColor(new java.awt.Color(82, 79, 98));
        table_pelanggan.setSelectionForeground(new java.awt.Color(243, 243, 243));
        jScrollPane3.setViewportView(table_pelanggan);

        jLabel12.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(82, 79, 98));
        jLabel12.setText("Data Pelanggan Tersedia :");

        jButton9.setForeground(new java.awt.Color(82, 79, 98));
        jButton9.setText("Keluar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        butt_tampilkanPelanggan.setForeground(new java.awt.Color(82, 79, 98));
        butt_tampilkanPelanggan.setText("Tampilkan");
        butt_tampilkanPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_tampilkanPelangganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_menuPelangganLayout = new javax.swing.GroupLayout(panel_menuPelanggan);
        panel_menuPelanggan.setLayout(panel_menuPelangganLayout);
        panel_menuPelangganLayout.setHorizontalGroup(
            panel_menuPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuPelangganLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(144, 144, 144))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuPelangganLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator5)
                .addContainerGap())
            .addGroup(panel_menuPelangganLayout.createSequentialGroup()
                .addGroup(panel_menuPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_menuPelangganLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panel_menuPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_menuPelangganLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panel_menuPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_menuPelangganLayout.createSequentialGroup()
                                .addGroup(panel_menuPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_menuPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_namaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_idPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(panel_menuPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel_menuPelangganLayout.createSequentialGroup()
                                        .addComponent(butt_tambahPelanggan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(butt_batal2))
                                    .addGroup(panel_menuPelangganLayout.createSequentialGroup()
                                        .addGroup(panel_menuPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(panel_menuPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_noPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_alamatPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(13, 13, 13))
                            .addGroup(panel_menuPelangganLayout.createSequentialGroup()
                                .addComponent(butt_tampilkanPelanggan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton9)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panel_menuPelangganLayout.setVerticalGroup(
            panel_menuPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuPelangganLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panel_menuPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_menuPelangganLayout.createSequentialGroup()
                        .addGroup(panel_menuPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_namaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_menuPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_idPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_menuPelangganLayout.createSequentialGroup()
                        .addGroup(panel_menuPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_alamatPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_menuPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_noPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addGroup(panel_menuPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butt_tambahPelanggan)
                    .addComponent(butt_batal2))
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_menuPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(butt_tampilkanPelanggan))
                .addContainerGap())
        );

        KosmetikMirin.addTab("Pelanggan", panel_menuPelanggan);

        panel_menuKasir.setBackground(new java.awt.Color(243, 243, 243));

        jLabel13.setFont(new java.awt.Font("Eras Demi ITC", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(82, 79, 98));
        jLabel13.setText("Kasir Toko Roll's Bakery");

        jLabel14.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(82, 79, 98));
        jLabel14.setText("Kode Barang  :");

        jLabel15.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(82, 79, 98));
        jLabel15.setText("Nama Barang :");

        jLabel17.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(82, 79, 98));
        jLabel17.setText("Harga/item    : ");

        jLabel16.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(82, 79, 98));
        jLabel16.setText("RP");

        jLabel18.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(82, 79, 98));
        jLabel18.setText("Nama Pelanggan :");

        jLabel19.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(82, 79, 98));
        jLabel19.setText("Jumlah beli         : ");

        txt_barangPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_barangPembelianActionPerformed(evt);
            }
        });

        txt_hargaPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaPembelianActionPerformed(evt);
            }
        });

        txt_idPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idPembelianActionPerformed(evt);
            }
        });

        txt_namaPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaPembelianActionPerformed(evt);
            }
        });

        butt_total.setText("Hitung total");
        butt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_totalActionPerformed(evt);
            }
        });

        butt_batal3.setText("Batal");
        butt_batal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_batal3ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(82, 79, 98));
        jLabel20.setText("Harga total    : ");

        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(82, 79, 98));
        jLabel21.setText("Jumlah Bayar    : ");

        butt_bayar.setText("BAYAR");
        butt_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_bayarActionPerformed(evt);
            }
        });

        txt_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bayarActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(82, 79, 98));
        jLabel22.setText("Kembalian        : ");

        txt_kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kembalianActionPerformed(evt);
            }
        });

        jButton8.setText("Keluar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        butt_cekNama.setText("cek");
        butt_cekNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_cekNamaActionPerformed(evt);
            }
        });

        butt_cekKode.setText("cek");
        butt_cekKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_cekKodeActionPerformed(evt);
            }
        });

        txt_pembelianKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pembelianKodeActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(82, 79, 98));
        jLabel23.setText("ID                      :");

        jLabel24.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(82, 79, 98));
        jLabel24.setText("RP");

        jLabel25.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(82, 79, 98));
        jLabel25.setText("RP");

        jLabel26.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(82, 79, 98));
        jLabel26.setText("RP");

        javax.swing.GroupLayout panel_menuKasirLayout = new javax.swing.GroupLayout(panel_menuKasir);
        panel_menuKasir.setLayout(panel_menuKasirLayout);
        panel_menuKasirLayout.setHorizontalGroup(
            panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuKasirLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_menuKasirLayout.createSequentialGroup()
                        .addGroup(panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_menuKasirLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_pembelianKode, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(butt_cekKode))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton8))
                        .addContainerGap())
                    .addGroup(panel_menuKasirLayout.createSequentialGroup()
                        .addGroup(panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_menuKasirLayout.createSequentialGroup()
                                .addGroup(panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_barangPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_menuKasirLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_hargaPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(46, 46, 46)
                                .addGroup(panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_menuKasirLayout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(butt_cekNama)
                                            .addComponent(txt_namaPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panel_menuKasirLayout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jumlahbeli, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_menuKasirLayout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_idPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panel_menuKasirLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(butt_total)
                                .addGap(18, 18, 18)
                                .addComponent(butt_batal3))
                            .addGroup(panel_menuKasirLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22))
                                .addGap(11, 11, 11)
                                .addGroup(panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_kembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(txt_bayar))))
                        .addGap(0, 45, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuKasirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butt_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(panel_menuKasirLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_menuKasirLayout.setVerticalGroup(
            panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuKasirLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txt_pembelianKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(txt_namaPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butt_cekKode)
                    .addComponent(butt_cekNama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_menuKasirLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txt_barangPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txt_hargaPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addGroup(panel_menuKasirLayout.createSequentialGroup()
                        .addGroup(panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_idPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jumlahbeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addGroup(panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butt_total)
                    .addComponent(butt_batal3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txt_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txt_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(butt_bayar)
                .addGap(13, 13, 13)
                .addComponent(jButton8)
                .addContainerGap())
        );

        KosmetikMirin.addTab("Pembelian", panel_menuKasir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(KosmetikMirin)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(KosmetikMirin)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void butt_batal2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        txt_namaPelanggan.setText("");
        txt_idPelanggan.setText("");
        txt_alamatPelanggan.setText("");
        txt_noPelanggan.setText("");
    }                                           

    private void txt_barangPembelianActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void txt_hargaPembelianActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void txt_idPembelianActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void txt_namaPembelianActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void butt_totalActionPerformed(java.awt.event.ActionEvent evt) {                                           
        boolean ketemu = false;
        int i = 0;
        int jum = (Integer) jumlahbeli.getValue();
        int hrg = Integer.parseInt(txt_hargaPembelian.getText());
        
        int total = jum*hrg;
        txt_total.setText(""+total);        
        
    }                                          

    private void butt_batal3ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        txt_pembelianKode.setText("");
        txt_barangPembelian.setText("");
        txt_namaPembelian.setText("");
        txt_idPembelian.setText("");
        jumlahbeli.setValue(0);
        txt_total.setText("");
        txt_bayar.setText("");
        txt_kembalian.setText("");
        txt_hargaPembelian.setText("");
    }                                           

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void butt_bayarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        int total = Integer.parseInt(txt_total.getText());
        int byr = Integer.parseInt(txt_bayar.getText());
        
        int kembali = byr-total;
        txt_kembalian.setText(""+kembali);
        
        JOptionPane.showMessageDialog(frame, "PEMBAYARAN BERHASIL");
        
        txt_pembelianKode.setText("");
        txt_barangPembelian.setText("");
        txt_namaPembelian.setText("");
        txt_idPembelian.setText("");
        jumlahbeli.setValue(0);
        txt_total.setText("");
        txt_bayar.setText("");
        txt_kembalian.setText("");
        txt_hargaPembelian.setText("");
        
        
    }                                          

    private void txt_bayarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void txt_kembalianActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.dispose();
    }                                        

    private void txt_hargaBarangActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void txt_kodeBarangActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void butt_batal1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        txt_kodeBarang.setText("");
        txt_namaBarang.setText("");        
        txt_hargaBarang.setText("");
        txt_stockBarang.setText("");
        
    }                                           

    private void butt_tampilkanBarangActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        DefaultTableModel tabbrg = (DefaultTableModel)table_barang.getModel();
        for (int j = 0; j < jumbrg; j++) {
            row[j][0] = brg[j].getKode();
            row[j][1] = brg[j].getNama();
            row[j][2] = ""+brg[j].getHarga();
            row[j][3] = ""+brg[j].getStock();
            tabbrg.addRow(row[j]);            
            
        }
    }                                                    

    private void txt_namaBarangActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        this.dispose();
    }                                        

    private void butt_tambahbarangActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        for (int i = jumbrg; i < maksbrg; i++) {
            String kd = txt_kodeBarang.getText();
            String nm = txt_namaBarang.getText();
            int hrg = Integer.parseInt(txt_hargaBarang.getText());
            int stc = Integer.parseInt(txt_stockBarang.getText());
            brg[i] = new cBarang (kd,nm,hrg,stc);
            jumbrg++;
            JOptionPane.showMessageDialog(frame, "Penambahan Berhasil!");
            break;
            
        }        
        txt_kodeBarang.setText("");
        txt_namaBarang.setText("");        
        txt_hargaBarang.setText("");
        txt_stockBarang.setText("");
        
        
        
    }                                                 

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.dispose();
    }                                        

    private void butt_tampilkanPelangganActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        DefaultTableModel tabplg = (DefaultTableModel) table_pelanggan.getModel();
        for (int i = 0; i < jumbrg; i++) {
            row[i][0] = plg[i].getNama();
            row[i][1] = plg[i].getIDPlgn();
            row[i][2] = plg[i].getAlamat();
            row[i][3] = plg[i].getNoTelp();
            tabplg.addRow(row[i]);
        }
        
        
    }                                                       

    private void txt_stockBarangActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void butt_tambahPelangganActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        
        for (int i = jumplg; i < maksplg; i++) {
            String nm = txt_namaPelanggan.getText();
            String id = txt_idPelanggan.getText();
            String alm = txt_alamatPelanggan.getText();
            String no = txt_noPelanggan.getText();
            plg[i] = new cPelanggan (nm,id,alm,no);
            jumplg++;
            JOptionPane.showMessageDialog(frame, "Penambahan Berhasil!");
            break;
            
        }        
        
        txt_namaPelanggan.setText("");
        txt_idPelanggan.setText("");        
        txt_alamatPelanggan.setText("");
        txt_noPelanggan.setText("");
        
        
    }                                                    

    private void butt_cekNamaActionPerformed(java.awt.event.ActionEvent evt) {                                             
        boolean ketemu=false;
        int i=0;        
        while (i<jumplg && ketemu==false){
            if (txt_namaPembelian.getText().equalsIgnoreCase(plg[i].getNama())) {
                ketemu = true;
                txt_idPembelian.setText(plg[i].getIDPlgn());
            }  else i++;
        } 
        if (ketemu==false){
            JOptionPane.showMessageDialog(frame, "Data nama Tidak Ditemukan!");
        }
    }                                            

    private void butt_cekKodeActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        boolean ketemu=false;
        int i=0;        
        while (i<jumbrg && ketemu==false){            
            if (txt_pembelianKode.getText().equalsIgnoreCase(brg[i].getKode())) {
                ketemu = true;                 
                txt_barangPembelian.setText(brg[i].getNama());
                txt_hargaPembelian.setText("" + brg[i].getHarga());
            }  else i++;
        }
        if (ketemu==false){
            JOptionPane.showMessageDialog(frame, "Data nama Tidak Ditemukan!");
        }
    }                                            

    private void txt_pembelianKodeActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(GUI_Kasir3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Kasir3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Kasir3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Kasir3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Kasir3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTabbedPane KosmetikMirin;
    private javax.swing.JButton butt_batal1;
    private javax.swing.JButton butt_batal2;
    private javax.swing.JButton butt_batal3;
    private javax.swing.JButton butt_bayar;
    private javax.swing.JButton butt_cekKode;
    private javax.swing.JButton butt_cekNama;
    private javax.swing.JButton butt_tambahPelanggan;
    private javax.swing.JButton butt_tambahbarang;
    private javax.swing.JButton butt_tampilkanBarang;
    private javax.swing.JButton butt_tampilkanPelanggan;
    private javax.swing.JButton butt_total;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JSpinner jumlahbeli;
    private javax.swing.JPanel panel_menuBarang;
    private javax.swing.JPanel panel_menuKasir;
    private javax.swing.JPanel panel_menuPelanggan;
    private javax.swing.JTable table_barang;
    private javax.swing.JTable table_pelanggan;
    private javax.swing.JTextField txt_alamatPelanggan;
    private javax.swing.JTextField txt_barangPembelian;
    private javax.swing.JTextField txt_bayar;
    private javax.swing.JTextField txt_hargaBarang;
    private javax.swing.JTextField txt_hargaPembelian;
    private javax.swing.JTextField txt_idPelanggan;
    private javax.swing.JTextField txt_idPembelian;
    private javax.swing.JTextField txt_kembalian;
    private javax.swing.JTextField txt_kodeBarang;
    private javax.swing.JTextField txt_namaBarang;
    private javax.swing.JTextField txt_namaPelanggan;
    private javax.swing.JTextField txt_namaPembelian;
    private javax.swing.JTextField txt_noPelanggan;
    private javax.swing.JTextField txt_pembelianKode;
    private javax.swing.JTextField txt_stockBarang;
    private javax.swing.JTextField txt_total;
    // End of variables declaration                   
}
