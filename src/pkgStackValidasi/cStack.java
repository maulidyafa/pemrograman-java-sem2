package pkgStackValidasi;
public class cStack {
    cItem top, bottom, temp;
    cStack(){
        top = bottom = null;
    }
    public void push(cItem baru){
        if(top == null){
            top = bottom = baru;
        }else{
            top.prev = baru;
            baru.next = top;
            top = baru;
        }
    }
    public cItem pop(){
        if(top == null){
            return null;
        }else if(top.next == null){
            temp = top;
            top = bottom = null;
            return temp;
        }else{
            temp = top;
            top = top.next;
            temp.next = temp.prev = null;
            return temp;
        }
    }
    public cItem peek(){
        if(top == null){
            return null;
        }else{
            return top;
        }
    }
}
