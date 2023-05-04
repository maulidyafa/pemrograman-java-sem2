package LinkedList;
public class cNode {
    private String NPM;
    private String Nama;
    private double IPK;
    cNode next;
    cNode before;
    cNode(String np, String nm, double ip) {
        NPM  = np;
        Nama = nm;
        IPK  = ip;
        next = before = null;
    }
    public String getNPM(){
        return NPM;
    }
    public String getNama(){
        return Nama;
    }
    public double getIPK(){
        return IPK;
    }
    
}
