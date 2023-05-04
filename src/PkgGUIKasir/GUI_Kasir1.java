package PkgGUIKasir;
import javax.swing.*;
public class GUI_Kasir1 extends javax.swing.JFrame {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        int harga = 0, kembalian, bayar = 0;
        String kode = "";
        String menu = JOptionPane.showInputDialog(jf, "TOKO ROLL'S BAKERY\n1. Cookies       Rp20.000\n2. Brownies    Rp50.000\n3. Pastry          Rp30.000\n\nMasukkan pilihan");
        int pilih = Integer.parseInt(menu);
        
        String jml = JOptionPane.showInputDialog(jf, "Masukkan Jumlah yang ingin dibeli");
        int t = Integer.parseInt(jml);
        switch (pilih) {
            case 1:
                harga = 20000 * t;
                kode = "Cookies";
                break;
            case 2:
                harga = 50000 * t;
                kode = "Brownies";
                break;
            case 3:
                harga = 30000 * t;
                kode = "Pastry";
                break;
    }
        do {
            String total = JOptionPane.showInputDialog(jf, "Nama barang : " + kode + "\nJumlah barang : " + t + "\nHarga total : RP " + harga + "\n\nMasukkan jumlah uang yang dibayarkan");
            bayar = Integer.parseInt(total);
        } while (bayar < harga);
        kembalian = bayar - harga;
        if (bayar > harga) {
            JOptionPane.showMessageDialog(jf, "Kembalian anda : RP " + kembalian + "\nTerima kasih...");
        } else {
            JOptionPane.showMessageDialog(jf, "Terima kasih...");
        }
        jf.dispose();

    }
}
