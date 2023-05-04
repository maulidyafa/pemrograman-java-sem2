package LinkedList;
import java.util.Scanner;
public class cDoubleLinkedList {
    Scanner sc = new Scanner(System.in);
    cNode header, tail;
    int js; //jumlah simpul
    
    cDoubleLinkedList(cNode h){
        header=tail=null;
        js=0;
        System.out.println("Object Linked List Berhasil Dibuat");
    }
    
    public void addNode(cNode baru) {
        if(header == null){
           header = baru;
           tail = baru;
        }else{
            baru.next = header;
            baru.before = baru;
            header = baru;
        }
        System.out.println("");
        System.out.println("Penambahan Berhasil...");
    }

    public void addNodeBehind(cNode baru) {
         if(header == null){
            header = baru;
            tail = baru;
        }else if(tail == null){
            tail = baru;
        }else{
            tail.next = baru;
            baru.before = tail;
            tail = baru;
        }
        System.out.println("");
        System.out.println("Penambahan Berhasil...");
    }

    public void delNodeFront() {
        if(header == null){
            System.out.println("Data Kosong");
        }else{
           System.out.println("NPM  : "+header.getNPM());
           System.out.println("Nama : "+header.getNama());
           System.out.println("IPK  : "+header.getIPK());
           System.out.println("");
           System.out.println("Anda ingin menghapus data?\n1. Ya\n2. Tidak");
           System.out.print("Pilih = ");
           int hapus = sc.nextInt();
           if (hapus==1){
            cNode t = header.next;
            header  = null;
            header  = t;
            js--;
            System.out.println("");
            System.out.println("Penghapusan Berhasil...");
           }else{
               System.out.println("");
               System.out.println("Penghapusan Dibatalkan");
           }
        }
    }

    public void delNodeBehind() {
        if (tail == null) {
            System.out.println("Data Kosong");
        } else {
            System.out.println("NPM  : " + tail.getNPM());
            System.out.println("Nama : " + tail.getNama());
            System.out.println("IPK  : " + tail.getIPK());
            System.out.println("");
            System.out.println("Anda ingin menghapus data?\n1. Ya\n2. Tidak");
            System.out.print("Pilih = ");
            int hapus2= sc.nextInt();
            if (hapus2 == 1) {
                tail = tail.before;
                tail.next = null;
                js--;
                System.out.println("");
                System.out.println("Penghapusan berhasil...");
            } else {
                System.out.println("");
                System.out.println("  Penghapusan dibatalkan...");
            }
        }
    }
    
    public void cariNode() {
        System.out.println("1. Berdasarkan Nama");
        System.out.println("2. Berdasarkan NPM");
        System.out.print("Pilih = ");
        int plh = sc.nextInt();
        System.out.println("==========================");
        if(plh==1){
            System.out.println("Masukkan Nama Mahasiswa");
            System.out.print("Nama : ");
            String nm = sc.next();
            System.out.println("==========================");
            int c = 0;
            for (cNode t = header; t != null; t = t.next) {
                if (nm.contains(t.getNama())) {
                    System.out.println("Data ditemukan...");
                    System.out.println("Nama : " + t.getNama()); 
                    System.out.println("NPM  : " + t.getNPM());
                    System.out.println("IPK  : " + t.getIPK());
                    c++;
                }
            }
            if (c == 0) {
                System.out.println("Data Tidak Ditemukan");
            }
        } else {
            System.out.println("Masukkan NPM Mahasiswa");
            System.out.print("NPM : ");
            String npm = sc.next();
            System.out.println("==========================");
            int c = 0;
            for (cNode t = header; t != null; t = t.next) {
                if (npm.contains(t.getNPM())) {
                    System.out.println("Data ditemukan...");
                    System.out.println("NPM  : " + t.getNPM()+" "); 
                    System.out.println("Nama : " + t.getNama() +" ");
                    System.out.println("IPK  : " + t.getIPK() +" ");
                    c++;
                }
            }
            if (c == 0) {
                System.out.println("Data Tidak Ditemukan");
            }
        }        
    }

    public void print() {
        System.out.println("1. Maju");
        System.out.println("2. Mundur");
        System.out.print("Pilih = ");
        int pilihh = sc.nextInt();
        System.out.println("==========================");
        if (pilihh==1){
            int i = 1;
            for (cNode t = tail; t != null; t = t.before) {
                System.out.println("Data ke-" + i);
                System.out.println("NPM  : " + t.getNPM() + " ");
                System.out.println("Nama : " + t.getNama() + " ");
                System.out.println("IPK  : " + t.getIPK() + " ");
                System.out.println(" ");
                i++;
            }
        }
        else if (pilihh==2){
            int i = 1;
            for (cNode t = header; t != null; t = t.next) {
                System.out.println("Data ke-" + i);
                System.out.println("NPM  : " + t.getNPM() + " ");
                System.out.println("Nama : " + t.getNama() + " ");
                System.out.println("IPK  : " + t.getIPK() + " ");
                System.out.println(" ");
                i++;
            }
        }
        
        System.out.println(" ");
    }
    

    
}
