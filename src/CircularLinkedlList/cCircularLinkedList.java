package CircularLinkedlList;
import java.util.Scanner;
public class cCircularLinkedList {
    Scanner sc = new Scanner (System.in);
    cNode header,tail;
    int js;
    
    cCircularLinkedList(){
        header = tail = null;
        js=0;
    }
    public void addNodeFront(cNode baru){
        if (header==null){
            header = tail = baru;
            tail.next = header;
        }else{
            baru.next = header;
            tail.next = baru;
            header = baru;
        }
        System.out.println("");
        System.out.println("Penambahan Berhasil...");
    }
    
    public void addNodeBehind(cNode baru){
        if(header==null){
            header = tail = baru;
        }else{
            tail.next = baru;
            baru.next = header;
            tail = baru;
        }
        System.out.println("");
        System.out.println("Penambahan Berhasil...");
    }
    
    public void delNodeFront(){
        if(header==null){
            System.out.println("Data Kosong");
        }else{
            System.out.println("Nama : "+header.getNama());
            System.out.println("==========================");
            System.out.println("Anda ingin menghapus data?\n1. Ya\n2. Tidak");
            System.out.print("Pilih = ");
            int hapus = sc.nextInt();
            System.out.println("");
            
            if(hapus==1){
                if(header.next==header){
                    header = tail = null;
                    System.out.println("");
                    System.out.println("Penghapusan Berhasil...");
                }else{
                    cNode t = header.next;
                    header.next = null;
                    header = t;
                    tail.next = header;
                    System.out.println("");
                    System.out.println("Penghapusan Berhasil...");
                }
            }else{
                System.out.println("");
                System.out.println("Penghapusan Dibatalkan");
            }
        }
    }
    
    public void delNodeBehind(){
        if(header==null){
            System.out.println("Data Kosong");
        }else{
            System.out.println("Nama : "+tail.getNama());
            System.out.println("==========================");
            System.out.println("Anda ingin menghapus data?\n1. Ya\n2. Tidak");
            System.out.print("Pilih = ");
            int hapus = sc.nextInt();
            System.out.println("");
            
            if(hapus==1){
                    header = tail = null;
                    System.out.println("");
                    System.out.println("Penghapusan Berhasil...");
            }else if(hapus==1){
                    cNode t = header;
                    do{
                        if(t.next==tail){
                            cNode m = t.next.next;
                            t.next = null;
                            tail = t;
                            tail.next = m;
                            break;
                        }
                        t = t.next;
                    }while (t!=header);
                    System.out.println(header.getNama());
                    System.out.println(tail.getNama());
                    System.out.println("");
                    System.out.println("Penghapusan Berhasil...");
                }else{
                System.out.println("");
                System.out.println("Penghapusan Dibatalkan");
            }
        }
    }
    public void cariNode(){
        if(header==null){
            System.out.println("Data Kosong");
        }else if(header==tail){
            System.out.println("Masukkan Nama Mahasiswa");
            System.out.print("Nama :");
            String nm = sc.next();
            System.out.println("==========================");
            if(header.getNama().equalsIgnoreCase(nm)){
                System.out.println("Data Ditemukan...");
                System.out.println("Nama : "+header.getNama());
            }else{
                System.out.println("Data Tidak Ditemukan");
            }
        }else{
            System.out.println("Masukkan Nama Mahasiswa");
            System.out.println("Nama : ");
            String nm1 = sc.next();
            System.out.println("==========================");
            boolean ketemu = false;
            cNode t = header;
            do{
                if(t.getNama().equalsIgnoreCase(nm1)){
                System.out.println("Data Ditemukan...");
                System.out.println("Nama : ");
                ketemu = true;
            } t = t.next;
            }while(t!=header);
            if(ketemu==false){
                System.out.println("Data Tidak Ditemukan");
            }
        }
    }
    
    public void tambahkarakter(){
        if(header==null){
            System.out.println("Data Kosong");
        }else{
            System.out.println("Masukkan Nama Mahasiswa");
            System.out.print("Nama : ");
            String nm = sc.next();
            cNode s = null;
            boolean karakter = false;
            cNode t = header;
            do{
               if(t.getNama().equalsIgnoreCase(nm)){
                   karakter = true;
                   s = t;
                   break;
               } t = t.next;
            }while(t!=header);
            if(karakter==true){
                System.out.println("==========================");
                System.out.println("Masukkan Sembarang Kata");
                System.out.print("Kata : ");
                String kata = sc.next();
                kata = kata.toUpperCase();
                t = s;
                for(int i = 0; i < kata.length(); i++){
                    System.out.println(kata.charAt(i)+"-> "+t.getNama());
                    t = t.next;
                }
                System.out.println("==========================");
                System.out.println("Penambahan Karakter Berhasil");
            }else
                System.out.println("Nama Tidak Tersedia");
        }
    }
    
    public void print(){
        if(header==null){
            System.out.println("Data Kosong");
        }else{
            cNode t = header;
            int i = 1;
            do{
                System.out.println(i+". "+t.getNama()+"");
                t = t.next;
                i++;
            }while(t!=header);
        }
    }
}
