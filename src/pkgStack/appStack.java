package pkgStack;
import java.util.Scanner;
public class appStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cStack mystack = new cStack();
        int pilih = 0;
        do{
            System.out.println("==============================");
            System.out.println("          MENU STACK          ");
            System.out.println("==============================");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Cetak");
            System.out.println("4. Exit");
            System.out.println("==============================");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1 :
                    System.out.println("==============================");
                    System.out.print("Masukkan Nama : ");
                    String nm = sc.next();
                    cItem t = new cItem(nm);
                    mystack.push(t);
                    break;
                case 2 :
                    System.out.println("==============================");
                    t = mystack.pop();
                    if(t==null){
                        System.out.println("Tidak Ada Data!");
                    }
                    else{
                        System.out.println(t.getNama()+" Keluar...");
                    }
                    break;
                case 3 :
                    System.out.println("==============================");
                    mystack.cetak();
                    break;
                case 4 :
                    System.out.println("==============================");
                    System.out.println("Terima Kasih ^_^");
                    break;
            }
        }while(pilih!=4);
    }
    
}
