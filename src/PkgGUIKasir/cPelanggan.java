package PkgGUIKasir;
public class cPelanggan {
    String nama, id, alamat, nmr;
    
    cPelanggan(String nm, String d, String almt, String no){
        id =d; nama = nm; alamat = almt; nmr = no;
    }
    public void setIDPlgn(String d){
        id = d;
    }
    public void setNama(String nm){
        nama = nm;
    }
    public void setAlamat(String a){
        alamat = a;
    }
    public void setNoTelp(String n){
        nmr = n;
    }
    
    public String getIDPlgn(){
        return id;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getNoTelp(){
        return nmr;
    }
}