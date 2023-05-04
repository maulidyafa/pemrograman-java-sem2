package pkgStack;
public class cStack {
    //stack berupa double linked list
    cItem top, tail;
    int jumlah;
    cStack(){
        top=tail=null;
        jumlah=0;
        System.out.println("Object Stack Dibuat...");
    }
    public void push(cItem baru){
        if(top==null){
            top=tail=baru;
        }
        else{
            //penambahan di depan
            baru.next = top;
            top.prev = baru;
            top = baru;
        }
        System.out.println("Push Berhasil");
    }
    public cItem pop(){
        if(top==null){
            System.out.println("Stack Kosong");
            return null;
        }
        else if(top.next==null){
            //stack sisa 1 item
            cItem t = top;
            top = tail = null;
            t.next = null; t.prev = null;
            System.out.println("Pop Berhasil");
            return t;
        }
        else{
            //stack sisa > 1 item
            cItem t = top;
            top = top.next;
            top.prev = null;
            t.next = null;
            t.prev = null;
            System.out.println("Pop Berhasil");
            return t;
        }
    }
    public void cetak (){
        int i = 1;
        System.out.println("Isi Stack : ");
        for (cItem t = top; t != null; t=t.next){
            System.out.println(i+". "+t.getNama()+"");
            i++;
        }
        System.out.println("");
    }
}
