package pkgStackValidasi;
import java.util.Scanner;
public class appStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;
        do{
            System.out.println("================================");
            System.out.println(" PROGRAM VALIDASI TANDA KURURNG ");
            System.out.println("================================");
            System.out.println("1. Validasi");
            System.out.println("2. Exit");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    cStack stack = new cStack();
                    System.out.println("================================");
                    System.out.print("Masukkan persamaan : ");
                    sc = new Scanner(System.in);
                    String pers = sc.nextLine();
                    boolean valid = false;
                    for(int i = 0; i < pers.length(); i++){
                        char t = pers.charAt(i);
                        cItem td = new cItem(t);
                        if(t=='('||t=='{'||t=='[')stack.push(td);
                        else if(t==')'||t=='}'||t==']'){
                            if(stack.peek()!=null){
                                cItem tpop = stack.pop();
                                if((tpop.getTanda()=='('&& t==')')||(tpop.getTanda()=='{'&& t=='}')||(tpop.getTanda()=='['&&t==']')){valid=true;
                                }
                             }else{
                                valid = false;
                            }
                        }
                    }
                    if(stack.peek()==null&&valid==true){
                        System.out.println("Persamaan Valid");
                    }else{
                        System.out.println("Persamaan Tidak Valid");
                    }
                    
                    break;
                case 2:
                    System.out.println("================================");
                    System.out.println("Terima Kasih");
            }
            
        }while(pilih!=2);
    }
    
}
