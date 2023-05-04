package CircularLinkedlList;
public class cNode {
    private String nama;
    cNode next;
    cNode before;
    cNode(String nm){
        nama = nm;
        next = before = null;
}
    public void setNama(String nm){
        nama = nm;
    }
    public String getNama(){
        return nama;
    }
}
