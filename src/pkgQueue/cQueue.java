package pkgQueue;
public class cQueue {
    cObject front, rear;
    int size;
    cQueue(){
        front = rear = null;
        size = 0;
        System.out.println("Object Queue Dibuat...");
    }
    public void enqueue(cObject baru){
        if(rear==null){
            front = rear = baru;
        }
        else{
            //Jika queue sudah ada isinya
            rear.next = baru;
            baru.prev = rear;
            rear = baru;
        }
        size++;
        System.out.println("");
        System.out.println("Enqueue Berhasil");
    }
    public cObject dequeue(){
        if(rear == null){
            System.out.println("Queue Kososng");
            return(null);
        }
        else if(front.next==null){
            //Queue tinggal berisi satu object
            cObject t = front;
            front = rear = null;
            System.out.println("Dequeue Berhasil");
            size--;
            return(t);
        }
        else{
            //Queue berisi >1 oject
            cObject t = front.next;
            cObject t2 = front;
            t2.next = null;
            front = t;
            front.prev = null;
            System.out.println("Dequeue Berhasil");
            size--;
            return(t2);
        }
    }
    public void print(){
        System.out.println("Isi Queue "+size+" : ");
        for(cObject t = front; t != null; t = t.next){
            System.out.println("No. Antrian : "+t.getNoAntri());
            System.out.println("NPM         : "+t.getNPM());
        }
        System.out.println("");
    }
}
