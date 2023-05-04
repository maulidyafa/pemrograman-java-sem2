package pkgPustakaADT;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class appAntrianKA {
        static Scanner sc = new Scanner(System.in);
    static String h = "===================================================";
    static Queue<cPenumpang> q = new LinkedList();
    static cPenumpang penumpang;
    static int antrian = 0;
    static String p[][] = new String[9][4];
    static int hargatiket = 75000;
    static void ambil(){
        System.out.println(h+"\nHarga Tiket = Rp"+hargatiket);
        antrian++;
        System.out.print(h+"\nNama Pemesan Tiket     : ");
        String nm = sc.next();
        System.out.print("Stasiun Asal           : ");
        String asal = sc.next();
        System.out.print("Stasiun Tujuan         : ");
        String tujuan = sc.next();
        System.out.print("Jumlah Penumpang       : ");
        int jum = sc.nextInt();
        if (jum > 4) {
            System.out.println("\nMaks Penumpang 4!");
        }else {
            penumpang = new cPenumpang(antrian, jum, asal, tujuan, nm);
            q.add(penumpang); 
        }
        
    }
    static void DaftarAntrian(){
        System.out.println("");
        System.out.println("             DAFTAR ANTRIAN PENUMPANG\n\n"+h);
        System.out.println("No. Antri\t Nama\n"+h);
        for (int i = 0; i < q.size(); i++) {
            cPenumpang pg = q.poll();
            System.out.println("   " + pg.getNo() + "\t\t " + pg.getNama());
            q.add(pg);
        }
        System.out.println("");
    }
    static void DaftarKursi(String p[][]){
        System.out.println("  A B  C D ");
        for (int i = 0; i < p.length; i++) {
            System.out.print((i+1)+" ");
            for (int j = 0; j < p[i].length; j++) {
                if (j == 2) System.out.print(" ");
                System.out.print(p[i][j] == null ? "X " : "O ");
            }
            System.out.println("");
        }
    }
    static int[] NomerKursi(String str){
        String col[] = {"A", "B", "C", "D"};
        int x = Integer.parseInt(str.substring(0, str.length() - 1));
        int y = Arrays.asList(col).indexOf(str.substring(str.length() - 1));
        int[] ret = {x,y};
        return ret;
    }
    public static void main(String[] args) {
        int Pilih = 0;
        System.out.println(h+"\n\n\t        KERETA API INDONESIA");
        do {
            System.out.println("\n"+h+"\n\nMAIN MENU :\n1. Ambil Antrian\n2. Panggil Antrian\n3. Tampilkan Antrian\n4. Daftar Penumpang\n5. Keluar");
            System.out.print("\nPilih = ");
            Pilih = sc.nextInt(); 
            System.out.println("");
            switch (Pilih){
                case 1 : ambil();
                    break;
                case 2 :
                    penumpang = q.poll();
                    System.out.println(h);
                    System.out.println(penumpang.toString());
                    System.out.println(h);
                    for (int i = 0; i < penumpang.getJum(); i++) {
                        System.out.println("");
                        DaftarKursi(p);
                        System.out.print("\nMasukkan nomor bangku (contoh 2D) : ");
                        String a = sc.next();
                        int b[] = NomerKursi(a);
                        if (p[b[0] - 1][b[1]] != null) {
                            System.out.println("Maaf bangku sudah ditempati");
                            i--;
                        }else{
                            p[b[0] - 1][b[1]] = penumpang.getNama();
                        }
                    }
                    System.out.println("Total Pembayaran                  : "+penumpang.getJum()*hargatiket);
                    break;
                case 3 : 
                    System.out.println(h);
                    DaftarAntrian();
                    break;
                case 4 : 
                    System.out.println(h+"\n");
                    DaftarKursi(p);
                    break;
            }
        } while (Pilih != 5);
        
    }
    }
    

