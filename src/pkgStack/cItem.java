package pkgStack;
public class cItem {
    private String nama;
    cItem next, prev;
    cItem(String n){
        nama = n;
        System.out.println("Item "+n+" Dibuat...");
    }
    public String getNama(){
        return nama;
    }
}
