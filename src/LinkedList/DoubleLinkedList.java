package LinkedList;
import java.util.Scanner;
public class DoubleLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cNode n;
        cDoubleLinkedList DLL = new cDoubleLinkedList(null);
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
            System.out.println("5. Exit");
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
                    System.out.println("Masukkan Data Mahasiswa!");
                    System.out.print("NPM  : ");
                    String NPM = sc.next();
                    System.out.print("Nama : ");
                    String Nama = sc.next();
                    System.out.print("IPK  : ");
                    double IPK = sc.nextDouble();
                    n = new cNode(NPM, Nama, IPK);
                     if(Pilih2 == 1){
                        DLL.addNode(n);
                    }else{
                        DLL.addNodeBehind(n);
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
                    if(Pilih3 == 1){
                        DLL.delNodeFront();
                    }else{
                        DLL.delNodeBehind();
                    }
                    break;
                case 3 :
                    System.out.println("");
                    System.out.println("==========================");
                    System.out.println("    *** CARI DATA ***     ");
                    System.out.println("==========================");
                    DLL.cariNode();
                    break;
                case 4 :
                    System.out.println("");
                    System.out.println("==========================");
                    System.out.println("    *** CETAK DATA ***    ");
                    System.out.println("==========================");
                    DLL.print();
                    break;
                case 5 :
                    System.out.println("");
                    System.out.println("==========================");
                    System.out.println("       *** EXIT ***"       );
                    System.out.println("==========================");
                    System.out.println("Terima Kasih ^_^");
                    break;
            } 
        }while(Pilih != 5);
    }
    
}
