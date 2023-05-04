package LinkedList;
import java.util.Scanner;
public class cLinkedList {
    Scanner sc = new Scanner(System.in);
    cNode header, tail;
    int js; //jumlah simpul
    cLinkedList(cNode h){
        header = h;
        tail = h;
        js = 0;
        System.out.println("Object Linked List Berhasil Dibuat");
    }
    public void addNode(cNode baru){
        if(header == null){
            header = tail = baru;
        }else{
            tail.next = baru;
            baru.before = tail;
            tail = baru;
        }
        System.out.println("");
        System.out.println("Penambahan Berhasil...");
    }
     public void addNodeBehind(cNode baru){
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
    public void delNode(){
        if(header == null){
            System.out.println("Data Kosong");
        }else{
           System.out.println("NPM  : "+header.getNPM());
           System.out.println("Nama : "+header.getNama());
           System.out.println("IPK  : "+header.getIPK());
           System.out.println("");
           System.out.println("Anda ingin menghapus data?\n1. Ya\n2. Tidak");
           System.out.print("\nPilih = ");
           int hapus = sc.nextInt();
           if (hapus==1){
            cNode t = header.next;
            header  = null;
            header  = t;
            System.out.println("");
            System.out.println("Penghapusan Berhasil...");
           }else{
               System.out.println("");
               System.out.println("Penghapusan Dibatalkan");
           }
        }
    }
     public void delNodeBehind(){
        if (tail == null) {
            System.out.println("Data Kosong");
        } else {
            System.out.println("NPM  : " + tail.getNPM());
            System.out.println("Nama : " + tail.getNama());
            System.out.println("IPK  : " + tail.getIPK());
            System.out.println("");
            System.out.println("Anda ingin menghapus data?\n1. Ya\n2. Tidak");
            System.out.print("\nPilih = ");
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

    public void print() {
        int i = 1;
        for (cNode t = header; t != null; t = t.next) {
            System.out.println("Data ke - "+i);
            System.out.println("NPM  : "+t.getNPM()+"");
            System.out.println("Nama : "+t.getNama()+"");
            System.out.println("IPK  : "+t.getIPK()+"");
            System.out.println("");
            i++;
        }
        System.out.println("");
    }
    }
    
