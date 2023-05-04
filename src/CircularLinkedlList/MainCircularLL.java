package CircularLinkedlList;
import java.util.Scanner;
public class MainCircularLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cNode n;
        cCircularLinkedList CLL = new cCircularLinkedList();
        int Pilih = 0, Pilih2 = 0, Pilih3 = 0, Pilih4 = 0;
        do{
            System.out.println("");
            System.out.println("==========================");
            System.out.println("MENU LINKED LIST MAHASISWA");
            System.out.println("==========================");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Hapus Data Mahasiswa");
            System.out.println("3. Cari Data Mahasiswa");
            System.out.println("4. Cetak Data Mahasiswa");
            System.out.println("5. Tambah Karakter");
            System.out.println("6. Exit");
            System.out.println("==========================");
            System.out.print  ("Pilih = ");
            Pilih = sc.nextInt();
            switch(Pilih){
                case 1 :
                    System.out.println("");
                    System.out.println("==========================");
                    System.out.println("    *** TAMBAH DATA ***   ");
                    System.out.println("==========================");
                    System.out.println("1. Tambah dari Depan");
                    System.out.println("2. Tambah dari Belakang");
                    System.out.print("Pilih = ");
                    Pilih2 = sc.nextInt();
                    System.out.println("==========================");
                    System.out.println("Masukkan Nama Mahasiswa");
                    System.out.print("Nama : ");
                    String nm = sc.next();
                    n = new cNode (nm);
                     if(Pilih2 == 1){
                        CLL.addNodeFront(n);
                    }else{
                        CLL.addNodeBehind(n);
                    }
                    break;
                case 2 :
                    System.out.println("");
                    System.out.println("==========================");
                    System.out.println("    *** HAPUS DATA ***    ");
                    System.out.println("==========================");
                    System.out.println("1. Hapus Data dari Depan");
                    System.out.println("2. Hapus Data dari Belakang");
                    System.out.print("Pilih = ");
                    Pilih3 = sc.nextInt();
                    System.out.println("==========================");
                    if(Pilih3 == 1){
                        CLL.delNodeFront();
                    }else{
                        CLL.delNodeBehind();
                    }
                    break;
                case 3 :
                    System.out.println("");
                    System.out.println("==========================");
                    System.out.println("    *** CARI DATA ***     ");
                    System.out.println("==========================");
                    CLL.cariNode();
                    break;
                case 4 :
                    System.out.println("");
                    System.out.println("==========================");
                    System.out.println("    *** CETAK DATA ***    ");
                    System.out.println("==========================");
                    CLL.print();
                    break;
                case 5 :
                    System.out.println("");
                    System.out.println("==========================");
                    System.out.println("  *** Tambah Karakter *** ");
                    System.out.println("==========================");
                    CLL.tambahkarakter();
                    break;
                case 6 :
                    System.out.println("");
                    System.out.println("==========================");
                    System.out.println("       *** EXIT ***"       );
                    System.out.println("==========================");
                    System.out.println("Terima Kasih ^_^");
                    break;
            } 
        }while(Pilih != 6);
    }
    
}
