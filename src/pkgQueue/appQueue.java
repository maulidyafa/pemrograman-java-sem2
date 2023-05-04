package pkgQueue;
import java.util.Scanner;
public class appQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cQueue q = new cQueue();
        int pilih = 0, NoAntri = 0;
        do{
            System.out.println("==============================");
            System.out.println("          MENU QUEUE          ");
            System.out.println("==============================");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Cetak");
            System.out.println("4. Exit");
            System.out.println("==============================");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1 :
                    NoAntri++;
                    System.out.println("==============================");
                    System.out.print("Masukkan NPM : ");
                    String np = sc.next();
                    String na = String.valueOf(NoAntri);
                    System.out.print("No. Antrian  : "+na);
                    cObject b = new cObject(np,na);
                    q.enqueue(b);
                    break;
                case 2 :
                    System.out.println("==============================");
                    cObject t = q.dequeue();
                    if(t==null){
                        System.out.println("Tidak Ada Data!");
                    }
                    else{
                        System.out.println(t.getNPM()+" Keluar");
                    }
                    break;
                case 3 :
                    System.out.println("==============================");
                    q.print();
                    break;
                case 4 :
                    System.out.println("==============================");
                    System.out.println("Terima Kasih ^_^");
                    break;
            }
    }while(pilih!=4);
    
    }
}
